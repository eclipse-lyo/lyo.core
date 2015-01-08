/**
 * Copyright (c) 2014 Jad El-khoury.
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
 * Jad El-khoury		- initial adaptor model
 * Matthieu Helleboid	- Move default generation information to Adaptor Manager Generator 
 * 						- Add Adaptor Interface GenModel and generate the model code, the model edit and the editor using ai as file extension
 * Anass Radouani		- Move default generation information to Adaptor Manager Generator 
 * 						- Add Adaptor Interface GenModel and generate the model code, the model edit and the editor using ai as file extension
 */
package org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Specification#getDomainSpecifications <em>Domain Specifications</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Specification#getDomainPrefixes <em>Domain Prefixes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterfacePackage#getSpecification()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Specification extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Domain Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.DomainSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Specifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Specifications</em>' containment reference list.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterfacePackage#getSpecification_DomainSpecifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainSpecification> getDomainSpecifications();

	/**
	 * Returns the value of the '<em><b>Domain Prefixes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.NamespacePrefix}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Prefixes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Prefixes</em>' containment reference list.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterfacePackage#getSpecification_DomainPrefixes()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamespacePrefix> getDomainPrefixes();

} // Specification
