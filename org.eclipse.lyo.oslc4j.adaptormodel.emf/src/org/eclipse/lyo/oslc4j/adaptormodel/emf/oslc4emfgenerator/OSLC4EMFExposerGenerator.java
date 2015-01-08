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

import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.DependenciesContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OSLC4EMF Exposer Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getCommonPluginId <em>Common Plugin Id</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getExposerPluginId <em>Exposer Plugin Id</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getCorePluginId <em>Core Plugin Id</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getCoreBasePackage <em>Core Base Package</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getExposerDependenciesContainer <em>Exposer Dependencies Container</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getExposerRequiredPluginsContainer <em>Exposer Required Plugins Container</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getExposerPackagesExportContainer <em>Exposer Packages Export Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage#getOSLC4EMFExposerGenerator()
 * @model
 * @generated
 */
public interface OSLC4EMFExposerGenerator extends OSLC4EMFGenerator {
	/**
	 * Returns the value of the '<em><b>Common Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Common Plugin Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Plugin Id</em>' attribute.
	 * @see #setCommonPluginId(String)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage#getOSLC4EMFExposerGenerator_CommonPluginId()
	 * @model required="true"
	 * @generated
	 */
	String getCommonPluginId();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getCommonPluginId <em>Common Plugin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Common Plugin Id</em>' attribute.
	 * @see #getCommonPluginId()
	 * @generated
	 */
	void setCommonPluginId(String value);

	/**
	 * Returns the value of the '<em><b>Exposer Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposer Plugin Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposer Plugin Id</em>' attribute.
	 * @see #setExposerPluginId(String)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage#getOSLC4EMFExposerGenerator_ExposerPluginId()
	 * @model required="true"
	 * @generated
	 */
	String getExposerPluginId();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getExposerPluginId <em>Exposer Plugin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposer Plugin Id</em>' attribute.
	 * @see #getExposerPluginId()
	 * @generated
	 */
	void setExposerPluginId(String value);

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage#getOSLC4EMFExposerGenerator_BasePackage()
	 * @model required="true"
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Core Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Plugin Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Plugin Id</em>' attribute.
	 * @see #setCorePluginId(String)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage#getOSLC4EMFExposerGenerator_CorePluginId()
	 * @model required="true"
	 * @generated
	 */
	String getCorePluginId();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getCorePluginId <em>Core Plugin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Plugin Id</em>' attribute.
	 * @see #getCorePluginId()
	 * @generated
	 */
	void setCorePluginId(String value);

	/**
	 * Returns the value of the '<em><b>Core Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Base Package</em>' attribute.
	 * @see #setCoreBasePackage(String)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage#getOSLC4EMFExposerGenerator_CoreBasePackage()
	 * @model required="true"
	 * @generated
	 */
	String getCoreBasePackage();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getCoreBasePackage <em>Core Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Base Package</em>' attribute.
	 * @see #getCoreBasePackage()
	 * @generated
	 */
	void setCoreBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Exposer Dependencies Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposer Dependencies Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposer Dependencies Container</em>' containment reference.
	 * @see #setExposerDependenciesContainer(DependenciesContainer)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage#getOSLC4EMFExposerGenerator_ExposerDependenciesContainer()
	 * @model containment="true"
	 * @generated
	 */
	DependenciesContainer getExposerDependenciesContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getExposerDependenciesContainer <em>Exposer Dependencies Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposer Dependencies Container</em>' containment reference.
	 * @see #getExposerDependenciesContainer()
	 * @generated
	 */
	void setExposerDependenciesContainer(DependenciesContainer value);

	/**
	 * Returns the value of the '<em><b>Exposer Required Plugins Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposer Required Plugins Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposer Required Plugins Container</em>' containment reference.
	 * @see #setExposerRequiredPluginsContainer(RequiredPluginsContainer)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage#getOSLC4EMFExposerGenerator_ExposerRequiredPluginsContainer()
	 * @model containment="true"
	 * @generated
	 */
	RequiredPluginsContainer getExposerRequiredPluginsContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getExposerRequiredPluginsContainer <em>Exposer Required Plugins Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposer Required Plugins Container</em>' containment reference.
	 * @see #getExposerRequiredPluginsContainer()
	 * @generated
	 */
	void setExposerRequiredPluginsContainer(RequiredPluginsContainer value);

	/**
	 * Returns the value of the '<em><b>Exposer Packages Export Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposer Packages Export Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposer Packages Export Container</em>' containment reference.
	 * @see #setExposerPackagesExportContainer(PackagesExportContainer)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage#getOSLC4EMFExposerGenerator_ExposerPackagesExportContainer()
	 * @model containment="true"
	 * @generated
	 */
	PackagesExportContainer getExposerPackagesExportContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator#getExposerPackagesExportContainer <em>Exposer Packages Export Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposer Packages Export Container</em>' containment reference.
	 * @see #getExposerPackagesExportContainer()
	 * @generated
	 */
	void setExposerPackagesExportContainer(PackagesExportContainer value);

} // OSLC4EMFExposerGenerator
