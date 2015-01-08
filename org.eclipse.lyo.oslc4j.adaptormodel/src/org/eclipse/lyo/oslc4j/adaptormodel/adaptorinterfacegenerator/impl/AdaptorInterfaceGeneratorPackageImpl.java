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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterfacePackage;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorContainer;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorFactory;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorPackage;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.DependenciesContainer;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.Dependency;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.MavenDependency;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourceMapping;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourcePropertyMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptorInterfaceGeneratorPackageImpl extends EPackageImpl implements AdaptorInterfaceGeneratorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptorInterfaceGeneratorContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mavenDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcePropertyMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptorInterfaceGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependenciesContainerEClass = null;

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
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdaptorInterfaceGeneratorPackageImpl() {
		super(eNS_URI, AdaptorInterfaceGeneratorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AdaptorInterfaceGeneratorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdaptorInterfaceGeneratorPackage init() {
		if (isInited) return (AdaptorInterfaceGeneratorPackage)EPackage.Registry.INSTANCE.getEPackage(AdaptorInterfaceGeneratorPackage.eNS_URI);

		// Obtain or create and register package
		AdaptorInterfaceGeneratorPackageImpl theAdaptorInterfaceGeneratorPackage = (AdaptorInterfaceGeneratorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AdaptorInterfaceGeneratorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AdaptorInterfaceGeneratorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AdaptorInterfacePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAdaptorInterfaceGeneratorPackage.createPackageContents();

		// Initialize created meta-data
		theAdaptorInterfaceGeneratorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdaptorInterfaceGeneratorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdaptorInterfaceGeneratorPackage.eNS_URI, theAdaptorInterfaceGeneratorPackage);
		return theAdaptorInterfaceGeneratorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptorInterfaceGeneratorContainer() {
		return adaptorInterfaceGeneratorContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptorInterfaceGeneratorContainer_Generator() {
		return (EReference)adaptorInterfaceGeneratorContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMavenDependency() {
		return mavenDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMavenDependency_ArtifactId() {
		return (EAttribute)mavenDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMavenDependency_GroupId() {
		return (EAttribute)mavenDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMavenDependency_Version() {
		return (EAttribute)mavenDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMavenDependency_Type() {
		return (EAttribute)mavenDependencyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMavenDependency_Classifier() {
		return (EAttribute)mavenDependencyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMavenDependency_Scope() {
		return (EAttribute)mavenDependencyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMavenDependency_SystemPath() {
		return (EAttribute)mavenDependencyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMavenDependency_Optional() {
		return (EAttribute)mavenDependencyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceMapping() {
		return resourceMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceMapping_Resource() {
		return (EReference)resourceMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceMapping_ResourcePropertyMappings() {
		return (EReference)resourceMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcePropertyMapping() {
		return resourcePropertyMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourcePropertyMapping_ResourceProperty() {
		return (EReference)resourcePropertyMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptorInterfaceGenerator() {
		return adaptorInterfaceGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptorInterfaceGenerator_AdaptorInterface() {
		return (EReference)adaptorInterfaceGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptorInterfaceGenerator_DependenciesContainer() {
		return (EReference)adaptorInterfaceGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdaptorInterfaceGenerator_Name() {
		return (EAttribute)adaptorInterfaceGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptorInterfaceGenerator_ResourceMappings() {
		return (EReference)adaptorInterfaceGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependenciesContainer() {
		return dependenciesContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependenciesContainer_Dependencies() {
		return (EReference)dependenciesContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptorInterfaceGeneratorFactory getAdaptorInterfaceGeneratorFactory() {
		return (AdaptorInterfaceGeneratorFactory)getEFactoryInstance();
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
		adaptorInterfaceGeneratorContainerEClass = createEClass(ADAPTOR_INTERFACE_GENERATOR_CONTAINER);
		createEReference(adaptorInterfaceGeneratorContainerEClass, ADAPTOR_INTERFACE_GENERATOR_CONTAINER__GENERATOR);

		dependencyEClass = createEClass(DEPENDENCY);

		mavenDependencyEClass = createEClass(MAVEN_DEPENDENCY);
		createEAttribute(mavenDependencyEClass, MAVEN_DEPENDENCY__ARTIFACT_ID);
		createEAttribute(mavenDependencyEClass, MAVEN_DEPENDENCY__GROUP_ID);
		createEAttribute(mavenDependencyEClass, MAVEN_DEPENDENCY__VERSION);
		createEAttribute(mavenDependencyEClass, MAVEN_DEPENDENCY__TYPE);
		createEAttribute(mavenDependencyEClass, MAVEN_DEPENDENCY__CLASSIFIER);
		createEAttribute(mavenDependencyEClass, MAVEN_DEPENDENCY__SCOPE);
		createEAttribute(mavenDependencyEClass, MAVEN_DEPENDENCY__SYSTEM_PATH);
		createEAttribute(mavenDependencyEClass, MAVEN_DEPENDENCY__OPTIONAL);

		resourceMappingEClass = createEClass(RESOURCE_MAPPING);
		createEReference(resourceMappingEClass, RESOURCE_MAPPING__RESOURCE);
		createEReference(resourceMappingEClass, RESOURCE_MAPPING__RESOURCE_PROPERTY_MAPPINGS);

		resourcePropertyMappingEClass = createEClass(RESOURCE_PROPERTY_MAPPING);
		createEReference(resourcePropertyMappingEClass, RESOURCE_PROPERTY_MAPPING__RESOURCE_PROPERTY);

		adaptorInterfaceGeneratorEClass = createEClass(ADAPTOR_INTERFACE_GENERATOR);
		createEReference(adaptorInterfaceGeneratorEClass, ADAPTOR_INTERFACE_GENERATOR__ADAPTOR_INTERFACE);
		createEReference(adaptorInterfaceGeneratorEClass, ADAPTOR_INTERFACE_GENERATOR__DEPENDENCIES_CONTAINER);
		createEAttribute(adaptorInterfaceGeneratorEClass, ADAPTOR_INTERFACE_GENERATOR__NAME);
		createEReference(adaptorInterfaceGeneratorEClass, ADAPTOR_INTERFACE_GENERATOR__RESOURCE_MAPPINGS);

		dependenciesContainerEClass = createEClass(DEPENDENCIES_CONTAINER);
		createEReference(dependenciesContainerEClass, DEPENDENCIES_CONTAINER__DEPENDENCIES);
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
		AdaptorInterfacePackage theAdaptorInterfacePackage = (AdaptorInterfacePackage)EPackage.Registry.INSTANCE.getEPackage(AdaptorInterfacePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mavenDependencyEClass.getESuperTypes().add(this.getDependency());

		// Initialize classes, features, and operations; add parameters
		initEClass(adaptorInterfaceGeneratorContainerEClass, AdaptorInterfaceGeneratorContainer.class, "AdaptorInterfaceGeneratorContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdaptorInterfaceGeneratorContainer_Generator(), this.getAdaptorInterfaceGenerator(), null, "generator", null, 0, -1, AdaptorInterfaceGeneratorContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mavenDependencyEClass, MavenDependency.class, "MavenDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMavenDependency_ArtifactId(), ecorePackage.getEString(), "artifactId", null, 0, 1, MavenDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMavenDependency_GroupId(), ecorePackage.getEString(), "groupId", null, 0, 1, MavenDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMavenDependency_Version(), ecorePackage.getEString(), "version", null, 0, 1, MavenDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMavenDependency_Type(), ecorePackage.getEString(), "type", null, 0, 1, MavenDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMavenDependency_Classifier(), ecorePackage.getEString(), "classifier", null, 0, 1, MavenDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMavenDependency_Scope(), ecorePackage.getEString(), "scope", null, 0, 1, MavenDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMavenDependency_SystemPath(), ecorePackage.getEString(), "systemPath", null, 0, 1, MavenDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMavenDependency_Optional(), ecorePackage.getEString(), "optional", "false", 0, 1, MavenDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceMappingEClass, ResourceMapping.class, "ResourceMapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceMapping_Resource(), theAdaptorInterfacePackage.getResource(), null, "resource", null, 1, 1, ResourceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceMapping_ResourcePropertyMappings(), this.getResourcePropertyMapping(), null, "resourcePropertyMappings", null, 0, -1, ResourceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourcePropertyMappingEClass, ResourcePropertyMapping.class, "ResourcePropertyMapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourcePropertyMapping_ResourceProperty(), theAdaptorInterfacePackage.getResourceProperty(), null, "resourceProperty", null, 1, 1, ResourcePropertyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adaptorInterfaceGeneratorEClass, AdaptorInterfaceGenerator.class, "AdaptorInterfaceGenerator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdaptorInterfaceGenerator_AdaptorInterface(), theAdaptorInterfacePackage.getAdaptorInterface(), null, "adaptorInterface", null, 1, 1, AdaptorInterfaceGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptorInterfaceGenerator_DependenciesContainer(), this.getDependenciesContainer(), null, "dependenciesContainer", null, 0, 1, AdaptorInterfaceGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorInterfaceGenerator_Name(), ecorePackage.getEString(), "name", null, 1, 1, AdaptorInterfaceGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptorInterfaceGenerator_ResourceMappings(), this.getResourceMapping(), null, "resourceMappings", null, 0, -1, AdaptorInterfaceGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependenciesContainerEClass, DependenciesContainer.class, "DependenciesContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependenciesContainer_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, DependenciesContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AdaptorInterfaceGeneratorPackageImpl
