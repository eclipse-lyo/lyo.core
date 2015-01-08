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
package org.eclipse.lyo.oslc4j.codegenerator.launcher.egf.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.DependenciesContainer;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator;
import org.eclipse.lyo.oslc4j.codegenerator.launcher.egf.Activator;
import org.eclipse.lyo.oslc4j.codegenerator.launcher.egf.Messages;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Handler for the Adaptor Manager Generator
 */
public class AdaptorManagerGeneratorHandler extends AbstractHandler {
	
	private static final String AMG_ACTIVITY_NAME = "adaptorManagerGenerator"; //$NON-NLS-1$

	private static final String PATH_FCORE = Activator.PLUGIN_ID + "/egf/adaptorManagerGenerator.fcore"; //$NON-NLS-1$
	
	public static String PROJECT_NAME_CONTRACT = "project.name"; //$NON-NLS-1$
	public static String JAVA_VERSION_CONTRAT = "java.version"; //$NON-NLS-1$
	public static String WEB_MODULE_CONTRACT = "webmodule.version"; //$NON-NLS-1$
	public static String OUTPUT_CONTRACT = "output"; //$NON-NLS-1$
	public static String MODEL_URI_CONTRACT = "modelURI"; //$NON-NLS-1$
	public static String MAVEN_DEPENDENCIES_CONTRACT = "mavenDependencies"; //$NON-NLS-1$
	

	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if (currentSelection instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) currentSelection;
			Object fElement = selection.getFirstElement();
			//retrieve the adaptor manager generator
			if (fElement instanceof AdaptorManagerGenerator) {
				AdaptorManagerGenerator amg = (AdaptorManagerGenerator) fElement;
				
				URI fcoreURI = URI.createPlatformPluginURI(PATH_FCORE, true);
				Activity activity = AMGHandlerUtil.getActivity(fcoreURI, AMG_ACTIVITY_NAME);
				if (activity instanceof FactoryComponent) {
					FactoryComponent factoryComponent = (FactoryComponent) activity;
					
					//init egf contracts
					AMGHandlerUtil.setStringContract(factoryComponent, PROJECT_NAME_CONTRACT, amg.getApplicationName());
					AMGHandlerUtil.setStringContract(factoryComponent, OUTPUT_CONTRACT, amg.getApplicationName());
					AMGHandlerUtil.setURIContract(factoryComponent, MODEL_URI_CONTRACT, amg.eResource().getURI());
					
					DependenciesContainer dependenciesContainer = amg.getDependenciesContainer();
					if (dependenciesContainer != null) {
						AMGHandlerUtil.setCollectionContract(factoryComponent, MAVEN_DEPENDENCIES_CONTRACT, dependenciesContainer.getDependencies());
					}
					
					//invoke the egf activity
					boolean result = AMGHandlerUtil.validateAndInvoke(activity, Messages.AMGHandler_JOB_NAME);
					if (! result)
						throw new RuntimeException(Messages.AMGHandler_ERROR_MSG);
					
				} else {
					throw new ExecutionException(Messages.AMGHandler_FACTORY_COMPONENT_ERROR_MSG + fcoreURI);
				}
			}
		}
		return null;
	}

	
}
