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
package org.eclipse.lyo.oslc4j.test.test;

import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.test.Constants;

@OslcResourceShape(title = "Bogus Resource Shape", describes = Constants.TYPE_TEST)
public class InvalidDuplicatePropertyDefinition
{
	@OslcPropertyDefinition(Constants.TEST_DOMAIN + "name")
	public String getName()
	{
		return null;
	}

	@OslcName("name")
	@OslcPropertyDefinition(Constants.TEST_DOMAIN + "name")
	public String getName2()
	{
		return null;
	}

	public void setName(final String name)
	{
	}

	public void setName2(final String name)
	{
	}
}
