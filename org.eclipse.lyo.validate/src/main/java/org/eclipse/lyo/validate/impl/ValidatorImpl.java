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

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.commons.io.IOUtils;
import org.apache.jena.rdf.model.Model;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.provider.jena.JenaModelHelper;
import org.eclipse.lyo.validate.Validator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.weso.rdf.PrefixMap;
import es.weso.rdf.jena.RDFAsJenaModel;
import es.weso.schema.Result;
import es.weso.schema.Schema;
import es.weso.schema.Schemas;
import scala.Option;
import scala.util.Try;

public class ValidatorImpl implements Validator {

	private static final Option<String> OPTION_NONE = Option.apply(null);
	private static final String TRIGGER_MODE = "TargetDecls";
	private static final String TURTLE = "Turtle";
	private static final String SHACLEX = "SHACLex";
	private static final Logger LOGGER = LoggerFactory.getLogger(ValidatorImpl.class);

	private static CharSequence streamAsCharSequence(final InputStream inputStream) throws IOException {
		return IOUtils.toString(inputStream, Charset.forName("UTF-8"));
	}

	private static CharSequence load(final String resourcePath, final String msg) throws IOException {
		InputStream schemaStream = ValidatorImpl.class.getResourceAsStream(resourcePath);
		CharSequence streamAsCharSequence;
		try {
			streamAsCharSequence = streamAsCharSequence(schemaStream);
			return streamAsCharSequence;
		} catch (IOException e) {
			LOGGER.error(msg, e);
			throw e;
		}
	}

	@Override
	public Schema getSchema(String fileName) {
		Schema schema = null;
		try {
			CharSequence charSequence = ValidatorImpl.load(fileName, "Error reading schema from stream");
			Try<Schema> schemaTry = Schemas.fromString(charSequence, TURTLE, SHACLEX, OPTION_NONE);

			if (schemaTry.isSuccess()) {
				schema = schemaTry.get();
			} else {
				LOGGER.info("No schema found.");
			}
		} catch (IOException e) {
			LOGGER.error("Error invoking validator", e);
		}
		return schema;
	}

	@Override
	public Result validate(final RDFAsJenaModel rdf, final Schema schema) {
		PrefixMap nodeMap = rdf.getPrefixMap();
		PrefixMap shapesMap = schema.pm();
		return schema.validate(rdf, TRIGGER_MODE, OPTION_NONE, OPTION_NONE, nodeMap, shapesMap);
	}

	@Override
	public Result validate(RDFAsJenaModel resourceAsRDFReader, RDFAsJenaModel shapeAsRDFReader) {
		Schema schema = null;
		Try<Schema> schemaTry = Schemas.fromRDF(shapeAsRDFReader, SHACLEX);
		if (schemaTry.isSuccess()) {
			schema = schemaTry.get();
		}
		return validate(resourceAsRDFReader, schema);
	}
	
	@Override
	public Result validate(Model dataModel, AbstractResource shape)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			DatatypeConfigurationException, OslcCoreApplicationException {
		Model shapeAsModel = JenaModelHelper.createJenaModel(new Object[] { shape });
		return validate(dataModel, shapeAsModel);
	}

	@Override
	public Result validate(AbstractResource aResource, Model shapeModel)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			DatatypeConfigurationException, OslcCoreApplicationException {
		Model resourceAsModel = JenaModelHelper.createJenaModel(new Object[] { aResource });
		return validate(resourceAsModel, shapeModel);
	}
	
	@Override
	public Result validate(AbstractResource aResource, AbstractResource shape)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			DatatypeConfigurationException, OslcCoreApplicationException {
		Model resourceAsModel = JenaModelHelper.createJenaModel(new Object[] { aResource });
		return validate(resourceAsModel, shape);
	}

	@Override
	public Result validate(Model resourceAsModel, Model shapeAsModel)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			DatatypeConfigurationException, OslcCoreApplicationException {
		RDFAsJenaModel resourceAsRDFReader = new RDFAsJenaModel(resourceAsModel);
		RDFAsJenaModel shapeAsRDFReader = new RDFAsJenaModel(shapeAsModel);
		return validate(resourceAsRDFReader, shapeAsRDFReader);
	}
}
