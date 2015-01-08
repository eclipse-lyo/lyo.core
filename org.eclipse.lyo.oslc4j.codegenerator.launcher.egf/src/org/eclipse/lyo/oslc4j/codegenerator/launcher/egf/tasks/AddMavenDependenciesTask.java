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

import static org.eclipse.m2e.core.ui.internal.editing.PomEdits.performOnDOMDocument;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.MavenDependency;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.internal.IMavenConstants;
import org.eclipse.m2e.core.project.IProjectConfigurationManager;
import org.eclipse.m2e.core.ui.internal.editing.PomEdits;
import org.eclipse.m2e.core.ui.internal.editing.PomEdits.Operation;
import org.eclipse.m2e.core.ui.internal.editing.PomEdits.OperationTuple;
import org.eclipse.m2e.core.ui.internal.editing.PomHelper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.google.common.base.Function;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;

/**
 * Task to add dependencies to Maven Project
 * Using MavenDependency Element from the Adaptor Interface Generator meta model (NsURI : http://org.eclipse.lyo/oslc4j/AdaptorInterfaceGenerator)
 *
 */
@SuppressWarnings("restriction")
public class AddMavenDependenciesTask implements ITaskProduction {

	public static final String PROJECT_NAME_CONTRACT = "add.maven.project.name"; //$NON-NLS-1$
	public static final String MAVEN_DEPENDENCIES_CONTRACT = "add.maven.dependencies"; //$NON-NLS-1$

	private String projectId;
	private IProject project;
	private Collection<?> dependencies;

	@Override
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {

		projectId = productionContext.getInputValue(PROJECT_NAME_CONTRACT, String.class);
		if (projectId == null || projectId.isEmpty())
			throw new InvocationException("empty project name"); //$NON-NLS-1$

		dependencies = productionContext.getInputValue(MAVEN_DEPENDENCIES_CONTRACT, Collection.class);
		if (dependencies == null)
			dependencies = Collections.emptyList();
	}

	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {

		project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectId);
		if (!project.exists())
			throw new InvocationException("Can't find the project " + projectId); //$NON-NLS-1$

		try {

			IFile pomFileHandle = project.getFile(new Path(IMavenConstants.POM_FILE_NAME));
			
			if (!pomFileHandle.exists() && !dependencies.isEmpty())
				throw new InvocationException("can't find pom file at " + pomFileHandle.getLocationURI()); //$NON-NLS-1$

			performOnDOMDocument(new OperationTuple(pomFileHandle, new Operation() {
				@Override
				public void process(Document document) {
					Element documentElement = document.getDocumentElement();
					Collection<MavenDependency> mavenDependencies = Collections2.filter(Collections2.transform(dependencies, new Function<Object, MavenDependency>() {
						@Override
						public MavenDependency apply(Object object) {
							if (object instanceof MavenDependency) {
								return (MavenDependency) object;
							}
							return null;
						}
					}), Predicates.notNull());
					addDependencies(documentElement, mavenDependencies);
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

	/**
	 * Add dependencies to a a pom Element
	 * @param documentElement the pom document element that with contains Dependencies
	 * @param dependencies Maven dependencies to add
	 */
	private void addDependencies(Element documentElement, Collection<MavenDependency> dependencies) {
		Element pomDeps = PomEdits.getChild(documentElement, PomEdits.DEPENDENCIES);
		for (Object object : dependencies) {
			
			if (object instanceof MavenDependency) {
				MavenDependency mavenDependency = (MavenDependency) object;
				
				final String artifactId = mavenDependency.getArtifactId();
				String groupId = mavenDependency.getGroupId();
				String version = mavenDependency.getVersion();
				String type = mavenDependency.getType();
				String classifier = mavenDependency.getClassifier();
				String scope = mavenDependency.getScope();
				String systemPath = mavenDependency.getSystemPath();
				String optional = mavenDependency.getOptional();

				Element pomDep = PomEdits.findChild(pomDeps, PomEdits.DEPENDENCY, new PomEdits.Matcher() {
					
					@Override
					public boolean matches(Element element) {
						Element child = PomEdits.findChild(element, PomEdits.ARTIFACT_ID);
						return child.getTextContent().equals(artifactId);
					}
				});
				if (pomDep == null) {
					Element newDependency = PomHelper.createDependency(pomDeps, groupId, artifactId, version);
					if (type != null && !type.isEmpty())
						PomEdits.createElementWithText(newDependency, PomEdits.TYPE, type);
					if (classifier != null && !classifier.isEmpty())
						PomEdits.createElementWithText(newDependency, PomEdits.CLASSIFIER, classifier);
					if (scope != null && !scope.isEmpty())
						PomEdits.createElementWithText(newDependency, PomEdits.SCOPE, scope);
					if (systemPath != null && !systemPath.isEmpty())
						PomEdits.createElementWithText(newDependency, PomEdits.SYSTEM_PATH, systemPath);
					if (optional != null && Boolean.getBoolean(optional))
						PomEdits.createElementWithText(newDependency, PomEdits.OPTIONAL, optional);
				}
			}
			

		}
	}

}
