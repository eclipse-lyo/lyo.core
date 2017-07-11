/*******************************************************************************
 * Copyright (c) 2017 Yash Khatri.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Yash Khatri - initial API and implementation and/or initial documentation
 *******************************************************************************/


/**
 * 
 * @author Yash Khatri
 * @version $version-stub$
 * @since 2.3.0
 */

package org.eclipse.lyo.validate.impl;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.shared.PropertyNotFoundException;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreRelativeURIException;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.provider.jena.JenaModelHelper;
import org.eclipse.lyo.validate.ValidationHelper;
import org.eclipse.lyo.validate.Validator;
import org.eclipse.lyo.validate.model.ResourceModel;
import org.eclipse.lyo.validate.model.ValidationResultModel;
import org.eclipse.lyo.validate.shacl.ShaclShape;
import org.eclipse.lyo.validate.shacl.ShaclShapeFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.weso.schema.Result;

public class ValidationHelperImpl implements ValidationHelper {

	private final static Logger log = LoggerFactory.getLogger(ValidationHelperImpl.class);

	List<ResourceModel> validResources;
	List<ResourceModel> invalidResources;
	boolean isValid;


	public ValidationHelperImpl() {
		validator = new ValidatorImpl();
		validResources = new ArrayList<ResourceModel>();
		invalidResources = new ArrayList<ResourceModel>();
		isValid = false;
	}

	private static Validator validator = new ValidatorImpl();


	@Override
	public ValidationResultModel validate(Model dataModel, Model shapeModel) throws IllegalAccessException,
	InvocationTargetException, DatatypeConfigurationException, OslcCoreApplicationException {
		return getValidationResults(dataModel, shapeModel, null, null);
	}


	@Override
	public ValidationResultModel validate(Model dataModel, Class<? extends AbstractResource> clazz)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			DatatypeConfigurationException, OslcCoreApplicationException, URISyntaxException, ParseException {
		ShaclShape shaclShape = createShaclShape(clazz);
		Model shapeModel = JenaModelHelper.createJenaModel(new Object[] { shaclShape });
		return getValidationResults(dataModel, shapeModel, null, null);
	}

	@Override
	public ValidationResultModel validateGeneric(Model dataModel, Class<? extends AbstractResource> clazz)
			throws OslcCoreApplicationException, URISyntaxException, ParseException, IllegalAccessException,
			InvocationTargetException, DatatypeConfigurationException {
		ShaclShape genericShaclShape = createShaclShape(clazz);
		return getValidationResults(dataModel, null, genericShaclShape, null);
	}

	@Override
	public ValidationResultModel validateURI(Model dataModel, String uriPattern)
			throws IllegalAccessException, InvocationTargetException, DatatypeConfigurationException,
			OslcCoreApplicationException {
		return getValidationResults(dataModel, null, new ShaclShape(), uriPattern);
	}

	@Override
	public ValidationResultModel validate(AbstractResource resource)
			throws OslcCoreApplicationException, URISyntaxException, ParseException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, DatatypeConfigurationException {
		ShaclShape shaclShape = createShaclShape(resource.getClass());
		Model shapeModel = JenaModelHelper.createJenaModel(new Object[] { shaclShape });
		Model dataModel = JenaModelHelper.createJenaModel(new Object[] { resource });
		return getValidationResults(dataModel, shapeModel, null, null);
	}

	@Override
	public ShaclShape createShaclShape(Class<? extends AbstractResource> resourceClass)
			throws OslcCoreApplicationException, URISyntaxException, ParseException {
		return ShaclShapeFactory.createShaclShape(resourceClass);
	}

