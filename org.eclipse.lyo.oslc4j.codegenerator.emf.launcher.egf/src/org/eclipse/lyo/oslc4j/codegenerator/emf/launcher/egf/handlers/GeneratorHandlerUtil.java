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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.egf.core.domain.TargetPlatformResourceSet;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.core.producer.MissingExtensionException;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.model.fcore.Contract;
import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.egf.model.types.Type;
import org.eclipse.egf.model.types.TypeCollection;
import org.eclipse.egf.model.types.TypeInteger;
import org.eclipse.egf.model.types.TypeString;
import org.eclipse.egf.model.types.TypeURI;
import org.eclipse.egf.producer.EGFProducerPlugin;
import org.eclipse.egf.producer.manager.ActivityManagerProducer;
import org.eclipse.egf.producer.manager.IActivityManager;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.DependenciesContainer;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.Dependency;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFCoreGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackageExport;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.PackageExportFeature;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPlugin;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.RequiredPluginFeature;
import org.eclipse.lyo.oslc4j.codegenerator.emf.launcher.egf.Activator;
import org.eclipse.swt.widgets.Display;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Predicates;
import com.google.common.base.Splitter;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

/**
 * Util Method for Generator Handlers
 */
public class GeneratorHandlerUtil {

	private static Pattern featurePattern = Pattern.compile(Messages.GeneratorHandlerUtil_0);
	
	/**
	 * Gets the activity by name
	 * @param fcoreURI FCore file uri
	 * @param activityName the activity name
	 * @return the activity if found or null if not
	 */
	public static Activity getActivity(URI fcoreURI, String activityName) {
		ResourceSet rs = new TargetPlatformResourceSet();
		Resource resource = rs.getResource(fcoreURI, true);
		EList<EObject> contents = resource.getContents();
		for (EObject eObject : contents) {
			if (eObject instanceof Activity && activityName.equals(((Activity)eObject).getName())) {
				return (Activity) eObject;
			}
		}
		return null;
	}
	
