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

import java.util.Collection;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * Wizard Page for generator properties
 */
public class PropertyBasedPage extends WizardPage {
	private String groupName;
	private Collection<Couple> keyAndLabel;
	private WizardController controller;

	public static class Couple {
		protected String label; 
		protected String key; 
		public Couple (String key, String label){
			this.key = key;
			this.label = label;
		}
	}
	
	protected PropertyBasedPage(WizardController controller, String groupName, Collection<Couple> keyAndLabel) {
		super("Properties");
		this.controller = controller;
		this.keyAndLabel = keyAndLabel;
		this.groupName = groupName;
		setTitle("Properties");
		setDescription("Please fill values");
	}

	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Group group = new Group(container, SWT.NONE);
		group.setLayout(new GridLayout(1, false));
		group.setText(groupName);
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(group, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		Composite composite = new Composite(scrolledComposite, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		
		for (Couple c : keyAndLabel){
			createProperty(composite, c.key, c.label);
		}
		
		scrolledComposite.setContent(composite);
		scrolledComposite.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}
	
	void createProperty (Composite c, final String key, String label) {
		Label lblTest = new Label(c, SWT.NONE);
		lblTest.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTest.setText(label + " : ");
		
		final Text text = new Text(c, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		text.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				controller.setProperty (key, text.getText());
				getContainer().updateButtons();
				getContainer().updateMessage();
			}
		});
		controller.setProperty(key, null);
	}
}
