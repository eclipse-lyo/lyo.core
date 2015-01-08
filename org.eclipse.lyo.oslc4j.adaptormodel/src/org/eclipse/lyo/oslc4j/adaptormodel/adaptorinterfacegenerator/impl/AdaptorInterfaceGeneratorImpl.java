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
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterface;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorPackage;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.DependenciesContainer;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourceMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adaptor Interface Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorImpl#getAdaptorInterface <em>Adaptor Interface</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorImpl#getDependenciesContainer <em>Dependencies Container</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorImpl#getResourceMappings <em>Resource Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AdaptorInterfaceGeneratorImpl extends CDOObjectImpl implements AdaptorInterfaceGenerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptorInterfaceGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorInterfaceGeneratorPackage.Literals.ADAPTOR_INTERFACE_GENERATOR;
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
	public AdaptorInterface getAdaptorInterface() {
		return (AdaptorInterface)eGet(AdaptorInterfaceGeneratorPackage.Literals.ADAPTOR_INTERFACE_GENERATOR__ADAPTOR_INTERFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdaptorInterface(AdaptorInterface newAdaptorInterface) {
		eSet(AdaptorInterfaceGeneratorPackage.Literals.ADAPTOR_INTERFACE_GENERATOR__ADAPTOR_INTERFACE, newAdaptorInterface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependenciesContainer getDependenciesContainer() {
		return (DependenciesContainer)eGet(AdaptorInterfaceGeneratorPackage.Literals.ADAPTOR_INTERFACE_GENERATOR__DEPENDENCIES_CONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependenciesContainer(DependenciesContainer newDependenciesContainer) {
		eSet(AdaptorInterfaceGeneratorPackage.Literals.ADAPTOR_INTERFACE_GENERATOR__DEPENDENCIES_CONTAINER, newDependenciesContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(AdaptorInterfaceGeneratorPackage.Literals.ADAPTOR_INTERFACE_GENERATOR__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(AdaptorInterfaceGeneratorPackage.Literals.ADAPTOR_INTERFACE_GENERATOR__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResourceMapping> getResourceMappings() {
		return (EList<ResourceMapping>)eGet(AdaptorInterfaceGeneratorPackage.Literals.ADAPTOR_INTERFACE_GENERATOR__RESOURCE_MAPPINGS, true);
	}

} //AdaptorInterfaceGeneratorImpl
