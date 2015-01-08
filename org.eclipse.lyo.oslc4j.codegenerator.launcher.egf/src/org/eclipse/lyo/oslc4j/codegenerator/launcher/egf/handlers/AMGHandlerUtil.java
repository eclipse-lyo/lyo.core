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
package org.eclipse.lyo.oslc4j.codegenerator.launcher.egf.handlers;

import java.util.Collection;

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
import org.eclipse.egf.model.types.TypeString;
import org.eclipse.egf.model.types.TypeURI;
import org.eclipse.egf.producer.EGFProducerPlugin;
import org.eclipse.egf.producer.manager.ActivityManagerProducer;
import org.eclipse.egf.producer.manager.IActivityManager;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;

/**
 * Utils Methods for Adaptor Manager Generator
 */
public class AMGHandlerUtil {

	/**
	 * Get an activity by name from a fcore fire
	 * @param fcoreURI fcore file uri
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
		{
			try {
				invoke(activity, jobName);
				return true;
			} catch (MissingExtensionException e) {
				e.printStackTrace();
			} catch (InvocationException e) {
				e.printStackTrace();
			} catch (CoreException e) {
				e.printStackTrace();
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
		Job job = new Job(jobName) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				Status status = null;
				try {
					Diagnostic diagnostic = activityManager.invoke(monitor);
					activityManager.dispose();
					if (diagnostic != null && diagnostic.getSeverity() != Diagnostic.OK) {
						status = new Status(diagnostic.getSeverity(), diagnostic.getSource(), diagnostic.getMessage());
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
	
}
