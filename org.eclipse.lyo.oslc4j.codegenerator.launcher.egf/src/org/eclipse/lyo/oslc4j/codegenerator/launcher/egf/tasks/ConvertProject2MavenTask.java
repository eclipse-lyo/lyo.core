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
package org.eclipse.lyo.oslc4j.codegenerator.launcher.egf.tasks;

import org.apache.maven.model.Model;
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
import org.eclipse.m2e.core.embedder.MavenModelManager;
import org.eclipse.m2e.core.internal.IMavenConstants;
import org.eclipse.m2e.core.project.IProjectConfigurationManager;
import org.eclipse.m2e.core.project.ResolverConfiguration;

/**
 * Task to convert a project to maven
 *
 */
@SuppressWarnings("restriction")
public class ConvertProject2MavenTask implements ITaskProduction {

	private static final String DEFAULT_PROJECT_VERSION = "0.0.1-SNAPSHOT"; //$NON-NLS-1$
	private static final String DEFAULT_MAVEN_MODEL_VERSION = "4.0.0"; //$NON-NLS-1$
	private static final String DEFAULT_MAVEN_TYPE = "war"; //$NON-NLS-1$

	public static final String PROJECT_NAME_CONTRACT = "convert.maven.project.name"; //$NON-NLS-1$
	public static final String PROJECT_VERSION_CONTRACT = "convert.maven.project.version"; //$NON-NLS-1$
	public static final String MAVEN_TYPE_CONTRACT = "convert.maven.type"; //$NON-NLS-1$
	public static final String MAVEN_ARTIFACT_ID_CONTRACT = "convert.maven.artifactId"; //$NON-NLS-1$
	public static final String MAVEN_GROUP_ID_CONTRACT = "convert.maven.groupId"; //$NON-NLS-1$

	private String projectId;
	private IProject project;
	private String type;
	private String projectVersion;
	private String groupId;
	private String artifactId;

	@Override
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {

		projectId = productionContext.getInputValue(PROJECT_NAME_CONTRACT, String.class);
		if (projectId == null || projectId.isEmpty())
			throw new InvocationException("empty project name"); //$NON-NLS-1$

		projectVersion = productionContext.getInputValue(PROJECT_VERSION_CONTRACT, String.class);
		if (projectVersion == null || "".equals(projectVersion)) //$NON-NLS-1$
			projectVersion = DEFAULT_PROJECT_VERSION;

		artifactId = productionContext.getInputValue(MAVEN_ARTIFACT_ID_CONTRACT, String.class);
		if (artifactId == null || "".equals(artifactId)) //$NON-NLS-1$
			artifactId = projectId;

		groupId = productionContext.getInputValue(MAVEN_GROUP_ID_CONTRACT, String.class);
		if (groupId == null || "".equals(groupId)) //$NON-NLS-1$
			groupId = projectId;

		type = productionContext.getInputValue(MAVEN_TYPE_CONTRACT, String.class);
		if (type == null || type.isEmpty())
			type = DEFAULT_MAVEN_TYPE;
	}

	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {

		project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectId);
		if (!project.exists())
			throw new InvocationException("Can't find the project " + projectId); //$NON-NLS-1$
		
		try {
			//If the project is already a maven project don't do anything
			if (project.hasNature(IMavenConstants.NATURE_ID))
				return;

			//Create Model
			Model model = createMavenModel(groupId, artifactId, projectVersion, type, projectId, ""); //$NON-NLS-1$

			//convert project to maven project
			MavenPlugin.getProjectConversionManager().convert(project, model, monitor);

			IFile pomFileHandle = project.getFile(new Path(IMavenConstants.POM_FILE_NAME));

			MavenModelManager modelManager = MavenPlugin.getMavenModelManager();
			modelManager.createMavenModel(pomFileHandle, model);

			ResolverConfiguration configuration = new ResolverConfiguration();
			configuration.setResolveWorkspaceProjects(true);
			configuration.setSelectedProfiles(""); //$NON-NLS-1$

			//add maven nature
			IProjectConfigurationManager configurationManager = MavenPlugin.getProjectConfigurationManager();
			configurationManager.enableMavenNature(project, configuration, monitor);

			//update configuration
			configurationManager.updateProjectConfiguration(project, monitor);

		} catch (CoreException e) {
			e.printStackTrace();
			throw new InvocationException(e);
		}

	}

	@Override
	public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {
	}

	private Model createMavenModel(String groupId, String artifactId, String version, String packaging,
			String modelName, String modelDescription) {
		Model model = new Model();
		model.setModelVersion(DEFAULT_MAVEN_MODEL_VERSION);

		model.setGroupId(groupId);
		model.setArtifactId(artifactId);
		model.setVersion(version);
		model.setPackaging(packaging);

		if (modelName != null && !modelName.isEmpty()) {
			model.setName(modelName);
		}
		if (modelDescription != null && !modelDescription.isEmpty()) {
			model.setDescription(modelDescription);
		}

		return model;
	}

}
