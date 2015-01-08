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
package org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGeneratorFactory;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGeneratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptorManagerGeneratorFactoryImpl extends EFactoryImpl implements AdaptorManagerGeneratorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdaptorManagerGeneratorFactory init() {
		try {
			AdaptorManagerGeneratorFactory theAdaptorManagerGeneratorFactory = (AdaptorManagerGeneratorFactory)EPackage.Registry.INSTANCE.getEFactory(AdaptorManagerGeneratorPackage.eNS_URI);
			if (theAdaptorManagerGeneratorFactory != null) {
				return theAdaptorManagerGeneratorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdaptorManagerGeneratorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptorManagerGeneratorFactoryImpl() {
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
			case AdaptorManagerGeneratorPackage.ADAPTOR_MANAGER_GENERATOR: return (EObject)createAdaptorManagerGenerator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptorManagerGenerator createAdaptorManagerGenerator() {
		AdaptorManagerGeneratorImpl adaptorManagerGenerator = new AdaptorManagerGeneratorImpl();
		return adaptorManagerGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptorManagerGeneratorPackage getAdaptorManagerGeneratorPackage() {
		return (AdaptorManagerGeneratorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdaptorManagerGeneratorPackage getPackage() {
		return AdaptorManagerGeneratorPackage.eINSTANCE;
	}

} //AdaptorManagerGeneratorFactoryImpl
