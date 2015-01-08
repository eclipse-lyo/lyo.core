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
import org.eclipse.lyo.oslc4j.adaptormodel.emf.constants.CoreServicesConstants;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFCoreGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage;
import org.eclipse.lyo.oslc4j.codegenerator.services.ServicesConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OSLC4EMF Core Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFCoreGeneratorImpl#getCorePluginId <em>Core Plugin Id</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFCoreGeneratorImpl#getBasePackage <em>Base Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OSLC4EMFCoreGeneratorImpl extends OSLC4EMFGeneratorImpl implements OSLC4EMFCoreGenerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSLC4EMFCoreGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_CORE_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorePluginId() {
		return (String)eGet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_CORE_GENERATOR__CORE_PLUGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorePluginId(String newCorePluginId) {
		eSet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_CORE_GENERATOR__CORE_PLUGIN_ID, newCorePluginId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePackage() {
		return (String)eGet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_CORE_GENERATOR__BASE_PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePackage(String newBasePackage) {
		eSet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_CORE_GENERATOR__BASE_PACKAGE, newBasePackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String webApplicationBasePath() {
		return "/";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OSLC4EMFgeneratorPackage.OSLC4EMF_CORE_GENERATOR___WEB_APPLICATION_BASE_PATH:
				return webApplicationBasePath();
		}
		return super.eInvoke(operationID, arguments);
	}
	
	@Override
	public String getPrefix(String key) {
		//We should not generate unwanted files
		//So all generated elements can have this prefix
		String result = "";
		switch (key) {
		case ServicesConstants.PREFIX_DELEGATE_UI_JS:
			result = "/WebContent/";
			break;
		case ServicesConstants.PREFIX_SERVICE_PROVIDER_CATALOG_JSP:
			result = "/WebContent/" + getCorePluginId().replaceAll("\\.", "/");
			break;
		case CoreServicesConstants.PREFIX_CORE_ACTIVATOR:
			result = getCorePluginId();
			break;
		default:
			result = getCorePluginId() + "."; 
			break;
		}
		return result;
	}

} //OSLC4EMFCoreGeneratorImpl
