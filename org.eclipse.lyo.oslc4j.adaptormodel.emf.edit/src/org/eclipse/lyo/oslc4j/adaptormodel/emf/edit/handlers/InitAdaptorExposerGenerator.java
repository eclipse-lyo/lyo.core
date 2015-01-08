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
package org.eclipse.lyo.oslc4j.adaptormodel.emf.edit.handlers;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackagesExportContainer;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPluginsContainer;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Initialize OSLC4EMF Adaptor Exposer Generator with maven dependencies for exposer and common plugins, required plugins and export packages
 */
public class InitAdaptorExposerGenerator  extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if (currentSelection instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) currentSelection;
			Object fElement = selection.getFirstElement();
			if (fElement instanceof OSLC4EMFExposerGenerator) {
				OSLC4EMFExposerGenerator generator = (OSLC4EMFExposerGenerator) fElement;
				initExposerGenerator(generator);
			}
		}
		return null;
	}
	

	private void initExposerGenerator(OSLC4EMFExposerGenerator exposerGenerator) {
		ResourceSet resSet = exposerGenerator.eResource().getResourceSet();
		if (resSet == null) {
			resSet = new ResourceSetImpl();
		}
		RequiredPluginsContainer defaultCommonRequiredPlugins = getCommonDefaultRequiredPlugins(resSet);
		if (defaultCommonRequiredPlugins != null) {
			exposerGenerator.setRequiredPluginsContainer(defaultCommonRequiredPlugins);
		}
		PackagesExportContainer defaultCommonPackagesExport = getCommonDefaultPackagesExport(resSet);
		if (defaultCommonPackagesExport != null) {
			exposerGenerator.setPackagesExportContainer(defaultCommonPackagesExport);
		}
		RequiredPluginsContainer defaultExposerRequiredPlugins = getExposerDefaultRequiredPlugins(resSet);
		if (defaultExposerRequiredPlugins != null) {
			exposerGenerator.setExposerRequiredPluginsContainer(defaultExposerRequiredPlugins);
		}
		try {
			exposerGenerator.eResource().save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private RequiredPluginsContainer getExposerDefaultRequiredPlugins(ResourceSet resSet) {
		Resource resource = resSet.getResource(URI.createPlatformPluginURI(org.eclipse.lyo.oslc4j.adaptormodel.emf.Activator.PLUGIN_ID + "/model/ExposerDefaultRequiredPlugins.xmi", true), true);
		TreeIterator<EObject> eAllContent = resource.getAllContents();
		while (eAllContent.hasNext()) {
			EObject eObject = (EObject) eAllContent.next();
			if (eObject instanceof RequiredPluginsContainer) {
				return (RequiredPluginsContainer) eObject;
			}
		}
		return null;
	}
	
	private RequiredPluginsContainer getCommonDefaultRequiredPlugins(ResourceSet resSet) {
		Resource resource = resSet.getResource(URI.createPlatformPluginURI(org.eclipse.lyo.oslc4j.adaptormodel.emf.Activator.PLUGIN_ID + "/model/CommonDefaultRequiredPlugins.xmi", true), true);
		TreeIterator<EObject> eAllContent = resource.getAllContents();
		while (eAllContent.hasNext()) {
			EObject eObject = (EObject) eAllContent.next();
			if (eObject instanceof RequiredPluginsContainer) {
				return (RequiredPluginsContainer) eObject;
			}
		}
		return null;
	}
	
	private PackagesExportContainer getCommonDefaultPackagesExport(ResourceSet resSet) {
		Resource resource = resSet.getResource(URI.createPlatformPluginURI(org.eclipse.lyo.oslc4j.adaptormodel.emf.Activator.PLUGIN_ID + "/model/CommonDefaultPackagesExport.xmi", true), true);
		TreeIterator<EObject> eAllContent = resource.getAllContents();
		while (eAllContent.hasNext()) {
			EObject eObject = (EObject) eAllContent.next();
			if (eObject instanceof PackagesExportContainer) {
				return (PackagesExportContainer) eObject;
			}
		}
		return null;
	}

}
