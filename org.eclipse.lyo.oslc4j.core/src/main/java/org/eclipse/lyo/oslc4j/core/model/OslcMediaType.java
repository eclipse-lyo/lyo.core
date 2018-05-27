/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation.
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
package org.eclipse.lyo.oslc4j.core.model;

import javax.print.attribute.standard.Media;
import javax.ws.rs.core.MediaType;

public interface OslcMediaType {

    String    APPLICATION_RDF_XML      = "application/rdf+xml";
    MediaType APPLICATION_RDF_XML_TYPE = MediaType.valueOf(APPLICATION_RDF_XML);

    String    APPLICATION_JSON_LD      = "application/ld+json";
    MediaType APPLICATION_JSON_LD_TYPE = MediaType.valueOf(APPLICATION_JSON_LD);

    String    TEXT_TURTLE      = "text/turtle";
    MediaType TEXT_TURTLE_TYPE = MediaType.valueOf(TEXT_TURTLE);

    String    RDF_JSON_MIME = "application/rdf+json";
    MediaType RDF_JSON_MT   = MediaType.valueOf(RDF_JSON_MIME);

    String N_TRIPLES_MIME = "application/n-triples";
    MediaType N_TRIPLES_MT = MediaType.valueOf(N_TRIPLES_MIME);

    // OSLC specific serialisations

    String    APPLICATION_X_OSLC_COMPACT_XML      = "application" + "/" + "x-oslc-compact+xml";
    MediaType APPLICATION_X_OSLC_COMPACT_XML_TYPE = new MediaType("application",
                                                                  "x-oslc-compact+xml");

    String    APPLICATION_X_OSLC_COMPACT_JSON      = "application/x-oslc-compact+json";
    MediaType APPLICATION_X_OSLC_COMPACT_JSON_TYPE = new MediaType("application",
                                                                   "x-oslc-compact+json");

    // Non-standard RDF serialisations

    String    APPLICATION_JSON      = MediaType.APPLICATION_JSON;
    MediaType APPLICATION_JSON_TYPE = MediaType.APPLICATION_JSON_TYPE;

    String    APPLICATION_XML      = MediaType.APPLICATION_XML;
    MediaType APPLICATION_XML_TYPE = MediaType.APPLICATION_XML_TYPE;

    String    TEXT_XML      = MediaType.TEXT_XML;
    MediaType TEXT_XML_TYPE = MediaType.TEXT_XML_TYPE;

    String RDF_THRIFT_MIME = "application/rdf+thrift";
    MediaType RDF_THRIFT_MT = MediaType.valueOf(RDF_THRIFT_MIME);

    // Deprecated

    @Deprecated String APPLICATION         = "application";
    @Deprecated String TEXT                = "text";
    @Deprecated String RDF_XML             = "rdf+xml";
    @Deprecated String JSON_LD             = "ld+json";
    @Deprecated String TURTLE              = "turtle";
    @Deprecated String X_OSLC_COMPACT_XML  = "x-oslc-compact+xml";
    @Deprecated String X_OSLC_COMPACT_JSON = "x-oslc-compact+json";

}
