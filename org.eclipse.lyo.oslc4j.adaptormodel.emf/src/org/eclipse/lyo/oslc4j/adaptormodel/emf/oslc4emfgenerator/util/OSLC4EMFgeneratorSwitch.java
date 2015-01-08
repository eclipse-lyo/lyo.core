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
package org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourceMapping;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourcePropertyMapping;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage
 * @generated
 */
public class OSLC4EMFgeneratorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OSLC4EMFgeneratorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSLC4EMFgeneratorSwitch() {
		if (modelPackage == null) {
			modelPackage = OSLC4EMFgeneratorPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OSLC4EMFgeneratorPackage.OSLC4EMF_GENERATOR: {
				OSLC4EMFGenerator oslc4EMFGenerator = (OSLC4EMFGenerator)theEObject;
				T result = caseOSLC4EMFGenerator(oslc4EMFGenerator);
				if (result == null) result = caseAdaptorInterfaceGenerator(oslc4EMFGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSLC4EMFgeneratorPackage.ESTRUCTURAL_FEATURE_MAPPING: {
				EStructuralFeatureMapping eStructuralFeatureMapping = (EStructuralFeatureMapping)theEObject;
				T result = caseEStructuralFeatureMapping(eStructuralFeatureMapping);
				if (result == null) result = caseResourcePropertyMapping(eStructuralFeatureMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSLC4EMFgeneratorPackage.ECLASS_MAPPING: {
				EClassMapping eClassMapping = (EClassMapping)theEObject;
				T result = caseEClassMapping(eClassMapping);
				if (result == null) result = caseResourceMapping(eClassMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSLC4EMFgeneratorPackage.OSLC4EMF_CORE_GENERATOR: {
				OSLC4EMFCoreGenerator oslc4EMFCoreGenerator = (OSLC4EMFCoreGenerator)theEObject;
				T result = caseOSLC4EMFCoreGenerator(oslc4EMFCoreGenerator);
				if (result == null) result = caseOSLC4EMFGenerator(oslc4EMFCoreGenerator);
				if (result == null) result = caseAdaptorInterfaceGenerator(oslc4EMFCoreGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSLC4EMFgeneratorPackage.OSLC4EMF_EXPOSER_GENERATOR: {
				OSLC4EMFExposerGenerator oslc4EMFExposerGenerator = (OSLC4EMFExposerGenerator)theEObject;
				T result = caseOSLC4EMFExposerGenerator(oslc4EMFExposerGenerator);
				if (result == null) result = caseOSLC4EMFGenerator(oslc4EMFExposerGenerator);
				if (result == null) result = caseAdaptorInterfaceGenerator(oslc4EMFExposerGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSLC4EMFgeneratorPackage.PACKAGES_EXPORT_CONTAINER: {
				PackagesExportContainer packagesExportContainer = (PackagesExportContainer)theEObject;
				T result = casePackagesExportContainer(packagesExportContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSLC4EMFgeneratorPackage.PACKAGE_EXPORT: {
				PackageExport packageExport = (PackageExport)theEObject;
				T result = casePackageExport(packageExport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSLC4EMFgeneratorPackage.REQUIRED_PLUGINS_CONTAINER: {
				RequiredPluginsContainer requiredPluginsContainer = (RequiredPluginsContainer)theEObject;
				T result = caseRequiredPluginsContainer(requiredPluginsContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSLC4EMFgeneratorPackage.REQUIRED_PLUGIN: {
				RequiredPlugin requiredPlugin = (RequiredPlugin)theEObject;
				T result = caseRequiredPlugin(requiredPlugin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSLC4EMFgeneratorPackage.REQUIRED_PLUGIN_FEATURE: {
				RequiredPluginFeature requiredPluginFeature = (RequiredPluginFeature)theEObject;
				T result = caseRequiredPluginFeature(requiredPluginFeature);
				if (result == null) result = caseRequiredPlugin(requiredPluginFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OSLC4EMFgeneratorPackage.PACKAGE_EXPORT_FEATURE: {
				PackageExportFeature packageExportFeature = (PackageExportFeature)theEObject;
				T result = casePackageExportFeature(packageExportFeature);
				if (result == null) result = casePackageExport(packageExportFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OSLC4EMF Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OSLC4EMF Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSLC4EMFGenerator(OSLC4EMFGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EStructural Feature Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EStructural Feature Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStructuralFeatureMapping(EStructuralFeatureMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClass Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClass Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClassMapping(EClassMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OSLC4EMF Core Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OSLC4EMF Core Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSLC4EMFCoreGenerator(OSLC4EMFCoreGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OSLC4EMF Exposer Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OSLC4EMF Exposer Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSLC4EMFExposerGenerator(OSLC4EMFExposerGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packages Export Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packages Export Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackagesExportContainer(PackagesExportContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Export</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Export</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageExport(PackageExport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Plugins Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Plugins Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredPluginsContainer(RequiredPluginsContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Plugin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredPlugin(RequiredPlugin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Plugin Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Plugin Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredPluginFeature(RequiredPluginFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Export Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Export Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageExportFeature(PackageExportFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptor Interface Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptor Interface Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptorInterfaceGenerator(AdaptorInterfaceGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Property Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Property Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcePropertyMapping(ResourcePropertyMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceMapping(ResourceMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OSLC4EMFgeneratorSwitch
