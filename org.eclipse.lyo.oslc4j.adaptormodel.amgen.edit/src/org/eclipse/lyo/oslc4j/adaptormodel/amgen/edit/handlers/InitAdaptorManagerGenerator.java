/*******************************************************************************
 * Copyright (c) 2014 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Helleboid Matthieu - initial API and implementation
 *    Anass Radouani 	 - initial API and implementation
 *******************************************************************************/
package org.eclipse.lyo.oslc4j.adaptormodel.amgen.edit.handlers;


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
import org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Initialize the Adaptor Manager Generator with Maven Dependencies of org.eclipse.lyo.oslc4j.adaptormodel/model/DefaultDependencies.xmi
 */
public class InitAdaptorManagerGenerator extends AbstractHandler  {

	private static final String PATH_DEFAULT_DEPENDENCIES = Activator.PLUGIN_ID + "/model/DefaultDependencies.xmi";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if (currentSelection instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) currentSelection;
			Object fElement = selection.getFirstElement();
			if (fElement instanceof AdaptorManagerGenerator) {
				AdaptorManagerGenerator amg = (AdaptorManagerGenerator) fElement;
				DependenciesContainer defaultDependenciesContainer = getDefaultDependenciesContainer(amg.eResource().getResourceSet());
				if (defaultDependenciesContainer != null) {
					amg.setDependenciesContainer(defaultDependenciesContainer);
				}
			}
		}
		return null;
	}
	
	/**
	 * @return Dependencies container with maven dependencies found at org.eclipse.lyo.oslc4j.adaptormodel/model/DefaultDependencies.xmi
	 */
	private DependenciesContainer getDefaultDependenciesContainer(ResourceSet resSet) {
		if (resSet == null) {
			resSet = new ResourceSetImpl();
		}
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

}
