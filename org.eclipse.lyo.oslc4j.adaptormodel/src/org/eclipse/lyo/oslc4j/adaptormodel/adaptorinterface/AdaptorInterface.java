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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptor Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterface#getServiceProviderCatalog <em>Service Provider Catalog</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterface#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterface#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterfacePackage#getAdaptorInterface()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface AdaptorInterface extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Service Provider Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Provider Catalog</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Provider Catalog</em>' containment reference.
	 * @see #setServiceProviderCatalog(ServiceProviderCatalog)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterfacePackage#getAdaptorInterface_ServiceProviderCatalog()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ServiceProviderCatalog getServiceProviderCatalog();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterface#getServiceProviderCatalog <em>Service Provider Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Provider Catalog</em>' containment reference.
	 * @see #getServiceProviderCatalog()
	 * @generated
	 */
	void setServiceProviderCatalog(ServiceProviderCatalog value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterfacePackage#getAdaptorInterface_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(Specification)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterfacePackage#getAdaptorInterface_Specification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Specification getSpecification();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterface#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Specification value);

} // AdaptorInterface
