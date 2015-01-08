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

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ICheckStateProvider;

/**
 * Adaptor Interface Import Wizard Controller
 */
public class WizardController implements ICheckStateProvider {

	private URI inputURI;
	private URI outputURI;

	public WizardController(ImportAIWizard importAI) {
	}

	@Override
	public boolean isChecked(Object element) {
		return false;
	}

	@Override
	public boolean isGrayed(Object element) {
		return false;
	}

	public void setSource(URI outputURI) {
		this.inputURI = outputURI;
	}

	public void setOutputURI(URI outputURI) {
		this.outputURI = outputURI;
	}

	public URI getInputURI() {
		return inputURI;
	}
	
	public URI getOutputURI() {
		return outputURI;
	}

	public boolean canFinish() {
		return inputURI != null && !inputURI.isEmpty() && outputURI != null && !outputURI.isEmpty();
	}
	
	
}
