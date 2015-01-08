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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;

/**
 *	Custom Ecore Adaptor Factory to call customEAttributeItemProvider instead of the original one
 */
public class CustomEcoreItemProviderAdapterFactory extends
		EcoreItemProviderAdapterFactory {

	@Override
	public Adapter createEAttributeAdapter() {
		if (eAttributeItemProvider == null) {
			eAttributeItemProvider = new CustomEAttributeItemProvider(this);
		}
		return eAttributeItemProvider;
	}
	
}
