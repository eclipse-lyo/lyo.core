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
package org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Resource;

import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorPackage;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourceMapping;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourcePropertyMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.ResourceMappingImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.ResourceMappingImpl#getResourcePropertyMappings <em>Resource Property Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ResourceMappingImpl extends CDOObjectImpl implements ResourceMapping {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorInterfaceGeneratorPackage.Literals.RESOURCE_MAPPING;
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
	public Resource getResource() {
		return (Resource)eGet(AdaptorInterfaceGeneratorPackage.Literals.RESOURCE_MAPPING__RESOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		eSet(AdaptorInterfaceGeneratorPackage.Literals.RESOURCE_MAPPING__RESOURCE, newResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResourcePropertyMapping> getResourcePropertyMappings() {
		return (EList<ResourcePropertyMapping>)eGet(AdaptorInterfaceGeneratorPackage.Literals.RESOURCE_MAPPING__RESOURCE_PROPERTY_MAPPINGS, true);
	}

} //ResourceMappingImpl
