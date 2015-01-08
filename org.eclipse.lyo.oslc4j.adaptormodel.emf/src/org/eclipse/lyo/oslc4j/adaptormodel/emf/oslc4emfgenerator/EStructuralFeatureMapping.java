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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourcePropertyMapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EStructural Feature Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EStructuralFeatureMapping#getEStructuralFeature <em>EStructural Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage#getEStructuralFeatureMapping()
 * @model
 * @generated
 */
public interface EStructuralFeatureMapping extends ResourcePropertyMapping {
	/**
	 * Returns the value of the '<em><b>EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EStructural Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EStructural Feature</em>' reference.
	 * @see #setEStructuralFeature(EStructuralFeature)
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage#getEStructuralFeatureMapping_EStructuralFeature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getEStructuralFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EStructuralFeatureMapping#getEStructuralFeature <em>EStructural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EStructural Feature</em>' reference.
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	void setEStructuralFeature(EStructuralFeature value);

} // EStructuralFeatureMapping
