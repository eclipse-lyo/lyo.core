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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptorInterfaceGeneratorFactoryImpl extends EFactoryImpl implements AdaptorInterfaceGeneratorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdaptorInterfaceGeneratorFactory init() {
		try {
			AdaptorInterfaceGeneratorFactory theAdaptorInterfaceGeneratorFactory = (AdaptorInterfaceGeneratorFactory)EPackage.Registry.INSTANCE.getEFactory(AdaptorInterfaceGeneratorPackage.eNS_URI);
			if (theAdaptorInterfaceGeneratorFactory != null) {
				return theAdaptorInterfaceGeneratorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdaptorInterfaceGeneratorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptorInterfaceGeneratorFactoryImpl() {
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
			case AdaptorInterfaceGeneratorPackage.ADAPTOR_INTERFACE_GENERATOR_CONTAINER: return (EObject)createAdaptorInterfaceGeneratorContainer();
			case AdaptorInterfaceGeneratorPackage.MAVEN_DEPENDENCY: return (EObject)createMavenDependency();
			case AdaptorInterfaceGeneratorPackage.DEPENDENCIES_CONTAINER: return (EObject)createDependenciesContainer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptorInterfaceGeneratorContainer createAdaptorInterfaceGeneratorContainer() {
		AdaptorInterfaceGeneratorContainerImpl adaptorInterfaceGeneratorContainer = new AdaptorInterfaceGeneratorContainerImpl();
		return adaptorInterfaceGeneratorContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MavenDependency createMavenDependency() {
		MavenDependencyImpl mavenDependency = new MavenDependencyImpl();
		return mavenDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependenciesContainer createDependenciesContainer() {
		DependenciesContainerImpl dependenciesContainer = new DependenciesContainerImpl();
		return dependenciesContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptorInterfaceGeneratorPackage getAdaptorInterfaceGeneratorPackage() {
		return (AdaptorInterfaceGeneratorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdaptorInterfaceGeneratorPackage getPackage() {
		return AdaptorInterfaceGeneratorPackage.eINSTANCE;
	}

} //AdaptorInterfaceGeneratorFactoryImpl
