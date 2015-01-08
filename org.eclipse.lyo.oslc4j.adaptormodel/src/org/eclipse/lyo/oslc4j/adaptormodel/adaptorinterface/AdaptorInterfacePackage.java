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
 * Jad El-khoury		- initial adaptor model
 * Matthieu Helleboid	- Move default generation information to Adaptor Manager Generator 
 * 						- Add Adaptor Interface GenModel and generate the model code, the model edit and the editor using ai as file extension
 * Anass Radouani		- Move default generation information to Adaptor Manager Generator 
 * 						- Add Adaptor Interface GenModel and generate the model code, the model edit and the editor using ai as file extension
 */
package org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterfaceFactory
 * @model kind="package"
 * @generated
 */
public interface AdaptorInterfacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adaptorinterface";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.lyo/oslc4j/adaptorInterface";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oslc4j_ai";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdaptorInterfacePackage eINSTANCE = org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfaceImpl <em>Adaptor Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfaceImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getAdaptorInterface()
	 * @generated
	 */
	int ADAPTOR_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Service Provider Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE__SPECIFICATION = 2;

	/**
	 * The number of structural features of the '<em>Adaptor Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Adaptor Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.SpecificationImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Domain Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DOMAIN_SPECIFICATIONS = 0;

	/**
	 * The feature id for the '<em><b>Domain Prefixes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DOMAIN_PREFIXES = 1;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.DomainSpecificationImpl <em>Domain Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.DomainSpecificationImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getDomainSpecification()
	 * @generated
	 */
	int DOMAIN_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Namespace URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFICATION__NAMESPACE_URI = 1;

	/**
	 * The feature id for the '<em><b>Namespace Prefix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFICATION__NAMESPACE_PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFICATION__RESOURCES = 3;

	/**
	 * The feature id for the '<em><b>Resource Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFICATION__RESOURCE_PROPERTIES = 4;

	/**
	 * The number of structural features of the '<em>Domain Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Domain Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.NamespacePrefixImpl <em>Namespace Prefix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.NamespacePrefixImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getNamespacePrefix()
	 * @generated
	 */
	int NAMESPACE_PREFIX = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_PREFIX__NAME = 0;

	/**
	 * The number of structural features of the '<em>Namespace Prefix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_PREFIX_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Namespace Prefix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_PREFIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceProviderCatalogImpl <em>Service Provider Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceProviderCatalogImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getServiceProviderCatalog()
	 * @generated
	 */
	int SERVICE_PROVIDER_CATALOG = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_CATALOG__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_CATALOG__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_CATALOG__PUBLISHER = 2;

	/**
	 * The feature id for the '<em><b>Service Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_CATALOG__SERVICE_PROVIDERS = 3;

	/**
	 * The number of structural features of the '<em>Service Provider Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_CATALOG_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service Provider Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_CATALOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceProviderImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getServiceProvider()
	 * @generated
	 */
	int SERVICE_PROVIDER = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__PUBLISHER = 2;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__SERVICES = 3;

	/**
	 * The feature id for the '<em><b>Service Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__SERVICE_NAMESPACE = 4;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__INSTANCE_ID = 5;

	/**
	 * The number of structural features of the '<em>Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 6;

	/**
	 * The feature id for the '<em><b>Domain Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DOMAIN_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Creation Factories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CREATION_FACTORIES = 1;

	/**
	 * The feature id for the '<em><b>Query Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__QUERY_CAPABILITIES = 2;

	/**
	 * The feature id for the '<em><b>Selection Dialogs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SELECTION_DIALOGS = 3;

	/**
	 * The feature id for the '<em><b>Creation Dialogs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CREATION_DIALOGS = 4;

	/**
	 * The feature id for the '<em><b>Basic Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__BASIC_CAPABILITIES = 5;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ResourceImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EXTENDS = 0;

	/**
	 * The feature id for the '<em><b>Resource Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RESOURCE_PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ResourcePropertyImpl <em>Resource Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ResourcePropertyImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getResourceProperty()
	 * @generated
	 */
	int RESOURCE_PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY__OCCURS = 2;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY__READ_ONLY = 3;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY__VALUE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY__REPRESENTATION = 5;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY__RANGE = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY__DESCRIPTION = 7;

	/**
	 * The number of structural features of the '<em>Resource Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Resource Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.CreationFactoryImpl <em>Creation Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.CreationFactoryImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getCreationFactory()
	 * @generated
	 */
	int CREATION_FACTORY = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_FACTORY__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_FACTORY__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Creation URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_FACTORY__CREATION_URI = 2;

	/**
	 * The feature id for the '<em><b>Resource Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_FACTORY__RESOURCE_TYPES = 3;

	/**
	 * The number of structural features of the '<em>Creation Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_FACTORY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Creation Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_FACTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.QueryCapabilityImpl <em>Query Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.QueryCapabilityImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getQueryCapability()
	 * @generated
	 */
	int QUERY_CAPABILITY = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CAPABILITY__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CAPABILITY__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Query Base URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CAPABILITY__QUERY_BASE_URI = 2;

	/**
	 * The feature id for the '<em><b>Resource Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CAPABILITY__RESOURCE_TYPES = 3;

	/**
	 * The number of structural features of the '<em>Query Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CAPABILITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Query Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CAPABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.BasicCapabilityImpl <em>Basic Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.BasicCapabilityImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getBasicCapability()
	 * @generated
	 */
	int BASIC_CAPABILITY = 11;

	/**
	 * The feature id for the '<em><b>Resource Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CAPABILITY__RESOURCE_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CAPABILITY__INSTANCE_ID = 1;

	/**
	 * The feature id for the '<em><b>Service Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CAPABILITY__SERVICE_NAMESPACE = 2;

	/**
	 * The number of structural features of the '<em>Basic Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CAPABILITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Basic Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CAPABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.DialogImpl <em>Dialog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.DialogImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getDialog()
	 * @generated
	 */
	int DIALOG = 12;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Dialog URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__DIALOG_URI = 2;

	/**
	 * The feature id for the '<em><b>Hint Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__HINT_WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Hint Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__HINT_HEIGHT = 4;

	/**
	 * The feature id for the '<em><b>Resource Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__RESOURCE_TYPES = 5;

	/**
	 * The number of structural features of the '<em>Dialog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Dialog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.PublisherImpl <em>Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.PublisherImpl
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getPublisher()
	 * @generated
	 */
	int PUBLISHER = 13;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__ICON = 3;

	/**
	 * The number of structural features of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyOccurs <em>Resource Property Occurs</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyOccurs
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getResourcePropertyOccurs()
	 * @generated
	 */
	int RESOURCE_PROPERTY_OCCURS = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyValueType <em>Resource Property Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyValueType
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getResourcePropertyValueType()
	 * @generated
	 */
	int RESOURCE_PROPERTY_VALUE_TYPE = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyRepresentation <em>Resource Property Representation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyRepresentation
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getResourcePropertyRepresentation()
	 * @generated
	 */
	int RESOURCE_PROPERTY_REPRESENTATION = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceServiceNamespace <em>Resource Service Namespace</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceServiceNamespace
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getResourceServiceNamespace()
	 * @generated
	 */
	int RESOURCE_SERVICE_NAMESPACE = 17;


	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterface <em>Adaptor Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptor Interface</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterface
	 * @generated
	 */
	EClass getAdaptorInterface();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterface#getServiceProviderCatalog <em>Service Provider Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Provider Catalog</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterface#getServiceProviderCatalog()
	 * @see #getAdaptorInterface()
	 * @generated
	 */
	EReference getAdaptorInterface_ServiceProviderCatalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterface#getName()
	 * @see #getAdaptorInterface()
	 * @generated
	 */
	EAttribute getAdaptorInterface_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterface#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterface#getSpecification()
	 * @see #getAdaptorInterface()
	 * @generated
	 */
	EReference getAdaptorInterface_Specification();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Specification#getDomainSpecifications <em>Domain Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Specifications</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Specification#getDomainSpecifications()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_DomainSpecifications();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Specification#getDomainPrefixes <em>Domain Prefixes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Prefixes</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Specification#getDomainPrefixes()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_DomainPrefixes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.DomainSpecification <em>Domain Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Specification</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.DomainSpecification
	 * @generated
	 */
	EClass getDomainSpecification();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.DomainSpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.DomainSpecification#getName()
	 * @see #getDomainSpecification()
	 * @generated
	 */
	EAttribute getDomainSpecification_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.DomainSpecification#getNamespaceURI <em>Namespace URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace URI</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.DomainSpecification#getNamespaceURI()
	 * @see #getDomainSpecification()
	 * @generated
	 */
	EAttribute getDomainSpecification_NamespaceURI();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.DomainSpecification#getNamespacePrefix <em>Namespace Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Namespace Prefix</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.DomainSpecification#getNamespacePrefix()
	 * @see #getDomainSpecification()
	 * @generated
	 */
	EReference getDomainSpecification_NamespacePrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.DomainSpecification#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.DomainSpecification#getResources()
	 * @see #getDomainSpecification()
	 * @generated
	 */
	EReference getDomainSpecification_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.DomainSpecification#getResourceProperties <em>Resource Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Properties</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.DomainSpecification#getResourceProperties()
	 * @see #getDomainSpecification()
	 * @generated
	 */
	EReference getDomainSpecification_ResourceProperties();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.NamespacePrefix <em>Namespace Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace Prefix</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.NamespacePrefix
	 * @generated
	 */
	EClass getNamespacePrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.NamespacePrefix#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.NamespacePrefix#getName()
	 * @see #getNamespacePrefix()
	 * @generated
	 */
	EAttribute getNamespacePrefix_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProviderCatalog <em>Service Provider Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Provider Catalog</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProviderCatalog
	 * @generated
	 */
	EClass getServiceProviderCatalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProviderCatalog#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProviderCatalog#getTitle()
	 * @see #getServiceProviderCatalog()
	 * @generated
	 */
	EAttribute getServiceProviderCatalog_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProviderCatalog#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProviderCatalog#getDescription()
	 * @see #getServiceProviderCatalog()
	 * @generated
	 */
	EAttribute getServiceProviderCatalog_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProviderCatalog#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProviderCatalog#getPublisher()
	 * @see #getServiceProviderCatalog()
	 * @generated
	 */
	EReference getServiceProviderCatalog_Publisher();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProviderCatalog#getServiceProviders <em>Service Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Providers</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProviderCatalog#getServiceProviders()
	 * @see #getServiceProviderCatalog()
	 * @generated
	 */
	EReference getServiceProviderCatalog_ServiceProviders();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProvider <em>Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Provider</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProvider
	 * @generated
	 */
	EClass getServiceProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProvider#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProvider#getTitle()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EAttribute getServiceProvider_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProvider#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProvider#getDescription()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EAttribute getServiceProvider_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProvider#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProvider#getPublisher()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EReference getServiceProvider_Publisher();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProvider#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProvider#getServices()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EReference getServiceProvider_Services();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProvider#getServiceNamespace <em>Service Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Namespace</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProvider#getServiceNamespace()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EAttribute getServiceProvider_ServiceNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProvider#getInstanceID <em>Instance ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance ID</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProvider#getInstanceID()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EAttribute getServiceProvider_InstanceID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Service#getDomainSpecification <em>Domain Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Specification</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Service#getDomainSpecification()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_DomainSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Service#getCreationFactories <em>Creation Factories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Creation Factories</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Service#getCreationFactories()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_CreationFactories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Service#getQueryCapabilities <em>Query Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query Capabilities</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Service#getQueryCapabilities()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_QueryCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Service#getSelectionDialogs <em>Selection Dialogs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selection Dialogs</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Service#getSelectionDialogs()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_SelectionDialogs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Service#getCreationDialogs <em>Creation Dialogs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Creation Dialogs</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Service#getCreationDialogs()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_CreationDialogs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Service#getBasicCapabilities <em>Basic Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Capabilities</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Service#getBasicCapabilities()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_BasicCapabilities();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Resource#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Resource#getExtends()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Extends();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Resource#getResourceProperties <em>Resource Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Properties</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Resource#getResourceProperties()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_ResourceProperties();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty <em>Resource Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Property</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty
	 * @generated
	 */
	EClass getResourceProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty#getTitle()
	 * @see #getResourceProperty()
	 * @generated
	 */
	EAttribute getResourceProperty_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty#getName()
	 * @see #getResourceProperty()
	 * @generated
	 */
	EAttribute getResourceProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty#getOccurs <em>Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occurs</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty#getOccurs()
	 * @see #getResourceProperty()
	 * @generated
	 */
	EAttribute getResourceProperty_Occurs();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty#isReadOnly()
	 * @see #getResourceProperty()
	 * @generated
	 */
	EAttribute getResourceProperty_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty#getValueType()
	 * @see #getResourceProperty()
	 * @generated
	 */
	EAttribute getResourceProperty_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty#getRepresentation()
	 * @see #getResourceProperty()
	 * @generated
	 */
	EAttribute getResourceProperty_Representation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Range</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty#getRange()
	 * @see #getResourceProperty()
	 * @generated
	 */
	EReference getResourceProperty_Range();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty#getDescription()
	 * @see #getResourceProperty()
	 * @generated
	 */
	EAttribute getResourceProperty_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.CreationFactory <em>Creation Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creation Factory</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.CreationFactory
	 * @generated
	 */
	EClass getCreationFactory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.CreationFactory#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.CreationFactory#getTitle()
	 * @see #getCreationFactory()
	 * @generated
	 */
	EAttribute getCreationFactory_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.CreationFactory#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.CreationFactory#getLabel()
	 * @see #getCreationFactory()
	 * @generated
	 */
	EAttribute getCreationFactory_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.CreationFactory#getCreationURI <em>Creation URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation URI</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.CreationFactory#getCreationURI()
	 * @see #getCreationFactory()
	 * @generated
	 */
	EAttribute getCreationFactory_CreationURI();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.CreationFactory#getResourceTypes <em>Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Types</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.CreationFactory#getResourceTypes()
	 * @see #getCreationFactory()
	 * @generated
	 */
	EReference getCreationFactory_ResourceTypes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.QueryCapability <em>Query Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Capability</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.QueryCapability
	 * @generated
	 */
	EClass getQueryCapability();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.QueryCapability#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.QueryCapability#getTitle()
	 * @see #getQueryCapability()
	 * @generated
	 */
	EAttribute getQueryCapability_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.QueryCapability#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.QueryCapability#getLabel()
	 * @see #getQueryCapability()
	 * @generated
	 */
	EAttribute getQueryCapability_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.QueryCapability#getQueryBaseURI <em>Query Base URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Base URI</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.QueryCapability#getQueryBaseURI()
	 * @see #getQueryCapability()
	 * @generated
	 */
	EAttribute getQueryCapability_QueryBaseURI();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.QueryCapability#getResourceTypes <em>Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Types</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.QueryCapability#getResourceTypes()
	 * @see #getQueryCapability()
	 * @generated
	 */
	EReference getQueryCapability_ResourceTypes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.BasicCapability <em>Basic Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Capability</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.BasicCapability
	 * @generated
	 */
	EClass getBasicCapability();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.BasicCapability#getResourceTypes <em>Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Types</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.BasicCapability#getResourceTypes()
	 * @see #getBasicCapability()
	 * @generated
	 */
	EReference getBasicCapability_ResourceTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.BasicCapability#getInstanceID <em>Instance ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance ID</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.BasicCapability#getInstanceID()
	 * @see #getBasicCapability()
	 * @generated
	 */
	EAttribute getBasicCapability_InstanceID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.BasicCapability#getServiceNamespace <em>Service Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Namespace</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.BasicCapability#getServiceNamespace()
	 * @see #getBasicCapability()
	 * @generated
	 */
	EAttribute getBasicCapability_ServiceNamespace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Dialog <em>Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Dialog
	 * @generated
	 */
	EClass getDialog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Dialog#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Dialog#getTitle()
	 * @see #getDialog()
	 * @generated
	 */
	EAttribute getDialog_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Dialog#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Dialog#getLabel()
	 * @see #getDialog()
	 * @generated
	 */
	EAttribute getDialog_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Dialog#getDialogURI <em>Dialog URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dialog URI</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Dialog#getDialogURI()
	 * @see #getDialog()
	 * @generated
	 */
	EAttribute getDialog_DialogURI();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Dialog#getHintWidth <em>Hint Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hint Width</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Dialog#getHintWidth()
	 * @see #getDialog()
	 * @generated
	 */
	EAttribute getDialog_HintWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Dialog#getHintHeight <em>Hint Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hint Height</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Dialog#getHintHeight()
	 * @see #getDialog()
	 * @generated
	 */
	EAttribute getDialog_HintHeight();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Dialog#getResourceTypes <em>Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Types</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Dialog#getResourceTypes()
	 * @see #getDialog()
	 * @generated
	 */
	EReference getDialog_ResourceTypes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Publisher
	 * @generated
	 */
	EClass getPublisher();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Publisher#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Publisher#getTitle()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Publisher#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Publisher#getLabel()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Publisher#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Publisher#getIdentifier()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Publisher#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Publisher#getIcon()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Icon();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyOccurs <em>Resource Property Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Property Occurs</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyOccurs
	 * @generated
	 */
	EEnum getResourcePropertyOccurs();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyValueType <em>Resource Property Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Property Value Type</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyValueType
	 * @generated
	 */
	EEnum getResourcePropertyValueType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyRepresentation <em>Resource Property Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Property Representation</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyRepresentation
	 * @generated
	 */
	EEnum getResourcePropertyRepresentation();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceServiceNamespace <em>Resource Service Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Service Namespace</em>'.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceServiceNamespace
	 * @generated
	 */
	EEnum getResourceServiceNamespace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdaptorInterfaceFactory getAdaptorInterfaceFactory();

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
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfaceImpl <em>Adaptor Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfaceImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getAdaptorInterface()
		 * @generated
		 */
		EClass ADAPTOR_INTERFACE = eINSTANCE.getAdaptorInterface();

		/**
		 * The meta object literal for the '<em><b>Service Provider Catalog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG = eINSTANCE.getAdaptorInterface_ServiceProviderCatalog();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTOR_INTERFACE__NAME = eINSTANCE.getAdaptorInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTOR_INTERFACE__SPECIFICATION = eINSTANCE.getAdaptorInterface_Specification();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.SpecificationImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Domain Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__DOMAIN_SPECIFICATIONS = eINSTANCE.getSpecification_DomainSpecifications();

		/**
		 * The meta object literal for the '<em><b>Domain Prefixes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__DOMAIN_PREFIXES = eINSTANCE.getSpecification_DomainPrefixes();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.DomainSpecificationImpl <em>Domain Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.DomainSpecificationImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getDomainSpecification()
		 * @generated
		 */
		EClass DOMAIN_SPECIFICATION = eINSTANCE.getDomainSpecification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_SPECIFICATION__NAME = eINSTANCE.getDomainSpecification_Name();

		/**
		 * The meta object literal for the '<em><b>Namespace URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_SPECIFICATION__NAMESPACE_URI = eINSTANCE.getDomainSpecification_NamespaceURI();

		/**
		 * The meta object literal for the '<em><b>Namespace Prefix</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFICATION__NAMESPACE_PREFIX = eINSTANCE.getDomainSpecification_NamespacePrefix();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFICATION__RESOURCES = eINSTANCE.getDomainSpecification_Resources();

		/**
		 * The meta object literal for the '<em><b>Resource Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFICATION__RESOURCE_PROPERTIES = eINSTANCE.getDomainSpecification_ResourceProperties();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.NamespacePrefixImpl <em>Namespace Prefix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.NamespacePrefixImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getNamespacePrefix()
		 * @generated
		 */
		EClass NAMESPACE_PREFIX = eINSTANCE.getNamespacePrefix();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE_PREFIX__NAME = eINSTANCE.getNamespacePrefix_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceProviderCatalogImpl <em>Service Provider Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceProviderCatalogImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getServiceProviderCatalog()
		 * @generated
		 */
		EClass SERVICE_PROVIDER_CATALOG = eINSTANCE.getServiceProviderCatalog();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROVIDER_CATALOG__TITLE = eINSTANCE.getServiceProviderCatalog_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROVIDER_CATALOG__DESCRIPTION = eINSTANCE.getServiceProviderCatalog_Description();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROVIDER_CATALOG__PUBLISHER = eINSTANCE.getServiceProviderCatalog_Publisher();

		/**
		 * The meta object literal for the '<em><b>Service Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROVIDER_CATALOG__SERVICE_PROVIDERS = eINSTANCE.getServiceProviderCatalog_ServiceProviders();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceProviderImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getServiceProvider()
		 * @generated
		 */
		EClass SERVICE_PROVIDER = eINSTANCE.getServiceProvider();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROVIDER__TITLE = eINSTANCE.getServiceProvider_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROVIDER__DESCRIPTION = eINSTANCE.getServiceProvider_Description();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROVIDER__PUBLISHER = eINSTANCE.getServiceProvider_Publisher();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROVIDER__SERVICES = eINSTANCE.getServiceProvider_Services();

		/**
		 * The meta object literal for the '<em><b>Service Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROVIDER__SERVICE_NAMESPACE = eINSTANCE.getServiceProvider_ServiceNamespace();

		/**
		 * The meta object literal for the '<em><b>Instance ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROVIDER__INSTANCE_ID = eINSTANCE.getServiceProvider_InstanceID();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ServiceImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Domain Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__DOMAIN_SPECIFICATION = eINSTANCE.getService_DomainSpecification();

		/**
		 * The meta object literal for the '<em><b>Creation Factories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__CREATION_FACTORIES = eINSTANCE.getService_CreationFactories();

		/**
		 * The meta object literal for the '<em><b>Query Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__QUERY_CAPABILITIES = eINSTANCE.getService_QueryCapabilities();

		/**
		 * The meta object literal for the '<em><b>Selection Dialogs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SELECTION_DIALOGS = eINSTANCE.getService_SelectionDialogs();

		/**
		 * The meta object literal for the '<em><b>Creation Dialogs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__CREATION_DIALOGS = eINSTANCE.getService_CreationDialogs();

		/**
		 * The meta object literal for the '<em><b>Basic Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__BASIC_CAPABILITIES = eINSTANCE.getService_BasicCapabilities();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ResourceImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__EXTENDS = eINSTANCE.getResource_Extends();

		/**
		 * The meta object literal for the '<em><b>Resource Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__RESOURCE_PROPERTIES = eINSTANCE.getResource_ResourceProperties();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ResourcePropertyImpl <em>Resource Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.ResourcePropertyImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getResourceProperty()
		 * @generated
		 */
		EClass RESOURCE_PROPERTY = eINSTANCE.getResourceProperty();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPERTY__TITLE = eINSTANCE.getResourceProperty_Title();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPERTY__NAME = eINSTANCE.getResourceProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPERTY__OCCURS = eINSTANCE.getResourceProperty_Occurs();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPERTY__READ_ONLY = eINSTANCE.getResourceProperty_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPERTY__VALUE_TYPE = eINSTANCE.getResourceProperty_ValueType();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPERTY__REPRESENTATION = eINSTANCE.getResourceProperty_Representation();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PROPERTY__RANGE = eINSTANCE.getResourceProperty_Range();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPERTY__DESCRIPTION = eINSTANCE.getResourceProperty_Description();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.CreationFactoryImpl <em>Creation Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.CreationFactoryImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getCreationFactory()
		 * @generated
		 */
		EClass CREATION_FACTORY = eINSTANCE.getCreationFactory();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATION_FACTORY__TITLE = eINSTANCE.getCreationFactory_Title();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATION_FACTORY__LABEL = eINSTANCE.getCreationFactory_Label();

		/**
		 * The meta object literal for the '<em><b>Creation URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATION_FACTORY__CREATION_URI = eINSTANCE.getCreationFactory_CreationURI();

		/**
		 * The meta object literal for the '<em><b>Resource Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATION_FACTORY__RESOURCE_TYPES = eINSTANCE.getCreationFactory_ResourceTypes();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.QueryCapabilityImpl <em>Query Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.QueryCapabilityImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getQueryCapability()
		 * @generated
		 */
		EClass QUERY_CAPABILITY = eINSTANCE.getQueryCapability();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_CAPABILITY__TITLE = eINSTANCE.getQueryCapability_Title();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_CAPABILITY__LABEL = eINSTANCE.getQueryCapability_Label();

		/**
		 * The meta object literal for the '<em><b>Query Base URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_CAPABILITY__QUERY_BASE_URI = eINSTANCE.getQueryCapability_QueryBaseURI();

		/**
		 * The meta object literal for the '<em><b>Resource Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_CAPABILITY__RESOURCE_TYPES = eINSTANCE.getQueryCapability_ResourceTypes();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.BasicCapabilityImpl <em>Basic Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.BasicCapabilityImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getBasicCapability()
		 * @generated
		 */
		EClass BASIC_CAPABILITY = eINSTANCE.getBasicCapability();

		/**
		 * The meta object literal for the '<em><b>Resource Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_CAPABILITY__RESOURCE_TYPES = eINSTANCE.getBasicCapability_ResourceTypes();

		/**
		 * The meta object literal for the '<em><b>Instance ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_CAPABILITY__INSTANCE_ID = eINSTANCE.getBasicCapability_InstanceID();

		/**
		 * The meta object literal for the '<em><b>Service Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_CAPABILITY__SERVICE_NAMESPACE = eINSTANCE.getBasicCapability_ServiceNamespace();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.DialogImpl <em>Dialog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.DialogImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getDialog()
		 * @generated
		 */
		EClass DIALOG = eINSTANCE.getDialog();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG__TITLE = eINSTANCE.getDialog_Title();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG__LABEL = eINSTANCE.getDialog_Label();

		/**
		 * The meta object literal for the '<em><b>Dialog URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG__DIALOG_URI = eINSTANCE.getDialog_DialogURI();

		/**
		 * The meta object literal for the '<em><b>Hint Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG__HINT_WIDTH = eINSTANCE.getDialog_HintWidth();

		/**
		 * The meta object literal for the '<em><b>Hint Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG__HINT_HEIGHT = eINSTANCE.getDialog_HintHeight();

		/**
		 * The meta object literal for the '<em><b>Resource Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOG__RESOURCE_TYPES = eINSTANCE.getDialog_ResourceTypes();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.PublisherImpl <em>Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.PublisherImpl
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getPublisher()
		 * @generated
		 */
		EClass PUBLISHER = eINSTANCE.getPublisher();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__TITLE = eINSTANCE.getPublisher_Title();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__LABEL = eINSTANCE.getPublisher_Label();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__IDENTIFIER = eINSTANCE.getPublisher_Identifier();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__ICON = eINSTANCE.getPublisher_Icon();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyOccurs <em>Resource Property Occurs</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyOccurs
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getResourcePropertyOccurs()
		 * @generated
		 */
		EEnum RESOURCE_PROPERTY_OCCURS = eINSTANCE.getResourcePropertyOccurs();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyValueType <em>Resource Property Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyValueType
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getResourcePropertyValueType()
		 * @generated
		 */
		EEnum RESOURCE_PROPERTY_VALUE_TYPE = eINSTANCE.getResourcePropertyValueType();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyRepresentation <em>Resource Property Representation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyRepresentation
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getResourcePropertyRepresentation()
		 * @generated
		 */
		EEnum RESOURCE_PROPERTY_REPRESENTATION = eINSTANCE.getResourcePropertyRepresentation();

		/**
		 * The meta object literal for the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceServiceNamespace <em>Resource Service Namespace</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceServiceNamespace
		 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl.AdaptorInterfacePackageImpl#getResourceServiceNamespace()
		 * @generated
		 */
		EEnum RESOURCE_SERVICE_NAMESPACE = eINSTANCE.getResourceServiceNamespace();

	}

} //AdaptorInterfacePackage
