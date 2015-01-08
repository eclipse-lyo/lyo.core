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

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterface;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.AdaptorInterfaceFactory;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.BasicCapability;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Dialog;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.DomainSpecification;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.NamespacePrefix;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Publisher;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.QueryCapability;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceProperty;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyOccurs;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourcePropertyValueType;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ResourceServiceNamespace;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Service;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProvider;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.ServiceProviderCatalog;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Specification;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorContainer;
import org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterfacegenerator.AdaptorInterfaceGeneratorFactory;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EClassMapping;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.EStructuralFeatureMapping;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFCoreGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFExposerGenerator;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.oslc4emfgenerator.OSLC4EMFgeneratorFactory;
import org.eclipse.lyo.oslc4j.adaptormodel.emf.ui.accelerator.Activator;

import com.google.common.base.Predicate;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;

/**
 * Accelerator Job
 */
public class OSLC4EMFAcceleratorJob implements IRunnableWithProgress {

	private static final String IDENTIFIER_NAME = "identifier";
	private WizardController controller;
	Multimap<EObject, EObject> objectsCreated = HashMultimap.create();
	private MultiStatus topLog = new MultiStatus(Activator.PLUGIN_ID, IStatus.WARNING, "OSLC4EMF", null);
	private AdaptorInterface adaptorInterface;
	
	public OSLC4EMFAcceleratorJob(WizardController controller) {
		this.controller = controller;
	}

	@SuppressWarnings("unchecked")
	public <T> T get (EObject o, Class<T> clazz){
		Collection<EObject> list = objectsCreated.get(o);
		for (EObject e : list){
			if (clazz.isInstance(e)){
				return (T) e;
			}
		}
		return null;
	}
	
	private void flushLog (){
		if (topLog.getChildren().length > 0){
			Activator.getDefault().getLog().log(topLog);
		}
	}
	
	private void log (String message){
		topLog.add(new Status(IStatus.WARNING, Activator.PLUGIN_ID, message));
	}
	
