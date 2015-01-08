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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.ResourcePropertyMappingImpl;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EStructuralFeatureMapping;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EStructural Feature Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.EStructuralFeatureMappingImpl#getEStructuralFeature <em>EStructural Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EStructuralFeatureMappingImpl extends ResourcePropertyMappingImpl implements EStructuralFeatureMapping {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeatureMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSLC4EMFgeneratorPackage.Literals.ESTRUCTURAL_FEATURE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getEStructuralFeature() {
		return (EStructuralFeature)eGet(OSLC4EMFgeneratorPackage.Literals.ESTRUCTURAL_FEATURE_MAPPING__ESTRUCTURAL_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEStructuralFeature(EStructuralFeature newEStructuralFeature) {
		eSet(OSLC4EMFgeneratorPackage.Literals.ESTRUCTURAL_FEATURE_MAPPING__ESTRUCTURAL_FEATURE, newEStructuralFeature);
	}

} //EStructuralFeatureMappingImpl
