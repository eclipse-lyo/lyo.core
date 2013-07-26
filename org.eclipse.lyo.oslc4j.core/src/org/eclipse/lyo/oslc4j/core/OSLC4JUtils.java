/*******************************************************************************
 * Copyright (c) 2012, 2013 IBM Corporation.
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
 *     Michael Fiedler       - initial API and implementation
 *     
 *******************************************************************************/
package org.eclipse.lyo.oslc4j.core;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.UriBuilder;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.QName;

import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.XMLLiteral;

import com.hp.hpl.jena.datatypes.RDFDatatype;
import com.hp.hpl.jena.datatypes.TypeMapper;
import com.hp.hpl.jena.datatypes.xsd.XSDDateTime;
import com.hp.hpl.jena.datatypes.xsd.impl.XMLLiteralType;


public class OSLC4JUtils {
	private static String publicURI = System.getProperty(OSLC4JConstants.OSLC4J_PUBLIC_URI);
	
	/**
	 * This constant should be set to true for matching the resource rdf:type to
	 * the describes parameter of the OslcResourceShape annotation. By default
	 * this is set to false. This is part of the fix for defect 412755.
	 */
	private static String useBeanClassForParsing = System.getProperty(OSLC4JConstants.OSLC4J_USE_BEAN_CLASS_FOR_PARSING);
	
	/**
	 * This constant should be set to true when the property type is not
	 * explicitly passed and it should be inferred from the resource shape. By
	 * default this is set to false. This is part of the the fix for defect
	 * 412789.
	 */
	private static String inferTypeFromShape = System.getProperty(OSLC4JConstants.OSLC4J_INFER_TYPE_FROM_SHAPE);
	
	/**
	 * List of available ResourceShapes. This list will be used to infer the
	 * property type from the resource shape and it will only be considered if
	 * the property inferTypeFromShape is set to true. This is part of the the
	 * fix for defect 412789.
	 */
	private static List<ResourceShape> shapes = new ArrayList<ResourceShape>();
	
	private static final Logger logger = Logger.getLogger(OSLC4JUtils.class.getName());
	/**
	 * Returns the value of org.eclipse.lyo.oslc4j.publicURI or null if not set.
	 * 
	 * 
	 * @return
	 */
	public static String getPublicURI()
	{
		return publicURI;
	}
	
	/**
	 * Sets the value of org.eclipse.lyo.oslc4j.publicURI
	 * @param publicURI
	 */
	@SuppressWarnings("unused")
	public static void setPublicURI(String newPublicURI) throws MalformedURLException
	{

		if (newPublicURI != null && !newPublicURI.isEmpty())
		{
			//test for valid URL - exception will be thrown if invalid
			URL newPublicURL = new URL(newPublicURI);			
		}
		publicURI = newPublicURI;
	}
	
	public static boolean useBeanClassForParsing() {
		boolean result = false;
		if (null != useBeanClassForParsing) {
			result = Boolean.parseBoolean(useBeanClassForParsing);
		}
		return result;
	}
	
	public static String getUseBeanClassForParsing() {		
		return useBeanClassForParsing;
	}

	public static void setUseBeanClassForParsing(String useBeanClassForParsing) {
		OSLC4JUtils.useBeanClassForParsing = useBeanClassForParsing;
	}
	
	public static boolean inferTypeFromShape() {
		boolean result = false;
		if (null != inferTypeFromShape) {
			result = Boolean.parseBoolean(inferTypeFromShape);
		}
		return result;
	}
	
	public static String getInferTypeFromShape() {
		return inferTypeFromShape;
	}

	public static void setInferTypeFromShape(String inferTypeFromShape) {
		OSLC4JUtils.inferTypeFromShape = inferTypeFromShape;
	}

	/**
	 * Returns a list of Resource Shapes to be used when inferring a property
	 * type from the Resource Shape. This method should only be used when the
	 * property inferTypeFromShape is set to true.
	 * 
	 * @return List of Resource Shapes
	 */
	public static List<ResourceShape> getShapes() {
		return shapes;
	}

