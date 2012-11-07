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
 * Array or collection of these elements where value is <code>true</code>
 * will not be presented as a query result.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface OslcNotQueryResult
{
    /**
     * True if the now ResponseInfo is to be generated for array or
     * collection of elements with this annotation
     */
    boolean value() default true;
}
