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
package org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorPackage
 * @generated
 */
public interface AdaptorInterfaceGeneratorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdaptorInterfaceGeneratorFactory eINSTANCE = org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.impl.AdaptorInterfaceGeneratorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	AdaptorInterfaceGeneratorContainer createAdaptorInterfaceGeneratorContainer();

	/**
	 * Returns a new object of class '<em>Maven Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maven Dependency</em>'.
	 * @generated
	 */
	MavenDependency createMavenDependency();

	/**
	 * Returns a new object of class '<em>Dependencies Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependencies Container</em>'.
	 * @generated
	 */
	DependenciesContainer createDependenciesContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdaptorInterfaceGeneratorPackage getAdaptorInterfaceGeneratorPackage();

} //AdaptorInterfaceGeneratorFactory
