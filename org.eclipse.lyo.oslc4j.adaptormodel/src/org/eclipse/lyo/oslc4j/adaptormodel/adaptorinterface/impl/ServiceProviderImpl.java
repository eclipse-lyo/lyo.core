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
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Publisher;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Service;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceProviderImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceProviderImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceProviderImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceProviderImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceProviderImpl#getServiceNamespace <em>Service Namespace</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceProviderImpl#getInstanceID <em>Instance ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceProviderImpl extends CDOObjectImpl implements ServiceProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorInterfacePackage.Literals.SERVICE_PROVIDER;
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
	public String getTitle() {
		return (String)eGet(AdaptorInterfacePackage.Literals.SERVICE_PROVIDER__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		eSet(AdaptorInterfacePackage.Literals.SERVICE_PROVIDER__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(AdaptorInterfacePackage.Literals.SERVICE_PROVIDER__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(AdaptorInterfacePackage.Literals.SERVICE_PROVIDER__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher getPublisher() {
		return (Publisher)eGet(AdaptorInterfacePackage.Literals.SERVICE_PROVIDER__PUBLISHER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(Publisher newPublisher) {
		eSet(AdaptorInterfacePackage.Literals.SERVICE_PROVIDER__PUBLISHER, newPublisher);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Service> getServices() {
		return (EList<Service>)eGet(AdaptorInterfacePackage.Literals.SERVICE_PROVIDER__SERVICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceNamespace() {
		return (String)eGet(AdaptorInterfacePackage.Literals.SERVICE_PROVIDER__SERVICE_NAMESPACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceNamespace(String newServiceNamespace) {
		eSet(AdaptorInterfacePackage.Literals.SERVICE_PROVIDER__SERVICE_NAMESPACE, newServiceNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceID() {
		return (String)eGet(AdaptorInterfacePackage.Literals.SERVICE_PROVIDER__INSTANCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceID(String newInstanceID) {
		eSet(AdaptorInterfacePackage.Literals.SERVICE_PROVIDER__INSTANCE_ID, newInstanceID);
	}

} //ServiceProviderImpl
