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
package org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterfacePackage;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.DomainSpecification;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.NamespacePrefix;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Resource;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.DomainSpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.DomainSpecificationImpl#getNamespaceURI <em>Namespace URI</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.DomainSpecificationImpl#getNamespacePrefix <em>Namespace Prefix</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.DomainSpecificationImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.DomainSpecificationImpl#getResourceProperties <em>Resource Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainSpecificationImpl extends CDOObjectImpl implements DomainSpecification {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorInterfacePackage.Literals.DOMAIN_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(AdaptorInterfacePackage.Literals.DOMAIN_SPECIFICATION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(AdaptorInterfacePackage.Literals.DOMAIN_SPECIFICATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespaceURI() {
		return (String)eGet(AdaptorInterfacePackage.Literals.DOMAIN_SPECIFICATION__NAMESPACE_URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespaceURI(String newNamespaceURI) {
		eSet(AdaptorInterfacePackage.Literals.DOMAIN_SPECIFICATION__NAMESPACE_URI, newNamespaceURI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacePrefix getNamespacePrefix() {
		return (NamespacePrefix)eGet(AdaptorInterfacePackage.Literals.DOMAIN_SPECIFICATION__NAMESPACE_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespacePrefix(NamespacePrefix newNamespacePrefix) {
		eSet(AdaptorInterfacePackage.Literals.DOMAIN_SPECIFICATION__NAMESPACE_PREFIX, newNamespacePrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Resource> getResources() {
		return (EList<Resource>)eGet(AdaptorInterfacePackage.Literals.DOMAIN_SPECIFICATION__RESOURCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResourceProperty> getResourceProperties() {
		return (EList<ResourceProperty>)eGet(AdaptorInterfacePackage.Literals.DOMAIN_SPECIFICATION__RESOURCE_PROPERTIES, true);
	}

} //DomainSpecificationImpl