	/**
	 * Validate and invoke an activity
	 * @param activity the activity to invoke
	 * @param jobName the job name
	 * @return true if the execution has no error
	 */
	public static boolean validateAndInvoke(Activity activity, String jobName)  {
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(activity);
		if (diagnostic.getSeverity() != Diagnostic.ERROR) 
		{	IStatus status = null;
			try {
				invoke(activity, jobName);
				return true;
			} catch (MissingExtensionException e) {
				status = new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage());
				e.printStackTrace();
			} catch (InvocationException e) {
				status = new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage());
				e.printStackTrace();
			} catch (CoreException e) {
				status = new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage());
				e.printStackTrace();
			}
			if (status != null) {
				ErrorDialog.openError(
						Display.getDefault().getActiveShell(), "Error", null, status);
			}
		}
		return false;
	}
	
	/**
	 * Invoke an EGF activity
	 * @param activity the activity to invoke
	 * @param jobName the job name
	 * @throws MissingExtensionException
	 * @throws InvocationException
	 * @throws CoreException
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void invoke(Activity activity, String jobName)
		throws MissingExtensionException, InvocationException, CoreException {
		
		ActivityManagerProducer producer = EGFProducerPlugin.getActivityManagerProducer(activity);
		final IActivityManager activityManager = producer.createActivityManager(activity);
		activityManager.initializeContext();
		Job job = new Job(Messages.GeneratorHandlerUtil_jobName) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				Status status = null;
				try {
					Diagnostic diagnostic = activityManager.invoke(monitor);
					activityManager.dispose();
					if (diagnostic != null && diagnostic.getSeverity() != Diagnostic.OK) {
						status = new Status(diagnostic.getSeverity(), diagnostic.getSource(), diagnostic.getMessage());
							ErrorDialog.openError(
									Display.getDefault().getActiveShell(), "Error", null, status);
					}
				} catch (InvocationException e) {
					e.printStackTrace();
				}
				return status != null ? status : Status.OK_STATUS;
			}
		};
		job.setUser(true);
		job.schedule();
		
	}
	
	/**
	 * Sets a contract String value
	 * @param factoryComponent the factory component containing the contract
	 * @param contractName the contract name
	 * @param value the value to set
	 * @return the contract if the value has been set or null if not
	 */
	public static TypeString setStringContract(FactoryComponent factoryComponent, String contractName, String value) {
		Contract invokedContract = factoryComponent.getContract(contractName);
		Type type = invokedContract.getType();
		if (type instanceof TypeString) 
		{
			TypeString typeString = (TypeString) type;
			typeString.setValue(value);
			return typeString;
		}
		return null;
	}
	
	/**
	 * Sets a contract Integer value
	 * @param factoryComponent the factory component containing the contract
	 * @param contractName the contract name
	 * @param value the value to set
	 * @return the contract if the value has been set or null if not
	 */
	public static TypeInteger setIntegerContract(FactoryComponent factoryComponent, String contractName, Integer value) {
		Contract invokedContract = factoryComponent.getContract(contractName);
		Type type = invokedContract.getType();
		if (type instanceof TypeInteger) 
		{
			TypeInteger typeInteger = (TypeInteger) type;
			typeInteger.setValue(value);
			return typeInteger;
		}
		return null;
	}
	
	/**
	 * Sets a contract Collection value
	 * @param factoryComponent the factory component containing the contract
	 * @param contractName the contract name
	 * @param value the value to set
	 * @return the contract if the value has been set or null if not
	 */
	public static TypeCollection setCollectionContract(FactoryComponent factoryComponent, String contractName, Collection<?> value) {
		Contract invokedContract = factoryComponent.getContract(contractName);
		Type type = invokedContract.getType();
		if (type instanceof TypeCollection) 
		{
			TypeCollection typeCollection = (TypeCollection) type;
			typeCollection.setInstance(value);
			return typeCollection;
		}
		return null;
	}
	
	/**
	 * Sets a contract URI value
	 * @param factoryComponent the factory component containing the contract
	 * @param contractName the contract name
	 * @param value the value to set
	 * @return the contract if the value has been set or null if not
	 */
	public static TypeURI setURIContract(FactoryComponent factoryComponent, String contractName, URI value) {
		Contract invokedContract = factoryComponent.getContract(contractName);
		Type type = invokedContract.getType();
		if (type instanceof TypeURI) 
		{
			TypeURI typeURI = (TypeURI) type;
			typeURI.setValue(value);
			return typeURI;
		}
		return null;
	}
	
	
	/**
	 * Gets core required plugin
	 * @param generator OSLC4EMF Core Generator
	 * @return Collection Required Plugins ids
	 */
	public static Collection<String> getCoreRequiredPlugins(final OSLC4EMFCoreGenerator generator) {
		if (generator.getRequiredPluginsContainer() == null) {
			return Collections.emptyList();
		}
		return Collections2.filter(Collections2.transform(generator.getRequiredPluginsContainer().getRequiredPlugins(), new Function<RequiredPlugin, String>() {

			@Override
			public String apply(RequiredPlugin requiredPlugin) {
				if (requiredPlugin instanceof RequiredPluginFeature) {
					return transformFeatureIds(generator, requiredPlugin.getId());
				} else {
					return requiredPlugin.getId();
				}
			}
		}), Predicates.notNull());
		
	}
	
	/**
	 * Gets Exposer Required Plugins
	 * @param generator OSLC4EMF Exposer plugin generator
	 * @return Required Plugins ids
	 */
	public static Collection<String> getExposerRequiredPlugins(final OSLC4EMFExposerGenerator generator) {
		if (generator.getExposerRequiredPluginsContainer() == null) {
			return Collections.emptyList();
		}
		return Collections2.filter(Collections2.transform(generator.getExposerRequiredPluginsContainer().getRequiredPlugins(), new Function<RequiredPlugin, String>() {

			@Override
			public String apply(RequiredPlugin requiredPlugin) {
				if (requiredPlugin instanceof RequiredPluginFeature) {
					return transformFeatureIds(generator, requiredPlugin.getId());
				} else {
					return requiredPlugin.getId();
				}
			}
		}), Predicates.notNull());
	}
	
	/**
	 * Get the common required plugin
	 * @param generator OSLC4EMF Exposer generator
	 * @return Required plugins ids
	 */
	public static Collection<String> getCommonRequiredPlugins(final OSLC4EMFExposerGenerator generator) {
		if (generator.getRequiredPluginsContainer() == null) {
			return Collections.emptyList();
		}
		return Collections2.filter(Collections2.transform(generator.getRequiredPluginsContainer().getRequiredPlugins(), new Function<RequiredPlugin, String>() {

			@Override
			public String apply(RequiredPlugin requiredPlugin) {
				if (requiredPlugin instanceof RequiredPluginFeature) {
					return transformFeatureIds(generator, requiredPlugin.getId());
				} else {
					return requiredPlugin.getId();
				}
			}
		}), Predicates.notNull());
	}
	
	
	
	/**
	 * Gets the core Plugin Activator path
	 * @param generator OSLC4EMF Core plugin generator
	 * @return activator Path
	 */
	public static String getCoreActivatorPath(OSLC4EMFCoreGenerator generator) {
		return generator.getCorePluginId() + "." + Messages.GeneratorHandlerUtil_CoreActivatorName; //$NON-NLS-1$
	}
	
	/**
	 * Gets the Exposer Plugin Activator path
	 * @param generator OSLC4EMF Exposer generator
	 * @return activator Path
	 */
	public static String getExposerActivatorPath(OSLC4EMFExposerGenerator generator) {
		return generator.getExposerPluginId() + "." + Messages.GeneratorHandlerUtil_ExposerActivatorName; //$NON-NLS-1$
	}
	
	/**
	 * Gets the Common Plugin Activator path
	 * @param generator OSLC4EMF Exposer generator
	 * @return activator Path
	 */
	public static String getCommonActivatorPath(OSLC4EMFExposerGenerator generator) {
		return generator.getCommonPluginId() + "." + Messages.GeneratorHandlerUtil_CommonActivatorName; //$NON-NLS-1$
	}

	/**
	 * Gets export packages for Core plugin
	 * @param generator OSLC4EMF Core plugin generator
	 * @return Core plugin packages to export
	 */
	public static Collection<String> getCorePackagesToExport(final OSLC4EMFCoreGenerator generator) {
		if (generator.getPackagesExportContainer() == null) {
			return Collections.emptyList();
		}
		return Collections2.filter(Collections2.transform(generator.getPackagesExportContainer().getPackagesExport(), new Function<PackageExport, String>() {

			@Override
			public String apply(PackageExport packageExport) {
				if (packageExport instanceof PackageExportFeature) {
					String id = packageExport.getId();
					return transformFeatureIds(generator, id);
				} else {
					return packageExport.getId();
				}
			}
		}), Predicates.notNull());
	}

	/**
	 * Gets export packages for Exposer plugin
	 * @param generator OSLC4EMF Exposer generator
	 * @return Exposer plugin packages to export
	 */
	public static Collection<String> getExposerPackagesToExport(final OSLC4EMFExposerGenerator generator) {
		if (generator.getExposerPackagesExportContainer() == null) {
			return Collections.emptyList();
		}
		return Collections2.filter(Collections2.transform(generator.getExposerPackagesExportContainer().getPackagesExport(), new Function<PackageExport, String>() {

			@Override
			public String apply(PackageExport packageExport) {
				if (packageExport instanceof PackageExportFeature) {
					String id = packageExport.getId();
					return transformFeatureIds(generator, id);
				} else {
					return packageExport.getId();
				}
			}
		}), Predicates.notNull());
	}
	
	/**
	 * Gets export packages for Common plugin
	 * @param generator OSLC4EMF Exposer generator
	 * @return Common plugin packages to export
	 */
	public static Collection<String> getCommonPackagesToExport(final OSLC4EMFExposerGenerator generator) {
		if (generator.getPackagesExportContainer() == null) {
			return Collections.emptyList();
		}
		return Collections2.filter(Collections2.transform(generator.getPackagesExportContainer().getPackagesExport(), new Function<PackageExport, String>() {

			@Override
			public String apply(PackageExport packageExport) {
				if (packageExport instanceof PackageExportFeature) {
					String id = packageExport.getId();
					return transformFeatureIds(generator, id);
				} else {
					return packageExport.getId();
				}
			}
		}), Predicates.notNull());
	}
	
	/**
	 * retrieve values of feature element (element between {})
	 * @param generator the generator containing the values
	 * @param id the id to process
	 * @return id with feature elements replaced by their values
	 */
	private static String transformFeatureIds(final OSLC4EMFGenerator generator, String id) {
		
		List<String> ids = Lists.newArrayList(Splitter.on(".").split(id)); //$NON-NLS-1$
		Collection<String> result = new ArrayList<String>();
		for (String string : ids) {
			Matcher m = featurePattern.matcher(string);
			if (m.find()) {
				String group = m.group(1);
				EStructuralFeature feature = generator.eClass().getEStructuralFeature(group);
				if (feature != null) {
					Object value = generator.eGet(feature);
					if (value instanceof String) {
						result.add((String) value);
					}
				}
			} else {
				result.add(string);
			}
		}
		return Joiner.on(".").join(result); //$NON-NLS-1$
	}

	/**
	 * Gets Core plugin generator Maven dependencies
	 * @param generator OSLC4EMF Core Plugin generator
	 * @return Collection of mavenDependency (ref Adaptor Interface Generator MM http://org.eclipse.lyo/oslc4j/adaptorInterfaceGenerator)
	 */
	public static Collection<Dependency> getCoreMavenDependencies(OSLC4EMFCoreGenerator generator) {
		DependenciesContainer dependenciesContainer = generator.getDependenciesContainer();
		if (dependenciesContainer != null) {
			return dependenciesContainer.getDependencies();
		}
		return null;
	}
}