	/**
	 * Sets a list of Resource Shapes to be used when inferring a property type
	 * from the Resource Shape. This method should only be used when the
	 * property inferTypeFromShape is set to true.
	 * 
	 * @param shapes
	 *            List of Resource Shapes
	 */
	public static void setShapes(List<ResourceShape> shapes) {
		OSLC4JUtils.shapes = shapes;
	}

	/**
	 * Returns the boolean value of org.eclipse.lyo.oslc4j.disableHostResolution
	 * Default is false if not set or invalid (hostname resolution will take place)
	 * @return
	 */
	public static boolean isHostResolutionDisabled()
	{
		boolean retVal = false;
		
		String hostResDisabledProp = System.getProperty(OSLC4JConstants.OSLC4J_DISABLE_HOST_RESOLUTION);
		if (hostResDisabledProp !=null)
		{
			retVal = Boolean.parseBoolean(hostResDisabledProp);
		}
		return retVal;
		
	}
	
	public static void setHostResolutionDisabled(boolean hostResDisabled)
	{
		System.setProperty(OSLC4JConstants.OSLC4J_DISABLE_HOST_RESOLUTION, Boolean.toString(hostResDisabled));
	}
	
	
	/**
	 * Resolve a URI (usually a resource subject or info URI) based on the settings of
	 * org.eclipse.lyo.oslc4j.publicURI and org.eclipse.lyo.oslc4j.disableHostResolution.
	 * 
	 * If the publicURI property is set, it takes precedence and is used to build the full URI.
	 * 
	 * If the disableHostResolution property is false or not set, resolution of the local hostname is attempted.
	 * 
	 * If the disableHostResolution property is true or resolution has failed, the hostname is retrieved from the request.
	 * 
	 * Query parameters from the request are not copied to the resolved URI.
	 * 
	 * @param request - request to base resolved URI on
	 * @param includePath - if the path (after the context root) should be included in the resolved URI
	 * @return
	 */
	public static String resolveURI(HttpServletRequest request, boolean includePath)
	{
		UriBuilder builder = null;

		final String pathInfo    = request.getPathInfo();
	    final String servletPath = request.getServletPath();
		final String configuredPublicURI = getPublicURI();
	   
		//public URI configured, use it - it includes the context
		if (configuredPublicURI != null && !configuredPublicURI.isEmpty())
		{
			String uriToBuild = includePath ? (configuredPublicURI + "/" + servletPath + pathInfo) : configuredPublicURI;
			builder = UriBuilder.fromUri(uriToBuild); //Normalize later
		}
		else
		{
			String hostName = "localhost";
		   
			//try host resolution first if property to disable it is false or not set
			boolean getHostNameFromRequest = false;
		   
			if (isHostResolutionDisabled())
			{
			   getHostNameFromRequest = true;
			}
			else
			{
				try 
				{
					hostName = InetAddress.getLocalHost().getCanonicalHostName();
				}
				catch (UnknownHostException e)
				{
					//fallback is to use the hostname from request
					logger.finer("Unable to resolve hostname.  Extracting hostname from request.");
					getHostNameFromRequest = true;
				}
			}
		   
			if (getHostNameFromRequest)
			{
				hostName = request.getServerName();
			}

			String contextPath   = request.getContextPath();
			String pathToBuild   = includePath ? (contextPath + servletPath + pathInfo) : contextPath; 
            builder = UriBuilder.fromPath(pathToBuild)
                                .scheme(request.getScheme())
                                .host(hostName)
                                .port(request.getServerPort());			   
		}
		   
	   
	   
		URI resolvedURI = builder.build().normalize();
       
		return resolvedURI.toString();

	}
	
	/**
	 * Returns the boolean value of org.eclipse.lyo.oslc4j.disableRelativeURIs
	 * Default is true if not set or invalid (relative URIs will not be allowed)
	 * @return
	 */
	public static boolean relativeURIsAreDisabled()
	{
		boolean retVal = true;
		
		String relURIsDisabledProp = System.getProperty(OSLC4JConstants.OSLC4J_DISABLE_RELATIVE_URIS);
		if (relURIsDisabledProp !=null)
		{
			retVal = Boolean.parseBoolean(relURIsDisabledProp);
		}
		return retVal;
	}
	
