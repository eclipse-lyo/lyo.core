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
import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

/**
 * Accelerator wizard controller
 */
public class WizardController implements ICheckStateProvider {

	public static final String CORE_PLUGIN_ID = "CORE_PLUGIN_ID";
	public static final String CORE_BASE_PACKAGE = "CORE_BASE_PACKAGE";
	public static final String CORE_NAME = "NAME";
	public static final String COMMON_PLUGIN_ID = "COMON_PLUGIN_ID";
	public static final String EXPOSER_PLUGIN_ID = "EXPOSER_PLUGIN_ID";
	public static final String EXPOSER_CORE_PLUGIN_ID = "EXPOSER_CORE_PLUGIN_ID";
	public static final String EXPOSER_BASE_PACKAGE = "EXPOSER_BASE_PACKAGE";
	public static final String EXPOSER_CORE_BASE_PACKAGE = "EXPOSER_CORE_BASE_PACKAGE";
	public static final String EXPOSER_NAME = "EXPOSER_NAME";
	
	
	private AdapterFactory adapterfactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	AdapterFactoryEditingDomain domain = new AdapterFactoryEditingDomain(adapterfactory , new BasicCommandStack());
	private Collection<EPackage> epackages = Sets.newHashSet();
	private Collection<EPackage> selectedEPackages = Sets.newHashSet();
	private Map<EObject, Boolean> mapOfSelection = Maps.newHashMap();
	private Map<String, String> values = Maps.newHashMap();
	
	
	private IWizard initGenFilesWizard;
	private IPath outputPath;
	private String generatorName;
	private String nsPrefix;
	private String nsURI;

	public String getNsPrefix() {
		return nsPrefix;
	}

	public void setNsPrefix(String nsPrefix) {
		this.nsPrefix = nsPrefix;
	}

	public IPath getOutputPath() {
		return outputPath;
	}

	public WizardController(IWizard initGenFilesWizard) {
		this.initGenFilesWizard = initGenFilesWizard;
	}

	public Collection<EPackage> getEPackages() {
		return epackages ;
	}
	
	public void refreshEcores() {
		for (IWizardPage currentPage : initGenFilesWizard.getPages()){
			if (currentPage instanceof IRefresh){
				((IRefresh)currentPage).refresh();
			}
		}
	}

	public void addSelectedEPackage(EPackage ePackage) {
		selectedEPackages.add(ePackage);
	}

	public void removeSelectedEPackage(EPackage ePackage) {
		selectedEPackages.remove(ePackage);
	}

	public AdapterFactory getAdapterfactory() {
		return adapterfactory;
	}

	public AdapterFactoryEditingDomain getDomain() {
		return domain;
	}

	public Collection<EPackage> getSelectedEPackages() {
		return selectedEPackages;
	}

	public void setOutputPath(IPath outputPath) {
		this.outputPath = outputPath;
		
	}

	public void setSelected(boolean isSelected, EObject eobject) {
		mapOfSelection.put(eobject, isSelected);
	}

	@Override
	public boolean isChecked(Object element) {
		Boolean result = mapOfSelection.get(element);
		if (result == null || result){
			return true ;
		}
		return false;
	}

	@Override
	public boolean isGrayed(Object element) {
		return element instanceof EPackage;
	}

	public boolean canFinish() {
		return selectedEPackages.size() > 0
				&& outputPath != null 
				&& generatorName != null && generatorName.length() > 0
				&& nsPrefix != null && nsPrefix.length() > 0
				&& noNullPropertyValues();
	}

	private boolean noNullPropertyValues() {
		return !values.values().contains(null);
	}

	public void setProperty(String key, String text) {
		values.put(key, text);
	}
	
	public String getProperty (String key){
		return values.get(key);
	}

	public void setGeneratorName(String text) {
		this.generatorName = text ;
	}
	
	public String getGeneratorName (){
		return generatorName;
	}

	public String getNsURI() {
		return nsURI;
	}

	public void setNsURI(String nsURI) {
		this.nsURI= nsURI;
	}
	
	
}
