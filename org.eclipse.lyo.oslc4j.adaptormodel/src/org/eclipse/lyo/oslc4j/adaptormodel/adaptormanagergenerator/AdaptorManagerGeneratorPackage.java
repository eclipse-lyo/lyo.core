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
package org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGeneratorFactory
 * @model kind="package"
 * @generated
 */
public interface AdaptorManagerGeneratorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adaptormanagergenerator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.lyo/oslc4j/adaptorManagerGenerator";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oslc4j_amg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdaptorManagerGeneratorPackage eINSTANCE = org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.impl.AdaptorManagerGeneratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.impl.AdaptorManagerGeneratorImpl <em>Adaptor Manager Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.impl.AdaptorManagerGeneratorImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.impl.AdaptorManagerGeneratorPackageImpl#getAdaptorManagerGenerator()
	 * @generated
	 */
	int ADAPTOR_MANAGER_GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Adaptor Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_MANAGER_GENERATOR__ADAPTOR_INTERFACE = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR__ADAPTOR_INTERFACE;

	/**
	 * The feature id for the '<em><b>Dependencies Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_MANAGER_GENERATOR__DEPENDENCIES_CONTAINER = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR__DEPENDENCIES_CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_MANAGER_GENERATOR__NAME = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Resource Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_MANAGER_GENERATOR__RESOURCE_MAPPINGS = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR__RESOURCE_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Java Class Base Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_MANAGER_GENERATOR__JAVA_CLASS_BASE_NAMESPACE = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Java Files Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_MANAGER_GENERATOR__JAVA_FILES_BASE_PATH = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jsp Files Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_MANAGER_GENERATOR__JSP_FILES_BASE_PATH = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Javascript Files Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_MANAGER_GENERATOR__JAVASCRIPT_FILES_BASE_PATH = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Application Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_MANAGER_GENERATOR__APPLICATION_NAME = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Web Application Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_MANAGER_GENERATOR__WEB_APPLICATION_BASE_PATH = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Adaptor Manager Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_MANAGER_GENERATOR_FEATURE_COUNT = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Adaptor Manager Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_MANAGER_GENERATOR_OPERATION_COUNT = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator <em>Adaptor Manager Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptor Manager Generator</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator
	 * @generated
	 */
	EClass getAdaptorManagerGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getJavaClassBaseNamespace <em>Java Class Base Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Class Base Namespace</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getJavaClassBaseNamespace()
	 * @see #getAdaptorManagerGenerator()
	 * @generated
	 */
	EAttribute getAdaptorManagerGenerator_JavaClassBaseNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getJavaFilesBasePath <em>Java Files Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Files Base Path</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getJavaFilesBasePath()
	 * @see #getAdaptorManagerGenerator()
	 * @generated
	 */
	EAttribute getAdaptorManagerGenerator_JavaFilesBasePath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getJspFilesBasePath <em>Jsp Files Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jsp Files Base Path</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getJspFilesBasePath()
	 * @see #getAdaptorManagerGenerator()
	 * @generated
	 */
	EAttribute getAdaptorManagerGenerator_JspFilesBasePath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getJavascriptFilesBasePath <em>Javascript Files Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Javascript Files Base Path</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getJavascriptFilesBasePath()
	 * @see #getAdaptorManagerGenerator()
	 * @generated
	 */
	EAttribute getAdaptorManagerGenerator_JavascriptFilesBasePath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getApplicationName <em>Application Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Name</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getApplicationName()
	 * @see #getAdaptorManagerGenerator()
	 * @generated
	 */
	EAttribute getAdaptorManagerGenerator_ApplicationName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getWebApplicationBasePath <em>Web Application Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Application Base Path</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getWebApplicationBasePath()
	 * @see #getAdaptorManagerGenerator()
	 * @generated
	 */
	EAttribute getAdaptorManagerGenerator_WebApplicationBasePath();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdaptorManagerGeneratorFactory getAdaptorManagerGeneratorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.impl.AdaptorManagerGeneratorImpl <em>Adaptor Manager Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.impl.AdaptorManagerGeneratorImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.impl.AdaptorManagerGeneratorPackageImpl#getAdaptorManagerGenerator()
		 * @generated
		 */
		EClass ADAPTOR_MANAGER_GENERATOR = eINSTANCE.getAdaptorManagerGenerator();

		/**
		 * The meta object literal for the '<em><b>Java Class Base Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTOR_MANAGER_GENERATOR__JAVA_CLASS_BASE_NAMESPACE = eINSTANCE.getAdaptorManagerGenerator_JavaClassBaseNamespace();

		/**
		 * The meta object literal for the '<em><b>Java Files Base Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTOR_MANAGER_GENERATOR__JAVA_FILES_BASE_PATH = eINSTANCE.getAdaptorManagerGenerator_JavaFilesBasePath();

		/**
		 * The meta object literal for the '<em><b>Jsp Files Base Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTOR_MANAGER_GENERATOR__JSP_FILES_BASE_PATH = eINSTANCE.getAdaptorManagerGenerator_JspFilesBasePath();

		/**
		 * The meta object literal for the '<em><b>Javascript Files Base Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTOR_MANAGER_GENERATOR__JAVASCRIPT_FILES_BASE_PATH = eINSTANCE.getAdaptorManagerGenerator_JavascriptFilesBasePath();

		/**
		 * The meta object literal for the '<em><b>Application Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTOR_MANAGER_GENERATOR__APPLICATION_NAME = eINSTANCE.getAdaptorManagerGenerator_ApplicationName();

		/**
		 * The meta object literal for the '<em><b>Web Application Base Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTOR_MANAGER_GENERATOR__WEB_APPLICATION_BASE_PATH = eINSTANCE.getAdaptorManagerGenerator_WebApplicationBasePath();

	}

} //AdaptorManagerGeneratorPackage
