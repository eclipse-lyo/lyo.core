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
 *	   Michael Fiedler		 - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.lyo.oslc4j.core;

import java.util.HashMap;
import java.util.Map;

public interface OSLC4JConstants {

	public static final String OSLC4J_PUBLIC_URI		= "org.eclipse.lyo.oslc4j.publicURI";
	public static final String OSLC4J_DISABLE_HOST_RESOLUTION = "org.eclipse.lyo.oslc4j.disableHostResolution";
	public static final String OSLC4J_DISABLE_RELATIVE_URIS = "org.eclipse.lyo.oslc4j.disableRelativeURIs";
	public static final String OSLC4J_USE_BEAN_CLASS_FOR_PARSING = "org.eclipse.lyo.oslc4j.useBeanClassForParsing";
	public static final String OSLC4J_INFER_TYPE_FROM_SHAPE = "org.eclipse.lyo.oslc4j.inferTypeFromResourceShape";

	public static final Map<String, Object> OSL4J_PROPERTY_SINGLETON = new HashMap<String, Object>(0);

	public static final String OSLC4J_SELECTED_PROPERTIES = "org.eclipse.lyo.oslc4j.selected.properties";
	public static final String OSLC4J_NEXT_PAGE = "org.eclipse.lyo.oslc4j.next.page";
	public static final String OSLC4J_TOTAL_COUNT = "org.eclipse.lyo.oslc4j.total.count";

	/**
	 * System property {@value} : When "true", the query result list type will be
	 * http://www.w3.org/2000/01/rdf-schema#Container, otherwise it will
	 * have no type. No type is the default.
	 *
	 */
	public static final String OSLC4J_QUERY_RESULT_LIST_AS_CONTAINER = "org.eclipse.lyo.oslc4j.queryResultListAsContainer";

    /**
     * System property {@value} : When "true", always abbreviate RDF/XML, even
     * when asked for application/rdf+xml. Otherwise, abbreviated RDF/XML is
     * only returned when application/xml is requested. Does not affect
     * text/turtle responses.
     */
    public static final String OSLC4J_ALWAYS_XML_ABBREV		  = "org.eclipse.lyo.oslc4j.alwaysXMLAbbrev";

    /**
     * System property {@value} : When "true" (default), fail on when reading a
     * property value that is not a legal instance of a datatype. When "false",
     * skip over invalid values in extended properties.
     */
    public static final String OSLC4J_STRICT_DATATYPES		 = "org.eclipse.lyo.oslc4j.strictDatatypes";
}
