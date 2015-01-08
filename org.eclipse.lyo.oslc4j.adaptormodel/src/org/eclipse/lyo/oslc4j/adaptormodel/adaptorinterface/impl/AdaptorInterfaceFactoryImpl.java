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
package org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptorInterfaceFactoryImpl extends EFactoryImpl implements AdaptorInterfaceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdaptorInterfaceFactory init() {
		try {
			AdaptorInterfaceFactory theAdaptorInterfaceFactory = (AdaptorInterfaceFactory)EPackage.Registry.INSTANCE.getEFactory(AdaptorInterfacePackage.eNS_URI);
			if (theAdaptorInterfaceFactory != null) {
				return theAdaptorInterfaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdaptorInterfaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptorInterfaceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AdaptorInterfacePackage.ADAPTOR_INTERFACE: return (EObject)createAdaptorInterface();
			case AdaptorInterfacePackage.SPECIFICATION: return (EObject)createSpecification();
			case AdaptorInterfacePackage.DOMAIN_SPECIFICATION: return (EObject)createDomainSpecification();
			case AdaptorInterfacePackage.NAMESPACE_PREFIX: return (EObject)createNamespacePrefix();
			case AdaptorInterfacePackage.SERVICE_PROVIDER_CATALOG: return (EObject)createServiceProviderCatalog();
			case AdaptorInterfacePackage.SERVICE_PROVIDER: return (EObject)createServiceProvider();
			case AdaptorInterfacePackage.SERVICE: return (EObject)createService();
			case AdaptorInterfacePackage.RESOURCE: return (EObject)createResource();
			case AdaptorInterfacePackage.RESOURCE_PROPERTY: return (EObject)createResourceProperty();
			case AdaptorInterfacePackage.CREATION_FACTORY: return (EObject)createCreationFactory();
			case AdaptorInterfacePackage.QUERY_CAPABILITY: return (EObject)createQueryCapability();
			case AdaptorInterfacePackage.BASIC_CAPABILITY: return (EObject)createBasicCapability();
			case AdaptorInterfacePackage.DIALOG: return (EObject)createDialog();
			case AdaptorInterfacePackage.PUBLISHER: return (EObject)createPublisher();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AdaptorInterfacePackage.RESOURCE_PROPERTY_OCCURS:
				return createResourcePropertyOccursFromString(eDataType, initialValue);
			case AdaptorInterfacePackage.RESOURCE_PROPERTY_VALUE_TYPE:
				return createResourcePropertyValueTypeFromString(eDataType, initialValue);
			case AdaptorInterfacePackage.RESOURCE_PROPERTY_REPRESENTATION:
				return createResourcePropertyRepresentationFromString(eDataType, initialValue);
			case AdaptorInterfacePackage.RESOURCE_SERVICE_NAMESPACE:
				return createResourceServiceNamespaceFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AdaptorInterfacePackage.RESOURCE_PROPERTY_OCCURS:
				return convertResourcePropertyOccursToString(eDataType, instanceValue);
			case AdaptorInterfacePackage.RESOURCE_PROPERTY_VALUE_TYPE:
				return convertResourcePropertyValueTypeToString(eDataType, instanceValue);
			case AdaptorInterfacePackage.RESOURCE_PROPERTY_REPRESENTATION:
				return convertResourcePropertyRepresentationToString(eDataType, instanceValue);
			case AdaptorInterfacePackage.RESOURCE_SERVICE_NAMESPACE:
				return convertResourceServiceNamespaceToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptorInterface createAdaptorInterface() {
		AdaptorInterfaceImpl adaptorInterface = new AdaptorInterfaceImpl();
		return adaptorInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSpecification createDomainSpecification() {
		DomainSpecificationImpl domainSpecification = new DomainSpecificationImpl();
		return domainSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacePrefix createNamespacePrefix() {
		NamespacePrefixImpl namespacePrefix = new NamespacePrefixImpl();
		return namespacePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProviderCatalog createServiceProviderCatalog() {
		ServiceProviderCatalogImpl serviceProviderCatalog = new ServiceProviderCatalogImpl();
		return serviceProviderCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProvider createServiceProvider() {
		ServiceProviderImpl serviceProvider = new ServiceProviderImpl();
		return serviceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceProperty createResourceProperty() {
		ResourcePropertyImpl resourceProperty = new ResourcePropertyImpl();
		return resourceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationFactory createCreationFactory() {
		CreationFactoryImpl creationFactory = new CreationFactoryImpl();
		return creationFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryCapability createQueryCapability() {
		QueryCapabilityImpl queryCapability = new QueryCapabilityImpl();
		return queryCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicCapability createBasicCapability() {
		BasicCapabilityImpl basicCapability = new BasicCapabilityImpl();
		return basicCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialog createDialog() {
		DialogImpl dialog = new DialogImpl();
		return dialog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher createPublisher() {
		PublisherImpl publisher = new PublisherImpl();
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePropertyOccurs createResourcePropertyOccursFromString(EDataType eDataType, String initialValue) {
		ResourcePropertyOccurs result = ResourcePropertyOccurs.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourcePropertyOccursToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePropertyValueType createResourcePropertyValueTypeFromString(EDataType eDataType, String initialValue) {
		ResourcePropertyValueType result = ResourcePropertyValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourcePropertyValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePropertyRepresentation createResourcePropertyRepresentationFromString(EDataType eDataType, String initialValue) {
		ResourcePropertyRepresentation result = ResourcePropertyRepresentation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourcePropertyRepresentationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceServiceNamespace createResourceServiceNamespaceFromString(EDataType eDataType, String initialValue) {
		ResourceServiceNamespace result = ResourceServiceNamespace.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceServiceNamespaceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptorInterfacePackage getAdaptorInterfacePackage() {
		return (AdaptorInterfacePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdaptorInterfacePackage getPackage() {
		return AdaptorInterfacePackage.eINSTANCE;
	}

} //AdaptorInterfaceFactoryImpl
