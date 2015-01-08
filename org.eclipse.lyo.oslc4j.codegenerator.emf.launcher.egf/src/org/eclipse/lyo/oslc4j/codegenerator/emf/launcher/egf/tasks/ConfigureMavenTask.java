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

import static org.eclipse.m2e.core.ui.internal.editing.PomEdits.performOnDOMDocument;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.internal.IMavenConstants;
import org.eclipse.m2e.core.project.IProjectConfigurationManager;
import org.eclipse.m2e.core.ui.internal.editing.PomEdits;
import org.eclipse.m2e.core.ui.internal.editing.PomEdits.Operation;
import org.eclipse.m2e.core.ui.internal.editing.PomEdits.OperationTuple;
import org.eclipse.m2e.core.ui.internal.editing.PomHelper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Configure Maven by adding
 * maven-dependency-plugin to copy dependencies to project lib folder
 *
 */
@SuppressWarnings("restriction")
public class ConfigureMavenTask implements ITaskProduction {

	public static final String PROJECT_NAME_CONTRACT = "config.maven.project.name"; //$NON-NLS-1$

	private String projectId;
	private IProject project;

	@Override
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {

		projectId = productionContext.getInputValue(PROJECT_NAME_CONTRACT, String.class);
		if (projectId == null || projectId.isEmpty())
			throw new InvocationException("empty project name"); //$NON-NLS-1$
	}

	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {

		project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectId);
		if (!project.exists())
			throw new InvocationException("Can't find the project " + projectId); //$NON-NLS-1$

		try {

			IFile pomFileHandle = project.getFile(new Path(IMavenConstants.POM_FILE_NAME));

			performOnDOMDocument(new OperationTuple(pomFileHandle, new Operation() {
				@Override
				public void process(Document document) {
					Element documentElement = document.getDocumentElement();
					Element pomPlugins = PomEdits.getChild(documentElement, PomEdits.BUILD, PomEdits.PLUGINS);
					addMavenCopyDependencies(pomPlugins);
				}
			}));
			
			IProjectConfigurationManager configurationManager = MavenPlugin.getProjectConfigurationManager();
			configurationManager.updateProjectConfiguration(project, monitor);

		} catch (CoreException | IOException e) {
			e.printStackTrace();
			throw new InvocationException(e);
		}

	}

	@Override
	public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {
	}
	
	private void addMavenCopyDependencies(Element pomPlugins) {
		Element plugin = PomHelper.createPlugin(pomPlugins, "org.apache.maven.plugins", "maven-dependency-plugin", "2.1"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		Element executions = PomEdits.getChild(plugin, PomEdits.EXECUTIONS);
		Element execution = PomEdits.getChild(executions, PomEdits.EXECUTION);
		PomEdits.createElementWithText(execution, PomEdits.ID, "copy-dependencies"); //$NON-NLS-1$
		PomEdits.createElementWithText(execution, "phase", "process-sources"); //$NON-NLS-1$ //$NON-NLS-2$
		Element goals = PomEdits.getChild(execution, PomEdits.GOALS);
		PomEdits.createElementWithText(goals, PomEdits.GOAL, "copy-dependencies"); //$NON-NLS-1$
		Element executionConfig = PomEdits.getChild(execution, PomEdits.CONFIGURATION);
		PomEdits.createElementWithText(executionConfig, "outputDirectory", "${basedir}/lib"); //$NON-NLS-1$ //$NON-NLS-2$
		PomEdits.createElementWithText(executionConfig, "overWriteReleases", String.valueOf(false)); //$NON-NLS-1$
		PomEdits.createElementWithText(executionConfig, "overWriteSnapshots", String.valueOf(false)); //$NON-NLS-1$
		PomEdits.createElementWithText(executionConfig, "overWriteIfNewer", String.valueOf(true)); //$NON-NLS-1$
		PomEdits.createElementWithText(executionConfig, "excludeTransitive", String.valueOf(true)); //$NON-NLS-1$
		PomEdits.createElementWithText(executionConfig, "includeTypes", "jar"); //$NON-NLS-1$ //$NON-NLS-2$
		PomEdits.format(plugin);
	}
}
