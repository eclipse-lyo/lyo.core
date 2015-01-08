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
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.ResourceMappingImpl;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EClassMapping;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EClass Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.impl.EClassMappingImpl#getEClass <em>EClass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EClassMappingImpl extends ResourceMappingImpl implements EClassMapping {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClassMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSLC4EMFgeneratorPackage.Literals.ECLASS_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		return (EClass)eGet(OSLC4EMFgeneratorPackage.Literals.ECLASS_MAPPING__ECLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClass(EClass newEClass) {
		eSet(OSLC4EMFgeneratorPackage.Literals.ECLASS_MAPPING__ECLASS, newEClass);
	}

} //EClassMappingImpl
