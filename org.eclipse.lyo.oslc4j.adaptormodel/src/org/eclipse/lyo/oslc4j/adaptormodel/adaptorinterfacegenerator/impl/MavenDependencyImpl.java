/**
 * Copyright (c) 2014 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 
 * Helleboid Matthieu 	- initial API and implementation
 * Anass Radouani 	 	- initial API and implementation
 */
package org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorPackage;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.MavenDependency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maven Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.MavenDependencyImpl#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.MavenDependencyImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.MavenDependencyImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.MavenDependencyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.MavenDependencyImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.MavenDependencyImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.MavenDependencyImpl#getSystemPath <em>System Path</em>}</li>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.MavenDependencyImpl#getOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MavenDependencyImpl extends DependencyImpl implements MavenDependency {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MavenDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorInterfaceGeneratorPackage.Literals.MAVEN_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArtifactId() {
		return (String)eGet(AdaptorInterfaceGeneratorPackage.Literals.MAVEN_DEPENDENCY__ARTIFACT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactId(String newArtifactId) {
		eSet(AdaptorInterfaceGeneratorPackage.Literals.MAVEN_DEPENDENCY__ARTIFACT_ID, newArtifactId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupId() {
		return (String)eGet(AdaptorInterfaceGeneratorPackage.Literals.MAVEN_DEPENDENCY__GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupId(String newGroupId) {
		eSet(AdaptorInterfaceGeneratorPackage.Literals.MAVEN_DEPENDENCY__GROUP_ID, newGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String)eGet(AdaptorInterfaceGeneratorPackage.Literals.MAVEN_DEPENDENCY__VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eSet(AdaptorInterfaceGeneratorPackage.Literals.MAVEN_DEPENDENCY__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eGet(AdaptorInterfaceGeneratorPackage.Literals.MAVEN_DEPENDENCY__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eSet(AdaptorInterfaceGeneratorPackage.Literals.MAVEN_DEPENDENCY__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassifier() {
		return (String)eGet(AdaptorInterfaceGeneratorPackage.Literals.MAVEN_DEPENDENCY__CLASSIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier(String newClassifier) {
		eSet(AdaptorInterfaceGeneratorPackage.Literals.MAVEN_DEPENDENCY__CLASSIFIER, newClassifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScope() {
		return (String)eGet(AdaptorInterfaceGeneratorPackage.Literals.MAVEN_DEPENDENCY__SCOPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(String newScope) {
		eSet(AdaptorInterfaceGeneratorPackage.Literals.MAVEN_DEPENDENCY__SCOPE, newScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemPath() {
		return (String)eGet(AdaptorInterfaceGeneratorPackage.Literals.MAVEN_DEPENDENCY__SYSTEM_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemPath(String newSystemPath) {
		eSet(AdaptorInterfaceGeneratorPackage.Literals.MAVEN_DEPENDENCY__SYSTEM_PATH, newSystemPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOptional() {
		return (String)eGet(AdaptorInterfaceGeneratorPackage.Literals.MAVEN_DEPENDENCY__OPTIONAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(String newOptional) {
		eSet(AdaptorInterfaceGeneratorPackage.Literals.MAVEN_DEPENDENCY__OPTIONAL, newOptional);
	}

} //MavenDependencyImpl
