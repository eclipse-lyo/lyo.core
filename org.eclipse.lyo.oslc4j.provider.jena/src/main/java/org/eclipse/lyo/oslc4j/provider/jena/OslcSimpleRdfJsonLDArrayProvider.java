/*******************************************************************************
 * Copyright (c) 2012, 2015 IBM Corporation.
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
 *	   Ricardo J. Herrera	- jsonld support
 *******************************************************************************/
package org.eclipse.lyo.oslc4j.provider.jena;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

import org.eclipse.lyo.oslc4j.core.model.OslcMediaType;

@Provider
@Produces(OslcMediaType.APPLICATION_JSON_LD)
@Consumes(OslcMediaType.APPLICATION_JSON_LD)
public final class OslcSimpleRdfJsonLDArrayProvider
	   extends OslcRdfJsonLDArrayProvider
{
	public OslcSimpleRdfJsonLDArrayProvider()
	{
		super();
	}

	@Override
	public void writeTo(final Object[]						 objects,
						final Class<?>						 type,
						final Type							 genericType,
						final Annotation[]					 annotations,
						final MediaType						 mediaType,
						final MultivaluedMap<String, Object> map,
						final OutputStream					 outputStream)
		   throws IOException,
				  WebApplicationException
	{
		writeTo(objects,
				mediaType,
				map,
				outputStream,
				null,
				null,
				null,
				null);
	}
}