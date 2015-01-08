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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

/**
 * Adaptor Interface import wizard
 */
public class ImportAIWizard extends Wizard implements IImportWizard {

	private WizardController controller;

	public ImportAIWizard() {
		controller = new WizardController(this);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		if (selection.getFirstElement() instanceof IFile){
			IFile cont = (IFile) selection.getFirstElement();
			controller.setSource(URI.createPlatformResourceURI(cont.getFullPath().toString(), true));
			controller.setOutputURI(URI.createPlatformResourceURI(cont.getParent().getFullPath().toString(), true));
		}
	}
	
	@Override
	public void addPages() {
		addPage(new ImportAIWizardPage(controller));
	}

	@Override
	public boolean canFinish() {
		return controller.canFinish();
	}
	
	@Override
	public boolean performFinish() {
		try {
			if (validateOutputPath()){
				getContainer().run(false, true, new ImportAIJob(controller));
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
		IContainer container = getContainer(controller.getOutputURI());
		String sourceFileName = controller.getInputURI().trimFileExtension().lastSegment();
		String fileName = sourceFileName + Messages.ImportAIWizard_AI_FILE_EXTENSION;
		String fileNameAigen = sourceFileName + Messages.ImportAIWizard_AIGEN_FILE_EXTENSION;
		IFile file = getFile(container, fileName);
		IFile fileGen = getFile(container, fileNameAigen);
		boolean result = true ;
		if ((file != null && file.exists()) || (fileGen != null && fileGen.exists())){
			result = false;
			if (MessageDialog.openQuestion(getShell(), "Warning", "Files with same name (" + sourceFileName + ") already exist\nDo you want to delete files (ai and aigen) to continue the process ?")){ //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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

	private IContainer getContainer(URI outputURI) {
		if (outputURI.segmentCount() == 1){
			return ResourcesPlugin.getWorkspace().getRoot().getProject(outputURI.toString());
		}
		else {
			return ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(outputURI.path()));
		}
	}
	
}
