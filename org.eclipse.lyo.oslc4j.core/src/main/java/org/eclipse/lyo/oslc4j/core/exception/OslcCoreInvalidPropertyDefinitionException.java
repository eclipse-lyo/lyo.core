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
package org.eclipse.lyo.oslc4j.core.exception;

import java.lang.reflect.Method;

import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.jetbrains.annotations.NotNull;

public final class OslcCoreInvalidPropertyDefinitionException extends OslcCoreApplicationException {
	private static final long serialVersionUID = 6043500589743612250L;

	private static final String MESSAGE_KEY = "InvalidPropertyDefinitionException";

	@NotNull private final Method				 method;
	@NotNull private final OslcPropertyDefinition oslcPropertyDefinition;
	@NotNull private final Class<?>				 resourceClass;

	public OslcCoreInvalidPropertyDefinitionException(final Class<?> resourceClass, final Method method, final OslcPropertyDefinition oslcPropertyDefinition) {
		super(MESSAGE_KEY, new Object[] {resourceClass.getName(), method.getName(), oslcPropertyDefinition.value()});

		this.method					= method;
		this.oslcPropertyDefinition = oslcPropertyDefinition;
		this.resourceClass			= resourceClass;
	}

	@NotNull
    public Method getMethod() {
		return method;
	}

	@NotNull
    public OslcPropertyDefinition getOslcPropertyDefinition()
	{
		return oslcPropertyDefinition;
	}

	@NotNull
    public Class<?> getResourceClass() {
		return resourceClass;
	}
}
