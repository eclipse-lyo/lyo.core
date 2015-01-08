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

import org.eclipse.emf.common.util.EList;

import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptor Interface Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator#getAdaptorInterface <em>Adaptor Interface</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator#getDependenciesContainer <em>Dependencies Container</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator#getResourceMappings <em>Resource Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorPackage#getAdaptorInterfaceGenerator()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface AdaptorInterfaceGenerator extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Adaptor Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adaptor Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adaptor Interface</em>' reference.
	 * @see #setAdaptorInterface(AdaptorInterface)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorPackage#getAdaptorInterfaceGenerator_AdaptorInterface()
	 * @model required="true"
	 * @generated
	 */
	AdaptorInterface getAdaptorInterface();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator#getAdaptorInterface <em>Adaptor Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adaptor Interface</em>' reference.
	 * @see #getAdaptorInterface()
	 * @generated
	 */
	void setAdaptorInterface(AdaptorInterface value);

	/**
	 * Returns the value of the '<em><b>Dependencies Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies Container</em>' containment reference.
	 * @see #setDependenciesContainer(DependenciesContainer)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorPackage#getAdaptorInterfaceGenerator_DependenciesContainer()
	 * @model containment="true"
	 * @generated
	 */
	DependenciesContainer getDependenciesContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator#getDependenciesContainer <em>Dependencies Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependencies Container</em>' containment reference.
	 * @see #getDependenciesContainer()
	 * @generated
	 */
	void setDependenciesContainer(DependenciesContainer value);

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
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorPackage#getAdaptorInterfaceGenerator_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Resource Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourceMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Mappings</em>' containment reference list.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorPackage#getAdaptorInterfaceGenerator_ResourceMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceMapping> getResourceMappings();

} // AdaptorInterfaceGenerator
