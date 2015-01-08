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
 * Jad El-khoury		- Adaptor Manager Generator
 * Matthieu Helleboid	- Extract generation information from Adaptor Interface and move them to tje Adaptor Manager Generator
 * Anass Radouani		- Extract generation information from Adaptor Interface and move them to tje Adaptor Manager Generator
 */
package org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator;

import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptor Manager Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getJavaClassBaseNamespace <em>Java Class Base Namespace</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getJavaFilesBasePath <em>Java Files Base Path</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getJspFilesBasePath <em>Jsp Files Base Path</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getJavascriptFilesBasePath <em>Javascript Files Base Path</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getApplicationName <em>Application Name</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getWebApplicationBasePath <em>Web Application Base Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGeneratorPackage#getAdaptorManagerGenerator()
 * @model
 * @generated
 */
public interface AdaptorManagerGenerator extends AdaptorInterfaceGenerator {
	/**
	 * Returns the value of the '<em><b>Java Class Base Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Class Base Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Class Base Namespace</em>' attribute.
	 * @see #setJavaClassBaseNamespace(String)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGeneratorPackage#getAdaptorManagerGenerator_JavaClassBaseNamespace()
	 * @model required="true"
	 * @generated
	 */
	String getJavaClassBaseNamespace();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getJavaClassBaseNamespace <em>Java Class Base Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Class Base Namespace</em>' attribute.
	 * @see #getJavaClassBaseNamespace()
	 * @generated
	 */
	void setJavaClassBaseNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Java Files Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Files Base Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Files Base Path</em>' attribute.
	 * @see #setJavaFilesBasePath(String)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGeneratorPackage#getAdaptorManagerGenerator_JavaFilesBasePath()
	 * @model required="true"
	 * @generated
	 */
	String getJavaFilesBasePath();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getJavaFilesBasePath <em>Java Files Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Files Base Path</em>' attribute.
	 * @see #getJavaFilesBasePath()
	 * @generated
	 */
	void setJavaFilesBasePath(String value);

	/**
	 * Returns the value of the '<em><b>Jsp Files Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsp Files Base Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsp Files Base Path</em>' attribute.
	 * @see #setJspFilesBasePath(String)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGeneratorPackage#getAdaptorManagerGenerator_JspFilesBasePath()
	 * @model required="true"
	 * @generated
	 */
	String getJspFilesBasePath();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getJspFilesBasePath <em>Jsp Files Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsp Files Base Path</em>' attribute.
	 * @see #getJspFilesBasePath()
	 * @generated
	 */
	void setJspFilesBasePath(String value);

	/**
	 * Returns the value of the '<em><b>Javascript Files Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Javascript Files Base Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Javascript Files Base Path</em>' attribute.
	 * @see #setJavascriptFilesBasePath(String)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGeneratorPackage#getAdaptorManagerGenerator_JavascriptFilesBasePath()
	 * @model required="true"
	 * @generated
	 */
	String getJavascriptFilesBasePath();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getJavascriptFilesBasePath <em>Javascript Files Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Javascript Files Base Path</em>' attribute.
	 * @see #getJavascriptFilesBasePath()
	 * @generated
	 */
	void setJavascriptFilesBasePath(String value);

	/**
	 * Returns the value of the '<em><b>Application Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Name</em>' attribute.
	 * @see #setApplicationName(String)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGeneratorPackage#getAdaptorManagerGenerator_ApplicationName()
	 * @model required="true"
	 * @generated
	 */
	String getApplicationName();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getApplicationName <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Name</em>' attribute.
	 * @see #getApplicationName()
	 * @generated
	 */
	void setApplicationName(String value);

	/**
	 * Returns the value of the '<em><b>Web Application Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Application Base Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Application Base Path</em>' attribute.
	 * @see #setWebApplicationBasePath(String)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGeneratorPackage#getAdaptorManagerGenerator_WebApplicationBasePath()
	 * @model required="true"
	 * @generated
	 */
	String getWebApplicationBasePath();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator#getWebApplicationBasePath <em>Web Application Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Application Base Path</em>' attribute.
	 * @see #getWebApplicationBasePath()
	 * @generated
	 */
	void setWebApplicationBasePath(String value);

} // AdaptorManagerGenerator
