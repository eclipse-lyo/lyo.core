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
import java.util.Iterator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Tree;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;

/**
 *	wizard page for Ecore Properties
 */
public class FillPropertiesPage extends WizardPage implements IRefresh {
	private Tree tree;
	private CheckboxTreeViewer checkboxTreeViewer;
	private WizardController controller;

	/**
	 * Create the wizard.
	 * @param controller 
	 */
	public FillPropertiesPage(WizardController controller) {
		super("Ecore Customisation");
		this.controller = controller;
		setTitle("Filtering");
		setDescription("Filter eclass, attributes and references");
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
		
		Group grpEcore = new Group(composite, SWT.NONE);
		grpEcore.setLayout(new GridLayout(2, false));
		grpEcore.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpEcore.setText("Ecore");
		checkboxTreeViewer = new CheckboxTreeViewer(grpEcore, SWT.BORDER | SWT.FULL_SELECTION);
		checkboxTreeViewer.addFilter(new ViewerFilter() {
			
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return element instanceof EPackage ||
						element instanceof EClass ||
						element instanceof EAttribute ||
						element instanceof EReference 
						;
			}
		});
		checkboxTreeViewer.setCheckStateProvider(controller);
		checkboxTreeViewer.addCheckStateListener(new ICheckStateListener() {
			
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				if (event.getElement() instanceof EObject){
					EObject eobject = (EObject) event.getElement();
					if (event.getChecked()){
						controller.setSelected (true, eobject);
					}
					else {
						controller.setSelected (false, eobject);
					}
				}
			}
		});
		checkboxTreeViewer.setLabelProvider(new AdapterFactoryLabelProvider(controller.getAdapterfactory()));
		checkboxTreeViewer.setContentProvider(new AdapterFactoryContentProvider(controller.getAdapterfactory()){
			@Override
			public Object[] getElements(Object object) {
				if (object instanceof Collection) {
					Collection<? extends Object> collec = (Collection<?>) object;
					return collec.toArray();
				}
				return super.getElements(object);
			}
		});
		tree = checkboxTreeViewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Composite composite_1 = new Composite(grpEcore, SWT.NONE);
		composite_1.setLayout(new GridLayout(1, false));
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		
		Button btnInvert = new Button(composite_1, SWT.NONE);
		btnInvert.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				check (new Predicate<EObject>() {
					@Override
					public boolean apply(EObject arg0) {
						return !controller.isChecked(arg0);
					}
				});
			}
		});
		btnInvert.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnInvert.setText("invert");
		
		Button btnSelectAll = new Button(composite_1, SWT.NONE);
		btnSelectAll.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				check (new Predicate<EObject>() {
					@Override
					public boolean apply(EObject arg0) {
						return true;
					}
				});
			}
		});
		btnSelectAll.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnSelectAll.setText("select all");
		
		checkboxTreeViewer.setInput(controller.getSelectedEPackages());
	}
	
	
	
	void check (Predicate<EObject> p){
		Iterator<EObject> toCheck = Iterators.emptyIterator();
		for (EPackage e : controller.getSelectedEPackages()){
			Iterator<EObject> i = e.eAllContents();
			toCheck = Iterators.concat(toCheck,i);
		}
		Iterator<EObject> i = toCheck;
		while (i.hasNext()){
			EObject next = i.next();
			controller.setSelected(p.apply(next), next);
		}
		checkboxTreeViewer.refresh();
	}

	@Override
	public void refresh() {
		checkboxTreeViewer.refresh();
		getContainer().updateMessage();
		getContainer().updateButtons();
	}
}
