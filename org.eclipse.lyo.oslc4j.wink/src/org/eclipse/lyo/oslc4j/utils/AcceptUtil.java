/*******************************************************************************
 * Copyright (c) 2013 IBM Corporation.
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
 *     Samuel Padgett       - initial API and implementation
 *     David Terry		    - initial API and implementation
 *******************************************************************************/
package org.eclipse.lyo.oslc4j.utils;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MediaType;

import org.apache.wink.common.internal.http.Accept;
import org.apache.wink.common.internal.providers.header.AcceptHeaderDelegate;
import org.eclipse.lyo.oslc4j.core.model.OslcMediaType;

public class AcceptUtil {
	public static MediaType RDF_XML = MediaType.valueOf("application/rdf+xml");
	public static MediaType TURTLE = MediaType.valueOf("text/turtle");
	
	public static MediaType matchMediaType(HttpServletRequest request, boolean acceptHTML) {
		String accept = request.getHeader("Accept");
		
		// No accept type specified.  Return nothing and let the caller decide
		// what the default should be.
		if (accept == null) {
			return null;
		}
		
		// FIXME: We should not use internal Wink classes if we can avoid it.
		AcceptHeaderDelegate delegate = new AcceptHeaderDelegate();
		
		Accept a = delegate.fromString(accept);
		
		for (MediaType nextType : a.getSortedMediaTypes()) {
			if (acceptHTML && nextType.isCompatible(MediaType.TEXT_HTML_TYPE)) {
				return MediaType.TEXT_HTML_TYPE;
			}
			
			if (nextType.isCompatible(RDF_XML)) {
				return RDF_XML;
			}
			
			if (nextType.isCompatible(TURTLE)) {
				return TURTLE;
			}
			
			if (nextType.isCompatible(MediaType.APPLICATION_XML_TYPE)) {
				return MediaType.APPLICATION_XML_TYPE;
			}
			
			if (nextType.isCompatible(MediaType.APPLICATION_JSON_TYPE)) {
				return MediaType.APPLICATION_JSON_TYPE;
			}
			
			if (nextType.isCompatible(MediaType.valueOf(OslcMediaType.X_OSLC_COMPACT_XML))) {
				return MediaType.valueOf(OslcMediaType.X_OSLC_COMPACT_XML);
			}
		}
		
		return null;
	}
}