	@Override
	public void run(IProgressMonitor monitor) throws InvocationTargetException,
			InterruptedException {
		try {
			monitor.beginTask("OSLC4EMF generation", 2);
			
			// AI file generation
			SubProgressMonitor sub = new SubProgressMonitor(monitor, 1);
			adaptorInterface = aiGeneration(sub);
			if (adaptorInterface == null){
				throw new InterruptedException("error");
			}
			checkCancel(monitor);
			
			// AIGen file generation
			SubProgressMonitor sub2 = new SubProgressMonitor(monitor, 1);
			AdaptorInterfaceGeneratorContainer container = aiGenGeneration (sub2);
			checkCancel(monitor);
			
			// save model
			save (adaptorInterface,container);
			
			// refresh
			try {
				if (controller.getOutputPath().segmentCount() == 1){
					ResourcesPlugin.getWorkspace().getRoot().getProject(controller.getOutputPath().toString()).refreshLocal(IResource.DEPTH_ONE, null);
				}
				else {
					ResourcesPlugin.getWorkspace().getRoot().getFolder(controller.getOutputPath()).refreshLocal(IResource.DEPTH_ONE, null);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		finally {
			flushLog();
		}
	}

	private void checkCancel(IProgressMonitor monitor)
			throws InterruptedException {
		if (monitor.isCanceled()){
			throw new InterruptedException("cancel by user");
		}
	}

	private void save(AdaptorInterface adaptor,
			AdaptorInterfaceGeneratorContainer container) {
		ResourceSetImpl set = new ResourceSetImpl();
		URI baseURI = URI.createPlatformResourceURI(controller.getOutputPath().toString(), true).appendSegment(controller.getGeneratorName());
		Resource aiRes = set.createResource(baseURI.appendFileExtension("ai"));
		aiRes.getContents().add(adaptor);
		Resource aiGenRes = set.createResource(baseURI.appendFileExtension("aigen"));
		aiGenRes.getContents().add(container);
		try {
			aiRes.save(Collections.emptyMap());
			aiGenRes.save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private AdaptorInterfaceGeneratorContainer aiGenGeneration(
			IProgressMonitor monitor) throws InterruptedException {
		AdaptorInterfaceGeneratorContainer result = AdaptorInterfaceGeneratorFactory.eINSTANCE.createAdaptorInterfaceGeneratorContainer();
		
		OSLC4EMFCoreGenerator coreGenerator = coreGenerator();
		if (coreGenerator != null){
			result.getGenerator().add(coreGenerator);
		}
		checkCancel(monitor);
		
		OSLC4EMFExposerGenerator exposerGenerator = exposerGenerator();
		if (exposerGenerator != null){
			result.getGenerator().add(exposerGenerator);
		}
		checkCancel(monitor);
		
		return result;
	}

	private OSLC4EMFExposerGenerator exposerGenerator() {
		OSLC4EMFExposerGenerator result = OSLC4EMFgeneratorFactory.eINSTANCE.createOSLC4EMFExposerGenerator();
		result.setExposerPluginId(controller.getProperty(WizardController.EXPOSER_PLUGIN_ID));
		result.setCoreBasePackage(controller.getProperty(WizardController.EXPOSER_CORE_BASE_PACKAGE));
		result.setCommonPluginId(controller.getProperty(WizardController.COMMON_PLUGIN_ID));
		result.setCorePluginId(controller.getProperty(WizardController.EXPOSER_CORE_PLUGIN_ID));
		result.setBasePackage(controller.getProperty(WizardController.EXPOSER_BASE_PACKAGE));
		result.setName(controller.getProperty(WizardController.EXPOSER_NAME));
		result.setAdaptorInterface(adaptorInterface);
		result.getResourceMappings().addAll(getMappings(result));
		return result;
	}

	private OSLC4EMFCoreGenerator coreGenerator() {
		OSLC4EMFCoreGenerator result = OSLC4EMFgeneratorFactory.eINSTANCE.createOSLC4EMFCoreGenerator();
		result.setCorePluginId(controller.getProperty(WizardController.CORE_PLUGIN_ID));
		result.setBasePackage(controller.getProperty(WizardController.CORE_BASE_PACKAGE));
		result.setName(controller.getProperty(WizardController.CORE_NAME));
		result.setAdaptorInterface(adaptorInterface);
		return result;
	}
	
	private Collection<EClassMapping> getMappings (AdaptorInterfaceGenerator generator){
		Collection<EClassMapping> mappings = Lists.newArrayList();
		for (EPackage ep : controller.getSelectedEPackages()){
			for (EClass e : getSelectedClassifiers(ep)){
				org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Resource r = get(e, org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Resource.class);
				if (r != null){
					EClassMapping mapping = OSLC4EMFgeneratorFactory.eINSTANCE.createEClassMapping();
					mapping.setEClass(e);
					mapping.setResource(r);
					mapping.getResourcePropertyMappings().addAll(getMappings(r, e));
					mappings.add(mapping);
				}
			}
		}
		return mappings;
	}
	
	private Collection<EStructuralFeatureMapping> getMappings (org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Resource r, EClass eclass){
		Collection<EStructuralFeatureMapping> mappings = Lists.newArrayList();
		int nbId = 0;
		for (EStructuralFeature f : getSelectedFeatures(eclass)){
			if (f instanceof EAttribute) {
				EAttribute att = (EAttribute) f;
				if (att.isID()){
					nbId ++;
					if (nbId == 1){
						ResourceProperty identifier = getIdentifier(f);
						if (identifier != null){
							EStructuralFeatureMapping mapping = OSLC4EMFgeneratorFactory.eINSTANCE.createEStructuralFeatureMapping();
							mapping.setEStructuralFeature(f);
							mapping.setResourceProperty(identifier);
							mappings.add(mapping);
						}
					}
					else {
						log("several ids in eclass " + f.getEContainingClass().getName() + " : this is not currently managed");
					}
				}
			}
			ResourceProperty p = get(f, ResourceProperty.class);
			if (p != null){
				EStructuralFeatureMapping mapping = OSLC4EMFgeneratorFactory.eINSTANCE.createEStructuralFeatureMapping();
				mapping.setEStructuralFeature(f);
				mapping.setResourceProperty(p);
				mappings.add(mapping);
			}
		}
		return mappings;
	}

	private ResourceProperty getIdentifier(EStructuralFeature f) {
		org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Resource  r = get(f.eContainer(), org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Resource.class);
		if (r != null){
			for (ResourceProperty p : r.getResourceProperties()){
				if (p.getName().equals(IDENTIFIER_NAME)){
					return p;
				}
			}
		}
		return null;
	}

	private AdaptorInterface aiGeneration(IProgressMonitor monitor) throws InterruptedException {
		AdaptorInterface result = AdaptorInterfaceFactory.eINSTANCE.createAdaptorInterface();
		result.setName(controller.getGeneratorName());
		monitor.beginTask("ai", 2);
		
		// specification
		SubProgressMonitor sub = new SubProgressMonitor(monitor, 1);
		result.setSpecification(specification(sub));
		checkCancel(monitor);
		
		// service provider catalog
		sub = new SubProgressMonitor(monitor, 1);
		result.setServiceProviderCatalog(serviceProviderCatalog(sub));
		
		return result;
	}

	private ServiceProviderCatalog serviceProviderCatalog(IProgressMonitor monitor) {
		ServiceProviderCatalog catalog = AdaptorInterfaceFactory.eINSTANCE.createServiceProviderCatalog();
		catalog.setTitle(controller.getGeneratorName() + " OSLC Service Provider Catalog");
		
		Publisher publisher = AdaptorInterfaceFactory.eINSTANCE.createPublisher();
		publisher.setIdentifier(controller.getGeneratorName().trim() + ".oslc.generator");
		publisher.setTitle("OSLC Catalog");
		catalog.setPublisher(publisher);

		
		Collection<EPackage> epackages = controller.getSelectedEPackages();
		monitor.beginTask("service creation", epackages.size());
		for (EPackage e : epackages){
			for(EClass eclass : getSelectedClassifiers(e)){
				ServiceProvider sp = serviceProvider (eclass);
				if (sp != null){
					catalog.getServiceProviders().add(sp);
				}
			}
			monitor.worked(1);
		}
		
		return catalog;
	}

	private Iterable<EClass> getSelectedClassifiers(EPackage e) {
		return Iterables.filter(Iterables.filter(e.getEClassifiers(), EClass.class), new Predicate<EClass>() {
			@Override
			public boolean apply(EClass eclass) {
				return controller.isChecked(eclass);
			}
		});
	}

	private ServiceProvider serviceProvider(EClass eclass) {
		ServiceProvider provider = AdaptorInterfaceFactory.eINSTANCE.createServiceProvider();
		provider.setTitle(eclass.getName());
		Publisher publisher = AdaptorInterfaceFactory.eINSTANCE.createPublisher();
		publisher.setIdentifier("urn:oslc:ServiceProvider");
		provider.setPublisher(publisher);
		
		Service service = service (eclass);
		if (service != null){
			provider.getServices().add(service);
		}
		
		objectsCreated.put(eclass, provider);
		return provider;
	}

	private Service service(EClass eclass) {
		Service service = AdaptorInterfaceFactory.eINSTANCE.createService();
		DomainSpecification ds = get(eclass, DomainSpecification.class);
		service.setDomainSpecification(ds);
		
		org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Resource r = get(eclass, org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Resource.class);
		
		QueryCapability qc = AdaptorInterfaceFactory.eINSTANCE.createQueryCapability();
		qc.setTitle(eclass.getName() + " Query Capability");
		qc.setLabel(eclass.getName() + " Query Capability");
		qc.getResourceTypes().add(r);
		service.getQueryCapabilities().add(qc);
		
		
		BasicCapability bc = AdaptorInterfaceFactory.eINSTANCE.createBasicCapability();
		bc.getResourceTypes().add(r);
		bc.setServiceNamespace(ResourceServiceNamespace.INDEPENDANT_OF_SERVICE_PROVIDER);
		service.getBasicCapabilities().add(bc);
		
		service.getSelectionDialogs().add(dialog("Selection Dialog", "Selection Dialog", (short)325,(short)325,"selector",r));
		service.getCreationDialogs().add(dialog("Creation Dialog", "Creation Dialog", (short)325,(short)325,"creator",r));
		
		return service;
	}
	
	private Dialog dialog (String title, String label, short height, short width, String URI, org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Resource type) {
		Dialog d = AdaptorInterfaceFactory.eINSTANCE.createDialog();
		d.setTitle(title);
		d.setLabel(label);
		d.setHintHeight(height);
		d.setHintWidth(width);
		d.getResourceTypes().add(type);
		d.setDialogURI(URI);
		return d;
	}

	private Specification specification(IProgressMonitor monitor) {
		Specification spec = AdaptorInterfaceFactory.eINSTANCE.createSpecification();
		
		NamespacePrefix prefix = AdaptorInterfaceFactory.eINSTANCE.createNamespacePrefix();
		prefix.setName(controller.getNsPrefix());
		spec.getDomainPrefixes().add(prefix);
		
		Collection<EPackage> epackages = controller.getSelectedEPackages();
		String nsURI = controller.getNsURI();
		monitor.beginTask("specification creation", epackages.size());
		for (EPackage e : epackages){
			for(EClass eclass : getSelectedClassifiers(e)){
				DomainSpecification ds = domainSpecification (eclass);
				ds.setNamespacePrefix(prefix);
				ds.setNamespaceURI(nsURI);
				spec.getDomainSpecifications().add(ds);
			}
			monitor.worked(1);
		}
		return spec;
	}

	private DomainSpecification domainSpecification(EClass e) {
		DomainSpecification ds = AdaptorInterfaceFactory.eINSTANCE.createDomainSpecification();
		org.eclipse.lyo.oslc4j.adaptormodel.adaptorinterface.Resource r = AdaptorInterfaceFactory.eINSTANCE.createResource();
		r.setName(e.getName());
		ds.setName(e.getName());
		ds.getResources().add(r);
		ResourceProperty identifier = createIdentifier();
		ds.getResourceProperties().add(identifier);
		r.getResourceProperties().add(identifier);
		for (EStructuralFeature f : getSelectedFeatures(e)){
			ResourceProperty resourceProperty = getResourceProperty(f);
			if (resourceProperty != null){
				ds.getResourceProperties().add(resourceProperty);
				r.getResourceProperties().add(resourceProperty);
			}
		}
		objectsCreated.put(e, r);
		objectsCreated.put(e, ds);
		return ds;
	}

	private Iterable<EStructuralFeature> getSelectedFeatures(EClass e) {
		return Iterables.filter(e.getEAllStructuralFeatures(),new Predicate<EStructuralFeature>(){
			@Override
			public boolean apply(EStructuralFeature arg0) {
				return controller.isChecked(arg0);
			}
		});
	}

	private ResourceProperty getResourceProperty(EStructuralFeature f) {
		if (f instanceof EAttribute){
			return getResourceProperty((EAttribute)f);
		}
		else {
			return getResourceProperty((EReference)f);
		}
	}
	
	private ResourceProperty getResourceProperty(EAttribute a) {
		ResourceProperty result = AdaptorInterfaceFactory.eINSTANCE.createResourceProperty();
		result.setName(a.getName());
		result.setOccurs(getOccurs(a));
		ResourcePropertyValueType valueType = getValueType(a.getEType());
		if (valueType != null){
			result.setValueType(valueType);
		}
		else {
			log ("no type for " + a.getName() + " [" + a.getEType() + "]");
		}
		objectsCreated.put(a, result);
		return result;
	}
	
	private ResourcePropertyOccurs getOccurs(EStructuralFeature a) {
		if (a.isMany()){
			if (a.getLowerBound() == 1){
				return ResourcePropertyOccurs.ONE_OR_MANY ;
			}
			else if (a.getLowerBound() == 0) {
				return ResourcePropertyOccurs.ZERO_OR_MANY ;
			}
			else {
				log ("no cardinality for " + a.getName() + " [" + a.getLowerBound()+"," + "]");
			}
		}
		else {
			if (a.getLowerBound() == 1 && a.getUpperBound() == 1){
				return ResourcePropertyOccurs.EXACTLY_ONE ;
			}
			else if (a.getLowerBound() == 0 && a.getUpperBound() == 1){
				return ResourcePropertyOccurs.ZERO_OR_ONE ;
			}
			else {
				log ("no cardinality for " + a.getName() + " [" + a.getLowerBound()+"," + "]");
			}
		}
		return null;
	}

	private ResourcePropertyValueType getValueType(EClassifier eType) {
		if (eType instanceof EDataType) {
			EDataType dataType = (EDataType) eType;
			if ("String".equalsIgnoreCase(dataType.getName()) || String.class.equals(dataType.getInstanceClass())){
				return ResourcePropertyValueType.STRING;
			}
			else if ("Boolean".equalsIgnoreCase(dataType.getName()) || Boolean.class.equals(dataType.getInstanceClass()) || boolean.class.equals(dataType.getInstanceClass())){
				return ResourcePropertyValueType.BOOLEAN;
			} 
			else if ("Date".equalsIgnoreCase(dataType.getName()) || Date.class.equals(dataType.getInstanceClass())){
				return ResourcePropertyValueType.DATE_TIME;
			} 
			else if ("Double".equalsIgnoreCase(dataType.getName())|| Double.class.equals(dataType.getInstanceClass()) || double.class.equals(dataType.getInstanceClass())){
				return ResourcePropertyValueType.DOUBLE;
			} 
			else if ("Float".equalsIgnoreCase(dataType.getName())|| Float.class.equals(dataType.getInstanceClass()) || float.class.equals(dataType.getInstanceClass())){
				return ResourcePropertyValueType.FLOAT;
			} 
			else if ("Integer".equalsIgnoreCase(dataType.getName()) || Integer.class.equals(dataType.getInstanceClass()) || int.class.equals(dataType.getInstanceClass())){
				return ResourcePropertyValueType.INTEGER;
			} 
		}
		return null;
	}

	private ResourceProperty getResourceProperty(EReference a) {
		ResourceProperty result = AdaptorInterfaceFactory.eINSTANCE.createResourceProperty();
		result.setValueType(ResourcePropertyValueType.RESOURCE);
		result.setName(a.getName());
		result.setOccurs(getOccurs(a));
		objectsCreated.put(a, result);
		return result;
	}

	private ResourceProperty createIdentifier() {
		ResourceProperty identifier = AdaptorInterfaceFactory.eINSTANCE.createResourceProperty();
		identifier.setName(IDENTIFIER_NAME);
		identifier.setOccurs(ResourcePropertyOccurs.EXACTLY_ONE);
		identifier.setValueType(ResourcePropertyValueType.STRING);
		return identifier;
	}


}
