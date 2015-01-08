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
package org.eclipse.lyo.oslc4j.adaptormodel.emf.ui.accelerator.wizards;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.ui.accelerator.wizards.PropertyBasedPage.Couple;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import com.google.common.collect.Lists;

/**
 * Accelerator Wizard
 */
public class InitGenFilesWizard extends Wizard implements INewWizard {

	private WizardController controller;

	public InitGenFilesWizard() {
		controller = new WizardController(this);
	}

	@Override
	public void addPages() {
		addPage(new SelectMetaModelsPage(controller));
		addPage(new FillPropertiesPage(controller));
		
		// CORE
		Collection<Couple> coreCouples =
				Lists.newArrayList(new PropertyBasedPage.Couple(WizardController.CORE_NAME, "name"),
									new PropertyBasedPage.Couple(WizardController.CORE_PLUGIN_ID, "core plugin id"),
									new PropertyBasedPage.Couple(WizardController.CORE_BASE_PACKAGE, "java base package")
						);
		addPage(new PropertyBasedPage(controller, "Core", coreCouples ));
		
		
		// EXPOSER
		Collection<Couple> exposerCouples =
				Lists.newArrayList(new PropertyBasedPage.Couple(WizardController.EXPOSER_NAME, "name"),
									new PropertyBasedPage.Couple(WizardController.EXPOSER_CORE_PLUGIN_ID, "core plugin id"),
									new PropertyBasedPage.Couple(WizardController.EXPOSER_CORE_BASE_PACKAGE, "core java base package"),
									new PropertyBasedPage.Couple(WizardController.COMMON_PLUGIN_ID, "common plugin id"),
									new PropertyBasedPage.Couple(WizardController.EXPOSER_PLUGIN_ID, "exposer plugin id"),
									new PropertyBasedPage.Couple(WizardController.EXPOSER_BASE_PACKAGE, "java base package")
						);
		addPage(new PropertyBasedPage(controller, "Exposer", exposerCouples ));
		
		
		
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		if (selection.getFirstElement() instanceof IContainer){
			IContainer cont = (IContainer) selection.getFirstElement();
			controller.setOutputPath(cont.getFullPath());
		}
	}
	
	@Override
	public boolean canFinish() {
		return controller.canFinish();
	}
	
	@Override
	public boolean performFinish() {
		try {
			if (validateOutputPath()){
				getContainer().run(false, true, new OSLC4EMFAcceleratorJob(controller));
			}
		} catch (InvocationTargetException e) {
			((WizardPage)getContainer().getCurrentPage()).setErrorMessage(e.getMessage());
			e.printStackTrace();
			return false;
		} catch (InterruptedException e) {
			((WizardPage)getContainer().getCurrentPage()).setErrorMessage(e.getMessage());
			e.printStackTrace();
			return false;
		}
		return true;
	}

	private boolean validateOutputPath() {
		IContainer container = getContainer (controller.getOutputPath());
		String fileName = controller.getGeneratorName() + ".ai";
		String fileNameAigen = controller.getGeneratorName() + ".aigen";
		IFile file = getFile(container, fileName);
		IFile fileGen = getFile(container, fileNameAigen);
		boolean result = true ;
		if ((file != null && file.exists()) || (fileGen != null && fileGen.exists())){
			result = false;
			if (MessageDialog.openQuestion(getShell(), "Warning", "Files with same name (" + controller.getGeneratorName() + ") already exist\nDo you want to delete files (ai and aigen) to continue the process ?")){
				if (file != null){
					try {
						file.delete(true, null);
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
				if (fileGen != null){
					try {
						fileGen.delete(true, null);
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
				result = true ;
			}
		}
		return result ;
	}

	private IFile getFile(IContainer container, String fileName) {
		try {
			for (IResource r : container.members()){
				if (r instanceof IFile) {
					IFile file = (IFile) r;
					if (file.getName().equalsIgnoreCase(fileName)){
						return file;
					}
				}
			}
		} catch (CoreException e) {
		}
		return null;
	}

	private IContainer getContainer(IPath outputPath) {
		if (outputPath.segmentCount() == 1){
			return ResourcesPlugin.getWorkspace().getRoot().getProject(outputPath.toString());
		}
		else {
			return ResourcesPlugin.getWorkspace().getRoot().getFolder(outputPath);
		}
	}

}
