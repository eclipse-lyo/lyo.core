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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGeneratorPackage
 * @generated
 */
public interface AdaptorManagerGeneratorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdaptorManagerGeneratorFactory eINSTANCE = org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.impl.AdaptorManagerGeneratorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Adaptor Manager Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adaptor Manager Generator</em>'.
	 * @generated
	 */
	AdaptorManagerGenerator createAdaptorManagerGenerator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdaptorManagerGeneratorPackage getAdaptorManagerGeneratorPackage();

} //AdaptorManagerGeneratorFactory
