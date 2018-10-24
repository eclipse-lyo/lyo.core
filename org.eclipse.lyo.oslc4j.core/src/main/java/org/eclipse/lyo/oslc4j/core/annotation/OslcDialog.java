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
 *	   Samuel Padgett		- add @Documented
 *******************************************************************************/
package org.eclipse.lyo.oslc4j.core.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.NotNull;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OslcDialog {
	/**
	 * Title string that could be used for display
	 */
    @NotNull String title();

	/**
	 * Very short label for use in menu items
	 */
    @NotNull String label() default "";

	/**
	 * The URI of the dialog
	 */
    @NotNull String uri();

	/**
	 * Values MUST be expressed in relative length units.  Em and ex units are interpreted relative to the default system font (at 100% size).
	 */
    @NotNull String hintWidth() default "";

	/**
	 * Values MUST be expressed in relative length units.  Em and ex units are interpreted relative to the default system font (at 100% size).
	 */
    @NotNull String hintHeight() default "";

	/**
	 * Resource types
	 */
    @NotNull String[] resourceTypes() default {};

	/**
	 * Usages
	 */
    @NotNull String[] usages() default {};
}
