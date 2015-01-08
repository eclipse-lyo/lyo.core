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
package org.eclipse.lyo.oslc4j.codegenerator.emf.launcher.egf.tasks;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.pde.internal.core.ClasspathComputer;
import org.eclipse.ui.internal.editors.text.WorkspaceOperationRunner;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

/**
 *	Do some configuration task on the project :
 *	- Add element on the project lib foler to the classpath
 *	- Sets java version
 *  - Sets required plugins
 *  - Sets the activator
 *  - Sets packages to export
 *  
 *  by calling ConfigureProjectOperation
 */
@SuppressWarnings("restriction")
public class ConfigureProjectTask implements ITaskProduction {

	private static final String DEFAULT_JAVA_VERSION = "1.7"; //$NON-NLS-1$
	
	public static final String PROJECT_CONTRACT = "config.project.name"; //$NON-NLS-1$
	public static final String JAVA_VERSION_CONTRACT = "config.java.version"; //$NON-NLS-1$
	public static final String DEPENDENCIES_CONTRACT = "config.dependencies"; //$NON-NLS-1$
	public static final String EXPORT_PACKAGES_CONTRACT = "config.exportPackages"; //$NON-NLS-1$
	public static final String ACTIVATOR_PATH = "config.activator.path"; //$NON-NLS-1$
	
	private IProject project;
	private Collection<?> exportPackages;
	private Collection<?> dependencies;
	private String version;
	private String activatorPath;
	private Collection<String> resources;
	

	@Override
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		String projectId = productionContext.getInputValue(PROJECT_CONTRACT, String.class);
		if (projectId == null || "".equals(projectId)) //$NON-NLS-1$
			throw new InvocationException("empty project name"); //$NON-NLS-1$
		
		project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectId);
		if (!project.exists())
			throw new InvocationException("can't find project with id : " + projectId); //$NON-NLS-1$
		
		IFolder libFolder = project.getFolder("lib"); //$NON-NLS-1$
		try {
			resources = Lists.newArrayList(".");
			if (libFolder.exists() ) {
				resources.addAll(Collections2.transform(Arrays.asList(libFolder.members()), new Function<IResource, String>() {

					@Override
					public String apply(IResource resource) {
						return "lib/" + resource.getName(); //$NON-NLS-1$
					}
				}));
			}
			
		} catch (CoreException e) {
		}
		
		version = productionContext.getInputValue(JAVA_VERSION_CONTRACT, String.class);
		if (version == null || version.isEmpty()) 
			version = DEFAULT_JAVA_VERSION;
		
		dependencies = productionContext.getInputValue(DEPENDENCIES_CONTRACT, Collection.class);
		
		exportPackages = productionContext.getInputValue(EXPORT_PACKAGES_CONTRACT, Collection.class);
		activatorPath = productionContext.getInputValue(ACTIVATOR_PATH, String.class);
		

	}

	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		try {
			WorkspaceOperationRunner runner = new WorkspaceOperationRunner();
			runner.setProgressMonitor(monitor);
			runner.run(false, false, new ConfigureProjectOperation(project, version, dependencies, exportPackages, activatorPath, resources));
		} catch (Exception e) {
			e.printStackTrace();
			throw new InvocationException(e);
		}
	}

	@Override
	public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		try {
			IPluginModelBase pluginModel = PluginRegistry.findModel(project);
			if (pluginModel != null) {
				ClasspathComputer.setClasspath(project, pluginModel);
			}
			project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} catch (CoreException e) {
			e.printStackTrace();
			throw new InvocationException(e);
		}

	}

	
}
