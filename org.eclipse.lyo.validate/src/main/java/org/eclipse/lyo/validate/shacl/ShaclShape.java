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

package org.eclipse.lyo.validate.shacl;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRdfCollectionType;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.ValueType;

import com.google.common.collect.ImmutableList;


@OslcNamespace(OslcConstants.SHACL_CORE_NAMESPACE)
@OslcName("Shape")
@OslcResourceShape(title = "Shacl Resource Shape", describes = OslcConstants.TYPE_SHACL_SHAPE)
public final class ShaclShape extends AbstractResource {
	//Targets
	private URI targetClass;  
	private URI targetNode;
	private URI targetSubjectsOf;
	private URI targetObjectsOf;

	//Core Constraints
	private final Map<URI, ShaclProperty> properties = new HashMap<URI, ShaclProperty>();
	
	private URI isDefinedBy;
	private String label;
	private URI type;
	private boolean isClosed;
	private List<URI> ignoredProperties;
	
	private boolean readShaclAnnotations = false;


	public ShaclShape() {
		super();
	}

	public ShaclShape(final URI about) {
		super(about);
	}
	
	public void addIgnoredProperties(final URI ignoredPropertyPredicate) {
		this.ignoredProperties.add(ignoredPropertyPredicate);
	}
	
	
	@OslcDescription("Type or types of resource described by this shape")
	@OslcPropertyDefinition(OslcConstants.RDF_NAMESPACE + "type")
	@OslcReadOnly
	@OslcTitle("RDF Type")
	public URI getType() {
		return type;
	}

	@OslcDescription("Type or types of resource described by this shape")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "targetClass")
	@OslcReadOnly
	@OslcTitle("targetClass")
	public URI getTargetClass() {
		return targetClass;
	}
	
	@OslcDescription("Type or types of resource described by this shape")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "targetSubjectsOf")
	@OslcReadOnly
	@OslcTitle("targetSubjectsOf")
	public URI getTargetSubjectsOf() {
		return targetSubjectsOf;
	}
	
	@OslcDescription("Type or types of resource described by this shape")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "targetObjectsOf")
	@OslcReadOnly
	@OslcTitle("targetObjectsOf")
	public URI getTargetObjectsOf() {
		return targetObjectsOf;
	}
	
	
	public void addProperty(final ShaclProperty property) {
		this.properties.put(property.getPath(), property);
	}
	
	public void removeProperty(final URI predicate) {
		this.properties.remove(predicate);
	}
	
	public ShaclProperty getShaclProperty(URI definition) {
		return properties.get(definition);
	}

	@OslcDescription("The properties that are allowed or required by this shape")
	@OslcName("property")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "property")
	@OslcRange(OslcConstants.TYPE_SHACL_PROPERTY)
	@OslcReadOnly
	@OslcTitle("Properties")
	@OslcValueType(ValueType.LocalResource)
	public List<ShaclProperty> getShaclProperties() {
		return ImmutableList.copyOf(properties.values().toArray(new ShaclProperty[properties.size()]));
	}

	@OslcDescription("Specified Is Defined By")
	@OslcPropertyDefinition(OslcConstants.RDFS_NAMESPACE + "isDefinedBy")
	@OslcTitle("isDefinedBy")
	public URI getIsDefinedBy() {
		return isDefinedBy;
	}

	@OslcDescription("Specified Label")
	@OslcPropertyDefinition(OslcConstants.RDFS_NAMESPACE + "label")
	@OslcTitle("label")
	public String getLabel() {
		return label;
	}
	
	@OslcDescription("Focus Node")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "targetNode")
	@OslcReadOnly
	@OslcTitle("targetNode")
	public URI getTargetNode() {
		return targetNode;
	}
	
	@OslcDescription("If set to true, the model is not allowed to have any other property apart from those in shapes graph.")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "closed")
	@OslcValueType(ValueType.Boolean)
	@OslcTitle("Closed")
	public boolean isClosed() {
		return isClosed;
		
	}
	
	@OslcDescription("Optional SHACL list of properties that are also permitted in addition to those explicitly enumerated via sh:property..")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "ignoredProperties")
	@OslcTitle("IgnoredProperties")
	@OslcRdfCollectionType
	public List<URI> getIgnoredProperties() {
		return ignoredProperties;
	}
	
	public boolean isReadShaclAnnotations() {
		return readShaclAnnotations;
	}

	public void setReadShaclAnnotations(boolean useShaclAnnotations) {
		this.readShaclAnnotations = useShaclAnnotations;
	}

	public void setType(URI type) {
		this.type = type;
	}
	
	public void setIgnoredProperties(List<URI> ignoredProperties) {
		this.ignoredProperties = ignoredProperties;
	}

	public void setTargetClass(final URI targetClass) {
			this.targetClass = targetClass;
	}
	
	public void setTargetSubjectsOf(final URI targetSubjectsOf) {
			this.targetSubjectsOf = targetSubjectsOf;
	}
	
	public void setTargetObjectsOf(final URI targetObjectsOf) {
			this.targetObjectsOf = targetObjectsOf;
	}
	
	public void setClosed(boolean isClosed) {
		this.isClosed = isClosed;
	}
	
	public void setTargetNode(final URI targetNode) {
			this.targetNode = targetNode;
	}

	public void setIsDefinedBy(URI isDefinedBy) {
		this.isDefinedBy = isDefinedBy;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void setShaclProperties(final ShaclProperty[] properties) {
		this.properties.clear();
		if (properties != null) {
			for(ShaclProperty prop :properties) {
				this.properties.put(prop.getPath(), prop);
			}
		}
	}

	@Override
	public String toString() {
		return "Shape [targetClass=" + targetClass + ", properties=" + properties + "]";
	}

}
