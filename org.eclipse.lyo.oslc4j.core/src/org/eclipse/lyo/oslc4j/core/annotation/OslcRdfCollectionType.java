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
 *     Steve Pitschke       - initial API and implementation
 *******************************************************************************/

package org.eclipse.lyo.oslc4j.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.eclipse.lyo.oslc4j.core.model.OslcConstants;

/**
 * Indicate which RDF: collection type should be used for representing
 * in RDF the multi-valued property
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OslcRdfCollectionType
{
    /**
     * Namespace URI.
     */
    String namespaceURI() default OslcConstants.RDF_NAMESPACE;

    /**
     * Prefix for the namespace.
     */
    String collectionType() default "List";
}
