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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorImpl;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackagesExportContainer;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPluginsContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OSLC4EMF Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFGeneratorImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFGeneratorImpl#getJavaVersion <em>Java Version</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFGeneratorImpl#getPackagesExportContainer <em>Packages Export Container</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFGeneratorImpl#getRequiredPluginsContainer <em>Required Plugins Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OSLC4EMFGeneratorImpl extends AdaptorInterfaceGeneratorImpl implements OSLC4EMFGenerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSLC4EMFGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSLC4EMFGenerator getExtends() {
		return (OSLC4EMFGenerator)eGet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_GENERATOR__EXTENDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(OSLC4EMFGenerator newExtends) {
		eSet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_GENERATOR__EXTENDS, newExtends);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaVersion() {
		return (String)eGet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_GENERATOR__JAVA_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaVersion(String newJavaVersion) {
		eSet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_GENERATOR__JAVA_VERSION, newJavaVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagesExportContainer getPackagesExportContainer() {
		return (PackagesExportContainer)eGet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_GENERATOR__PACKAGES_EXPORT_CONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackagesExportContainer(PackagesExportContainer newPackagesExportContainer) {
		eSet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_GENERATOR__PACKAGES_EXPORT_CONTAINER, newPackagesExportContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredPluginsContainer getRequiredPluginsContainer() {
		return (RequiredPluginsContainer)eGet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_GENERATOR__REQUIRED_PLUGINS_CONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredPluginsContainer(RequiredPluginsContainer newRequiredPluginsContainer) {
		eSet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_GENERATOR__REQUIRED_PLUGINS_CONTAINER, newRequiredPluginsContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getJavaFilesBasePath() {
		return "/src/";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix(String key) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OSLC4EMFgeneratorPackage.OSLC4EMF_GENERATOR___GET_JAVA_FILES_BASE_PATH:
				return getJavaFilesBasePath();
			case OSLC4EMFgeneratorPackage.OSLC4EMF_GENERATOR___GET_PREFIX__STRING:
				return getPrefix((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //OSLC4EMFGeneratorImpl
