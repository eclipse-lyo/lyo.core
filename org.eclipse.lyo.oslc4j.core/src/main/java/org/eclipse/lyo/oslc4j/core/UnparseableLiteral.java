/*******************************************************************************
 * Copyright (c) 2014 IBM Corporation.
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
 *     Romain Barth			- unparseable literal
 *     some attributes in DOORS or CLM are not parseable because of some value
 *     (e.g. date in a datetime attribute or empty value in a long attribute)
 *******************************************************************************/
package org.eclipse.lyo.oslc4j.core;

public class UnparseableLiteral {

	private String rawValue;
	private String datatype;

	public UnparseableLiteral(String rawValue, String datatype){
		this.setDatatype(datatype);
		this.setRawValue(rawValue);
	}

	public String getRawValue(){
		return this.rawValue;
	}

	public String getDatatype(){
		return this.datatype;
	}

	public void setRawValue(String value){
		this.rawValue = value;
	}

	public void setDatatype(String value){
		this.datatype = value;
	}

	public String toString(){
		return "Unparseable Literal: "+this.rawValue+"^^"+this.datatype;
	}
}
