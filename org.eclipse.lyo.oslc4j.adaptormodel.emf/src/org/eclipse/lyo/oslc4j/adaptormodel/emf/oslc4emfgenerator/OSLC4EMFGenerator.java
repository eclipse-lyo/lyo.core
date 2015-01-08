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

import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OSLC4EMF Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator#getJavaVersion <em>Java Version</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator#getPackagesExportContainer <em>Packages Export Container</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator#getRequiredPluginsContainer <em>Required Plugins Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage#getOSLC4EMFGenerator()
 * @model abstract="true"
 * @generated
 */
public interface OSLC4EMFGenerator extends AdaptorInterfaceGenerator {
	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(OSLC4EMFGenerator)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage#getOSLC4EMFGenerator_Extends()
	 * @model
	 * @generated
	 */
	OSLC4EMFGenerator getExtends();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(OSLC4EMFGenerator value);

	/**
	 * Returns the value of the '<em><b>Java Version</b></em>' attribute.
	 * The default value is <code>"1.7"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Version</em>' attribute.
	 * @see #setJavaVersion(String)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage#getOSLC4EMFGenerator_JavaVersion()
	 * @model default="1.7"
	 * @generated
	 */
	String getJavaVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator#getJavaVersion <em>Java Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Version</em>' attribute.
	 * @see #getJavaVersion()
	 * @generated
	 */
	void setJavaVersion(String value);

	/**
	 * Returns the value of the '<em><b>Packages Export Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages Export Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages Export Container</em>' containment reference.
	 * @see #setPackagesExportContainer(PackagesExportContainer)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage#getOSLC4EMFGenerator_PackagesExportContainer()
	 * @model containment="true"
	 * @generated
	 */
	PackagesExportContainer getPackagesExportContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator#getPackagesExportContainer <em>Packages Export Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packages Export Container</em>' containment reference.
	 * @see #getPackagesExportContainer()
	 * @generated
	 */
	void setPackagesExportContainer(PackagesExportContainer value);

	/**
	 * Returns the value of the '<em><b>Required Plugins Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Plugins Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Plugins Container</em>' containment reference.
	 * @see #setRequiredPluginsContainer(RequiredPluginsContainer)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage#getOSLC4EMFGenerator_RequiredPluginsContainer()
	 * @model containment="true"
	 * @generated
	 */
	RequiredPluginsContainer getRequiredPluginsContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator#getRequiredPluginsContainer <em>Required Plugins Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Plugins Container</em>' containment reference.
	 * @see #getRequiredPluginsContainer()
	 * @generated
	 */
	void setRequiredPluginsContainer(RequiredPluginsContainer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getJavaFilesBasePath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getPrefix(String key);

} // OSLC4EMFGenerator
