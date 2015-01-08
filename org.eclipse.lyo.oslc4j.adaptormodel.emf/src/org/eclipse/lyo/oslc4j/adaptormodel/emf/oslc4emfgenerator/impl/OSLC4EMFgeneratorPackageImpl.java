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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorPackage;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EClassMapping;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EStructuralFeatureMapping;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFCoreGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorFactory;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackageExport;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackageExportFeature;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackagesExportContainer;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPlugin;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPluginFeature;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPluginsContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OSLC4EMFgeneratorPackageImpl extends EPackageImpl implements OSLC4EMFgeneratorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oslc4EMFGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStructuralFeatureMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oslc4EMFCoreGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oslc4EMFExposerGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packagesExportContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageExportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredPluginsContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredPluginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredPluginFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageExportFeatureEClass = null;

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
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OSLC4EMFgeneratorPackageImpl() {
		super(eNS_URI, OSLC4EMFgeneratorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OSLC4EMFgeneratorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OSLC4EMFgeneratorPackage init() {
		if (isInited) return (OSLC4EMFgeneratorPackage)EPackage.Registry.INSTANCE.getEPackage(OSLC4EMFgeneratorPackage.eNS_URI);

		// Obtain or create and register package
		OSLC4EMFgeneratorPackageImpl theOSLC4EMFgeneratorPackage = (OSLC4EMFgeneratorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OSLC4EMFgeneratorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OSLC4EMFgeneratorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AdaptorInterfaceGeneratorPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOSLC4EMFgeneratorPackage.createPackageContents();

		// Initialize created meta-data
		theOSLC4EMFgeneratorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOSLC4EMFgeneratorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OSLC4EMFgeneratorPackage.eNS_URI, theOSLC4EMFgeneratorPackage);
		return theOSLC4EMFgeneratorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSLC4EMFGenerator() {
		return oslc4EMFGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSLC4EMFGenerator_Extends() {
		return (EReference)oslc4EMFGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSLC4EMFGenerator_JavaVersion() {
		return (EAttribute)oslc4EMFGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSLC4EMFGenerator_PackagesExportContainer() {
		return (EReference)oslc4EMFGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSLC4EMFGenerator_RequiredPluginsContainer() {
		return (EReference)oslc4EMFGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOSLC4EMFGenerator__GetJavaFilesBasePath() {
		return oslc4EMFGeneratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOSLC4EMFGenerator__GetPrefix__String() {
		return oslc4EMFGeneratorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStructuralFeatureMapping() {
		return eStructuralFeatureMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStructuralFeatureMapping_EStructuralFeature() {
		return (EReference)eStructuralFeatureMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClassMapping() {
		return eClassMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassMapping_EClass() {
		return (EReference)eClassMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSLC4EMFCoreGenerator() {
		return oslc4EMFCoreGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSLC4EMFCoreGenerator_CorePluginId() {
		return (EAttribute)oslc4EMFCoreGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSLC4EMFCoreGenerator_BasePackage() {
		return (EAttribute)oslc4EMFCoreGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOSLC4EMFCoreGenerator__WebApplicationBasePath() {
		return oslc4EMFCoreGeneratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSLC4EMFExposerGenerator() {
		return oslc4EMFExposerGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSLC4EMFExposerGenerator_CommonPluginId() {
		return (EAttribute)oslc4EMFExposerGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSLC4EMFExposerGenerator_ExposerPluginId() {
		return (EAttribute)oslc4EMFExposerGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSLC4EMFExposerGenerator_BasePackage() {
		return (EAttribute)oslc4EMFExposerGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSLC4EMFExposerGenerator_CorePluginId() {
		return (EAttribute)oslc4EMFExposerGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSLC4EMFExposerGenerator_CoreBasePackage() {
		return (EAttribute)oslc4EMFExposerGeneratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSLC4EMFExposerGenerator_ExposerDependenciesContainer() {
		return (EReference)oslc4EMFExposerGeneratorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSLC4EMFExposerGenerator_ExposerRequiredPluginsContainer() {
		return (EReference)oslc4EMFExposerGeneratorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSLC4EMFExposerGenerator_ExposerPackagesExportContainer() {
		return (EReference)oslc4EMFExposerGeneratorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackagesExportContainer() {
		return packagesExportContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackagesExportContainer_PackagesExport() {
		return (EReference)packagesExportContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackagesExportContainer_Name() {
		return (EAttribute)packagesExportContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageExport() {
		return packageExportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageExport_Id() {
		return (EAttribute)packageExportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredPluginsContainer() {
		return requiredPluginsContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredPluginsContainer_RequiredPlugins() {
		return (EReference)requiredPluginsContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredPluginsContainer_Name() {
		return (EAttribute)requiredPluginsContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredPlugin() {
		return requiredPluginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredPlugin_Id() {
		return (EAttribute)requiredPluginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredPluginFeature() {
		return requiredPluginFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageExportFeature() {
		return packageExportFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSLC4EMFgeneratorFactory getOSLC4EMFgeneratorFactory() {
		return (OSLC4EMFgeneratorFactory)getEFactoryInstance();
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
		oslc4EMFGeneratorEClass = createEClass(OSLC4EMF_GENERATOR);
		createEReference(oslc4EMFGeneratorEClass, OSLC4EMF_GENERATOR__EXTENDS);
		createEAttribute(oslc4EMFGeneratorEClass, OSLC4EMF_GENERATOR__JAVA_VERSION);
		createEReference(oslc4EMFGeneratorEClass, OSLC4EMF_GENERATOR__PACKAGES_EXPORT_CONTAINER);
		createEReference(oslc4EMFGeneratorEClass, OSLC4EMF_GENERATOR__REQUIRED_PLUGINS_CONTAINER);
		createEOperation(oslc4EMFGeneratorEClass, OSLC4EMF_GENERATOR___GET_JAVA_FILES_BASE_PATH);
		createEOperation(oslc4EMFGeneratorEClass, OSLC4EMF_GENERATOR___GET_PREFIX__STRING);

		eStructuralFeatureMappingEClass = createEClass(ESTRUCTURAL_FEATURE_MAPPING);
		createEReference(eStructuralFeatureMappingEClass, ESTRUCTURAL_FEATURE_MAPPING__ESTRUCTURAL_FEATURE);

		eClassMappingEClass = createEClass(ECLASS_MAPPING);
		createEReference(eClassMappingEClass, ECLASS_MAPPING__ECLASS);

		oslc4EMFCoreGeneratorEClass = createEClass(OSLC4EMF_CORE_GENERATOR);
		createEAttribute(oslc4EMFCoreGeneratorEClass, OSLC4EMF_CORE_GENERATOR__CORE_PLUGIN_ID);
		createEAttribute(oslc4EMFCoreGeneratorEClass, OSLC4EMF_CORE_GENERATOR__BASE_PACKAGE);
		createEOperation(oslc4EMFCoreGeneratorEClass, OSLC4EMF_CORE_GENERATOR___WEB_APPLICATION_BASE_PATH);

		oslc4EMFExposerGeneratorEClass = createEClass(OSLC4EMF_EXPOSER_GENERATOR);
		createEAttribute(oslc4EMFExposerGeneratorEClass, OSLC4EMF_EXPOSER_GENERATOR__COMMON_PLUGIN_ID);
		createEAttribute(oslc4EMFExposerGeneratorEClass, OSLC4EMF_EXPOSER_GENERATOR__EXPOSER_PLUGIN_ID);
		createEAttribute(oslc4EMFExposerGeneratorEClass, OSLC4EMF_EXPOSER_GENERATOR__BASE_PACKAGE);
		createEAttribute(oslc4EMFExposerGeneratorEClass, OSLC4EMF_EXPOSER_GENERATOR__CORE_PLUGIN_ID);
		createEAttribute(oslc4EMFExposerGeneratorEClass, OSLC4EMF_EXPOSER_GENERATOR__CORE_BASE_PACKAGE);
		createEReference(oslc4EMFExposerGeneratorEClass, OSLC4EMF_EXPOSER_GENERATOR__EXPOSER_DEPENDENCIES_CONTAINER);
		createEReference(oslc4EMFExposerGeneratorEClass, OSLC4EMF_EXPOSER_GENERATOR__EXPOSER_REQUIRED_PLUGINS_CONTAINER);
		createEReference(oslc4EMFExposerGeneratorEClass, OSLC4EMF_EXPOSER_GENERATOR__EXPOSER_PACKAGES_EXPORT_CONTAINER);

		packagesExportContainerEClass = createEClass(PACKAGES_EXPORT_CONTAINER);
		createEReference(packagesExportContainerEClass, PACKAGES_EXPORT_CONTAINER__PACKAGES_EXPORT);
		createEAttribute(packagesExportContainerEClass, PACKAGES_EXPORT_CONTAINER__NAME);

		packageExportEClass = createEClass(PACKAGE_EXPORT);
		createEAttribute(packageExportEClass, PACKAGE_EXPORT__ID);

		requiredPluginsContainerEClass = createEClass(REQUIRED_PLUGINS_CONTAINER);
		createEReference(requiredPluginsContainerEClass, REQUIRED_PLUGINS_CONTAINER__REQUIRED_PLUGINS);
		createEAttribute(requiredPluginsContainerEClass, REQUIRED_PLUGINS_CONTAINER__NAME);

		requiredPluginEClass = createEClass(REQUIRED_PLUGIN);
		createEAttribute(requiredPluginEClass, REQUIRED_PLUGIN__ID);

		requiredPluginFeatureEClass = createEClass(REQUIRED_PLUGIN_FEATURE);

		packageExportFeatureEClass = createEClass(PACKAGE_EXPORT_FEATURE);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		oslc4EMFGeneratorEClass.getESuperTypes().add(theAdaptorInterfaceGeneratorPackage.getAdaptorInterfaceGenerator());
		eStructuralFeatureMappingEClass.getESuperTypes().add(theAdaptorInterfaceGeneratorPackage.getResourcePropertyMapping());
		eClassMappingEClass.getESuperTypes().add(theAdaptorInterfaceGeneratorPackage.getResourceMapping());
		oslc4EMFCoreGeneratorEClass.getESuperTypes().add(this.getOSLC4EMFGenerator());
		oslc4EMFExposerGeneratorEClass.getESuperTypes().add(this.getOSLC4EMFGenerator());
		requiredPluginFeatureEClass.getESuperTypes().add(this.getRequiredPlugin());
		packageExportFeatureEClass.getESuperTypes().add(this.getPackageExport());

		// Initialize classes, features, and operations; add parameters
		initEClass(oslc4EMFGeneratorEClass, OSLC4EMFGenerator.class, "OSLC4EMFGenerator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOSLC4EMFGenerator_Extends(), this.getOSLC4EMFGenerator(), null, "extends", null, 0, 1, OSLC4EMFGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSLC4EMFGenerator_JavaVersion(), ecorePackage.getEString(), "javaVersion", "1.7", 0, 1, OSLC4EMFGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOSLC4EMFGenerator_PackagesExportContainer(), this.getPackagesExportContainer(), null, "packagesExportContainer", null, 0, 1, OSLC4EMFGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOSLC4EMFGenerator_RequiredPluginsContainer(), this.getRequiredPluginsContainer(), null, "requiredPluginsContainer", null, 0, 1, OSLC4EMFGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOSLC4EMFGenerator__GetJavaFilesBasePath(), ecorePackage.getEString(), "getJavaFilesBasePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getOSLC4EMFGenerator__GetPrefix__String(), theEcorePackage.getEString(), "getPrefix", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eStructuralFeatureMappingEClass, EStructuralFeatureMapping.class, "EStructuralFeatureMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEStructuralFeatureMapping_EStructuralFeature(), theEcorePackage.getEStructuralFeature(), null, "eStructuralFeature", null, 1, 1, EStructuralFeatureMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassMappingEClass, EClassMapping.class, "EClassMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEClassMapping_EClass(), theEcorePackage.getEClass(), null, "eClass", null, 1, 1, EClassMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oslc4EMFCoreGeneratorEClass, OSLC4EMFCoreGenerator.class, "OSLC4EMFCoreGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOSLC4EMFCoreGenerator_CorePluginId(), ecorePackage.getEString(), "corePluginId", null, 1, 1, OSLC4EMFCoreGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSLC4EMFCoreGenerator_BasePackage(), ecorePackage.getEString(), "basePackage", null, 1, 1, OSLC4EMFCoreGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOSLC4EMFCoreGenerator__WebApplicationBasePath(), ecorePackage.getEString(), "webApplicationBasePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(oslc4EMFExposerGeneratorEClass, OSLC4EMFExposerGenerator.class, "OSLC4EMFExposerGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOSLC4EMFExposerGenerator_CommonPluginId(), theEcorePackage.getEString(), "commonPluginId", null, 1, 1, OSLC4EMFExposerGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSLC4EMFExposerGenerator_ExposerPluginId(), theEcorePackage.getEString(), "exposerPluginId", null, 1, 1, OSLC4EMFExposerGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSLC4EMFExposerGenerator_BasePackage(), ecorePackage.getEString(), "basePackage", null, 1, 1, OSLC4EMFExposerGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSLC4EMFExposerGenerator_CorePluginId(), ecorePackage.getEString(), "corePluginId", null, 1, 1, OSLC4EMFExposerGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSLC4EMFExposerGenerator_CoreBasePackage(), ecorePackage.getEString(), "coreBasePackage", null, 1, 1, OSLC4EMFExposerGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOSLC4EMFExposerGenerator_ExposerDependenciesContainer(), theAdaptorInterfaceGeneratorPackage.getDependenciesContainer(), null, "exposerDependenciesContainer", null, 0, 1, OSLC4EMFExposerGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOSLC4EMFExposerGenerator_ExposerRequiredPluginsContainer(), this.getRequiredPluginsContainer(), null, "exposerRequiredPluginsContainer", null, 0, 1, OSLC4EMFExposerGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOSLC4EMFExposerGenerator_ExposerPackagesExportContainer(), this.getPackagesExportContainer(), null, "exposerPackagesExportContainer", null, 0, 1, OSLC4EMFExposerGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packagesExportContainerEClass, PackagesExportContainer.class, "PackagesExportContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackagesExportContainer_PackagesExport(), this.getPackageExport(), null, "packagesExport", null, 0, -1, PackagesExportContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackagesExportContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackagesExportContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageExportEClass, PackageExport.class, "PackageExport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageExport_Id(), ecorePackage.getEString(), "id", null, 1, 1, PackageExport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredPluginsContainerEClass, RequiredPluginsContainer.class, "RequiredPluginsContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredPluginsContainer_RequiredPlugins(), this.getRequiredPlugin(), null, "requiredPlugins", null, 0, -1, RequiredPluginsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredPluginsContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, RequiredPluginsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredPluginEClass, RequiredPlugin.class, "RequiredPlugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequiredPlugin_Id(), theEcorePackage.getEString(), "id", null, 1, 1, RequiredPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredPluginFeatureEClass, RequiredPluginFeature.class, "RequiredPluginFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(packageExportFeatureEClass, PackageExportFeature.class, "PackageExportFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// javaFilesBasePath
		createJavaFilesBasePathAnnotations();
		// prefix
		createPrefixAnnotations();
		// webApplicationBasePath
		createWebApplicationBasePathAnnotations();
		// applicationName
		createApplicationNameAnnotations();
		// javaClassBaseNamespace
		createJavaClassBaseNamespaceAnnotations();
	}

	/**
	 * Initializes the annotations for <b>javaFilesBasePath</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJavaFilesBasePathAnnotations() {
		String source = "javaFilesBasePath";		
		addAnnotation
		  (getOSLC4EMFGenerator__GetJavaFilesBasePath(), 
		   source, 
		   new String[] {
		   });				
	}

	/**
	 * Initializes the annotations for <b>prefix</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPrefixAnnotations() {
		String source = "prefix";			
		addAnnotation
		  (getOSLC4EMFGenerator__GetPrefix__String(), 
		   source, 
		   new String[] {
		   });			
	}

	/**
	 * Initializes the annotations for <b>webApplicationBasePath</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createWebApplicationBasePathAnnotations() {
		String source = "webApplicationBasePath";				
		addAnnotation
		  (getOSLC4EMFCoreGenerator__WebApplicationBasePath(), 
		   source, 
		   new String[] {
		   });		
	}

	/**
	 * Initializes the annotations for <b>applicationName</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createApplicationNameAnnotations() {
		String source = "applicationName";					
		addAnnotation
		  (getOSLC4EMFCoreGenerator_CorePluginId(), 
		   source, 
		   new String[] {
		   });	
	}

	/**
	 * Initializes the annotations for <b>javaClassBaseNamespace</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJavaClassBaseNamespaceAnnotations() {
		String source = "javaClassBaseNamespace";						
		addAnnotation
		  (getOSLC4EMFCoreGenerator_BasePackage(), 
		   source, 
		   new String[] {
		   });
	}

} //OSLC4EMFgeneratorPackageImpl
