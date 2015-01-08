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
import org.eclipse.lyo.oslc4j.adaptormodel.Activator;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.DependenciesContainer;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFCoreGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackagesExportContainer;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPluginsContainer;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Initialize OSLC4EMF Adaptor Core Generator with maven dependencies, required plugins and export packages
 */
public class InitAdaptorCoreGenerator  extends AbstractHandler {

	private static final String PATH_DEFAULT_DEPENDENCIES = Activator.PLUGIN_ID + "/model/DefaultDependencies.xmi";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if (currentSelection instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) currentSelection;
			Object fElement = selection.getFirstElement();
			if (fElement instanceof OSLC4EMFCoreGenerator) {
				OSLC4EMFCoreGenerator generator = (OSLC4EMFCoreGenerator) fElement;
				initCoreGenerator(generator);
			}
		}
		return null;
	}
	

	private void initCoreGenerator(OSLC4EMFCoreGenerator coreGenerator) {
		ResourceSet resSet = coreGenerator.eResource().getResourceSet();
		if (resSet == null) {
			resSet = new ResourceSetImpl();
		}
		DependenciesContainer defaultDependencies = getCoreDefaultDependenciesContainer(resSet);
		if (defaultDependencies != null) {
			coreGenerator.setDependenciesContainer(defaultDependencies);
		}
		RequiredPluginsContainer defaultRequiredPlugins = getCoreDefaultRequiredPlugins(resSet);
		if (defaultRequiredPlugins != null) {
			coreGenerator.setRequiredPluginsContainer(defaultRequiredPlugins);
		}
		PackagesExportContainer defaultPackagesExport = getCoreDefaultPackagesExport(resSet);
		if (defaultPackagesExport != null) {
			coreGenerator.setPackagesExportContainer(defaultPackagesExport);
		}
		try {
			coreGenerator.eResource().save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private DependenciesContainer getCoreDefaultDependenciesContainer(ResourceSet resSet) {
		Resource resource = resSet.getResource(URI.createPlatformPluginURI(PATH_DEFAULT_DEPENDENCIES, true), true);
		TreeIterator<EObject> eAllContent = resource.getAllContents();
		while (eAllContent.hasNext()) {
			EObject eObject = (EObject) eAllContent.next();
			if (eObject instanceof DependenciesContainer) {
				return (DependenciesContainer) eObject;
			}
		}
		return null;
	}
	
	private RequiredPluginsContainer getCoreDefaultRequiredPlugins(ResourceSet resSet) {
		Resource resource = resSet.getResource(URI.createPlatformPluginURI(org.eclipse.lyo.oslc4j.adaptormodel.emf.Activator.PLUGIN_ID + "/model/CoreDefaultRequiredPlugins.xmi", true), true);
		TreeIterator<EObject> eAllContent = resource.getAllContents();
		while (eAllContent.hasNext()) {
			EObject eObject = (EObject) eAllContent.next();
			if (eObject instanceof RequiredPluginsContainer) {
				return (RequiredPluginsContainer) eObject;
			}
		}
		return null;
	}
	
	private PackagesExportContainer getCoreDefaultPackagesExport(ResourceSet resSet) {
		Resource resource = resSet.getResource(URI.createPlatformPluginURI(org.eclipse.lyo.oslc4j.adaptormodel.emf.Activator.PLUGIN_ID + "/model/CoreDefaultPackagesExport.xmi", true), true);
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
