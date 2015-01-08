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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorPackage;

import org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGeneratorFactory;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGeneratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptorManagerGeneratorPackageImpl extends EPackageImpl implements AdaptorManagerGeneratorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptorManagerGeneratorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGeneratorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdaptorManagerGeneratorPackageImpl() {
		super(eNS_URI, AdaptorManagerGeneratorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AdaptorManagerGeneratorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdaptorManagerGeneratorPackage init() {
		if (isInited) return (AdaptorManagerGeneratorPackage)EPackage.Registry.INSTANCE.getEPackage(AdaptorManagerGeneratorPackage.eNS_URI);

		// Obtain or create and register package
		AdaptorManagerGeneratorPackageImpl theAdaptorManagerGeneratorPackage = (AdaptorManagerGeneratorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AdaptorManagerGeneratorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AdaptorManagerGeneratorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AdaptorInterfaceGeneratorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAdaptorManagerGeneratorPackage.createPackageContents();

		// Initialize created meta-data
		theAdaptorManagerGeneratorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdaptorManagerGeneratorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdaptorManagerGeneratorPackage.eNS_URI, theAdaptorManagerGeneratorPackage);
		return theAdaptorManagerGeneratorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptorManagerGenerator() {
		return adaptorManagerGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdaptorManagerGenerator_JavaClassBaseNamespace() {
		return (EAttribute)adaptorManagerGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdaptorManagerGenerator_JavaFilesBasePath() {
		return (EAttribute)adaptorManagerGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdaptorManagerGenerator_JspFilesBasePath() {
		return (EAttribute)adaptorManagerGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdaptorManagerGenerator_JavascriptFilesBasePath() {
		return (EAttribute)adaptorManagerGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdaptorManagerGenerator_ApplicationName() {
		return (EAttribute)adaptorManagerGeneratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdaptorManagerGenerator_WebApplicationBasePath() {
		return (EAttribute)adaptorManagerGeneratorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptorManagerGeneratorFactory getAdaptorManagerGeneratorFactory() {
		return (AdaptorManagerGeneratorFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		adaptorManagerGeneratorEClass = createEClass(ADAPTOR_MANAGER_GENERATOR);
		createEAttribute(adaptorManagerGeneratorEClass, ADAPTOR_MANAGER_GENERATOR__JAVA_CLASS_BASE_NAMESPACE);
		createEAttribute(adaptorManagerGeneratorEClass, ADAPTOR_MANAGER_GENERATOR__JAVA_FILES_BASE_PATH);
		createEAttribute(adaptorManagerGeneratorEClass, ADAPTOR_MANAGER_GENERATOR__JSP_FILES_BASE_PATH);
		createEAttribute(adaptorManagerGeneratorEClass, ADAPTOR_MANAGER_GENERATOR__JAVASCRIPT_FILES_BASE_PATH);
		createEAttribute(adaptorManagerGeneratorEClass, ADAPTOR_MANAGER_GENERATOR__APPLICATION_NAME);
		createEAttribute(adaptorManagerGeneratorEClass, ADAPTOR_MANAGER_GENERATOR__WEB_APPLICATION_BASE_PATH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AdaptorInterfaceGeneratorPackage theAdaptorInterfaceGeneratorPackage = (AdaptorInterfaceGeneratorPackage)EPackage.Registry.INSTANCE.getEPackage(AdaptorInterfaceGeneratorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		adaptorManagerGeneratorEClass.getESuperTypes().add(theAdaptorInterfaceGeneratorPackage.getAdaptorInterfaceGenerator());

		// Initialize classes, features, and operations; add parameters
		initEClass(adaptorManagerGeneratorEClass, AdaptorManagerGenerator.class, "AdaptorManagerGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdaptorManagerGenerator_JavaClassBaseNamespace(), ecorePackage.getEString(), "javaClassBaseNamespace", null, 1, 1, AdaptorManagerGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorManagerGenerator_JavaFilesBasePath(), ecorePackage.getEString(), "javaFilesBasePath", null, 1, 1, AdaptorManagerGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorManagerGenerator_JspFilesBasePath(), ecorePackage.getEString(), "jspFilesBasePath", null, 1, 1, AdaptorManagerGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorManagerGenerator_JavascriptFilesBasePath(), ecorePackage.getEString(), "javascriptFilesBasePath", null, 1, 1, AdaptorManagerGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorManagerGenerator_ApplicationName(), ecorePackage.getEString(), "applicationName", null, 1, 1, AdaptorManagerGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorManagerGenerator_WebApplicationBasePath(), ecorePackage.getEString(), "webApplicationBasePath", null, 1, 1, AdaptorManagerGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AdaptorManagerGeneratorPackageImpl
