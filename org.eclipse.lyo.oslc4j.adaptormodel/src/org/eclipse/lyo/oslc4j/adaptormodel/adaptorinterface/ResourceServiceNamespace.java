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
 * Jad El-khoury		- initial adaptor model
 * Matthieu Helleboid	- Move default generation information to Adaptor Manager Generator 
 * 						- Add Adaptor Interface GenModel and generate the model code, the model edit and the editor using ai as file extension
 * Anass Radouani		- Move default generation information to Adaptor Manager Generator 
 * 						- Add Adaptor Interface GenModel and generate the model code, the model edit and the editor using ai as file extension
 */
package org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resource Service Namespace</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterfacePackage#getResourceServiceNamespace()
 * @model
 * @generated
 */
public enum ResourceServiceNamespace implements Enumerator {
	/**
	 * The '<em><b>Relative To Service Provider</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIVE_TO_SERVICE_PROVIDER_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIVE_TO_SERVICE_PROVIDER(0, "relativeToServiceProvider", "relativeToServiceProvider"),

	/**
	 * The '<em><b>Independant Of Service Provider</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDEPENDANT_OF_SERVICE_PROVIDER_VALUE
	 * @generated
	 * @ordered
	 */
	INDEPENDANT_OF_SERVICE_PROVIDER(1, "independantOfServiceProvider", "independantOfServiceProvider");

	/**
	 * The '<em><b>Relative To Service Provider</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Relative To Service Provider</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELATIVE_TO_SERVICE_PROVIDER
	 * @model name="relativeToServiceProvider"
	 * @generated
	 * @ordered
	 */
	public static final int RELATIVE_TO_SERVICE_PROVIDER_VALUE = 0;

	/**
	 * The '<em><b>Independant Of Service Provider</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Independant Of Service Provider</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDEPENDANT_OF_SERVICE_PROVIDER
	 * @model name="independantOfServiceProvider"
	 * @generated
	 * @ordered
	 */
	public static final int INDEPENDANT_OF_SERVICE_PROVIDER_VALUE = 1;

	/**
	 * An array of all the '<em><b>Resource Service Namespace</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResourceServiceNamespace[] VALUES_ARRAY =
		new ResourceServiceNamespace[] {
			RELATIVE_TO_SERVICE_PROVIDER,
			INDEPENDANT_OF_SERVICE_PROVIDER,
		};

	/**
	 * A public read-only list of all the '<em><b>Resource Service Namespace</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResourceServiceNamespace> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resource Service Namespace</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceServiceNamespace get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceServiceNamespace result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Service Namespace</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceServiceNamespace getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceServiceNamespace result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Service Namespace</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceServiceNamespace get(int value) {
		switch (value) {
			case RELATIVE_TO_SERVICE_PROVIDER_VALUE: return RELATIVE_TO_SERVICE_PROVIDER;
			case INDEPENDANT_OF_SERVICE_PROVIDER_VALUE: return INDEPENDANT_OF_SERVICE_PROVIDER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ResourceServiceNamespace(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ResourceServiceNamespace
