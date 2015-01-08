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

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

/**
 * Adaptor Interface import wizard page
 */
public class ImportAIWizardPage extends WizardPage {
	
	private Text txtSource;
	private Text txtDestination;
	private WizardController controller;

	/**
	 * Create the wizard.
	 */
	public ImportAIWizardPage(WizardController controller) {
		super(Messages.ImportAIWizardPage_IMPORT_AI_PAGE_NAME);
		this.controller = controller;
		setTitle(Messages.ImportAIWizardPage_IMPORT_AI_PAGE_TITLE);
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(3, false));
		
		Label lblSource = new Label(container, SWT.NONE);
		lblSource.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSource.setText("Source :"); //$NON-NLS-1$
		
		txtSource = new Text(container, SWT.BORDER | SWT.READ_ONLY);
		txtSource.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		if (controller.getInputURI() != null){
			txtSource.setText(controller.getInputURI().toString());
		}
		
		Button btnSource = new Button(container, SWT.NONE);
		btnSource.setText("Browse"); //$NON-NLS-1$
		btnSource.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ResourceDialog dialog = new ResourceDialog(getShell(), Messages.ImportAIWizardPage_SELECT_AI_MSG, SWT.NONE);
				if (dialog.open() == ResourceDialog.OK) {
					if (dialog.getURIs().size() > 0){
						URI inputURI = dialog.getURIs().iterator().next();
						txtSource.setText(inputURI.toString());
						controller.setSource(inputURI);
					}
					else {
						txtSource.setText(""); //$NON-NLS-1$
					}
					refresh();
				}
			}
		});
		
		Label lblDestination = new Label(container, SWT.NONE);
		lblDestination.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDestination.setText("Destination :"); //$NON-NLS-1$
		
		txtDestination = new Text(container, SWT.BORDER | SWT.READ_ONLY);
		txtDestination.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		if (controller.getOutputURI() != null){
			txtDestination.setText(controller.getOutputURI().toString());
		}
		
		Button btnDestination = new Button(container, SWT.NONE);
		btnDestination.setText("Browse"); //$NON-NLS-1$
		btnDestination.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ContainerSelectionDialog dialog = new ContainerSelectionDialog(getShell(), ResourcesPlugin.getWorkspace().getRoot(), true, "Output Path"); //$NON-NLS-1$
				if (dialog.open() == ContainerSelectionDialog.OK){
					if (dialog.getResult().length > 0){
						IPath outputPath = (IPath) dialog.getResult()[0];
						txtDestination.setText(outputPath.toString());
						controller.setOutputURI(URI.createPlatformResourceURI(outputPath.toString(), true));
					}
					else {
						txtDestination.setText(""); //$NON-NLS-1$
					}
					refresh();
				}
			}
		});
		refresh();
	}
	

	public void refresh() {
		getContainer().updateMessage();
		getContainer().updateButtons();
	}
}
