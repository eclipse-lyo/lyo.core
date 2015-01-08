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
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.DependenciesContainer;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.constants.CoreServicesConstants;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.constants.ExposerServicesConstants;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackagesExportContainer;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPluginsContainer;
import org.eclipse.lyo.oslc4j.codegenerator.services.ServicesConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OSLC4EMF Exposer Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFExposerGeneratorImpl#getCommonPluginId <em>Common Plugin Id</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFExposerGeneratorImpl#getExposerPluginId <em>Exposer Plugin Id</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFExposerGeneratorImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFExposerGeneratorImpl#getCorePluginId <em>Core Plugin Id</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFExposerGeneratorImpl#getCoreBasePackage <em>Core Base Package</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFExposerGeneratorImpl#getExposerDependenciesContainer <em>Exposer Dependencies Container</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFExposerGeneratorImpl#getExposerRequiredPluginsContainer <em>Exposer Required Plugins Container</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFExposerGeneratorImpl#getExposerPackagesExportContainer <em>Exposer Packages Export Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OSLC4EMFExposerGeneratorImpl extends OSLC4EMFGeneratorImpl implements OSLC4EMFExposerGenerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSLC4EMFExposerGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_EXPOSER_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommonPluginId() {
		return (String)eGet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_EXPOSER_GENERATOR__COMMON_PLUGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommonPluginId(String newCommonPluginId) {
		eSet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_EXPOSER_GENERATOR__COMMON_PLUGIN_ID, newCommonPluginId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExposerPluginId() {
		return (String)eGet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_EXPOSER_GENERATOR__EXPOSER_PLUGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposerPluginId(String newExposerPluginId) {
		eSet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_EXPOSER_GENERATOR__EXPOSER_PLUGIN_ID, newExposerPluginId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePackage() {
		return (String)eGet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_EXPOSER_GENERATOR__BASE_PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePackage(String newBasePackage) {
		eSet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_EXPOSER_GENERATOR__BASE_PACKAGE, newBasePackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorePluginId() {
		return (String)eGet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_EXPOSER_GENERATOR__CORE_PLUGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorePluginId(String newCorePluginId) {
		eSet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_EXPOSER_GENERATOR__CORE_PLUGIN_ID, newCorePluginId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoreBasePackage() {
		return (String)eGet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_EXPOSER_GENERATOR__CORE_BASE_PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreBasePackage(String newCoreBasePackage) {
		eSet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_EXPOSER_GENERATOR__CORE_BASE_PACKAGE, newCoreBasePackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependenciesContainer getExposerDependenciesContainer() {
		return (DependenciesContainer)eGet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_EXPOSER_GENERATOR__EXPOSER_DEPENDENCIES_CONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposerDependenciesContainer(DependenciesContainer newExposerDependenciesContainer) {
		eSet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_EXPOSER_GENERATOR__EXPOSER_DEPENDENCIES_CONTAINER, newExposerDependenciesContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredPluginsContainer getExposerRequiredPluginsContainer() {
		return (RequiredPluginsContainer)eGet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_EXPOSER_GENERATOR__EXPOSER_REQUIRED_PLUGINS_CONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposerRequiredPluginsContainer(RequiredPluginsContainer newExposerRequiredPluginsContainer) {
		eSet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_EXPOSER_GENERATOR__EXPOSER_REQUIRED_PLUGINS_CONTAINER, newExposerRequiredPluginsContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagesExportContainer getExposerPackagesExportContainer() {
		return (PackagesExportContainer)eGet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_EXPOSER_GENERATOR__EXPOSER_PACKAGES_EXPORT_CONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposerPackagesExportContainer(PackagesExportContainer newExposerPackagesExportContainer) {
		eSet(OSLC4EMFgeneratorPackage.Literals.OSLC4EMF_EXPOSER_GENERATOR__EXPOSER_PACKAGES_EXPORT_CONTAINER, newExposerPackagesExportContainer);
	}

	@Override
	public String getPrefix(String key) {
		String result = "";
		switch (key) {
		case ServicesConstants.PREFIX_ADAPTOR_APPLICATION:
			result = getCorePluginId() + "." + getCoreBasePackage();
			break;
		case ServicesConstants.PREFIX_ADAPTOR_CONSTANT:
			result = getCommonPluginId() + "." + getBasePackage();
			break;
		case ServicesConstants.PREFIX_ADAPTOR_PACKAGE_INFO:
			result = getCommonPluginId() + "." + getBasePackage();
			break;
		case ServicesConstants.PREFIX_ADAPTOR_SERVLET_LISTENER:
			result = getCorePluginId() + "." + getCoreBasePackage();
			break;
		case ServicesConstants.PREFIX_DELEGATE_UI_JS:
			result = "/WebContent/";
			break;
		case ServicesConstants.PREFIX_RESOURCE:
			result = getCommonPluginId() + "." + getBasePackage();
			break;
		case ServicesConstants.PREFIX_SERVICE_PROVIDER_CATALOG_JSP:
			result = "/WebContent/" + getCorePluginId().replaceAll("\\.", "/") + "/" + getCoreBasePackage();
			break;
		case ServicesConstants.PREFIX_SERVICE_PROVIDER_CATALOG_SERVICE:
			result = getCorePluginId() + "." + getCoreBasePackage();
			break;
		case ServicesConstants.PREFIX_SERVICE_PROVIDER_CATALOG_SINGLETON:
			result = getCorePluginId() + "." + getCoreBasePackage();
			break;
		case ServicesConstants.PREFIX_FILTERED_RESOURCE_COLLECTION_JSP:
			result = "/WebContent/" + getExposerPluginId().replaceAll("\\.", "/") + "/" + getBasePackage();
			break;
		case ServicesConstants.PREFIX_RESOURCE_COLLECTION_JSP:
			result = "/WebContent/" + getExposerPluginId().replaceAll("\\.", "/") + "/" + getBasePackage();
			break;
		case ServicesConstants.PREFIX_RESOURCE_CREATOR_JSP:
			result = "/WebContent/" + getExposerPluginId().replaceAll("\\.", "/") + "/" + getBasePackage();
			break;
		case ServicesConstants.PREFIX_RESOURCE_JSP:
			result = "/WebContent/" + getExposerPluginId().replaceAll("\\.", "/") + "/" + getBasePackage();
			break;
		case ServicesConstants.PREFIX_RESOURCE_SELECTOR_JPS:
			result = "/WebContent/" + getExposerPluginId().replaceAll("\\.", "/") + "/" + getBasePackage();
			break;
		case ServicesConstants.PREFIX_SERVICE_PROVIDER_JSP:
			result = "/WebContent/" + getExposerPluginId().replaceAll("\\.", "/") + "/" + getBasePackage();
			break;
		case CoreServicesConstants.PREFIX_CORE_ACTIVATOR:
			result = getCorePluginId() + "." + getCoreBasePackage();
			break;
		case CoreServicesConstants.PREFIX_EXPOSER_EXTENSION_INTERFACE:
			result = getCorePluginId() + "." + getCoreBasePackage();
			break;
		case CoreServicesConstants.PREFIX_EXPOSER_EXTENSION_READER:
			result = getCorePluginId() + "." + getCoreBasePackage();
			break;
		case ExposerServicesConstants.PREFIX_COMMON_ACTIVATOR:
			result = getCommonPluginId();
			break;
		case ExposerServicesConstants.PREFIX_RESOURCE_UTIL:
			result = getCommonPluginId();
			break;
		case ExposerServicesConstants.PREFIX_RESOURCE_MANAGER:
			result = getCommonPluginId() + "." + getBasePackage();
			break;
		case ExposerServicesConstants.PREFIX_EXPOSER_ACTIVATOR:
			result = getExposerPluginId();
			break;
		default:
			result = getExposerPluginId() + "." + getBasePackage();
			break;
		}
		return result;
	}
	
} //OSLC4EMFExposerGeneratorImpl
