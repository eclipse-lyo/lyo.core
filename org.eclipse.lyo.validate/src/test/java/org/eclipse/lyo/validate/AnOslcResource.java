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
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Date;
import java.util.HashSet;

import javax.xml.datatype.DatatypeConfigurationException;

import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.ResourceShapeFactory;
import org.eclipse.lyo.oslc4j.core.model.ValueType;
import org.eclipse.lyo.validate.impl.ValidatorImpl;
import org.eclipse.lyo.validate.model.ValidationResultModel;
import org.eclipse.lyo.validate.shacl.ShaclShape;
import org.eclipse.lyo.validate.shacl.ShaclShapeFactory;

@OslcNamespace(SampleAdaptorConstants.SAMPLEDOMAIN_NAMSPACE)
@OslcName(SampleAdaptorConstants.ANOSLCRESOURCE)
@OslcResourceShape(title = "AResource Resource Shape", describes = SampleAdaptorConstants.TYPE_ARESOURCE)
public class AnOslcResource extends AbstractResource {
	private BigInteger anIntegerProperty;
	private BigInteger integerProperty2;
	private BigInteger anotherIntegerProperty;

	private String aStringProperty;
	private HashSet<Date> aSetOfDates = new HashSet<Date>();
	private Link aReferenceProperty = new Link();
	private BigInteger integerProperty3;
	private static ShaclShape shaclShape = null;
	private static ResourceShape resourceShape = null;

	public AnOslcResource() throws URISyntaxException {
		super();
	}

	public AnOslcResource(final URI about) throws URISyntaxException {
		super(about);
	}

	@OslcName("anIntegerProperty")
	@OslcPropertyDefinition(SampleAdaptorConstants.SAMPLEDOMAIN_NAMSPACE + "anIntegerProperty")
	@OslcOccurs(Occurs.ExactlyOne)
	@OslcValueType(ValueType.Integer)
	@OslcReadOnly(false)
	public BigInteger getAnIntegerProperty() {
		return anIntegerProperty;
	}


	@OslcName("integerProperty2")
	@OslcPropertyDefinition(SampleAdaptorConstants.SAMPLEDOMAIN_NAMSPACE + "integerProperty2")
	@OslcOccurs(Occurs.ExactlyOne)
	@OslcValueType(ValueType.Integer)
	@OslcReadOnly(false)
	public BigInteger getIntegerProperty2() {
		return integerProperty2;
	}
	public void setIntegerProperty2(BigInteger integerProperty2) {
		this.integerProperty2 = integerProperty2;
	}


	@OslcName("integerProperty3")
	@OslcPropertyDefinition(SampleAdaptorConstants.SAMPLEDOMAIN_NAMSPACE + "integerProperty3")
	@OslcOccurs(Occurs.ExactlyOne)
	@OslcValueType(ValueType.Integer)
	@OslcReadOnly(false)
	public BigInteger getIntegerProperty3() {
		return integerProperty3;
	}
	public void setIntegerProperty3(BigInteger integerProperty3) {
		this.integerProperty3 = integerProperty3;
	}

	@OslcName("anotherIntegerProperty")
	@OslcPropertyDefinition(SampleAdaptorConstants.SAMPLEDOMAIN_NAMSPACE + "anotherIntegerProperty")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcValueType(ValueType.Integer)
	@OslcReadOnly(false)
	public BigInteger getAnotherIntegerProperty() {
		return anotherIntegerProperty;
	}

	@OslcName("aStringProperty")
	@OslcPropertyDefinition(SampleAdaptorConstants.SAMPLEDOMAIN_NAMSPACE + "aStringProperty")
	@OslcDescription("a Simple Single String Property")
	@OslcOccurs(Occurs.OneOrMany)
	@OslcValueType(ValueType.String)
	@OslcTitle("a Property")
	public String getAStringProperty() {
		return aStringProperty;
	}

	@OslcName("aSetOfDates")
	@OslcPropertyDefinition(SampleAdaptorConstants.SAMPLEDOMAIN_NAMSPACE + "aSetOfDates")
	@OslcOccurs(Occurs.OneOrMany)
	@OslcValueType(ValueType.DateTime)
	@OslcReadOnly(false)
	public HashSet<Date> getASetOfDates() {
		return aSetOfDates;
	}

	@OslcName("aReferenceProperty")
	@OslcPropertyDefinition(SampleAdaptorConstants.SAMPLEDOMAIN_NAMSPACE + "aReferenceProperty")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcValueType(ValueType.Resource)
	@OslcRange({ SampleAdaptorConstants.TYPE_ANOTHERRESOURCE })
	@OslcReadOnly(false)
	public Link getAReferenceProperty() {
		return aReferenceProperty;
	}

	public void setAnIntegerProperty(final BigInteger anIntegerProperty) {
		this.anIntegerProperty = anIntegerProperty;
	}

	public void setAnotherIntegerProperty(final BigInteger anotherIntegerProperty) {
		this.anotherIntegerProperty = anotherIntegerProperty;
	}

	public void setAStringProperty(final String aStringProperty) {
		this.aStringProperty = aStringProperty;
	}

	public void addASetOfDates(final Date aSetOfDates) {
		this.aSetOfDates.add(aSetOfDates);
	}

	public void setASetOfDates(final HashSet<Date> aSetOfDates) {
		this.aSetOfDates.clear();
		if (aSetOfDates != null) {
			this.aSetOfDates.addAll(aSetOfDates);
		}
	}

	public void setAReferenceProperty(final Link aReferenceProperty) {
		this.aReferenceProperty = aReferenceProperty;
	}

	public ValidationResultModel validate() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
	DatatypeConfigurationException, OslcCoreApplicationException, URISyntaxException, ParseException {
		return new ValidatorImpl().validate(this);
	}

	public ShaclShape getShaclShape() throws OslcCoreApplicationException, URISyntaxException, ParseException {
		if(shaclShape == null) 
			return createShaclShape();
		else
			return shaclShape;
	}

	private ShaclShape createShaclShape() throws OslcCoreApplicationException, URISyntaxException, ParseException {
		return ShaclShapeFactory.createShaclShape(AnOslcResource.class);
	}

	public ResourceShape getResourceShape() throws OslcCoreApplicationException, URISyntaxException {
		if(resourceShape == null) 
			return createResourceShape();
		else
			return resourceShape;
	}

	private ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
		return ResourceShapeFactory.createResourceShape("Temp_Service_Base", 
				OslcConstants.PATH_RESOURCE_SHAPES, 
				SampleAdaptorConstants.PATH_ANOSLCRESOURCE,  
				AnOslcResource.class);
	}


}
