/*******************************************************************************
Copyright (c) 2013 Jad El-khoury

All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 
The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
and the Eclipse Distribution License is available at
http://www.eclipse.org/org/documents/edl-v10.php.

Contributors:

    Jad El-khoury          - initial API and implementation
    Matthieu Helleboid	   - Helper to invoke EOperation
    Anass Radouani		   - Helper to invoke EOperation
 *******************************************************************************/
package org.eclipse.lyo.oslc4j.codegenerator.services;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

public class Services {

	public String OBS_attributeTypeDeclaration(String valueType, String occurs, String range) {
	String type = "";
	switch (valueType) {
		case ("Boolean"):
		case ("String"):
			type = valueType;
		break;
		case ("DateTime"):
			type = "Date";
		break;
		case ("URI"):
			type = "java.net.URI";
		break;
		case ("Resource"):
			type = range;
		break;	
	}
	
	if (occurs.equals("zeroOrMany") || (occurs.equals("oneOrMany"))) {
		type = "java.util.ArrayList<" + type + ">";
	}

	return type;
  }
	
	/**
	 * invoke EOperation
	 * @param self EObject containing the EOperation
	 * @param operation the EOperation to invoke
	 * @param arguments EOperation arguments
	 * @return
	 */
	public Object invoke(EObject self, EOperation operation, Collection<Object> arguments){
		try {
			Object eInvoke = self.eInvoke(operation, new BasicEList<Object>(arguments));
			return eInvoke;
		} catch (InvocationTargetException e) {
			return "";
		}
	}

}