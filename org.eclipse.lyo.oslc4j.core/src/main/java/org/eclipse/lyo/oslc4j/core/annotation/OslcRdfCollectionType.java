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
 *	   Steve Pitschke		- initial API and implementation
 *	   Samuel Padgett		- add @Documented
 *******************************************************************************/
package org.eclipse.lyo.oslc4j.core.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.eclipse.lyo.oslc4j.core.model.OslcConstants;

/**
 * Indicate which RDF: collection type should be used for representing
 * in RDF the multi-valued property
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OslcRdfCollectionType
{
	String RDF_LIST = "List";
	String RDF_SEQ = "Seq";
	String RDF_ALT = "Alt";
	String RDF_BAG = "Bag";

	/**
	 * Namespace URI.
	 */
	String namespaceURI() default OslcConstants.RDF_NAMESPACE;

	/**
	 * Prefix for the namespace.
	 */
	String collectionType() default "List";
}
