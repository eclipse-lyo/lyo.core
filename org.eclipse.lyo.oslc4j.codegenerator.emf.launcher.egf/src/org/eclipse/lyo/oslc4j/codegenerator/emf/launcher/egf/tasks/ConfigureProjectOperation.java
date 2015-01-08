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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.pde.core.IBaseModel;
import org.eclipse.pde.internal.core.ibundle.IBundle;
import org.eclipse.pde.internal.core.ibundle.IBundlePluginModelBase;
import org.eclipse.pde.internal.ui.util.ModelModification;
import org.eclipse.pde.internal.ui.util.PDEModelUtility;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.osgi.framework.Constants;

import com.google.common.base.Joiner;
import com.google.common.collect.Sets;

/**
 * Configure project manifest by adding
 *  - java version
 *  - required plugins
 *  - activator
 *  - packages to export
 *  - Classpath
 */
@SuppressWarnings("restriction")
public class ConfigureProjectOperation extends WorkspaceModifyOperation {

	private IProject _project;
	private String _version;
	private Collection<?> _dependencies;
	private Collection<?> _exportPackages;
	private String _activatorPath;
	private Collection<?> _resources;

	public ConfigureProjectOperation(IProject project, String version, Collection<?> dependencies, Collection<?> exportPackages, String activatorPath, Collection<?> resources) {
		_project = project;
		_version = version;
		_dependencies = dependencies;
		_exportPackages = exportPackages;
		_activatorPath = activatorPath;
		_resources = resources;
	}

	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
		PDEModelUtility.modifyModel(new ModelModification(_project) {

			@SuppressWarnings("deprecation") //need use Constants.BUNDLE_REQUIREDEXECUTIONENVIRONMENT for java 1.7 execution environment
			@Override
			protected void modifyModel(IBaseModel model, IProgressMonitor monitor) throws CoreException {

				if (!(model instanceof IBundlePluginModelBase)) {
					return;
				}
				IBundle bundle = ((IBundlePluginModelBase) model).getBundleModel().getBundle();
				if ("1.7".equals(_version) || "1.6".equals(_version)) { //$NON-NLS-1$ //$NON-NLS-2$
					bundle.setHeader(Constants.BUNDLE_REQUIREDEXECUTIONENVIRONMENT, "JavaSE-" + _version); //$NON-NLS-1$
				} else if ("1.4".equals(_version) || "1.5".equals(_version)) { //$NON-NLS-1$ //$NON-NLS-2$
					bundle.setHeader(Constants.BUNDLE_REQUIREDEXECUTIONENVIRONMENT, "JavaSE-" + _version); //$NON-NLS-1$
				}
				
				if (_activatorPath != null && !_activatorPath.isEmpty()) {
					bundle.setHeader(Constants.BUNDLE_ACTIVATOR, _activatorPath);
				}
				
				bundle.setHeader(Constants.BUNDLE_ACTIVATIONPOLICY, "lazy"); //$NON-NLS-1$
				
				setCollectionHeader(bundle, Constants.BUNDLE_CLASSPATH, _resources, ",\n ", ",(\\n)?(\\s)?"); //$NON-NLS-1$ //$NON-NLS-2$
				setCollectionHeader(bundle, Constants.REQUIRE_BUNDLE, _dependencies, ",\n ", ",(\\n)?(\\s)?"); //$NON-NLS-1$ //$NON-NLS-2$
				setCollectionHeader(bundle, Constants.EXPORT_PACKAGE, _exportPackages, ",\n ", "(;.*)?,(\\n)?(\\s)?"); //$NON-NLS-1$ //$NON-NLS-2$
			}
		}, monitor);

	}

	@SuppressWarnings("unchecked")
	private void setCollectionHeader(IBundle bundle, String key, Collection<?> elements, String separator,
			String splitRegex) {
		
		if (elements != null && !elements.isEmpty()) {
			String values = bundle.getHeader(key);
			HashSet<String> valuesSet = Sets.newHashSet();
			if (values != null) {
				valuesSet.addAll(Sets.newHashSet(values.split(splitRegex)));
			}
			valuesSet.addAll((Collection<? extends String>) elements);
			values = Joiner.on(separator).skipNulls().join(valuesSet);
			bundle.setHeader(key, values);
		}
	}

}

