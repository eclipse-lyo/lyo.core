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
package org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.provider.EAttributeItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

/**
 * Add the parent name to the eattribute
 */
public class CustomEAttributeItemProvider extends EAttributeItemProvider {

	public CustomEAttributeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public String getText(Object object) {
		if (object instanceof EObject && ((EObject)object).eContainer() != null) {
			IItemLabelProvider labelProvider = (IItemLabelProvider)adapterFactory.adapt(((EObject)object).eContainer(), IItemLabelProvider.class);
			return  labelProvider.getText(((EObject)object).eContainer()) + "." + super.getText(object);
		}
		return super.getText(object);
	}

}
