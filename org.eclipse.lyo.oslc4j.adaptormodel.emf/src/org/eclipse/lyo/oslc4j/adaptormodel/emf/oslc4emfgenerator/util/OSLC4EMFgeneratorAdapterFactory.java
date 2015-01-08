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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourceMapping;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourcePropertyMapping;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage
 * @generated
 */
public class OSLC4EMFgeneratorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OSLC4EMFgeneratorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSLC4EMFgeneratorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OSLC4EMFgeneratorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSLC4EMFgeneratorSwitch<Adapter> modelSwitch =
		new OSLC4EMFgeneratorSwitch<Adapter>() {
			@Override
			public Adapter caseOSLC4EMFGenerator(OSLC4EMFGenerator object) {
				return createOSLC4EMFGeneratorAdapter();
			}
			@Override
			public Adapter caseEStructuralFeatureMapping(EStructuralFeatureMapping object) {
				return createEStructuralFeatureMappingAdapter();
			}
			@Override
			public Adapter caseEClassMapping(EClassMapping object) {
				return createEClassMappingAdapter();
			}
			@Override
			public Adapter caseOSLC4EMFCoreGenerator(OSLC4EMFCoreGenerator object) {
				return createOSLC4EMFCoreGeneratorAdapter();
			}
			@Override
			public Adapter caseOSLC4EMFExposerGenerator(OSLC4EMFExposerGenerator object) {
				return createOSLC4EMFExposerGeneratorAdapter();
			}
			@Override
			public Adapter casePackagesExportContainer(PackagesExportContainer object) {
				return createPackagesExportContainerAdapter();
			}
			@Override
			public Adapter casePackageExport(PackageExport object) {
				return createPackageExportAdapter();
			}
			@Override
			public Adapter caseRequiredPluginsContainer(RequiredPluginsContainer object) {
				return createRequiredPluginsContainerAdapter();
			}
			@Override
			public Adapter caseRequiredPlugin(RequiredPlugin object) {
				return createRequiredPluginAdapter();
			}
			@Override
			public Adapter caseRequiredPluginFeature(RequiredPluginFeature object) {
				return createRequiredPluginFeatureAdapter();
			}
			@Override
			public Adapter casePackageExportFeature(PackageExportFeature object) {
				return createPackageExportFeatureAdapter();
			}
			@Override
			public Adapter caseAdaptorInterfaceGenerator(AdaptorInterfaceGenerator object) {
				return createAdaptorInterfaceGeneratorAdapter();
			}
			@Override
			public Adapter caseResourcePropertyMapping(ResourcePropertyMapping object) {
				return createResourcePropertyMappingAdapter();
			}
			@Override
			public Adapter caseResourceMapping(ResourceMapping object) {
				return createResourceMappingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator <em>OSLC4EMF Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator
	 * @generated
	 */
	public Adapter createOSLC4EMFGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EStructuralFeatureMapping <em>EStructural Feature Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EStructuralFeatureMapping
	 * @generated
	 */
	public Adapter createEStructuralFeatureMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EClassMapping <em>EClass Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EClassMapping
	 * @generated
	 */
	public Adapter createEClassMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFCoreGenerator <em>OSLC4EMF Core Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFCoreGenerator
	 * @generated
	 */
	public Adapter createOSLC4EMFCoreGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator <em>OSLC4EMF Exposer Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator
	 * @generated
	 */
	public Adapter createOSLC4EMFExposerGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackagesExportContainer <em>Packages Export Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackagesExportContainer
	 * @generated
	 */
	public Adapter createPackagesExportContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackageExport <em>Package Export</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackageExport
	 * @generated
	 */
	public Adapter createPackageExportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPluginsContainer <em>Required Plugins Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPluginsContainer
	 * @generated
	 */
	public Adapter createRequiredPluginsContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPlugin <em>Required Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPlugin
	 * @generated
	 */
	public Adapter createRequiredPluginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPluginFeature <em>Required Plugin Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPluginFeature
	 * @generated
	 */
	public Adapter createRequiredPluginFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackageExportFeature <em>Package Export Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackageExportFeature
	 * @generated
	 */
	public Adapter createPackageExportFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator <em>Adaptor Interface Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator
	 * @generated
	 */
	public Adapter createAdaptorInterfaceGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourcePropertyMapping <em>Resource Property Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourcePropertyMapping
	 * @generated
	 */
	public Adapter createResourcePropertyMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourceMapping <em>Resource Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.ResourceMapping
	 * @generated
	 */
	public Adapter createResourceMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OSLC4EMFgeneratorAdapterFactory
