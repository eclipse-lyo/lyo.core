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
package org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorFactory
 * @model kind="package"
 * @generated
 */
public interface AdaptorInterfaceGeneratorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adaptorinterfacegenerator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.lyo/oslc4j/adaptorInterfaceGenerator";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oslc4j_aig";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdaptorInterfaceGeneratorPackage eINSTANCE = org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorContainerImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorPackageImpl#getAdaptorInterfaceGeneratorContainer()
	 * @generated
	 */
	int ADAPTOR_INTERFACE_GENERATOR_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE_GENERATOR_CONTAINER__GENERATOR = 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE_GENERATOR_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE_GENERATOR_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.DependencyImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 1;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.MavenDependencyImpl <em>Maven Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.MavenDependencyImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorPackageImpl#getMavenDependency()
	 * @generated
	 */
	int MAVEN_DEPENDENCY = 2;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_DEPENDENCY__ARTIFACT_ID = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_DEPENDENCY__GROUP_ID = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_DEPENDENCY__VERSION = DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_DEPENDENCY__TYPE = DEPENDENCY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_DEPENDENCY__CLASSIFIER = DEPENDENCY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_DEPENDENCY__SCOPE = DEPENDENCY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>System Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_DEPENDENCY__SYSTEM_PATH = DEPENDENCY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_DEPENDENCY__OPTIONAL = DEPENDENCY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Maven Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Maven Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_DEPENDENCY_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.ResourceMappingImpl <em>Resource Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.ResourceMappingImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorPackageImpl#getResourceMapping()
	 * @generated
	 */
	int RESOURCE_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAPPING__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Resource Property Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAPPING__RESOURCE_PROPERTY_MAPPINGS = 1;

	/**
	 * The number of structural features of the '<em>Resource Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.ResourcePropertyMappingImpl <em>Resource Property Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.ResourcePropertyMappingImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorPackageImpl#getResourcePropertyMapping()
	 * @generated
	 */
	int RESOURCE_PROPERTY_MAPPING = 4;

	/**
	 * The feature id for the '<em><b>Resource Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY_MAPPING__RESOURCE_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Resource Property Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY_MAPPING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resource Property Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorImpl <em>Adaptor Interface Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorPackageImpl#getAdaptorInterfaceGenerator()
	 * @generated
	 */
	int ADAPTOR_INTERFACE_GENERATOR = 5;

	/**
	 * The feature id for the '<em><b>Adaptor Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE_GENERATOR__ADAPTOR_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Dependencies Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE_GENERATOR__DEPENDENCIES_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE_GENERATOR__NAME = 2;

	/**
	 * The feature id for the '<em><b>Resource Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE_GENERATOR__RESOURCE_MAPPINGS = 3;

	/**
	 * The number of structural features of the '<em>Adaptor Interface Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE_GENERATOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Adaptor Interface Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE_GENERATOR_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.DependenciesContainerImpl <em>Dependencies Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.DependenciesContainerImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorPackageImpl#getDependenciesContainer()
	 * @generated
	 */
	int DEPENDENCIES_CONTAINER = 6;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_CONTAINER__DEPENDENCIES = 0;

	/**
	 * The number of structural features of the '<em>Dependencies Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dependencies Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_CONTAINER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorContainer
	 * @generated
	 */
	EClass getAdaptorInterfaceGeneratorContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorContainer#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generator</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorContainer#getGenerator()
	 * @see #getAdaptorInterfaceGeneratorContainer()
	 * @generated
	 */
	EReference getAdaptorInterfaceGeneratorContainer_Generator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.MavenDependency <em>Maven Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maven Dependency</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.MavenDependency
	 * @generated
	 */
	EClass getMavenDependency();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.MavenDependency#getArtifactId <em>Artifact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Id</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.MavenDependency#getArtifactId()
	 * @see #getMavenDependency()
	 * @generated
	 */
	EAttribute getMavenDependency_ArtifactId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.MavenDependency#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.MavenDependency#getGroupId()
	 * @see #getMavenDependency()
	 * @generated
	 */
	EAttribute getMavenDependency_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.MavenDependency#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.MavenDependency#getVersion()
	 * @see #getMavenDependency()
	 * @generated
	 */
	EAttribute getMavenDependency_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.MavenDependency#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.MavenDependency#getType()
	 * @see #getMavenDependency()
	 * @generated
	 */
	EAttribute getMavenDependency_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.MavenDependency#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.MavenDependency#getClassifier()
	 * @see #getMavenDependency()
	 * @generated
	 */
	EAttribute getMavenDependency_Classifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.MavenDependency#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.MavenDependency#getScope()
	 * @see #getMavenDependency()
	 * @generated
	 */
	EAttribute getMavenDependency_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.MavenDependency#getSystemPath <em>System Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Path</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.MavenDependency#getSystemPath()
	 * @see #getMavenDependency()
	 * @generated
	 */
	EAttribute getMavenDependency_SystemPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.MavenDependency#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.MavenDependency#getOptional()
	 * @see #getMavenDependency()
	 * @generated
	 */
	EAttribute getMavenDependency_Optional();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourceMapping <em>Resource Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Mapping</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourceMapping
	 * @generated
	 */
	EClass getResourceMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourceMapping#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourceMapping#getResource()
	 * @see #getResourceMapping()
	 * @generated
	 */
	EReference getResourceMapping_Resource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourceMapping#getResourcePropertyMappings <em>Resource Property Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Property Mappings</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourceMapping#getResourcePropertyMappings()
	 * @see #getResourceMapping()
	 * @generated
	 */
	EReference getResourceMapping_ResourcePropertyMappings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourcePropertyMapping <em>Resource Property Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Property Mapping</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourcePropertyMapping
	 * @generated
	 */
	EClass getResourcePropertyMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourcePropertyMapping#getResourceProperty <em>Resource Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Property</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourcePropertyMapping#getResourceProperty()
	 * @see #getResourcePropertyMapping()
	 * @generated
	 */
	EReference getResourcePropertyMapping_ResourceProperty();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator <em>Adaptor Interface Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptor Interface Generator</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator
	 * @generated
	 */
	EClass getAdaptorInterfaceGenerator();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator#getAdaptorInterface <em>Adaptor Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Adaptor Interface</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator#getAdaptorInterface()
	 * @see #getAdaptorInterfaceGenerator()
	 * @generated
	 */
	EReference getAdaptorInterfaceGenerator_AdaptorInterface();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator#getDependenciesContainer <em>Dependencies Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies Container</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator#getDependenciesContainer()
	 * @see #getAdaptorInterfaceGenerator()
	 * @generated
	 */
	EReference getAdaptorInterfaceGenerator_DependenciesContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator#getName()
	 * @see #getAdaptorInterfaceGenerator()
	 * @generated
	 */
	EAttribute getAdaptorInterfaceGenerator_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator#getResourceMappings <em>Resource Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Mappings</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator#getResourceMappings()
	 * @see #getAdaptorInterfaceGenerator()
	 * @generated
	 */
	EReference getAdaptorInterfaceGenerator_ResourceMappings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.DependenciesContainer <em>Dependencies Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencies Container</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.DependenciesContainer
	 * @generated
	 */
	EClass getDependenciesContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.DependenciesContainer#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.DependenciesContainer#getDependencies()
	 * @see #getDependenciesContainer()
	 * @generated
	 */
	EReference getDependenciesContainer_Dependencies();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdaptorInterfaceGeneratorFactory getAdaptorInterfaceGeneratorFactory();

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
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorContainerImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorPackageImpl#getAdaptorInterfaceGeneratorContainer()
		 * @generated
		 */
		EClass ADAPTOR_INTERFACE_GENERATOR_CONTAINER = eINSTANCE.getAdaptorInterfaceGeneratorContainer();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTOR_INTERFACE_GENERATOR_CONTAINER__GENERATOR = eINSTANCE.getAdaptorInterfaceGeneratorContainer_Generator();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.DependencyImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.MavenDependencyImpl <em>Maven Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.MavenDependencyImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorPackageImpl#getMavenDependency()
		 * @generated
		 */
		EClass MAVEN_DEPENDENCY = eINSTANCE.getMavenDependency();

		/**
		 * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAVEN_DEPENDENCY__ARTIFACT_ID = eINSTANCE.getMavenDependency_ArtifactId();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAVEN_DEPENDENCY__GROUP_ID = eINSTANCE.getMavenDependency_GroupId();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAVEN_DEPENDENCY__VERSION = eINSTANCE.getMavenDependency_Version();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAVEN_DEPENDENCY__TYPE = eINSTANCE.getMavenDependency_Type();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAVEN_DEPENDENCY__CLASSIFIER = eINSTANCE.getMavenDependency_Classifier();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAVEN_DEPENDENCY__SCOPE = eINSTANCE.getMavenDependency_Scope();

		/**
		 * The meta object literal for the '<em><b>System Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAVEN_DEPENDENCY__SYSTEM_PATH = eINSTANCE.getMavenDependency_SystemPath();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAVEN_DEPENDENCY__OPTIONAL = eINSTANCE.getMavenDependency_Optional();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.ResourceMappingImpl <em>Resource Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.ResourceMappingImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorPackageImpl#getResourceMapping()
		 * @generated
		 */
		EClass RESOURCE_MAPPING = eINSTANCE.getResourceMapping();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MAPPING__RESOURCE = eINSTANCE.getResourceMapping_Resource();

		/**
		 * The meta object literal for the '<em><b>Resource Property Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MAPPING__RESOURCE_PROPERTY_MAPPINGS = eINSTANCE.getResourceMapping_ResourcePropertyMappings();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.ResourcePropertyMappingImpl <em>Resource Property Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.ResourcePropertyMappingImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorPackageImpl#getResourcePropertyMapping()
		 * @generated
		 */
		EClass RESOURCE_PROPERTY_MAPPING = eINSTANCE.getResourcePropertyMapping();

		/**
		 * The meta object literal for the '<em><b>Resource Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PROPERTY_MAPPING__RESOURCE_PROPERTY = eINSTANCE.getResourcePropertyMapping_ResourceProperty();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorImpl <em>Adaptor Interface Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorPackageImpl#getAdaptorInterfaceGenerator()
		 * @generated
		 */
		EClass ADAPTOR_INTERFACE_GENERATOR = eINSTANCE.getAdaptorInterfaceGenerator();

		/**
		 * The meta object literal for the '<em><b>Adaptor Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTOR_INTERFACE_GENERATOR__ADAPTOR_INTERFACE = eINSTANCE.getAdaptorInterfaceGenerator_AdaptorInterface();

		/**
		 * The meta object literal for the '<em><b>Dependencies Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTOR_INTERFACE_GENERATOR__DEPENDENCIES_CONTAINER = eINSTANCE.getAdaptorInterfaceGenerator_DependenciesContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTOR_INTERFACE_GENERATOR__NAME = eINSTANCE.getAdaptorInterfaceGenerator_Name();

		/**
		 * The meta object literal for the '<em><b>Resource Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTOR_INTERFACE_GENERATOR__RESOURCE_MAPPINGS = eINSTANCE.getAdaptorInterfaceGenerator_ResourceMappings();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.DependenciesContainerImpl <em>Dependencies Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.DependenciesContainerImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorPackageImpl#getDependenciesContainer()
		 * @generated
		 */
		EClass DEPENDENCIES_CONTAINER = eINSTANCE.getDependenciesContainer();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCIES_CONTAINER__DEPENDENCIES = eINSTANCE.getDependenciesContainer_Dependencies();

	}

} //AdaptorInterfaceGeneratorPackage
