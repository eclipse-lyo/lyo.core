/**
 * Copyright (c) 2014 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 
 * Helleboid Matthieu 	- initial API and implementation
 * Anass Radouani 	 	- initial API and implementation
 */
package org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Property Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourcePropertyMapping#getResourceProperty <em>Resource Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorPackage#getResourcePropertyMapping()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ResourcePropertyMapping extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Resource Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Property</em>' reference.
	 * @see #setResourceProperty(ResourceProperty)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorPackage#getResourcePropertyMapping_ResourceProperty()
	 * @model required="true"
	 * @generated
	 */
	ResourceProperty getResourceProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourcePropertyMapping#getResourceProperty <em>Resource Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Property</em>' reference.
	 * @see #getResourceProperty()
	 * @generated
	 */
	void setResourceProperty(ResourceProperty value);

} // ResourcePropertyMapping
