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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterface;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterfaceFactory;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterfacePackage;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.BasicCapability;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.CreationFactory;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Dialog;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.DomainSpecification;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.NamespacePrefix;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Publisher;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.QueryCapability;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Resource;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyOccurs;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyRepresentation;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyValueType;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceServiceNamespace;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Service;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProvider;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProviderCatalog;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Specification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptorInterfacePackageImpl extends EPackageImpl implements AdaptorInterfacePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptorInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespacePrefixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceProviderCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creationFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourcePropertyOccursEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourcePropertyValueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourcePropertyRepresentationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceServiceNamespaceEEnum = null;

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
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterfacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdaptorInterfacePackageImpl() {
		super(eNS_URI, AdaptorInterfaceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AdaptorInterfacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdaptorInterfacePackage init() {
		if (isInited) return (AdaptorInterfacePackage)EPackage.Registry.INSTANCE.getEPackage(AdaptorInterfacePackage.eNS_URI);

		// Obtain or create and register package
		AdaptorInterfacePackageImpl theAdaptorInterfacePackage = (AdaptorInterfacePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AdaptorInterfacePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AdaptorInterfacePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAdaptorInterfacePackage.createPackageContents();

		// Initialize created meta-data
		theAdaptorInterfacePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdaptorInterfacePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdaptorInterfacePackage.eNS_URI, theAdaptorInterfacePackage);
		return theAdaptorInterfacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptorInterface() {
		return adaptorInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptorInterface_ServiceProviderCatalog() {
		return (EReference)adaptorInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdaptorInterface_Name() {
		return (EAttribute)adaptorInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptorInterface_Specification() {
		return (EReference)adaptorInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecification() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_DomainSpecifications() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_DomainPrefixes() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainSpecification() {
		return domainSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSpecification_Name() {
		return (EAttribute)domainSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSpecification_NamespaceURI() {
		return (EAttribute)domainSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecification_NamespacePrefix() {
		return (EReference)domainSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecification_Resources() {
		return (EReference)domainSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecification_ResourceProperties() {
		return (EReference)domainSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespacePrefix() {
		return namespacePrefixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespacePrefix_Name() {
		return (EAttribute)namespacePrefixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceProviderCatalog() {
		return serviceProviderCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceProviderCatalog_Title() {
		return (EAttribute)serviceProviderCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceProviderCatalog_Description() {
		return (EAttribute)serviceProviderCatalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProviderCatalog_Publisher() {
		return (EReference)serviceProviderCatalogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProviderCatalog_ServiceProviders() {
		return (EReference)serviceProviderCatalogEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceProvider() {
		return serviceProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceProvider_Title() {
		return (EAttribute)serviceProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceProvider_Description() {
		return (EAttribute)serviceProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProvider_Publisher() {
		return (EReference)serviceProviderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProvider_Services() {
		return (EReference)serviceProviderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceProvider_ServiceNamespace() {
		return (EAttribute)serviceProviderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceProvider_InstanceID() {
		return (EAttribute)serviceProviderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_DomainSpecification() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_CreationFactories() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_QueryCapabilities() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_SelectionDialogs() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_CreationDialogs() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_BasicCapabilities() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Name() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Extends() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_ResourceProperties() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceProperty() {
		return resourcePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceProperty_Title() {
		return (EAttribute)resourcePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceProperty_Name() {
		return (EAttribute)resourcePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceProperty_Occurs() {
		return (EAttribute)resourcePropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceProperty_ReadOnly() {
		return (EAttribute)resourcePropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceProperty_ValueType() {
		return (EAttribute)resourcePropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceProperty_Representation() {
		return (EAttribute)resourcePropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceProperty_Range() {
		return (EReference)resourcePropertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceProperty_Description() {
		return (EAttribute)resourcePropertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreationFactory() {
		return creationFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreationFactory_Title() {
		return (EAttribute)creationFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreationFactory_Label() {
		return (EAttribute)creationFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreationFactory_CreationURI() {
		return (EAttribute)creationFactoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreationFactory_ResourceTypes() {
		return (EReference)creationFactoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryCapability() {
		return queryCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryCapability_Title() {
		return (EAttribute)queryCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryCapability_Label() {
		return (EAttribute)queryCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryCapability_QueryBaseURI() {
		return (EAttribute)queryCapabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryCapability_ResourceTypes() {
		return (EReference)queryCapabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicCapability() {
		return basicCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicCapability_ResourceTypes() {
		return (EReference)basicCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicCapability_InstanceID() {
		return (EAttribute)basicCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicCapability_ServiceNamespace() {
		return (EAttribute)basicCapabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialog() {
		return dialogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialog_Title() {
		return (EAttribute)dialogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialog_Label() {
		return (EAttribute)dialogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialog_DialogURI() {
		return (EAttribute)dialogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialog_HintWidth() {
		return (EAttribute)dialogEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialog_HintHeight() {
		return (EAttribute)dialogEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialog_ResourceTypes() {
		return (EReference)dialogEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublisher() {
		return publisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublisher_Title() {
		return (EAttribute)publisherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublisher_Label() {
		return (EAttribute)publisherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublisher_Identifier() {
		return (EAttribute)publisherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublisher_Icon() {
		return (EAttribute)publisherEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourcePropertyOccurs() {
		return resourcePropertyOccursEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourcePropertyValueType() {
		return resourcePropertyValueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourcePropertyRepresentation() {
		return resourcePropertyRepresentationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceServiceNamespace() {
		return resourceServiceNamespaceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptorInterfaceFactory getAdaptorInterfaceFactory() {
		return (AdaptorInterfaceFactory)getEFactoryInstance();
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
		adaptorInterfaceEClass = createEClass(ADAPTOR_INTERFACE);
		createEReference(adaptorInterfaceEClass, ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG);
		createEAttribute(adaptorInterfaceEClass, ADAPTOR_INTERFACE__NAME);
		createEReference(adaptorInterfaceEClass, ADAPTOR_INTERFACE__SPECIFICATION);

		specificationEClass = createEClass(SPECIFICATION);
		createEReference(specificationEClass, SPECIFICATION__DOMAIN_SPECIFICATIONS);
		createEReference(specificationEClass, SPECIFICATION__DOMAIN_PREFIXES);

		domainSpecificationEClass = createEClass(DOMAIN_SPECIFICATION);
		createEAttribute(domainSpecificationEClass, DOMAIN_SPECIFICATION__NAME);
		createEAttribute(domainSpecificationEClass, DOMAIN_SPECIFICATION__NAMESPACE_URI);
		createEReference(domainSpecificationEClass, DOMAIN_SPECIFICATION__NAMESPACE_PREFIX);
		createEReference(domainSpecificationEClass, DOMAIN_SPECIFICATION__RESOURCES);
		createEReference(domainSpecificationEClass, DOMAIN_SPECIFICATION__RESOURCE_PROPERTIES);

		namespacePrefixEClass = createEClass(NAMESPACE_PREFIX);
		createEAttribute(namespacePrefixEClass, NAMESPACE_PREFIX__NAME);

		serviceProviderCatalogEClass = createEClass(SERVICE_PROVIDER_CATALOG);
		createEAttribute(serviceProviderCatalogEClass, SERVICE_PROVIDER_CATALOG__TITLE);
		createEAttribute(serviceProviderCatalogEClass, SERVICE_PROVIDER_CATALOG__DESCRIPTION);
		createEReference(serviceProviderCatalogEClass, SERVICE_PROVIDER_CATALOG__PUBLISHER);
		createEReference(serviceProviderCatalogEClass, SERVICE_PROVIDER_CATALOG__SERVICE_PROVIDERS);

		serviceProviderEClass = createEClass(SERVICE_PROVIDER);
		createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__TITLE);
		createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__DESCRIPTION);
		createEReference(serviceProviderEClass, SERVICE_PROVIDER__PUBLISHER);
		createEReference(serviceProviderEClass, SERVICE_PROVIDER__SERVICES);
		createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__SERVICE_NAMESPACE);
		createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__INSTANCE_ID);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__DOMAIN_SPECIFICATION);
		createEReference(serviceEClass, SERVICE__CREATION_FACTORIES);
		createEReference(serviceEClass, SERVICE__QUERY_CAPABILITIES);
		createEReference(serviceEClass, SERVICE__SELECTION_DIALOGS);
		createEReference(serviceEClass, SERVICE__CREATION_DIALOGS);
		createEReference(serviceEClass, SERVICE__BASIC_CAPABILITIES);

		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__EXTENDS);
		createEReference(resourceEClass, RESOURCE__RESOURCE_PROPERTIES);
		createEAttribute(resourceEClass, RESOURCE__NAME);

		resourcePropertyEClass = createEClass(RESOURCE_PROPERTY);
		createEAttribute(resourcePropertyEClass, RESOURCE_PROPERTY__TITLE);
		createEAttribute(resourcePropertyEClass, RESOURCE_PROPERTY__NAME);
		createEAttribute(resourcePropertyEClass, RESOURCE_PROPERTY__OCCURS);
		createEAttribute(resourcePropertyEClass, RESOURCE_PROPERTY__READ_ONLY);
		createEAttribute(resourcePropertyEClass, RESOURCE_PROPERTY__VALUE_TYPE);
		createEAttribute(resourcePropertyEClass, RESOURCE_PROPERTY__REPRESENTATION);
		createEReference(resourcePropertyEClass, RESOURCE_PROPERTY__RANGE);
		createEAttribute(resourcePropertyEClass, RESOURCE_PROPERTY__DESCRIPTION);

		creationFactoryEClass = createEClass(CREATION_FACTORY);
		createEAttribute(creationFactoryEClass, CREATION_FACTORY__TITLE);
		createEAttribute(creationFactoryEClass, CREATION_FACTORY__LABEL);
		createEAttribute(creationFactoryEClass, CREATION_FACTORY__CREATION_URI);
		createEReference(creationFactoryEClass, CREATION_FACTORY__RESOURCE_TYPES);

		queryCapabilityEClass = createEClass(QUERY_CAPABILITY);
		createEAttribute(queryCapabilityEClass, QUERY_CAPABILITY__TITLE);
		createEAttribute(queryCapabilityEClass, QUERY_CAPABILITY__LABEL);
		createEAttribute(queryCapabilityEClass, QUERY_CAPABILITY__QUERY_BASE_URI);
		createEReference(queryCapabilityEClass, QUERY_CAPABILITY__RESOURCE_TYPES);

		basicCapabilityEClass = createEClass(BASIC_CAPABILITY);
		createEReference(basicCapabilityEClass, BASIC_CAPABILITY__RESOURCE_TYPES);
		createEAttribute(basicCapabilityEClass, BASIC_CAPABILITY__INSTANCE_ID);
		createEAttribute(basicCapabilityEClass, BASIC_CAPABILITY__SERVICE_NAMESPACE);

		dialogEClass = createEClass(DIALOG);
		createEAttribute(dialogEClass, DIALOG__TITLE);
		createEAttribute(dialogEClass, DIALOG__LABEL);
		createEAttribute(dialogEClass, DIALOG__DIALOG_URI);
		createEAttribute(dialogEClass, DIALOG__HINT_WIDTH);
		createEAttribute(dialogEClass, DIALOG__HINT_HEIGHT);
		createEReference(dialogEClass, DIALOG__RESOURCE_TYPES);

		publisherEClass = createEClass(PUBLISHER);
		createEAttribute(publisherEClass, PUBLISHER__TITLE);
		createEAttribute(publisherEClass, PUBLISHER__LABEL);
		createEAttribute(publisherEClass, PUBLISHER__IDENTIFIER);
		createEAttribute(publisherEClass, PUBLISHER__ICON);

		// Create enums
		resourcePropertyOccursEEnum = createEEnum(RESOURCE_PROPERTY_OCCURS);
		resourcePropertyValueTypeEEnum = createEEnum(RESOURCE_PROPERTY_VALUE_TYPE);
		resourcePropertyRepresentationEEnum = createEEnum(RESOURCE_PROPERTY_REPRESENTATION);
		resourceServiceNamespaceEEnum = createEEnum(RESOURCE_SERVICE_NAMESPACE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(adaptorInterfaceEClass, AdaptorInterface.class, "AdaptorInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdaptorInterface_ServiceProviderCatalog(), this.getServiceProviderCatalog(), null, "serviceProviderCatalog", null, 1, 1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorInterface_Name(), ecorePackage.getEString(), "name", null, 1, 1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptorInterface_Specification(), this.getSpecification(), null, "specification", null, 1, 1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecification_DomainSpecifications(), this.getDomainSpecification(), null, "domainSpecifications", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_DomainPrefixes(), this.getNamespacePrefix(), null, "domainPrefixes", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainSpecificationEClass, DomainSpecification.class, "DomainSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainSpecification_Name(), ecorePackage.getEString(), "name", null, 1, 1, DomainSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainSpecification_NamespaceURI(), ecorePackage.getEString(), "namespaceURI", null, 1, 1, DomainSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecification_NamespacePrefix(), this.getNamespacePrefix(), null, "namespacePrefix", null, 1, 1, DomainSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecification_Resources(), this.getResource(), null, "resources", null, 0, -1, DomainSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecification_ResourceProperties(), this.getResourceProperty(), null, "resourceProperties", null, 0, -1, DomainSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namespacePrefixEClass, NamespacePrefix.class, "NamespacePrefix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamespacePrefix_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamespacePrefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceProviderCatalogEClass, ServiceProviderCatalog.class, "ServiceProviderCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceProviderCatalog_Title(), ecorePackage.getEString(), "title", null, 0, 1, ServiceProviderCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceProviderCatalog_Description(), ecorePackage.getEString(), "description", null, 0, 1, ServiceProviderCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceProviderCatalog_Publisher(), this.getPublisher(), null, "publisher", null, 0, 1, ServiceProviderCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceProviderCatalog_ServiceProviders(), this.getServiceProvider(), null, "serviceProviders", null, 0, -1, ServiceProviderCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceProviderEClass, ServiceProvider.class, "ServiceProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceProvider_Title(), ecorePackage.getEString(), "title", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceProvider_Description(), ecorePackage.getEString(), "description", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceProvider_Publisher(), this.getPublisher(), null, "publisher", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceProvider_Services(), this.getService(), null, "services", null, 1, -1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceProvider_ServiceNamespace(), ecorePackage.getEString(), "serviceNamespace", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceProvider_InstanceID(), ecorePackage.getEString(), "instanceID", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_DomainSpecification(), this.getDomainSpecification(), null, "domainSpecification", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_CreationFactories(), this.getCreationFactory(), null, "creationFactories", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_QueryCapabilities(), this.getQueryCapability(), null, "queryCapabilities", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_SelectionDialogs(), this.getDialog(), null, "selectionDialogs", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_CreationDialogs(), this.getDialog(), null, "creationDialogs", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_BasicCapabilities(), this.getBasicCapability(), null, "basicCapabilities", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_Extends(), this.getResource(), null, "extends", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_ResourceProperties(), this.getResourceProperty(), null, "resourceProperties", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourcePropertyEClass, ResourceProperty.class, "ResourceProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceProperty_Title(), ecorePackage.getEString(), "title", null, 0, 1, ResourceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, ResourceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceProperty_Occurs(), this.getResourcePropertyOccurs(), "occurs", "exactlyOne", 0, 1, ResourceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceProperty_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", null, 0, 1, ResourceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceProperty_ValueType(), this.getResourcePropertyValueType(), "valueType", null, 0, 1, ResourceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceProperty_Representation(), this.getResourcePropertyRepresentation(), "representation", "na", 0, 1, ResourceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceProperty_Range(), this.getResource(), null, "range", null, 0, 1, ResourceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceProperty_Description(), ecorePackage.getEString(), "description", null, 0, 1, ResourceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(creationFactoryEClass, CreationFactory.class, "CreationFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreationFactory_Title(), ecorePackage.getEString(), "title", null, 1, 1, CreationFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreationFactory_Label(), ecorePackage.getEString(), "label", null, 0, 1, CreationFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreationFactory_CreationURI(), ecorePackage.getEString(), "creationURI", null, 1, 1, CreationFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreationFactory_ResourceTypes(), this.getResource(), null, "resourceTypes", null, 0, -1, CreationFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryCapabilityEClass, QueryCapability.class, "QueryCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryCapability_Title(), ecorePackage.getEString(), "title", null, 1, 1, QueryCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryCapability_Label(), ecorePackage.getEString(), "label", null, 0, 1, QueryCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryCapability_QueryBaseURI(), ecorePackage.getEString(), "queryBaseURI", null, 1, 1, QueryCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryCapability_ResourceTypes(), this.getResource(), null, "resourceTypes", null, 0, -1, QueryCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicCapabilityEClass, BasicCapability.class, "BasicCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicCapability_ResourceTypes(), this.getResource(), null, "resourceTypes", null, 0, -1, BasicCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicCapability_InstanceID(), ecorePackage.getEString(), "instanceID", null, 0, 1, BasicCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicCapability_ServiceNamespace(), this.getResourceServiceNamespace(), "serviceNamespace", "relativeToServiceProvider", 1, 1, BasicCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dialogEClass, Dialog.class, "Dialog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDialog_Title(), ecorePackage.getEString(), "title", null, 1, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialog_Label(), ecorePackage.getEString(), "label", null, 0, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialog_DialogURI(), ecorePackage.getEString(), "dialogURI", null, 1, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialog_HintWidth(), ecorePackage.getEShort(), "hintWidth", null, 0, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialog_HintHeight(), ecorePackage.getEShort(), "hintHeight", null, 0, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDialog_ResourceTypes(), this.getResource(), null, "resourceTypes", null, 0, -1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publisherEClass, Publisher.class, "Publisher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublisher_Title(), ecorePackage.getEString(), "title", null, 1, 1, Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublisher_Label(), ecorePackage.getEString(), "label", null, 0, 1, Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublisher_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublisher_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(resourcePropertyOccursEEnum, ResourcePropertyOccurs.class, "ResourcePropertyOccurs");
		addEEnumLiteral(resourcePropertyOccursEEnum, ResourcePropertyOccurs.EXACTLY_ONE);
		addEEnumLiteral(resourcePropertyOccursEEnum, ResourcePropertyOccurs.ZERO_OR_ONE);
		addEEnumLiteral(resourcePropertyOccursEEnum, ResourcePropertyOccurs.ZERO_OR_MANY);
		addEEnumLiteral(resourcePropertyOccursEEnum, ResourcePropertyOccurs.ONE_OR_MANY);

		initEEnum(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.class, "ResourcePropertyValueType");
		addEEnumLiteral(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.BOOLEAN);
		addEEnumLiteral(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.STRING);
		addEEnumLiteral(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.DATE_TIME);
		addEEnumLiteral(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.XML_LITERAL);
		addEEnumLiteral(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.RESOURCE);
		addEEnumLiteral(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.LOCAL_RESOURCE);
		addEEnumLiteral(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.URI);
		addEEnumLiteral(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.DOUBLE);
		addEEnumLiteral(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.FLOAT);
		addEEnumLiteral(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.INTEGER);

		initEEnum(resourcePropertyRepresentationEEnum, ResourcePropertyRepresentation.class, "ResourcePropertyRepresentation");
		addEEnumLiteral(resourcePropertyRepresentationEEnum, ResourcePropertyRepresentation.REFERENCE);
		addEEnumLiteral(resourcePropertyRepresentationEEnum, ResourcePropertyRepresentation.INLINE);
		addEEnumLiteral(resourcePropertyRepresentationEEnum, ResourcePropertyRepresentation.EITHER);
		addEEnumLiteral(resourcePropertyRepresentationEEnum, ResourcePropertyRepresentation.NA);

		initEEnum(resourceServiceNamespaceEEnum, ResourceServiceNamespace.class, "ResourceServiceNamespace");
		addEEnumLiteral(resourceServiceNamespaceEEnum, ResourceServiceNamespace.RELATIVE_TO_SERVICE_PROVIDER);
		addEEnumLiteral(resourceServiceNamespaceEEnum, ResourceServiceNamespace.INDEPENDANT_OF_SERVICE_PROVIDER);

		// Create resource
		createResource(eNS_URI);
	}

} //AdaptorInterfacePackageImpl
