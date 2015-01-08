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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage
 * @generated
 */
public interface OSLC4EMFgeneratorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OSLC4EMFgeneratorFactory eINSTANCE = org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.OSLC4EMFgeneratorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EStructural Feature Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EStructural Feature Mapping</em>'.
	 * @generated
	 */
	EStructuralFeatureMapping createEStructuralFeatureMapping();

	/**
	 * Returns a new object of class '<em>EClass Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EClass Mapping</em>'.
	 * @generated
	 */
	EClassMapping createEClassMapping();

	/**
	 * Returns a new object of class '<em>OSLC4EMF Core Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OSLC4EMF Core Generator</em>'.
	 * @generated
	 */
	OSLC4EMFCoreGenerator createOSLC4EMFCoreGenerator();

	/**
	 * Returns a new object of class '<em>OSLC4EMF Exposer Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OSLC4EMF Exposer Generator</em>'.
	 * @generated
	 */
	OSLC4EMFExposerGenerator createOSLC4EMFExposerGenerator();

	/**
	 * Returns a new object of class '<em>Packages Export Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Packages Export Container</em>'.
	 * @generated
	 */
	PackagesExportContainer createPackagesExportContainer();

	/**
	 * Returns a new object of class '<em>Package Export</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Export</em>'.
	 * @generated
	 */
	PackageExport createPackageExport();

	/**
	 * Returns a new object of class '<em>Required Plugins Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Plugins Container</em>'.
	 * @generated
	 */
	RequiredPluginsContainer createRequiredPluginsContainer();

	/**
	 * Returns a new object of class '<em>Required Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Plugin</em>'.
	 * @generated
	 */
	RequiredPlugin createRequiredPlugin();

	/**
	 * Returns a new object of class '<em>Required Plugin Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Plugin Feature</em>'.
	 * @generated
	 */
	RequiredPluginFeature createRequiredPluginFeature();

	/**
	 * Returns a new object of class '<em>Package Export Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Export Feature</em>'.
	 * @generated
	 */
	PackageExportFeature createPackageExportFeature();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OSLC4EMFgeneratorPackage getOSLC4EMFgeneratorPackage();

} //OSLC4EMFgeneratorFactory
