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
package org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorFactory
 * @model kind="package"
 * @generated
 */
public interface OSLC4EMFgeneratorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "oslc4emfgenerator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.lyo/oslc4j/emf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oslc4emf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OSLC4EMFgeneratorPackage eINSTANCE = org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFGeneratorImpl <em>OSLC4EMF Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFGeneratorImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getOSLC4EMFGenerator()
	 * @generated
	 */
	int OSLC4EMF_GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Adaptor Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_GENERATOR__ADAPTOR_INTERFACE = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR__ADAPTOR_INTERFACE;

	/**
	 * The feature id for the '<em><b>Dependencies Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_GENERATOR__DEPENDENCIES_CONTAINER = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR__DEPENDENCIES_CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_GENERATOR__NAME = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Resource Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_GENERATOR__RESOURCE_MAPPINGS = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR__RESOURCE_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_GENERATOR__EXTENDS = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Java Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_GENERATOR__JAVA_VERSION = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Packages Export Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_GENERATOR__PACKAGES_EXPORT_CONTAINER = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required Plugins Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_GENERATOR__REQUIRED_PLUGINS_CONTAINER = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>OSLC4EMF Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_GENERATOR_FEATURE_COUNT = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Java Files Base Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_GENERATOR___GET_JAVA_FILES_BASE_PATH = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Prefix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_GENERATOR___GET_PREFIX__STRING = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>OSLC4EMF Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_GENERATOR_OPERATION_COUNT = AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.EStructuralFeatureMappingImpl <em>EStructural Feature Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.EStructuralFeatureMappingImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getEStructuralFeatureMapping()
	 * @generated
	 */
	int ESTRUCTURAL_FEATURE_MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Resource Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_MAPPING__RESOURCE_PROPERTY = AdaptorInterfaceGeneratorPackage.RESOURCE_PROPERTY_MAPPING__RESOURCE_PROPERTY;

	/**
	 * The feature id for the '<em><b>EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_MAPPING__ESTRUCTURAL_FEATURE = AdaptorInterfaceGeneratorPackage.RESOURCE_PROPERTY_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EStructural Feature Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_MAPPING_FEATURE_COUNT = AdaptorInterfaceGeneratorPackage.RESOURCE_PROPERTY_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EStructural Feature Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_MAPPING_OPERATION_COUNT = AdaptorInterfaceGeneratorPackage.RESOURCE_PROPERTY_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.EClassMappingImpl <em>EClass Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.EClassMappingImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getEClassMapping()
	 * @generated
	 */
	int ECLASS_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_MAPPING__RESOURCE = AdaptorInterfaceGeneratorPackage.RESOURCE_MAPPING__RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource Property Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_MAPPING__RESOURCE_PROPERTY_MAPPINGS = AdaptorInterfaceGeneratorPackage.RESOURCE_MAPPING__RESOURCE_PROPERTY_MAPPINGS;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_MAPPING__ECLASS = AdaptorInterfaceGeneratorPackage.RESOURCE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EClass Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_MAPPING_FEATURE_COUNT = AdaptorInterfaceGeneratorPackage.RESOURCE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EClass Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_MAPPING_OPERATION_COUNT = AdaptorInterfaceGeneratorPackage.RESOURCE_MAPPING_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFCoreGeneratorImpl <em>OSLC4EMF Core Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFCoreGeneratorImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getOSLC4EMFCoreGenerator()
	 * @generated
	 */
	int OSLC4EMF_CORE_GENERATOR = 3;

	/**
	 * The feature id for the '<em><b>Adaptor Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_CORE_GENERATOR__ADAPTOR_INTERFACE = OSLC4EMF_GENERATOR__ADAPTOR_INTERFACE;

	/**
	 * The feature id for the '<em><b>Dependencies Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_CORE_GENERATOR__DEPENDENCIES_CONTAINER = OSLC4EMF_GENERATOR__DEPENDENCIES_CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_CORE_GENERATOR__NAME = OSLC4EMF_GENERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Resource Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_CORE_GENERATOR__RESOURCE_MAPPINGS = OSLC4EMF_GENERATOR__RESOURCE_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_CORE_GENERATOR__EXTENDS = OSLC4EMF_GENERATOR__EXTENDS;

	/**
	 * The feature id for the '<em><b>Java Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_CORE_GENERATOR__JAVA_VERSION = OSLC4EMF_GENERATOR__JAVA_VERSION;

	/**
	 * The feature id for the '<em><b>Packages Export Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_CORE_GENERATOR__PACKAGES_EXPORT_CONTAINER = OSLC4EMF_GENERATOR__PACKAGES_EXPORT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Required Plugins Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_CORE_GENERATOR__REQUIRED_PLUGINS_CONTAINER = OSLC4EMF_GENERATOR__REQUIRED_PLUGINS_CONTAINER;

	/**
	 * The feature id for the '<em><b>Core Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_CORE_GENERATOR__CORE_PLUGIN_ID = OSLC4EMF_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_CORE_GENERATOR__BASE_PACKAGE = OSLC4EMF_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OSLC4EMF Core Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_CORE_GENERATOR_FEATURE_COUNT = OSLC4EMF_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Java Files Base Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_CORE_GENERATOR___GET_JAVA_FILES_BASE_PATH = OSLC4EMF_GENERATOR___GET_JAVA_FILES_BASE_PATH;

	/**
	 * The operation id for the '<em>Get Prefix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_CORE_GENERATOR___GET_PREFIX__STRING = OSLC4EMF_GENERATOR___GET_PREFIX__STRING;

	/**
	 * The operation id for the '<em>Web Application Base Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_CORE_GENERATOR___WEB_APPLICATION_BASE_PATH = OSLC4EMF_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>OSLC4EMF Core Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_CORE_GENERATOR_OPERATION_COUNT = OSLC4EMF_GENERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFExposerGeneratorImpl <em>OSLC4EMF Exposer Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFExposerGeneratorImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getOSLC4EMFExposerGenerator()
	 * @generated
	 */
	int OSLC4EMF_EXPOSER_GENERATOR = 4;

	/**
	 * The feature id for the '<em><b>Adaptor Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_EXPOSER_GENERATOR__ADAPTOR_INTERFACE = OSLC4EMF_GENERATOR__ADAPTOR_INTERFACE;

	/**
	 * The feature id for the '<em><b>Dependencies Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_EXPOSER_GENERATOR__DEPENDENCIES_CONTAINER = OSLC4EMF_GENERATOR__DEPENDENCIES_CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_EXPOSER_GENERATOR__NAME = OSLC4EMF_GENERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Resource Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_EXPOSER_GENERATOR__RESOURCE_MAPPINGS = OSLC4EMF_GENERATOR__RESOURCE_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_EXPOSER_GENERATOR__EXTENDS = OSLC4EMF_GENERATOR__EXTENDS;

	/**
	 * The feature id for the '<em><b>Java Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_EXPOSER_GENERATOR__JAVA_VERSION = OSLC4EMF_GENERATOR__JAVA_VERSION;

	/**
	 * The feature id for the '<em><b>Packages Export Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_EXPOSER_GENERATOR__PACKAGES_EXPORT_CONTAINER = OSLC4EMF_GENERATOR__PACKAGES_EXPORT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Required Plugins Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_EXPOSER_GENERATOR__REQUIRED_PLUGINS_CONTAINER = OSLC4EMF_GENERATOR__REQUIRED_PLUGINS_CONTAINER;

	/**
	 * The feature id for the '<em><b>Common Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_EXPOSER_GENERATOR__COMMON_PLUGIN_ID = OSLC4EMF_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exposer Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_EXPOSER_GENERATOR__EXPOSER_PLUGIN_ID = OSLC4EMF_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_EXPOSER_GENERATOR__BASE_PACKAGE = OSLC4EMF_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Core Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_EXPOSER_GENERATOR__CORE_PLUGIN_ID = OSLC4EMF_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Core Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_EXPOSER_GENERATOR__CORE_BASE_PACKAGE = OSLC4EMF_GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Exposer Dependencies Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_EXPOSER_GENERATOR__EXPOSER_DEPENDENCIES_CONTAINER = OSLC4EMF_GENERATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Exposer Required Plugins Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_EXPOSER_GENERATOR__EXPOSER_REQUIRED_PLUGINS_CONTAINER = OSLC4EMF_GENERATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Exposer Packages Export Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_EXPOSER_GENERATOR__EXPOSER_PACKAGES_EXPORT_CONTAINER = OSLC4EMF_GENERATOR_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>OSLC4EMF Exposer Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_EXPOSER_GENERATOR_FEATURE_COUNT = OSLC4EMF_GENERATOR_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Java Files Base Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_EXPOSER_GENERATOR___GET_JAVA_FILES_BASE_PATH = OSLC4EMF_GENERATOR___GET_JAVA_FILES_BASE_PATH;

	/**
	 * The operation id for the '<em>Get Prefix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_EXPOSER_GENERATOR___GET_PREFIX__STRING = OSLC4EMF_GENERATOR___GET_PREFIX__STRING;

	/**
	 * The number of operations of the '<em>OSLC4EMF Exposer Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSLC4EMF_EXPOSER_GENERATOR_OPERATION_COUNT = OSLC4EMF_GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.PackagesExportContainerImpl <em>Packages Export Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.PackagesExportContainerImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getPackagesExportContainer()
	 * @generated
	 */
	int PACKAGES_EXPORT_CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>Packages Export</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGES_EXPORT_CONTAINER__PACKAGES_EXPORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGES_EXPORT_CONTAINER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Packages Export Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGES_EXPORT_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Packages Export Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGES_EXPORT_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.PackageExportImpl <em>Package Export</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.PackageExportImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getPackageExport()
	 * @generated
	 */
	int PACKAGE_EXPORT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_EXPORT__ID = 0;

	/**
	 * The number of structural features of the '<em>Package Export</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_EXPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Package Export</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_EXPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.RequiredPluginsContainerImpl <em>Required Plugins Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.RequiredPluginsContainerImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getRequiredPluginsContainer()
	 * @generated
	 */
	int REQUIRED_PLUGINS_CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Required Plugins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PLUGINS_CONTAINER__REQUIRED_PLUGINS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PLUGINS_CONTAINER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Required Plugins Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PLUGINS_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Required Plugins Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PLUGINS_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.RequiredPluginImpl <em>Required Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.RequiredPluginImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getRequiredPlugin()
	 * @generated
	 */
	int REQUIRED_PLUGIN = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PLUGIN__ID = 0;

	/**
	 * The number of structural features of the '<em>Required Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PLUGIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Required Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PLUGIN_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.RequiredPluginFeatureImpl <em>Required Plugin Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.RequiredPluginFeatureImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getRequiredPluginFeature()
	 * @generated
	 */
	int REQUIRED_PLUGIN_FEATURE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PLUGIN_FEATURE__ID = REQUIRED_PLUGIN__ID;

	/**
	 * The number of structural features of the '<em>Required Plugin Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PLUGIN_FEATURE_FEATURE_COUNT = REQUIRED_PLUGIN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required Plugin Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PLUGIN_FEATURE_OPERATION_COUNT = REQUIRED_PLUGIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.PackageExportFeatureImpl <em>Package Export Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.PackageExportFeatureImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getPackageExportFeature()
	 * @generated
	 */
	int PACKAGE_EXPORT_FEATURE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_EXPORT_FEATURE__ID = PACKAGE_EXPORT__ID;

	/**
	 * The number of structural features of the '<em>Package Export Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_EXPORT_FEATURE_FEATURE_COUNT = PACKAGE_EXPORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Package Export Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_EXPORT_FEATURE_OPERATION_COUNT = PACKAGE_EXPORT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator <em>OSLC4EMF Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSLC4EMF Generator</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator
	 * @generated
	 */
	EClass getOSLC4EMFGenerator();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator#getExtends()
	 * @see #getOSLC4EMFGenerator()
	 * @generated
	 */
	EReference getOSLC4EMFGenerator_Extends();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator#getJavaVersion <em>Java Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Version</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator#getJavaVersion()
	 * @see #getOSLC4EMFGenerator()
	 * @generated
	 */
	EAttribute getOSLC4EMFGenerator_JavaVersion();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator#getPackagesExportContainer <em>Packages Export Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Packages Export Container</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator#getPackagesExportContainer()
	 * @see #getOSLC4EMFGenerator()
	 * @generated
	 */
	EReference getOSLC4EMFGenerator_PackagesExportContainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator#getRequiredPluginsContainer <em>Required Plugins Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Plugins Container</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator#getRequiredPluginsContainer()
	 * @see #getOSLC4EMFGenerator()
	 * @generated
	 */
	EReference getOSLC4EMFGenerator_RequiredPluginsContainer();

	/**
	 * Returns the meta object for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator#getJavaFilesBasePath() <em>Get Java Files Base Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Java Files Base Path</em>' operation.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator#getJavaFilesBasePath()
	 * @generated
	 */
	EOperation getOSLC4EMFGenerator__GetJavaFilesBasePath();

	/**
	 * Returns the meta object for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator#getPrefix(java.lang.String) <em>Get Prefix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Prefix</em>' operation.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator#getPrefix(java.lang.String)
	 * @generated
	 */
	EOperation getOSLC4EMFGenerator__GetPrefix__String();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EStructuralFeatureMapping <em>EStructural Feature Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStructural Feature Mapping</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EStructuralFeatureMapping
	 * @generated
	 */
	EClass getEStructuralFeatureMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EStructuralFeatureMapping#getEStructuralFeature <em>EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EStructural Feature</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EStructuralFeatureMapping#getEStructuralFeature()
	 * @see #getEStructuralFeatureMapping()
	 * @generated
	 */
	EReference getEStructuralFeatureMapping_EStructuralFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EClassMapping <em>EClass Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass Mapping</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EClassMapping
	 * @generated
	 */
	EClass getEClassMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EClassMapping#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EClassMapping#getEClass()
	 * @see #getEClassMapping()
	 * @generated
	 */
	EReference getEClassMapping_EClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFCoreGenerator <em>OSLC4EMF Core Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSLC4EMF Core Generator</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFCoreGenerator
	 * @generated
	 */
	EClass getOSLC4EMFCoreGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFCoreGenerator#getCorePluginId <em>Core Plugin Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Plugin Id</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFCoreGenerator#getCorePluginId()
	 * @see #getOSLC4EMFCoreGenerator()
	 * @generated
	 */
	EAttribute getOSLC4EMFCoreGenerator_CorePluginId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFCoreGenerator#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFCoreGenerator#getBasePackage()
	 * @see #getOSLC4EMFCoreGenerator()
	 * @generated
	 */
	EAttribute getOSLC4EMFCoreGenerator_BasePackage();

	/**
	 * Returns the meta object for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFCoreGenerator#webApplicationBasePath() <em>Web Application Base Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Web Application Base Path</em>' operation.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFCoreGenerator#webApplicationBasePath()
	 * @generated
	 */
	EOperation getOSLC4EMFCoreGenerator__WebApplicationBasePath();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator <em>OSLC4EMF Exposer Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSLC4EMF Exposer Generator</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator
	 * @generated
	 */
	EClass getOSLC4EMFExposerGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getCommonPluginId <em>Common Plugin Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Common Plugin Id</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getCommonPluginId()
	 * @see #getOSLC4EMFExposerGenerator()
	 * @generated
	 */
	EAttribute getOSLC4EMFExposerGenerator_CommonPluginId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getExposerPluginId <em>Exposer Plugin Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exposer Plugin Id</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getExposerPluginId()
	 * @see #getOSLC4EMFExposerGenerator()
	 * @generated
	 */
	EAttribute getOSLC4EMFExposerGenerator_ExposerPluginId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getBasePackage()
	 * @see #getOSLC4EMFExposerGenerator()
	 * @generated
	 */
	EAttribute getOSLC4EMFExposerGenerator_BasePackage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getCorePluginId <em>Core Plugin Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Plugin Id</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getCorePluginId()
	 * @see #getOSLC4EMFExposerGenerator()
	 * @generated
	 */
	EAttribute getOSLC4EMFExposerGenerator_CorePluginId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getCoreBasePackage <em>Core Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Base Package</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getCoreBasePackage()
	 * @see #getOSLC4EMFExposerGenerator()
	 * @generated
	 */
	EAttribute getOSLC4EMFExposerGenerator_CoreBasePackage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getExposerDependenciesContainer <em>Exposer Dependencies Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exposer Dependencies Container</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getExposerDependenciesContainer()
	 * @see #getOSLC4EMFExposerGenerator()
	 * @generated
	 */
	EReference getOSLC4EMFExposerGenerator_ExposerDependenciesContainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getExposerRequiredPluginsContainer <em>Exposer Required Plugins Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exposer Required Plugins Container</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getExposerRequiredPluginsContainer()
	 * @see #getOSLC4EMFExposerGenerator()
	 * @generated
	 */
	EReference getOSLC4EMFExposerGenerator_ExposerRequiredPluginsContainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getExposerPackagesExportContainer <em>Exposer Packages Export Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exposer Packages Export Container</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getExposerPackagesExportContainer()
	 * @see #getOSLC4EMFExposerGenerator()
	 * @generated
	 */
	EReference getOSLC4EMFExposerGenerator_ExposerPackagesExportContainer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackagesExportContainer <em>Packages Export Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packages Export Container</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackagesExportContainer
	 * @generated
	 */
	EClass getPackagesExportContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackagesExportContainer#getPackagesExport <em>Packages Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages Export</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackagesExportContainer#getPackagesExport()
	 * @see #getPackagesExportContainer()
	 * @generated
	 */
	EReference getPackagesExportContainer_PackagesExport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackagesExportContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackagesExportContainer#getName()
	 * @see #getPackagesExportContainer()
	 * @generated
	 */
	EAttribute getPackagesExportContainer_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackageExport <em>Package Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Export</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackageExport
	 * @generated
	 */
	EClass getPackageExport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackageExport#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackageExport#getId()
	 * @see #getPackageExport()
	 * @generated
	 */
	EAttribute getPackageExport_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPluginsContainer <em>Required Plugins Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Plugins Container</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPluginsContainer
	 * @generated
	 */
	EClass getRequiredPluginsContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPluginsContainer#getRequiredPlugins <em>Required Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Plugins</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPluginsContainer#getRequiredPlugins()
	 * @see #getRequiredPluginsContainer()
	 * @generated
	 */
	EReference getRequiredPluginsContainer_RequiredPlugins();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPluginsContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPluginsContainer#getName()
	 * @see #getRequiredPluginsContainer()
	 * @generated
	 */
	EAttribute getRequiredPluginsContainer_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPlugin <em>Required Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Plugin</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPlugin
	 * @generated
	 */
	EClass getRequiredPlugin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPlugin#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPlugin#getId()
	 * @see #getRequiredPlugin()
	 * @generated
	 */
	EAttribute getRequiredPlugin_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPluginFeature <em>Required Plugin Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Plugin Feature</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPluginFeature
	 * @generated
	 */
	EClass getRequiredPluginFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackageExportFeature <em>Package Export Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Export Feature</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackageExportFeature
	 * @generated
	 */
	EClass getPackageExportFeature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OSLC4EMFgeneratorFactory getOSLC4EMFgeneratorFactory();

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
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFGeneratorImpl <em>OSLC4EMF Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFGeneratorImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getOSLC4EMFGenerator()
		 * @generated
		 */
		EClass OSLC4EMF_GENERATOR = eINSTANCE.getOSLC4EMFGenerator();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSLC4EMF_GENERATOR__EXTENDS = eINSTANCE.getOSLC4EMFGenerator_Extends();

		/**
		 * The meta object literal for the '<em><b>Java Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSLC4EMF_GENERATOR__JAVA_VERSION = eINSTANCE.getOSLC4EMFGenerator_JavaVersion();

		/**
		 * The meta object literal for the '<em><b>Packages Export Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSLC4EMF_GENERATOR__PACKAGES_EXPORT_CONTAINER = eINSTANCE.getOSLC4EMFGenerator_PackagesExportContainer();

		/**
		 * The meta object literal for the '<em><b>Required Plugins Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSLC4EMF_GENERATOR__REQUIRED_PLUGINS_CONTAINER = eINSTANCE.getOSLC4EMFGenerator_RequiredPluginsContainer();

		/**
		 * The meta object literal for the '<em><b>Get Java Files Base Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OSLC4EMF_GENERATOR___GET_JAVA_FILES_BASE_PATH = eINSTANCE.getOSLC4EMFGenerator__GetJavaFilesBasePath();

		/**
		 * The meta object literal for the '<em><b>Get Prefix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OSLC4EMF_GENERATOR___GET_PREFIX__STRING = eINSTANCE.getOSLC4EMFGenerator__GetPrefix__String();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.EStructuralFeatureMappingImpl <em>EStructural Feature Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.EStructuralFeatureMappingImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getEStructuralFeatureMapping()
		 * @generated
		 */
		EClass ESTRUCTURAL_FEATURE_MAPPING = eINSTANCE.getEStructuralFeatureMapping();

		/**
		 * The meta object literal for the '<em><b>EStructural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURAL_FEATURE_MAPPING__ESTRUCTURAL_FEATURE = eINSTANCE.getEStructuralFeatureMapping_EStructuralFeature();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.EClassMappingImpl <em>EClass Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.EClassMappingImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getEClassMapping()
		 * @generated
		 */
		EClass ECLASS_MAPPING = eINSTANCE.getEClassMapping();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS_MAPPING__ECLASS = eINSTANCE.getEClassMapping_EClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFCoreGeneratorImpl <em>OSLC4EMF Core Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFCoreGeneratorImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getOSLC4EMFCoreGenerator()
		 * @generated
		 */
		EClass OSLC4EMF_CORE_GENERATOR = eINSTANCE.getOSLC4EMFCoreGenerator();

		/**
		 * The meta object literal for the '<em><b>Core Plugin Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSLC4EMF_CORE_GENERATOR__CORE_PLUGIN_ID = eINSTANCE.getOSLC4EMFCoreGenerator_CorePluginId();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSLC4EMF_CORE_GENERATOR__BASE_PACKAGE = eINSTANCE.getOSLC4EMFCoreGenerator_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Web Application Base Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OSLC4EMF_CORE_GENERATOR___WEB_APPLICATION_BASE_PATH = eINSTANCE.getOSLC4EMFCoreGenerator__WebApplicationBasePath();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFExposerGeneratorImpl <em>OSLC4EMF Exposer Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFExposerGeneratorImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getOSLC4EMFExposerGenerator()
		 * @generated
		 */
		EClass OSLC4EMF_EXPOSER_GENERATOR = eINSTANCE.getOSLC4EMFExposerGenerator();

		/**
		 * The meta object literal for the '<em><b>Common Plugin Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSLC4EMF_EXPOSER_GENERATOR__COMMON_PLUGIN_ID = eINSTANCE.getOSLC4EMFExposerGenerator_CommonPluginId();

		/**
		 * The meta object literal for the '<em><b>Exposer Plugin Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSLC4EMF_EXPOSER_GENERATOR__EXPOSER_PLUGIN_ID = eINSTANCE.getOSLC4EMFExposerGenerator_ExposerPluginId();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSLC4EMF_EXPOSER_GENERATOR__BASE_PACKAGE = eINSTANCE.getOSLC4EMFExposerGenerator_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Core Plugin Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSLC4EMF_EXPOSER_GENERATOR__CORE_PLUGIN_ID = eINSTANCE.getOSLC4EMFExposerGenerator_CorePluginId();

		/**
		 * The meta object literal for the '<em><b>Core Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSLC4EMF_EXPOSER_GENERATOR__CORE_BASE_PACKAGE = eINSTANCE.getOSLC4EMFExposerGenerator_CoreBasePackage();

		/**
		 * The meta object literal for the '<em><b>Exposer Dependencies Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSLC4EMF_EXPOSER_GENERATOR__EXPOSER_DEPENDENCIES_CONTAINER = eINSTANCE.getOSLC4EMFExposerGenerator_ExposerDependenciesContainer();

		/**
		 * The meta object literal for the '<em><b>Exposer Required Plugins Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSLC4EMF_EXPOSER_GENERATOR__EXPOSER_REQUIRED_PLUGINS_CONTAINER = eINSTANCE.getOSLC4EMFExposerGenerator_ExposerRequiredPluginsContainer();

		/**
		 * The meta object literal for the '<em><b>Exposer Packages Export Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSLC4EMF_EXPOSER_GENERATOR__EXPOSER_PACKAGES_EXPORT_CONTAINER = eINSTANCE.getOSLC4EMFExposerGenerator_ExposerPackagesExportContainer();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.PackagesExportContainerImpl <em>Packages Export Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.PackagesExportContainerImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getPackagesExportContainer()
		 * @generated
		 */
		EClass PACKAGES_EXPORT_CONTAINER = eINSTANCE.getPackagesExportContainer();

		/**
		 * The meta object literal for the '<em><b>Packages Export</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGES_EXPORT_CONTAINER__PACKAGES_EXPORT = eINSTANCE.getPackagesExportContainer_PackagesExport();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGES_EXPORT_CONTAINER__NAME = eINSTANCE.getPackagesExportContainer_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.PackageExportImpl <em>Package Export</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.PackageExportImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getPackageExport()
		 * @generated
		 */
		EClass PACKAGE_EXPORT = eINSTANCE.getPackageExport();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_EXPORT__ID = eINSTANCE.getPackageExport_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.RequiredPluginsContainerImpl <em>Required Plugins Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.RequiredPluginsContainerImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getRequiredPluginsContainer()
		 * @generated
		 */
		EClass REQUIRED_PLUGINS_CONTAINER = eINSTANCE.getRequiredPluginsContainer();

		/**
		 * The meta object literal for the '<em><b>Required Plugins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_PLUGINS_CONTAINER__REQUIRED_PLUGINS = eINSTANCE.getRequiredPluginsContainer_RequiredPlugins();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_PLUGINS_CONTAINER__NAME = eINSTANCE.getRequiredPluginsContainer_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.RequiredPluginImpl <em>Required Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.RequiredPluginImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getRequiredPlugin()
		 * @generated
		 */
		EClass REQUIRED_PLUGIN = eINSTANCE.getRequiredPlugin();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_PLUGIN__ID = eINSTANCE.getRequiredPlugin_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.RequiredPluginFeatureImpl <em>Required Plugin Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.RequiredPluginFeatureImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getRequiredPluginFeature()
		 * @generated
		 */
		EClass REQUIRED_PLUGIN_FEATURE = eINSTANCE.getRequiredPluginFeature();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.PackageExportFeatureImpl <em>Package Export Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.PackageExportFeatureImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorPackageImpl#getPackageExportFeature()
		 * @generated
		 */
		EClass PACKAGE_EXPORT_FEATURE = eINSTANCE.getPackageExportFeature();

	}

} //OSLC4EMFgeneratorPackage
