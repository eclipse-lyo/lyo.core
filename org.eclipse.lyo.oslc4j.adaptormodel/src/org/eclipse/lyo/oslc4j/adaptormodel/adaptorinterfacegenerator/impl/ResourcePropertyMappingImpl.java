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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty;

import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorPackage;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourcePropertyMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Property Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.ResourcePropertyMappingImpl#getResourceProperty <em>Resource Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ResourcePropertyMappingImpl extends CDOObjectImpl implements ResourcePropertyMapping {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcePropertyMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorInterfaceGeneratorPackage.Literals.RESOURCE_PROPERTY_MAPPING;
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
	public ResourceProperty getResourceProperty() {
		return (ResourceProperty)eGet(AdaptorInterfaceGeneratorPackage.Literals.RESOURCE_PROPERTY_MAPPING__RESOURCE_PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceProperty(ResourceProperty newResourceProperty) {
		eSet(AdaptorInterfaceGeneratorPackage.Literals.RESOURCE_PROPERTY_MAPPING__RESOURCE_PROPERTY, newResourceProperty);
	}

} //ResourcePropertyMappingImpl
