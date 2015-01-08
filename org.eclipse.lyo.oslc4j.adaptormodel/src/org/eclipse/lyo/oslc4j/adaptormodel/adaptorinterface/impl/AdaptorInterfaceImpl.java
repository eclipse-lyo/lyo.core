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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterface;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterfacePackage;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProviderCatalog;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Specification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adaptor Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfaceImpl#getServiceProviderCatalog <em>Service Provider Catalog</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfaceImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdaptorInterfaceImpl extends CDOObjectImpl implements AdaptorInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptorInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorInterfacePackage.Literals.ADAPTOR_INTERFACE;
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
	public ServiceProviderCatalog getServiceProviderCatalog() {
		return (ServiceProviderCatalog)eGet(AdaptorInterfacePackage.Literals.ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceProviderCatalog(ServiceProviderCatalog newServiceProviderCatalog) {
		eSet(AdaptorInterfacePackage.Literals.ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG, newServiceProviderCatalog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(AdaptorInterfacePackage.Literals.ADAPTOR_INTERFACE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(AdaptorInterfacePackage.Literals.ADAPTOR_INTERFACE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification getSpecification() {
		return (Specification)eGet(AdaptorInterfacePackage.Literals.ADAPTOR_INTERFACE__SPECIFICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(Specification newSpecification) {
		eSet(AdaptorInterfacePackage.Literals.ADAPTOR_INTERFACE__SPECIFICATION, newSpecification);
	}

} //AdaptorInterfaceImpl