	/**
	 * This method returns true if the given Resource Shape describes array
	 * matches the list of rdf types.
	 * 
	 * @param shape
	 *            Resource Shape
	 * @param rdfTypesList
	 *            List of rdf:types
	 *
	 * @return True if the ResourceShape type is in the list of rdf:types,
	 *         otherwise returns false.
	 */
	private static boolean doesResourceShapeMatchRdfTypes(ResourceShape shape, List<String> rdfTypesList) {
		boolean result = false;
		
		if (null != shape) {
			URI[] describes = shape.getDescribes();
			for (URI describeUri : describes) {
				String describeUriStr = describeUri.toASCIIString();
				for (String rdfType: rdfTypesList) {
					if (rdfType.equals(describeUriStr)) {
						return true;
					}
				}
			}
		}
		
		return result;
	}
	
	/**
	 * This method receives the property name and the property value and tries
	 * to infer the property type from the pre-defined list of Resource Shapes.
	 * Then returns the corresponding java object for the given object value.
	 * Returns a null object when it was not possible to infer the property type
	 * from the list of Resource Shapes.
	 * 
	 * @param rdfTypesList
	 * @param propertyQName
	 *            Property information
	 * @param originalValue
	 *            Property value
	 * @return Java object related to the Resource Shape type.
	 * @throws DatatypeConfigurationException
	 *             , IllegalArgumentException, InstantiationException,
	 *             InvocationTargetException
	 on 
	 * 
	 */
	public static Object getValueBasedOnResourceShapeType(
			final List<String> rdfTypesList, final QName propertyQName,
			final Object originalValue) throws DatatypeConfigurationException,
			IllegalArgumentException, InstantiationException,
			InvocationTargetException {

		Object returnValue = null;

		try {
			if (null != rdfTypesList && !rdfTypesList.isEmpty()) {
				if (null != propertyQName && null != originalValue) {
		
					// get the pre-defined list of ResourceShapes
					List<ResourceShape> shapes = OSLC4JUtils.getShapes();
		
					if (null != shapes && !shapes.isEmpty()) {
		
						// try to find the attribute type in the list of
						// resource shapes
						String propertyName = propertyQName.getNamespaceURI()
								+ propertyQName.getLocalPart();
		
						TypeMapper typeMapper = TypeMapper.getInstance();
		
						for (ResourceShape shape : shapes) {
							
							// ensure that the current resource shape matches the resource rdf:type
							if (doesResourceShapeMatchRdfTypes(shape, rdfTypesList)) {
								
								org.eclipse.lyo.oslc4j.core.model.Property[] props = shape
										.getProperties();
								
								for (org.eclipse.lyo.oslc4j.core.model.Property prop : props) {
									URI propDefinition = prop.getPropertyDefinition();
			
									if (propertyName.equals(propDefinition
											.toString())) {
										URI propValueType = prop.getValueType();
										
										if (null == propValueType) {
											continue;
										}
										
										RDFDatatype dataTypeFromShape = typeMapper
												.getTypeByName(propValueType.toString());
			
										// this is a literal type
										if (null != dataTypeFromShape) {
											Class<?> objClass = dataTypeFromShape
													.getJavaClass();
			
										// special treatment for XMLLiteral
										if (XMLLiteralType.theXMLLiteralType.getURI()
												.equals(propValueType.toString())) {
											return new XMLLiteral(
													originalValue.toString());
										}
		
										// special treatment for Date
										if (objClass.getCanonicalName().equals(XSDDateTime.class.getCanonicalName())) {
											String dateStr = originalValue.toString();
											Calendar calendar;
											calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(dateStr).toGregorianCalendar();
											final XSDDateTime xsdDateTime = new XSDDateTime(calendar);
											return xsdDateTime.asCalendar().getTime();
										}
		
										Constructor<?> cons = objClass
												.getConstructor(String.class);
										Object newValue = cons.newInstance(originalValue
												.toString());
										return newValue;
											
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (NoSuchMethodException e) {
			// if there is any error while creating the new object, return null,
			// i.e use the original value and not the new one.
			returnValue = null;
		} catch (IllegalAccessException e) {
			// if there is any error while creating the new object, return null,
			// i.e use the original value and not the new one.
			returnValue = null;
		}

		return returnValue;
	}
	
}
