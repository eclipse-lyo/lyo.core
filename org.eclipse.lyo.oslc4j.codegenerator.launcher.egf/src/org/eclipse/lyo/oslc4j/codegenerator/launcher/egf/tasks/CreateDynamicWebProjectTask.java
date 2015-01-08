/*******************************************************************************
 * Copyright (c) 2014 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Helleboid Matthieu 	- initial API and implementation
 *    Anass Radouani 		- initial API and implementation
 *******************************************************************************/
package org.eclipse.lyo.oslc4j.codegenerator.launcher.egf.tasks;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.jst.j2ee.internal.web.archive.operations.WebFacetProjectCreationDataModelProvider;
import org.eclipse.jst.j2ee.project.facet.IJ2EEFacetConstants;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetDataModelProperties;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetProjectCreationDataModelProperties;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetProjectCreationDataModelProperties.FacetDataModelMap;
import org.eclipse.wst.common.componentcore.internal.util.IModuleConstants;
import org.eclipse.wst.common.frameworks.datamodel.DataModelFactory;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.frameworks.datamodel.IDataModelProvider;
import org.eclipse.wst.common.project.facet.core.ProjectFacetsManager;

/**
 * Task create a Dynamic Web Project
 * 
 */
@SuppressWarnings("restriction")
public class CreateDynamicWebProjectTask implements ITaskProduction {

	public static final String PROJECT_CONTRACT = "dwp.project.name"; //$NON-NLS-1$
	public static final String JAVA_VERSION = "dwp.java.version"; //$NON-NLS-1$
	public static final String WEB_MODULE_VERSION = "dwp.webmodule.version"; //$NON-NLS-1$

	private String projectId;
	private String java;
	private String webModule;

	@Override
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {
		projectId = productionContext.getInputValue(PROJECT_CONTRACT, String.class);
		if (projectId == null || "".equals(projectId)) //$NON-NLS-1$
			throw new InvocationException("empty project name"); //$NON-NLS-1$

		java = productionContext.getInputValue(JAVA_VERSION, String.class);
		if (java == null || "".equals(java)) //$NON-NLS-1$
			throw new InvocationException("no java version"); //$NON-NLS-1$

		webModule = productionContext.getInputValue(WEB_MODULE_VERSION, String.class);
		if (webModule == null || "".equals(webModule)) //$NON-NLS-1$
			throw new InvocationException("no web module version"); //$NON-NLS-1$
	}

	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		if (root.getProject(projectId).exists()) {
			return;
		}

		try {
			createDynamicWebProject(projectId, java, webModule, monitor);
		} catch (Exception e) {
			e.printStackTrace();
			throw new InvocationException(e);
		}

	}

	@Override
	public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {
	}

	/**
	 * @param projectName
	 *            The Project name
	 * @param javaVersion
	 *            The java version
	 * @param webModuleVersion
	 *            The web module version
	 * @param monitor
	 *            the progress monitor (or null) to use for reporting progress
	 *            to the user.
	 * @return The newly created web dynamic project
	 * @throws ExecutionException
	 *             if an exception occurred during execution.
	 */
	private IProject createDynamicWebProject(String projectName, String javaVersion, String webModuleVersion,
			IProgressMonitor monitor) throws ExecutionException {
		//create Model
		IDataModel dm = DataModelFactory
				.createDataModel((IDataModelProvider) new WebFacetProjectCreationDataModelProvider());
		
		//Set facets
		dm.setProperty(IFacetProjectCreationDataModelProperties.FACET_PROJECT_NAME, projectName);

		FacetDataModelMap facetMap = (FacetDataModelMap) dm
				.getProperty(IFacetProjectCreationDataModelProperties.FACET_DM_MAP);
		IDataModel facetModel = facetMap.getFacetDataModel(IJ2EEFacetConstants.DYNAMIC_WEB);
		facetModel.setProperty(IFacetDataModelProperties.FACET_VERSION,
				ProjectFacetsManager.getProjectFacet(IModuleConstants.JST_WEB_MODULE).getVersion(webModuleVersion));

		IDataModel javaFacetModel = facetMap.getFacetDataModel(IJ2EEFacetConstants.JAVA);
		javaFacetModel.setProperty(IFacetDataModelProperties.FACET_VERSION,
				ProjectFacetsManager.getProjectFacet(IModuleConstants.JST_JAVA).getVersion(javaVersion));

		IStatus st = dm.getDefaultOperation().execute(monitor, null);
		if (!st.isOK()) {
			throw new ExecutionException(st.getMessage());
		}
		return ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
	}

}