	private ValidationResultModel getValidationResults(Model dataModel, Model shapeModel,
			ShaclShape genericShaclShape, String uriPattern) throws IllegalAccessException,
	InvocationTargetException, DatatypeConfigurationException, OslcCoreApplicationException {

		ResourceModel resourceModel;
		Result validationResult = null;
		ResIterator iterator = dataModel.listSubjects();
		Model model = ModelFactory.createDefaultModel();
		while (iterator.hasNext()) {
			// Iterating over each resource in the model

			resourceModel = new ResourceModel();

			final Resource resource = iterator.next();
			model.add(resource.listProperties());

			try {
				// Setting the graph name as the target node.
				if (genericShaclShape != null) {
					//Not validating for blank node.
					shapeModel = setTargetNode(genericShaclShape, model, resource);
				}
			} catch (URISyntaxException | OslcCoreRelativeURIException e) {
				log.warn("failed to set the graph name as the target node");
				model.remove(resource.listProperties());
				continue;
			}

			if (!com.google.common.base.Strings.isNullOrEmpty(uriPattern)) {
				patternValidator(model.getSeq(resource).toString(), uriPattern);
			} else {
				validationResult = validator.validate(model, shapeModel);
				if (validationResult.isValid()) {
					isValid = true;
				} 
			}

			populateResourceModel(resourceModel, model, resource, validationResult);

			populateCounts(resourceModel);

			model.remove(resource.listProperties());
			isValid = false;

			log.info("Total Number Of Resources " + (validResources.size() + invalidResources.size()) );
		}

		log.info("Validations Completed; Returning ValidationResultModel");
		return populateValidationModel();

	}

	private void populateCounts(ResourceModel resourceModel) {
		if (isValid) {
			validResources.add(resourceModel);
			log.info("Datamodel valid.");
		} else {
			invalidResources.add(resourceModel);
			log.info("Datamodel Invalid");
		}
		log.debug("Valid Count:"+validResources.size());
		log.debug("InValid Count:"+invalidResources.size());
	}

	private static void populateResourceModel(ResourceModel resourceModel, Model model, final Resource resource, Result validationResult) {
		try {
			log.debug("setting title");
			resourceModel.setTitle(resource.getRequiredProperty(model.getProperty("http://purl.org/dc/terms/title"))
					.getObject().toString());
		} catch (PropertyNotFoundException e) {
			try {
				log.debug("setting title");
				resourceModel.setTitle(resource.getRequiredProperty(model.getProperty("http://purl.org/dc/terms#title"))
						.getObject().toString());
			} catch (PropertyNotFoundException ex) {
				log.debug("title doesn't exist");
				resourceModel.setTitle("No title exists");
			}
		}

		try {
			log.debug("setting description");
			resourceModel.setDescription(
					resource.getRequiredProperty(model.getProperty("http://purl.org/dc/terms/description")).getObject().toString());
		} catch (PropertyNotFoundException e) {
			try {
				log.debug("setting description");
				resourceModel.setDescription(
						resource.getRequiredProperty(model.getProperty("http://purl.org/dc/terms#description")).getObject().toString());
			} catch (PropertyNotFoundException ex) {
				log.debug("description doesn't exist");
				resourceModel.setDescription("No desciption exists");
			}
		}
		try {
			log.debug("setting uri");
			resourceModel.setURI(model.getSeq(resource).toString());
		} catch (Exception e) {
			log.debug("uri doesn't exist");
			resourceModel.setURI("No uri exists");
		}

		resourceModel.setResult(validationResult);
	}

	private ValidationResultModel populateValidationModel() {
		log.debug("Populating ValidationResultModel");
		return new ValidationResultModel(validResources, invalidResources);
	}

	private static Model setTargetNode(ShaclShape genericShaclShape, Model model,
			final Resource resource) throws DatatypeConfigurationException, IllegalAccessException,
	InvocationTargetException, OslcCoreApplicationException, URISyntaxException {
		log.debug("Setting Target Node to {}", new URI(model.getSeq(resource).toString()));
		genericShaclShape.setTargetNode(new URI(model.getSeq(resource).toString()));
		return JenaModelHelper.createJenaModel(new Object[]{genericShaclShape});
	}

	private void patternValidator(String stringToValidate, String patternString) {
		log.info("Validating Pattern: " + patternString);
		log.debug("URI to Validate" + stringToValidate);
		try {
			Pattern pattern = Pattern.compile(patternString);
			Matcher matcher = pattern.matcher(stringToValidate);
			if (matcher.matches())
				isValid = true;
			else if (stringToValidate.contains(patternString))
				isValid = true;
		} catch (PatternSyntaxException e) {
			if (stringToValidate.contains(patternString))
				isValid = true;
		}

	}
}
