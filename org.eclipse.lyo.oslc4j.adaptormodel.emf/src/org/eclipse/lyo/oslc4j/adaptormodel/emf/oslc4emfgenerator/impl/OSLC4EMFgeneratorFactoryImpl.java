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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OSLC4EMFgeneratorFactoryImpl extends EFactoryImpl implements OSLC4EMFgeneratorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OSLC4EMFgeneratorFactory init() {
		try {
			OSLC4EMFgeneratorFactory theOSLC4EMFgeneratorFactory = (OSLC4EMFgeneratorFactory)EPackage.Registry.INSTANCE.getEFactory(OSLC4EMFgeneratorPackage.eNS_URI);
			if (theOSLC4EMFgeneratorFactory != null) {
				return theOSLC4EMFgeneratorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OSLC4EMFgeneratorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSLC4EMFgeneratorFactoryImpl() {
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
			case OSLC4EMFgeneratorPackage.ESTRUCTURAL_FEATURE_MAPPING: return (EObject)createEStructuralFeatureMapping();
			case OSLC4EMFgeneratorPackage.ECLASS_MAPPING: return (EObject)createEClassMapping();
			case OSLC4EMFgeneratorPackage.OSLC4EMF_CORE_GENERATOR: return (EObject)createOSLC4EMFCoreGenerator();
			case OSLC4EMFgeneratorPackage.OSLC4EMF_EXPOSER_GENERATOR: return (EObject)createOSLC4EMFExposerGenerator();
			case OSLC4EMFgeneratorPackage.PACKAGES_EXPORT_CONTAINER: return (EObject)createPackagesExportContainer();
			case OSLC4EMFgeneratorPackage.PACKAGE_EXPORT: return (EObject)createPackageExport();
			case OSLC4EMFgeneratorPackage.REQUIRED_PLUGINS_CONTAINER: return (EObject)createRequiredPluginsContainer();
			case OSLC4EMFgeneratorPackage.REQUIRED_PLUGIN: return (EObject)createRequiredPlugin();
			case OSLC4EMFgeneratorPackage.REQUIRED_PLUGIN_FEATURE: return (EObject)createRequiredPluginFeature();
			case OSLC4EMFgeneratorPackage.PACKAGE_EXPORT_FEATURE: return (EObject)createPackageExportFeature();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeatureMapping createEStructuralFeatureMapping() {
		EStructuralFeatureMappingImpl eStructuralFeatureMapping = new EStructuralFeatureMappingImpl();
		return eStructuralFeatureMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassMapping createEClassMapping() {
		EClassMappingImpl eClassMapping = new EClassMappingImpl();
		return eClassMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSLC4EMFCoreGenerator createOSLC4EMFCoreGenerator() {
		OSLC4EMFCoreGeneratorImpl oslc4EMFCoreGenerator = new OSLC4EMFCoreGeneratorImpl();
		return oslc4EMFCoreGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSLC4EMFExposerGenerator createOSLC4EMFExposerGenerator() {
		OSLC4EMFExposerGeneratorImpl oslc4EMFExposerGenerator = new OSLC4EMFExposerGeneratorImpl();
		return oslc4EMFExposerGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagesExportContainer createPackagesExportContainer() {
		PackagesExportContainerImpl packagesExportContainer = new PackagesExportContainerImpl();
		return packagesExportContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageExport createPackageExport() {
		PackageExportImpl packageExport = new PackageExportImpl();
		return packageExport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredPluginsContainer createRequiredPluginsContainer() {
		RequiredPluginsContainerImpl requiredPluginsContainer = new RequiredPluginsContainerImpl();
		return requiredPluginsContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredPlugin createRequiredPlugin() {
		RequiredPluginImpl requiredPlugin = new RequiredPluginImpl();
		return requiredPlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredPluginFeature createRequiredPluginFeature() {
		RequiredPluginFeatureImpl requiredPluginFeature = new RequiredPluginFeatureImpl();
		return requiredPluginFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageExportFeature createPackageExportFeature() {
		PackageExportFeatureImpl packageExportFeature = new PackageExportFeatureImpl();
		return packageExportFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSLC4EMFgeneratorPackage getOSLC4EMFgeneratorPackage() {
		return (OSLC4EMFgeneratorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OSLC4EMFgeneratorPackage getPackage() {
		return OSLC4EMFgeneratorPackage.eINSTANCE;
	}

} //OSLC4EMFgeneratorFactoryImpl
