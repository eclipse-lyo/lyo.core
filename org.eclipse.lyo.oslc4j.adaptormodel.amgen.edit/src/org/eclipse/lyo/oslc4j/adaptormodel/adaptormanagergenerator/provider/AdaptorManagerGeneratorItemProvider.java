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
package org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.provider.AdaptorInterfaceGeneratorItemProvider;

import org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGeneratorPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptorManagerGeneratorItemProvider
	extends AdaptorInterfaceGeneratorItemProvider
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
	public AdaptorManagerGeneratorItemProvider(AdapterFactory adapterFactory) {
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

			addJavaClassBaseNamespacePropertyDescriptor(object);
			addJavaFilesBasePathPropertyDescriptor(object);
			addJspFilesBasePathPropertyDescriptor(object);
			addJavascriptFilesBasePathPropertyDescriptor(object);
			addApplicationNamePropertyDescriptor(object);
			addWebApplicationBasePathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Java Class Base Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJavaClassBaseNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdaptorManagerGenerator_javaClassBaseNamespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdaptorManagerGenerator_javaClassBaseNamespace_feature", "_UI_AdaptorManagerGenerator_type"),
				 AdaptorManagerGeneratorPackage.Literals.ADAPTOR_MANAGER_GENERATOR__JAVA_CLASS_BASE_NAMESPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Java Files Base Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJavaFilesBasePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdaptorManagerGenerator_javaFilesBasePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdaptorManagerGenerator_javaFilesBasePath_feature", "_UI_AdaptorManagerGenerator_type"),
				 AdaptorManagerGeneratorPackage.Literals.ADAPTOR_MANAGER_GENERATOR__JAVA_FILES_BASE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Jsp Files Base Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJspFilesBasePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdaptorManagerGenerator_jspFilesBasePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdaptorManagerGenerator_jspFilesBasePath_feature", "_UI_AdaptorManagerGenerator_type"),
				 AdaptorManagerGeneratorPackage.Literals.ADAPTOR_MANAGER_GENERATOR__JSP_FILES_BASE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Javascript Files Base Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJavascriptFilesBasePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdaptorManagerGenerator_javascriptFilesBasePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdaptorManagerGenerator_javascriptFilesBasePath_feature", "_UI_AdaptorManagerGenerator_type"),
				 AdaptorManagerGeneratorPackage.Literals.ADAPTOR_MANAGER_GENERATOR__JAVASCRIPT_FILES_BASE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Application Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplicationNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdaptorManagerGenerator_applicationName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdaptorManagerGenerator_applicationName_feature", "_UI_AdaptorManagerGenerator_type"),
				 AdaptorManagerGeneratorPackage.Literals.ADAPTOR_MANAGER_GENERATOR__APPLICATION_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Web Application Base Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebApplicationBasePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdaptorManagerGenerator_webApplicationBasePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdaptorManagerGenerator_webApplicationBasePath_feature", "_UI_AdaptorManagerGenerator_type"),
				 AdaptorManagerGeneratorPackage.Literals.ADAPTOR_MANAGER_GENERATOR__WEB_APPLICATION_BASE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns AdaptorManagerGenerator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AdaptorManagerGenerator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AdaptorManagerGenerator)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AdaptorManagerGenerator_type") :
			getString("_UI_AdaptorManagerGenerator_type") + " " + label;
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

		switch (notification.getFeatureID(AdaptorManagerGenerator.class)) {
			case AdaptorManagerGeneratorPackage.ADAPTOR_MANAGER_GENERATOR__JAVA_CLASS_BASE_NAMESPACE:
			case AdaptorManagerGeneratorPackage.ADAPTOR_MANAGER_GENERATOR__JAVA_FILES_BASE_PATH:
			case AdaptorManagerGeneratorPackage.ADAPTOR_MANAGER_GENERATOR__JSP_FILES_BASE_PATH:
			case AdaptorManagerGeneratorPackage.ADAPTOR_MANAGER_GENERATOR__JAVASCRIPT_FILES_BASE_PATH:
			case AdaptorManagerGeneratorPackage.ADAPTOR_MANAGER_GENERATOR__APPLICATION_NAME:
			case AdaptorManagerGeneratorPackage.ADAPTOR_MANAGER_GENERATOR__WEB_APPLICATION_BASE_PATH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
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
