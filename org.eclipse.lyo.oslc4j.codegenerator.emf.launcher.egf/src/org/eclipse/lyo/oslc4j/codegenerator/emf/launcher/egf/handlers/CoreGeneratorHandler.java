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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFCoreGenerator;
import org.eclipse.lyo.oslc4j.codegenerator.emf.launcher.egf.Activator;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Handler for OSLC4EMF Core Plugin generator
 */
public class CoreGeneratorHandler extends AbstractHandler {

	private static final String CORE_ACTIVITY_NAME = "OSLC4EMFCoreGenerator"; //$NON-NLS-1$
	private static final String PATH_CORE_FCORE = Activator.PLUGIN_ID + "/egf/OSLC4EMFCoreGenerator.fcore"; //$NON-NLS-1$
	public static String PROJECT_NAME_CONTRACT = "project.name"; //$NON-NLS-1$
	public static String JAVA_VERSION_CONTRAT = "java.version"; //$NON-NLS-1$
	public static String OUTPUT_CONTRACT = "output"; //$NON-NLS-1$
	public static String MODEL_URI_CONTRACT = "modelURI"; //$NON-NLS-1$
	public static String REQUIRED_DEPENDENCIES = "requiredDependencies"; //$NON-NLS-1$
	public static String ACTIVATOR_PATH = "activatorPath"; //$NON-NLS-1$
	public static String PACKAGES_TO_EXPORT = "packagesToExport"; //$NON-NLS-1$
	public static String MAVEN_DEPENDENCIES_TO_ADD = "mavenDependenciesToAdd"; //$NON-NLS-1$
	

	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if (currentSelection instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) currentSelection;
			Object fElement = selection.getFirstElement();
			if (fElement instanceof OSLC4EMFCoreGenerator) {
				OSLC4EMFCoreGenerator generator = (OSLC4EMFCoreGenerator) fElement;
				
				URI fcoreURI = URI.createPlatformPluginURI(PATH_CORE_FCORE, true);
				Activity activity = GeneratorHandlerUtil.getActivity(fcoreURI, CORE_ACTIVITY_NAME);
				if (activity instanceof FactoryComponent) {
					FactoryComponent factoryComponent = (FactoryComponent) activity;
					
					GeneratorHandlerUtil.setStringContract(factoryComponent, PROJECT_NAME_CONTRACT, generator.getCorePluginId());
					String javaVersion = generator.getJavaVersion();
					if (javaVersion != null && !javaVersion.isEmpty()) {
						GeneratorHandlerUtil.setStringContract(factoryComponent, JAVA_VERSION_CONTRAT, javaVersion);
					}
					GeneratorHandlerUtil.setStringContract(factoryComponent, OUTPUT_CONTRACT, generator.getCorePluginId());
					GeneratorHandlerUtil.setURIContract(factoryComponent, MODEL_URI_CONTRACT, generator.eResource().getURI());
					GeneratorHandlerUtil.setCollectionContract(factoryComponent, REQUIRED_DEPENDENCIES, GeneratorHandlerUtil.getCoreRequiredPlugins(generator));
					GeneratorHandlerUtil.setStringContract(factoryComponent, ACTIVATOR_PATH, GeneratorHandlerUtil.getCoreActivatorPath(generator));
					GeneratorHandlerUtil.setCollectionContract(factoryComponent, PACKAGES_TO_EXPORT, GeneratorHandlerUtil.getCorePackagesToExport(generator));
					GeneratorHandlerUtil.setCollectionContract(factoryComponent, MAVEN_DEPENDENCIES_TO_ADD, GeneratorHandlerUtil.getCoreMavenDependencies(generator));
					
					boolean result = GeneratorHandlerUtil.validateAndInvoke(activity, Messages.CoreGeneratorHandler_CORE_GENERATION_NAME);
					if (! result)
						throw new RuntimeException(Messages.CoreGeneratorHandler_CORE_GENERATION_ERROR);
					
				} else {
					throw new ExecutionException(Messages.CoreGeneratorHandler_FACTORY_NOT_FOUND_ERROR + fcoreURI);
				}
			}
		}
		return null;
	}

}
