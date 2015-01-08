/**
 *  Copyright (c) 2014 THALES GLOBAL SERVICES.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *   
 *  Contributors:
 *     Helleboid Matthieu - initial API and implementation
 *     Anass Radouani 	 - initial API and implementation
 */
package org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPlugin;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPluginsContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Plugins Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.RequiredPluginsContainerImpl#getRequiredPlugins <em>Required Plugins</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.RequiredPluginsContainerImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiredPluginsContainerImpl extends CDOObjectImpl implements RequiredPluginsContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredPluginsContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSLC4EMFgeneratorPackage.Literals.REQUIRED_PLUGINS_CONTAINER;
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
	@SuppressWarnings("unchecked")
	public EList<RequiredPlugin> getRequiredPlugins() {
		return (EList<RequiredPlugin>)eGet(OSLC4EMFgeneratorPackage.Literals.REQUIRED_PLUGINS_CONTAINER__REQUIRED_PLUGINS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(OSLC4EMFgeneratorPackage.Literals.REQUIRED_PLUGINS_CONTAINER__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(OSLC4EMFgeneratorPackage.Literals.REQUIRED_PLUGINS_CONTAINER__NAME, newName);
	}

} //RequiredPluginsContainerImpl
