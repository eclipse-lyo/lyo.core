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
package org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.provider.ResourcePropertyMappingItemProvider;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EClassMapping;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EStructuralFeatureMapping;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorPackage;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

/**
 * This is the item provider adapter for a {@link org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EStructuralFeatureMapping} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EStructuralFeatureMappingItemProvider
	extends ResourcePropertyMappingItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeatureMappingItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addEStructuralFeaturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the EStructural Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addEStructuralFeaturePropertyDescriptor(Object object) {
		ComposeableAdapterFactory rootAdapterFactory = ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory();
		ComposedAdapterFactory caf = new ComposedAdapterFactory(new CustomEcoreItemProviderAdapterFactory());
		caf.addAdapterFactory(rootAdapterFactory);
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(caf,
				 getResourceLocator(),
				 getString("_UI_EStructuralFeatureMapping_eStructuralFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeatureMapping_eStructuralFeature_feature", "_UI_EStructuralFeatureMapping_type"),
				 OSLC4EMFgeneratorPackage.Literals.ESTRUCTURAL_FEATURE_MAPPING__ESTRUCTURAL_FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null) {
				
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						Collection<?> choiceOfValues = super.getChoiceOfValues(object);
						EObject container = ((EStructuralFeatureMapping)object).eContainer();
						if (container instanceof EClassMapping) {
							final EClass eClass = ((EClassMapping) container).getEClass();
							return Collections2.filter(choiceOfValues, new Predicate<Object>() {
								@Override
								public boolean apply(Object object) {
									if (object instanceof EStructuralFeature) {
										return eClass.getEAllStructuralFeatures().contains((EStructuralFeature) object);
									}
									return false;
								}
							});
						}
						return choiceOfValues;
					}
			});
	}
	
	/**
	 * This returns EStructuralFeatureMapping.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EStructuralFeatureMapping"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_EStructuralFeatureMapping_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
