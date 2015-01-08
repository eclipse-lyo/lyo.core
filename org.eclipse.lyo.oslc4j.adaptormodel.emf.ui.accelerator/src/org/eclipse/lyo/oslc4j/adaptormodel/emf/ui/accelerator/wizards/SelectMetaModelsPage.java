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

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.presentation.EcoreActionBarContributor.ExtendedLoadResourceAction.ExtendedLoadResourceDialog;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

/**
 * Wizard Page to select the meta models used by the accelerator
 */
public class SelectMetaModelsPage extends WizardPage {
	
	private Table table;
	private WizardController controller;
	private CheckboxTableViewer checkboxTableViewer;
	private Text outputPath;
	private Text textGenName;
	private Text nsPrefixText;
	private Text nsURIText;
	
	/**
	 * Create the wizard.
	 */
	public SelectMetaModelsPage(WizardController controller) {
		super("Select ecore");
		this.controller = controller;
		setTitle("OSLC4EMF");
		setDescription("Generate a generator from ecore models");
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite = new Composite(container, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		
		Group grpLocation = new Group(composite, SWT.NONE);
		grpLocation.setLayout(new GridLayout(3, false));
		grpLocation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpLocation.setText("Location");
		
		Label lblGeneratorName = new Label(grpLocation, SWT.NONE);
		lblGeneratorName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblGeneratorName.setText("adaptor interface name : ");
		
		textGenName = new Text(grpLocation, SWT.BORDER);
		textGenName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		textGenName.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				controller.setGeneratorName(textGenName.getText());
			}
		});
		
		Label lblNamespacePrefix = new Label(grpLocation, SWT.NONE);
		lblNamespacePrefix.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNamespacePrefix.setText("namespace prefix : ");
		
		nsPrefixText = new Text(grpLocation, SWT.BORDER);
		nsPrefixText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				controller.setNsPrefix(nsPrefixText.getText());
			}
		});
		nsPrefixText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		
		Label lblNamespaceURI = new Label(grpLocation, SWT.NONE);
		lblNamespaceURI.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNamespaceURI.setText("namespace URI : ");
		
		nsURIText = new Text(grpLocation, SWT.BORDER);
		nsURIText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				controller.setNsURI(nsURIText.getText());
			}
		});
		nsURIText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		
		Label lblOutputPath = new Label(grpLocation, SWT.NONE);
		lblOutputPath.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblOutputPath.setText("output path : ");
		
		outputPath = new Text(grpLocation, SWT.BORDER | SWT.READ_ONLY);
		outputPath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		if (controller.getOutputPath() != null){
			outputPath.setText(controller.getOutputPath().toString());
		}
		
		Button btnBrowse = new Button(grpLocation, SWT.NONE);
		btnBrowse.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ContainerSelectionDialog dialog = new ContainerSelectionDialog(getShell(), ResourcesPlugin.getWorkspace().getRoot(), true, "Output Path");
				if (dialog.open() == ContainerSelectionDialog.OK){
					if (dialog.getResult().length > 0){
						Path outputPath2 = (Path) dialog.getResult()[0];
						controller.setOutputPath (outputPath2);
						outputPath.setText(outputPath2.toString());
					}
					else {
						outputPath.setText("");
					}
				}
			}
		});
		btnBrowse.setText("Browse");
		
		Group grpSelectedEcore = new Group(composite, SWT.NONE);
		grpSelectedEcore.setLayout(new GridLayout(1, false));
		grpSelectedEcore.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpSelectedEcore.setText("Selected Ecore");
		
		Composite composite_1 = new Composite(grpSelectedEcore, SWT.NONE);
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		composite_1.setLayout(new GridLayout(2, false));
		
		checkboxTableViewer = CheckboxTableViewer.newCheckList(composite_1, SWT.BORDER | SWT.FULL_SELECTION);
		checkboxTableViewer.setLabelProvider(new AdapterFactoryLabelProvider(controller.getAdapterfactory()){
			@Override
			public String getColumnText(Object object, int columnIndex) {
				String result = super.getColumnText(object, columnIndex);
				if (object instanceof EPackage) {
					EPackage ep = (EPackage) object;
					result += " - " + ep.getNsURI();
				}
				return result;
			}
		});
		checkboxTableViewer.setContentProvider(ArrayContentProvider.getInstance());
		table = checkboxTableViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Composite composite_2 = new Composite(composite_1, SWT.NONE);
		composite_2.setLayout(new FillLayout(SWT.VERTICAL));
		composite_2.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		
		Button btnAdd = new Button(composite_2, SWT.NONE);
		btnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//ExtendedLoadResourceDialog need an ecore resource at the editing domain resource set
				controller.getDomain().getResourceSet().getResources().add(new XMIResourceImpl(URI.createPlatformResourceURI("temp.ecore",true)));
				ExtendedLoadResourceDialog loadResourceDialog =
				        new ExtendedLoadResourceDialog(getShell(), controller.getDomain());
				if (loadResourceDialog.open() == ExtendedLoadResourceDialog.OK){
					for (URI uri : loadResourceDialog.getURIs()){
						controller.getDomain().getResourceSet().getResource(uri, true);
					}
					updateEPackages();
					refresh();
					
				}
			}
		});
		btnAdd.setText("add");
		
		Button btnNewButton = new Button(composite_2, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				for (EPackage ep : controller.getEPackages()){
					EcoreUtil.resolveAll(ep);
				}
				updateEPackages();
				refresh();
			}
		});
		btnNewButton.setText("resolve all");
		
		checkboxTableViewer.addCheckStateListener(new ICheckStateListener() {
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				if (event.getChecked()){
					controller.addSelectedEPackage(((EPackage)event.getElement()));
				}
				else {
					controller.removeSelectedEPackage(((EPackage)event.getElement()));
				}
				refresh();
			}
		});
		
		// inputs
		checkboxTableViewer.setInput(controller.getEPackages());
	}

	protected void updateEPackages() {
		for (Resource r : controller.getDomain().getResourceSet().getResources()){
			for (EObject eo : r.getContents()){
				if (eo instanceof EPackage) {
					EPackage ep = (EPackage) eo;
					if (!controller.getEPackages().contains(ep)){
						controller.getEPackages().add(ep);
					}
				}
			}
		}
	}

	private void refresh() {
		checkboxTableViewer.refresh();
		controller.refreshEcores();
		getContainer().updateMessage();
		getContainer().updateButtons();
	}
	
	@Override
	public boolean canFlipToNextPage() {
		return super.canFlipToNextPage() && controller.getSelectedEPackages().size() != 0;
	}
}
