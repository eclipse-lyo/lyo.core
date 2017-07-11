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

package org.eclipse.lyo.validate;

import java.lang.reflect.InvocationTargetException;

import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.jena.rdf.model.Model;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;

import es.weso.rdf.jena.RDFAsJenaModel;
import es.weso.schema.Result;
import es.weso.schema.Schema;

/**
 * The Interface Validator.
 */
public interface Validator {

	/**
	 * Get the validation schema from the turtle file.
	 *
	 * @param fileName the file name
	 * @return the schema
	 * 
	 */
	public Schema getSchema(String fileName);

	/**
	 * Validate.
	 * 
	 * <p>
	 * 
	 * Validates the Data Graph against the Schema.
	 *
	 * @param rdf the rdf
	 * @param schema the schema
	 * @return the validation result
	 */
	public Result validate(final RDFAsJenaModel rdf, final Schema schema);

	/**
	 * Validate.
	 * 
	 * <p>
	 * 
	 * Validates the Data Model against Shape.
	 *
	 * @param dataModel the data model
	 * @param shape the shape
	 * @return the validation result
	 * @throws IllegalAccessException the illegal access exception
	 * @throws IllegalArgumentException the illegal argument exception
	 * @throws InvocationTargetException the invocation target exception
	 * @throws DatatypeConfigurationException the datatype configuration exception
	 * @throws OslcCoreApplicationException the oslc core application exception
	 */
	public Result validate(Model dataModel, AbstractResource shape)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			DatatypeConfigurationException, OslcCoreApplicationException;

	/**
	 * Validate.
	 *
	 *<p>
	 *
	 *Validates the resource against the shape.
	 *
	 * @param resourceAsRDFReader the resource as RDF reader
	 * @param shapeAsRDFReader the shape as RDF reader
	 * @return the result
	 */
	public Result validate(RDFAsJenaModel resourceAsRDFReader, RDFAsJenaModel shapeAsRDFReader);

	/**
	 * Validate.
	 *
	 *<p>
	 *Validates the Data graph against Shape Graph
	 *
	 * @param aResource the a resource
	 * @param shape the shape
	 * @return the result
	 * @throws IllegalAccessException the illegal access exception
	 * @throws IllegalArgumentException the illegal argument exception
	 * @throws InvocationTargetException the invocation target exception
	 * @throws DatatypeConfigurationException the datatype configuration exception
	 * @throws OslcCoreApplicationException the oslc core application exception
	 * 
	 */
	public Result validate(AbstractResource aResource, AbstractResource shape)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			DatatypeConfigurationException, OslcCoreApplicationException;

	/**
	 * Validate.
	 *
	 *<p>
	 *
	 *Validates the Data Model against Shapes Model.
	 *
	 * @param resourceAsModel the resource as model
	 * @param shapeAsModel the shape as model
	 * @return the result
	 * @throws IllegalAccessException the illegal access exception
	 * @throws IllegalArgumentException the illegal argument exception
	 * @throws InvocationTargetException the invocation target exception
	 * @throws DatatypeConfigurationException the datatype configuration exception
	 * @throws OslcCoreApplicationException the oslc core application exception
	 * 
	 */
	public Result validate(Model resourceAsModel, Model shapeAsModel)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			DatatypeConfigurationException, OslcCoreApplicationException;

	
	
	/**
	 * Validate.
	 *
	 *<p>
	 *
	 *Validates the resource against the shapeModel.
	 *
	 * @param aResource the a resource
	 * @param shapeModel the shape model
	 * @return the result
	 * @throws IllegalAccessException the illegal access exception
	 * @throws IllegalArgumentException the illegal argument exception
	 * @throws InvocationTargetException the invocation target exception
	 * @throws DatatypeConfigurationException the datatype configuration exception
	 * @throws OslcCoreApplicationException the oslc core application exception
	 */
	Result validate(AbstractResource aResource, Model shapeModel)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			DatatypeConfigurationException, OslcCoreApplicationException;
}
