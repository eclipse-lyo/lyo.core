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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;

/**
 * Task refresh a project
 */
public class RefreshProject implements ITaskProduction {

	public static int DEFAULT_DEPTH = IResource.DEPTH_INFINITE;
	
	public static final String PROJECT_CONTRACT = "refresh.project.name"; //$NON-NLS-1$
	public static final String DEPTH_CONTRACT = "refresh.depth"; //$NON-NLS-1$
	
	private String projectId;
	private Integer depth;
	
	@Override
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {
		projectId = productionContext.getInputValue(PROJECT_CONTRACT, String.class);
		if (projectId == null || projectId.isEmpty())
			throw new InvocationException("empty project name"); //$NON-NLS-1$
		
		depth = productionContext.getInputValue(DEPTH_CONTRACT, Integer.class);
		if (depth == null)
			depth = DEFAULT_DEPTH;
	}

	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {
		
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectId);
		if (!project.exists())
			throw new InvocationException("Can't find the project " + projectId); //$NON-NLS-1$
		
		try {
			project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} catch (CoreException e) {
			e.printStackTrace();
			throw new InvocationException(e);
		}
	}

	@Override
	public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {
	}

}
