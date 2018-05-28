/*******************************************************************************
 * Copyright (c) 2012, 2014 IBM Corporation.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *	   Russell Boykin		- initial API and implementation
 *	   Alberto Giammaria	- initial API and implementation
 *	   Chris Peters			- initial API and implementation
 *	   Gianluca Bernardini	- initial API and implementation
 *******************************************************************************/
package org.eclipse.lyo.oslc4j.provider.jena;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.Providers;

import org.eclipse.lyo.oslc4j.core.OSLC4JConstants;
import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNotQueryResult;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.exception.MessageExtractor;
import org.eclipse.lyo.oslc4j.core.model.Error;
import org.eclipse.lyo.oslc4j.core.model.IResource;
import org.eclipse.lyo.oslc4j.core.model.OslcMediaType;
import org.eclipse.lyo.oslc4j.core.model.ResponseInfo;
import org.eclipse.lyo.oslc4j.core.model.ResponseInfoArray;
import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;
import org.eclipse.lyo.oslc4j.core.model.ServiceProviderCatalog;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.RDFReader;
import org.apache.jena.rdf.model.RDFWriter;
import org.apache.jena.util.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractOslcRdfXmlProvider
{
	private final static Logger log                      = LoggerFactory.getLogger(
			AbstractOslcRdfXmlProvider.class);

	private static final Annotation[] ANNOTATIONS_EMPTY_ARRAY = new Annotation[0];
	private static final Class<Error> CLASS_OSLC_ERROR		  = Error.class;
	private static final ErrorHandler ERROR_HANDLER			  = new ErrorHandler();

	// FIXME Andrew@2018-03-03: this project shall not treat clients differently
	// we should instead create special query result providers
	private @Context   HttpHeaders        httpHeaders;          // Available only on the server
	protected @Context HttpServletRequest httpServletRequest; // Available only on the server
	private @Context   Providers          providers;          // Available on both client and server

	protected AbstractOslcRdfXmlProvider()
	{
		super();
	}

	protected static boolean isWriteable(final Class<?>		 type,
										 final Annotation[]	 annotations,
										 final MediaType	 actualMediaType,
										 final MediaType ... requiredMediaTypes)
	{
		if (type.getAnnotation(OslcResourceShape.class) != null
				|| type.getAnnotation(OslcNotQueryResult.class) != null
				|| IResource.class.isAssignableFrom(type)
				)
		{
			// We do not have annotations when running from the non-web client.
			return isCompatible(actualMediaType, requiredMediaTypes);
		}

		return false;
	}

	protected void writeTo(final Object[]						objects,
						   final MediaType						baseMediaType,
						   final MultivaluedMap<String, Object> map,
						   final OutputStream					outputStream,
						   final Map<String, Object>			properties,
						   final String							descriptionURI,
						   final String							responseInfoURI,
						   final ResponseInfo<?>				responseInfo)
				throws WebApplicationException
	{
		String serializationLanguage = getSerializationLanguage(baseMediaType);

		// This is a special case to handle RDNG GET on a ServiceProvider resource.
		// RDNG can only consume RDF/XML-ABBREV although its sometimes sends Accept=application/rdf+xml.
		// The org.eclipse.lyo.oslc4j.alwaysXMLAbbrevOnlyProviders system property is used
		// to turn off this special case
		if ((objects != null && objects[0] != null) && (objects[0] instanceof
				ServiceProviderCatalog || objects[0] instanceof ServiceProvider) &&
				serializationLanguage
				.equals(FileUtils.langXML) && "true".equals(System.getProperty(
				"org.eclipse.lyo.oslc4j.alwaysXMLAbbrevOnlyProviders"))) {
			serializationLanguage = FileUtils.langXMLAbbrev;
			log.debug("Using RDF/XML-ABBREV for ServiceProvider resources");
		}

		writeQueryResultsLegacy(objects,
								outputStream,
								serializationLanguage,
								descriptionURI,
								responseInfoURI,
								responseInfo,
								properties
		);
	}

	/**
	 * @param objects               OSLC Resources to write
	 * @param outputStream          Stream to write to
	 * @param serializationLanguage See
	 * {@link AbstractOslcRdfXmlProvider#getSerializationLanguage(MediaType)}
	 * @param descriptionURI        Used for writing query results only
	 * @param responseInfoURI       Used for writing query results only
	 * @param responseInfo          Used for writing query results only
	 * @param properties            Selected properties (see {@code OSLC4JConstants
	 * .OSLC4J_SELECTED_PROPERTIES})
	 */
	private void writeQueryResultsLegacy(final Object[] objects, final OutputStream outputStream,
			final String serializationLanguage, final String descriptionURI,
			final String responseInfoURI, final ResponseInfo<?> responseInfo,
			final Map<String, Object> properties) {
		try {
			final Model model = JenaModelHelper.createJenaModel(descriptionURI,
																responseInfoURI,
																responseInfo,
																objects,
																properties);
			RDFWriter writer;
			if	(serializationLanguage.equals(FileUtils.langXMLAbbrev)) {
				writer = new RdfXmlAbbreviatedWriter();
			} else {
				writer = model.getWriter(serializationLanguage);
			}
			writer.setProperty("showXmlDeclaration", "false");
			writer.setErrorHandler(ERROR_HANDLER);

			if (! serializationLanguage.equals(FileUtils.langTurtle)) {
				String xmlDeclaration = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
				outputStream.write(xmlDeclaration.getBytes());
			}

			writer.write(model, outputStream, null);
		} catch (final Exception exception) {
			log.warn(MessageExtractor.getMessage("ErrorSerializingResource"), exception);
			throw new WebApplicationException(exception);
		}
	}

	protected void writeTo(final boolean queryResult, final Object[] objects,
			final MediaType baseMediaType, final MultivaluedMap<String, Object> map,
			final OutputStream outputStream) throws WebApplicationException {
		final String serializationLanguage = getSerializationLanguage(baseMediaType);
		final boolean clientSide = isClientSide();

		if (clientSide) {
			serialiseObjectsToStream(objects, outputStream, serializationLanguage);
		} else {
			String descriptionURI = null;
			String responseInfoURI = null;
			if (queryResult && "GET".equals(httpServletRequest.getMethod())) {
				descriptionURI = OSLC4JUtils.resolveURI(httpServletRequest, true);
				responseInfoURI = descriptionURI;

				final String queryString = httpServletRequest.getQueryString();
				if ((queryString != null) && (isOslcQuery(queryString))) {
					responseInfoURI += "?" + queryString;
				}
			}
			@SuppressWarnings(
					"unchecked") final Map<String, Object> properties = (Map<String, Object>)
					httpServletRequest
					.getAttribute(OSLC4JConstants.OSLC4J_SELECTED_PROPERTIES);
			final String nextPageURI = (String) httpServletRequest.getAttribute(OSLC4JConstants
																						.OSLC4J_NEXT_PAGE);
			final Integer totalCount = (Integer) httpServletRequest.getAttribute(OSLC4JConstants
																						 .OSLC4J_TOTAL_COUNT);

			ResponseInfo<?> responseInfo = new ResponseInfoArray<Object>(null,
																		 properties,
																		 totalCount,
																		 nextPageURI
			);

			writeQueryResultsLegacy(objects,
									outputStream,
									serializationLanguage,
									descriptionURI,
									responseInfoURI,
									responseInfo,
									properties
			);
		}
	}

	private void serialiseObjectsToStream(final Object[] objects, final OutputStream outputStream,
			final String serializationLanguage) {
		writeQueryResultsLegacy(objects,
								outputStream,
								serializationLanguage,
								null,
								null,
								null,
								null
		);
	}

	private boolean isClientSide() {
		boolean isClientSide = false;
		try {
			httpServletRequest.getMethod();
		} catch (RuntimeException e) {
			isClientSide = true;
		}
		return isClientSide;
	}

	private String getSerializationLanguage(final MediaType baseMediaType) {
		// Determine whether to serialize in xml or abreviated xml based upon mediatype.
		// application/rdf+xml yields xml
		// applicaton/xml yields abbreviated xml
		if (OslcMediaType.TEXT_TURTLE_TYPE.equals(baseMediaType))
		{
			return FileUtils.langTurtle;
		}

		if (OslcMediaType.APPLICATION_RDF_XML_TYPE.isCompatible(baseMediaType) &&
			!OSLC4JUtils.alwaysAbbrevXML())
		{
			return FileUtils.langXML;
		}

		return FileUtils.langXMLAbbrev;
	}

	protected static boolean isReadable(final Class<?>		type,
										final MediaType		actualMediaType,
										final MediaType ... requiredMediaTypes)
	{
		if (type.getAnnotation(OslcResourceShape.class) != null)
		{
			if (isCompatible(actualMediaType, requiredMediaTypes))
			{
				return true;
			}
		}

		return false;
	}

	protected static boolean isCompatible(final MediaType actualMediaType,
			final MediaType... requiredMediaTypes)
	{
			for (final MediaType requiredMediaType : requiredMediaTypes)
			{
				if (requiredMediaType.isCompatible(actualMediaType))
				{
					return true;
				}
			}

		return false;
	}

	protected Object[] readFrom(final Class<?>						 type,
								final MediaType						 mediaType,
								final MultivaluedMap<String, String> map,
								final InputStream					 inputStream)
			  throws WebApplicationException
	{
		final Model model = ModelFactory.createDefaultModel();

		RDFReader reader = null;

		if (mediaType != null && mediaType.isCompatible(OslcMediaType.TEXT_TURTLE_TYPE))
		{
			reader=model.getReader(FileUtils.langTurtle);
		} else {
			reader = model.getReader(); // Default reader handles both xml and abbreviated xml
		}
		reader.setErrorHandler(ERROR_HANDLER);

		try
		{
			// Pass the empty string as the base URI. This allows Jena to
			// resolve relative URIs commonly used to in reified statements
			// for OSLC link labels. See this section of the CM specification
			// for an example:
			// http://open-services.net/bin/view/Main/CmSpecificationV2?sortcol=table;up=#Labels_for_Relationships

			reader.read(model,
						inputStream,
						"");

			return JenaModelHelper.fromJenaModel(model,
												 type);
		}
		catch (final Exception exception)
		{
			throw new WebApplicationException(exception,
											  buildBadRequestResponse(exception,
																	  mediaType,
																	  map));
		}
	}

	protected Response buildBadRequestResponse(final Exception				   exception,
											   final MediaType				   initialErrorMediaType,
											   final MultivaluedMap<String, ?> map)
	{
		final MediaType determinedErrorMediaType = determineErrorMediaType(initialErrorMediaType,
																		   map);

		final Error error = new Error();

		error.setStatusCode(String.valueOf(Response.Status.BAD_REQUEST.getStatusCode()));
		error.setMessage(exception.getMessage());

		final ResponseBuilder responseBuilder = Response.status(Response.Status.BAD_REQUEST);
		return responseBuilder.type(determinedErrorMediaType).entity(error).build();
	}

	/**
	 * We handle the case where a client requests an accept type different than their content type.
	 * This will work correctly in the successful case.	 But, in the error case where our
	 * MessageBodyReader/MessageBodyWriter fails internally, we respect the client's requested accept type.
	 */
	private MediaType determineErrorMediaType(final MediaType				  initialErrorMediaType,
											  final MultivaluedMap<String, ?> map)
	{
		try
		{
			// HttpHeaders will not be available on the client side and will throw a NullPointerException
			final List<MediaType> acceptableMediaTypes = httpHeaders.getAcceptableMediaTypes();

			// Since we got here, we know we are executing on the server

			if (acceptableMediaTypes != null)
			{
				for (final MediaType acceptableMediaType : acceptableMediaTypes)
				{
					// If a concrete media type with a MessageBodyWriter
					if (isAcceptableMediaType(acceptableMediaType))
					{
						return acceptableMediaType;
					}
				}
			}
		}
		catch (final NullPointerException exception)
		{
			// Ignore NullPointerException since this means the context has not been set since we are on the client

			// See if the MultivaluedMap for headers is available
			if (map != null)
			{
				final Object acceptObject = map.getFirst("Accept");

				if (acceptObject instanceof String)
				{
					final String[] accepts = acceptObject.toString().split(",");

					double	  winningQ		   = 0.0D;
					MediaType winningMediaType = null;

					for (final String accept : accepts)
					{
						final MediaType acceptMediaType = MediaType.valueOf(accept);

						// If a concrete media type with a MessageBodyWriter
						if (isAcceptableMediaType(acceptMediaType))
						{
							final String stringQ = acceptMediaType.getParameters().get("q");

							final double q = stringQ == null ? 1.0D : Double.parseDouble(stringQ);

							// Make sure and exclude blackballed media type
							if (Double.compare(q, 0.0D) > 0)
							{
								if ((winningMediaType == null) ||
									(Double.compare(q, winningQ) > 0))
								{
									winningMediaType = acceptMediaType;
									winningQ		 = q;
								}
							}
						}
					}

					if (winningMediaType != null)
					{
						return winningMediaType;
					}
				}
			}
		}

		return initialErrorMediaType;
	}

	/**
	 * Only allow media types that are not wildcards and have a related MessageBodyWriter for OSLC Error.
	 */
	private boolean isAcceptableMediaType(final MediaType mediaType)
	{
		// FIXME Andrew@2018-03-03: wildcards should be acceptable and JSON-LD or Turtle shall be
		// served
		return (!mediaType.isWildcardType()) &&
			   (!mediaType.isWildcardSubtype()) &&
			   (providers.getMessageBodyWriter(CLASS_OSLC_ERROR,
											   CLASS_OSLC_ERROR,
											   ANNOTATIONS_EMPTY_ARRAY,
											   mediaType) != null);
	}

	protected static boolean isOslcQuery(final String parmString)
	{
		boolean containsOslcParm = false;

		// FIXME Andrew@2018-03-03: what about 'search=oslc.*'
		// should switch to URLEncodedUtils (https://stackoverflow.com/a/13592324/464590)
		final String [] uriParts = parmString.toLowerCase().split("oslc\\.",2);
		if (uriParts.length > 1)
		{
			containsOslcParm = true;
		}

		return containsOslcParm;
	}
}
