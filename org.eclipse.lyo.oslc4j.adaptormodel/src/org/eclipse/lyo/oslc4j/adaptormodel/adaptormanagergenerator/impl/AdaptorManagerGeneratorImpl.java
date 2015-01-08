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
 * Jad El-khoury		- Adaptor Manager Generator
 * Matthieu Helleboid	- Extract generation information from Adaptor Interface and move them to tje Adaptor Manager Generator
 * Anass Radouani		- Extract generation information from Adaptor Interface and move them to tje Adaptor Manager Generator
 */
package org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorImpl;

import org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGeneratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adaptor Manager Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.impl.AdaptorManagerGeneratorImpl#getJavaClassBaseNamespace <em>Java Class Base Namespace</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.impl.AdaptorManagerGeneratorImpl#getJavaFilesBasePath <em>Java Files Base Path</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.impl.AdaptorManagerGeneratorImpl#getJspFilesBasePath <em>Jsp Files Base Path</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.impl.AdaptorManagerGeneratorImpl#getJavascriptFilesBasePath <em>Javascript Files Base Path</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.impl.AdaptorManagerGeneratorImpl#getApplicationName <em>Application Name</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.impl.AdaptorManagerGeneratorImpl#getWebApplicationBasePath <em>Web Application Base Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdaptorManagerGeneratorImpl extends AdaptorInterfaceGeneratorImpl implements AdaptorManagerGenerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptorManagerGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorManagerGeneratorPackage.Literals.ADAPTOR_MANAGER_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaClassBaseNamespace() {
		return (String)eGet(AdaptorManagerGeneratorPackage.Literals.ADAPTOR_MANAGER_GENERATOR__JAVA_CLASS_BASE_NAMESPACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaClassBaseNamespace(String newJavaClassBaseNamespace) {
		eSet(AdaptorManagerGeneratorPackage.Literals.ADAPTOR_MANAGER_GENERATOR__JAVA_CLASS_BASE_NAMESPACE, newJavaClassBaseNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaFilesBasePath() {
		return (String)eGet(AdaptorManagerGeneratorPackage.Literals.ADAPTOR_MANAGER_GENERATOR__JAVA_FILES_BASE_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaFilesBasePath(String newJavaFilesBasePath) {
		eSet(AdaptorManagerGeneratorPackage.Literals.ADAPTOR_MANAGER_GENERATOR__JAVA_FILES_BASE_PATH, newJavaFilesBasePath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJspFilesBasePath() {
		return (String)eGet(AdaptorManagerGeneratorPackage.Literals.ADAPTOR_MANAGER_GENERATOR__JSP_FILES_BASE_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJspFilesBasePath(String newJspFilesBasePath) {
		eSet(AdaptorManagerGeneratorPackage.Literals.ADAPTOR_MANAGER_GENERATOR__JSP_FILES_BASE_PATH, newJspFilesBasePath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavascriptFilesBasePath() {
		return (String)eGet(AdaptorManagerGeneratorPackage.Literals.ADAPTOR_MANAGER_GENERATOR__JAVASCRIPT_FILES_BASE_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavascriptFilesBasePath(String newJavascriptFilesBasePath) {
		eSet(AdaptorManagerGeneratorPackage.Literals.ADAPTOR_MANAGER_GENERATOR__JAVASCRIPT_FILES_BASE_PATH, newJavascriptFilesBasePath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationName() {
		return (String)eGet(AdaptorManagerGeneratorPackage.Literals.ADAPTOR_MANAGER_GENERATOR__APPLICATION_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationName(String newApplicationName) {
		eSet(AdaptorManagerGeneratorPackage.Literals.ADAPTOR_MANAGER_GENERATOR__APPLICATION_NAME, newApplicationName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebApplicationBasePath() {
		return (String)eGet(AdaptorManagerGeneratorPackage.Literals.ADAPTOR_MANAGER_GENERATOR__WEB_APPLICATION_BASE_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebApplicationBasePath(String newWebApplicationBasePath) {
		eSet(AdaptorManagerGeneratorPackage.Literals.ADAPTOR_MANAGER_GENERATOR__WEB_APPLICATION_BASE_PATH, newWebApplicationBasePath);
	}

} //AdaptorManagerGeneratorImpl
