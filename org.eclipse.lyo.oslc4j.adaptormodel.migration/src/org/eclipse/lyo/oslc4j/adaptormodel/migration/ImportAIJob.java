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
package org.eclipse.lyo.oslc4j.adaptormodel.migration;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterface;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterfaceFactory;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorContainer;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorFactory;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptormanagergenerator.AdaptorManagerGeneratorFactory;

/**
 * Job to create an ai and aigen models from former adaptorInterface model
 */
public class ImportAIJob implements IRunnableWithProgress {

	private static final String JAVASCRIPT_FILES_BASE_PATH = "javascriptFilesBasePath"; //$NON-NLS-1$
	private static final String JSP_FILES_BASE_PATH = "jspFilesBasePath"; //$NON-NLS-1$
	private static final String JAVA_FILES_BASE_PATH = "javaFilesBasePath"; //$NON-NLS-1$
	private static final String JAVA_CLASS_BASE_NAMESPACE = "javaClassBaseNamespace"; //$NON-NLS-1$
	private WizardController controller;
	private MultiStatus topLog = new MultiStatus(Activator.PLUGIN_ID, IStatus.WARNING, "OSLC4J", null); //$NON-NLS-1$
	private ResourceSetImpl set = new ResourceSetImpl();

	public ImportAIJob(WizardController controller) {
		this.controller = controller;
	}

	@Override
	public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		try {
			monitor.beginTask(Messages.ImportAIJob_IMPORT_TASK_NAME, 1);

			//Disable errors on feature not found
			set.getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, true);
			Resource resource = set.getResource(controller.getInputURI(), true);
			EList<EObject> contents = resource.getContents();
			AdaptorInterface formerAI = getAdaptorInterface(contents);
			
			if (formerAI == null) {
				log(Messages.ImportAIJob_AI_NOT_FOUND_ERROR_MSG);
				throw new InterruptedException("error"); //$NON-NLS-1$
			}
			
			//adaptor interface
			new SubProgressMonitor(monitor, 1);
			AdaptorInterface newAI = aiGeneration(formerAI);
			checkCancel(monitor);

			//adaptor interface generator
			new SubProgressMonitor(monitor, 1);
			AdaptorInterfaceGeneratorContainer container = aiGenGeneration(resource, formerAI, newAI);
			checkCancel(monitor);

			save(newAI, container);

			// refresh
			try {
				if (controller.getOutputURI().segmentCount() == 1) {
					ResourcesPlugin.getWorkspace().getRoot().getProject(controller.getOutputURI().toString())
							.refreshLocal(IResource.DEPTH_ONE, null);
				} else {
					ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(controller.getOutputURI().path()))
							.refreshLocal(IResource.DEPTH_ONE, null);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		} finally {
			flushLog();
		}
	}

	private AdaptorInterfaceGeneratorContainer aiGenGeneration(Resource resource, AdaptorInterface formerAI,
			AdaptorInterface newAI) {
		AdaptorInterfaceGeneratorContainer result = AdaptorInterfaceGeneratorFactory.eINSTANCE
				.createAdaptorInterfaceGeneratorContainer();
		AdaptorManagerGenerator amgen = AdaptorManagerGeneratorFactory.eINSTANCE.createAdaptorManagerGenerator();
		result.getGenerator().add(amgen);
		amgen.setAdaptorInterface(newAI);
		amgen.setName(newAI.getName());
		amgen.setApplicationName(newAI.getName());
		//retrieve adaptor interface former feature on the xmi ressource
		if (resource instanceof XMIResource) {
			XMIResource xmiresource = (XMIResource) resource;
			//search in unrecognized feature
			Map<EObject, AnyType> exMap = xmiresource.getEObjectToExtensionMap();
			AnyType get = exMap.get(formerAI);
			FeatureMap anyAttribute = get.getAnyAttribute();
			for (Entry entry : anyAttribute) {
				String featureName = entry.getEStructuralFeature().getName();
				switch (featureName) {
				case JAVA_CLASS_BASE_NAMESPACE:
					amgen.setJavaClassBaseNamespace(entry.getValue().toString());
					break;
				case JAVA_FILES_BASE_PATH:
					amgen.setJavaFilesBasePath(entry.getValue().toString());
					break;
				case JSP_FILES_BASE_PATH:
					amgen.setJspFilesBasePath(entry.getValue().toString());
					amgen.setWebApplicationBasePath(entry.getValue().toString());
					break;
				case JAVASCRIPT_FILES_BASE_PATH:
					amgen.setJavascriptFilesBasePath(entry.getValue().toString());
					break;
				default:
					break;
				}
			}
		}
		return result;
	}

	/**
	 * Return a copy of former adaptor interface without unknow features
	 * @param formerAI the former Adaptor Interface
	 * @return the new Adaptor Interface
	 */
	private AdaptorInterface aiGeneration(AdaptorInterface formerAI) {
		AdaptorInterface ai = AdaptorInterfaceFactory.eINSTANCE.createAdaptorInterface();
		ai.setName(formerAI.getName());
		Copier copier = new EcoreUtil.Copier();
		AdaptorInterface copy = (AdaptorInterface)copier.copy(formerAI);
		copier.copyReferences();
		ai.setServiceProviderCatalog(copy.getServiceProviderCatalog());
		ai.setSpecification(copy.getSpecification());
		return ai;
	}

	/**
	 * Checks if the used pressed cancel button
	 * @param monitor
	 * @throws InterruptedException
	 */
	private void checkCancel(IProgressMonitor monitor) throws InterruptedException {
		if (monitor.isCanceled()) {
			throw new InterruptedException("cancel by user"); //$NON-NLS-1$
		}
	}

	private void flushLog() {
		if (topLog.getChildren().length > 0) {
			Activator.getDefault().getLog().log(topLog);
		}
	}

	private void log(String message) {
		topLog.add(new Status(IStatus.WARNING, Activator.PLUGIN_ID, message));
	}

	/**
	 * Save the ai and aigen models
	 * @param adaptor the adaptor interface element (saved in ai file)
	 * @param container the adaptor interface generator container element (saved in aigen file)
	 */
	private void save(AdaptorInterface adaptor, AdaptorInterfaceGeneratorContainer container) {
		URI baseURI = controller.getOutputURI().appendSegment(
				controller.getInputURI().trimFileExtension().lastSegment());
		Resource aiRes = set.createResource(baseURI.appendFileExtension(Messages.ImportAIJob_AI_EXTENSION));
		aiRes.getContents().add(adaptor);
		Resource aiGenRes = set.createResource(baseURI.appendFileExtension(Messages.ImportAIJob_AIGEN_EXTENSION));
		aiGenRes.getContents().add(container);
		try {
			aiRes.save(Collections.emptyMap());
			aiGenRes.save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Gets the adaptor interface from a list of object
	 * @param contents
	 * @return
	 */
	private AdaptorInterface getAdaptorInterface(EList<EObject> contents) {
		for (EObject eObject : contents) {
			if (eObject instanceof AdaptorInterface) {
				return (AdaptorInterface) eObject;
			}
		}
		return null;
	}

}
