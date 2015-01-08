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
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.BasicCapability;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.CreationFactory;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Dialog;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.DomainSpecification;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.QueryCapability;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceImpl#getDomainSpecification <em>Domain Specification</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceImpl#getCreationFactories <em>Creation Factories</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceImpl#getQueryCapabilities <em>Query Capabilities</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceImpl#getSelectionDialogs <em>Selection Dialogs</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceImpl#getCreationDialogs <em>Creation Dialogs</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceImpl#getBasicCapabilities <em>Basic Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends CDOObjectImpl implements Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorInterfacePackage.Literals.SERVICE;
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
	public DomainSpecification getDomainSpecification() {
		return (DomainSpecification)eGet(AdaptorInterfacePackage.Literals.SERVICE__DOMAIN_SPECIFICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainSpecification(DomainSpecification newDomainSpecification) {
		eSet(AdaptorInterfacePackage.Literals.SERVICE__DOMAIN_SPECIFICATION, newDomainSpecification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CreationFactory> getCreationFactories() {
		return (EList<CreationFactory>)eGet(AdaptorInterfacePackage.Literals.SERVICE__CREATION_FACTORIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<QueryCapability> getQueryCapabilities() {
		return (EList<QueryCapability>)eGet(AdaptorInterfacePackage.Literals.SERVICE__QUERY_CAPABILITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Dialog> getSelectionDialogs() {
		return (EList<Dialog>)eGet(AdaptorInterfacePackage.Literals.SERVICE__SELECTION_DIALOGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Dialog> getCreationDialogs() {
		return (EList<Dialog>)eGet(AdaptorInterfacePackage.Literals.SERVICE__CREATION_DIALOGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BasicCapability> getBasicCapabilities() {
		return (EList<BasicCapability>)eGet(AdaptorInterfacePackage.Literals.SERVICE__BASIC_CAPABILITIES, true);
	}

} //ServiceImpl
