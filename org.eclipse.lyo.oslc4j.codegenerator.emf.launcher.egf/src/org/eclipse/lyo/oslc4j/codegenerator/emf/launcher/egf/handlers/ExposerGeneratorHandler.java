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
package org.eclipse.lyo.oslc4j.codegenerator.emf.launcher.egf.handlers;

import java.util.Collection;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator;
import org.eclipse.lyo.oslc4j.codegenerator.emf.launcher.egf.Activator;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Handler for OSLC4EMF Exposer and common plugin generator
 */
public class ExposerGeneratorHandler extends AbstractHandler {

	private static final String EXPOSER_ACTIVITY_AND_FCORE_NAME = "OSLC4EMFExposerGenerator"; //$NON-NLS-1$
	private static final String COMMON_ACTIVITY_AND_FCORE_NAME = "OSLC4EMFCommonGenerator"; //$NON-NLS-1$
	public static String PROJECT_NAME_CONTRACT = "project.name"; //$NON-NLS-1$
	public static String EXECUTION_ENVIRONMENT_CONTRAT = "execution.environment"; //$NON-NLS-1$
	public static String OUTPUT_CONTRACT = "output"; //$NON-NLS-1$
	public static String MODEL_URI_CONTRACT = "modelURI"; //$NON-NLS-1$
	public static String JAVA_VERSION_CONTRACT = "java.version"; //$NON-NLS-1$
	public static String REQUIRED_DEPENDENCIES_CONTRACT = "requiredDependencies"; //$NON-NLS-1$
	public static String ACTIVATOR_PATH_CONTRACT = "activatorPath"; //$NON-NLS-1$
	public static String PACKAGES_TO_EXPORT_CONTRACT = "packagesToExport"; //$NON-NLS-1$
	

	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if (currentSelection instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) currentSelection;
			Object fElement = selection.getFirstElement();
			if (fElement instanceof OSLC4EMFExposerGenerator) {
				OSLC4EMFExposerGenerator generator = (OSLC4EMFExposerGenerator) fElement;
				
				Boolean result = generate(generator, COMMON_ACTIVITY_AND_FCORE_NAME, generator.getCommonPluginId(), GeneratorHandlerUtil.getCommonRequiredPlugins(generator), GeneratorHandlerUtil.getCommonActivatorPath(generator), GeneratorHandlerUtil.getCommonPackagesToExport(generator));
				if (! result)
					throw new RuntimeException(Messages.ExposerGeneratorHandler_Common_ERROR_MSG);
				
				result = generate(generator, EXPOSER_ACTIVITY_AND_FCORE_NAME, generator.getExposerPluginId(), GeneratorHandlerUtil.getExposerRequiredPlugins(generator), GeneratorHandlerUtil.getExposerActivatorPath(generator), GeneratorHandlerUtil.getExposerPackagesToExport(generator));
				if (! result)
					throw new RuntimeException(Messages.ExposerGeneratorHandler_Exposer_ERROR_MSG);
			}
		}
		return null;
	}


	private boolean generate(OSLC4EMFExposerGenerator generator, String activityName, String pluginId, Collection<?> requiredDependencies, String activatorPath, Collection<?> packagesToExport) throws ExecutionException {
		URI fcoreURI = URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/egf/"+activityName+".fcore", true); //$NON-NLS-1$ //$NON-NLS-2$
		Activity activity = GeneratorHandlerUtil.getActivity(fcoreURI, activityName);
		if (activity instanceof FactoryComponent) {
			FactoryComponent factoryComponent = (FactoryComponent) activity;
			
			GeneratorHandlerUtil.setStringContract(factoryComponent, PROJECT_NAME_CONTRACT, pluginId);
			String javaVersion = generator.getJavaVersion();
			GeneratorHandlerUtil.setStringContract(factoryComponent, JAVA_VERSION_CONTRACT, javaVersion);
			if ("1.7".equals(javaVersion) || "1.6".equals(javaVersion)) { //$NON-NLS-1$ //$NON-NLS-2$
				GeneratorHandlerUtil.setStringContract(factoryComponent, EXECUTION_ENVIRONMENT_CONTRAT, "JavaSE-" + javaVersion); //$NON-NLS-1$
			} else if ("1.4".equals(javaVersion) || "1.5".equals(javaVersion)) { //$NON-NLS-1$ //$NON-NLS-2$
				GeneratorHandlerUtil.setStringContract(factoryComponent, EXECUTION_ENVIRONMENT_CONTRAT, "J2SE-" + javaVersion); //$NON-NLS-1$
			} 
			
			GeneratorHandlerUtil.setStringContract(factoryComponent, OUTPUT_CONTRACT, pluginId);
			GeneratorHandlerUtil.setURIContract(factoryComponent, MODEL_URI_CONTRACT, generator.eResource().getURI());
			GeneratorHandlerUtil.setCollectionContract(factoryComponent, REQUIRED_DEPENDENCIES_CONTRACT, requiredDependencies);
			GeneratorHandlerUtil.setStringContract(factoryComponent, ACTIVATOR_PATH_CONTRACT, activatorPath);
			GeneratorHandlerUtil.setCollectionContract(factoryComponent, PACKAGES_TO_EXPORT_CONTRACT, packagesToExport);
			
			return GeneratorHandlerUtil.validateAndInvoke(activity, Messages.ExposerGeneratorHandler_ExposerGenerationName);
			
		} else {
			throw new ExecutionException(Messages.ExposerGeneratorHandler_FACTORY_NOT_FOUND_ERROR_MSG + fcoreURI);
		}
	}


}
