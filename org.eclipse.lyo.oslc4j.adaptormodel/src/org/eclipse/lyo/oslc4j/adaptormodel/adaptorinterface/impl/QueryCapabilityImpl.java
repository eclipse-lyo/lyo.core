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
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.QueryCapability;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.QueryCapabilityImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.QueryCapabilityImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.QueryCapabilityImpl#getQueryBaseURI <em>Query Base URI</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.QueryCapabilityImpl#getResourceTypes <em>Resource Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryCapabilityImpl extends CDOObjectImpl implements QueryCapability {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorInterfacePackage.Literals.QUERY_CAPABILITY;
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
		return (String)eGet(AdaptorInterfacePackage.Literals.QUERY_CAPABILITY__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		eSet(AdaptorInterfacePackage.Literals.QUERY_CAPABILITY__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eGet(AdaptorInterfacePackage.Literals.QUERY_CAPABILITY__LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eSet(AdaptorInterfacePackage.Literals.QUERY_CAPABILITY__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueryBaseURI() {
		return (String)eGet(AdaptorInterfacePackage.Literals.QUERY_CAPABILITY__QUERY_BASE_URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryBaseURI(String newQueryBaseURI) {
		eSet(AdaptorInterfacePackage.Literals.QUERY_CAPABILITY__QUERY_BASE_URI, newQueryBaseURI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Resource> getResourceTypes() {
		return (EList<Resource>)eGet(AdaptorInterfacePackage.Literals.QUERY_CAPABILITY__RESOURCE_TYPES, true);
	}

} //QueryCapabilityImpl
