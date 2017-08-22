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

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.lyo.oslc4j.core.annotation.OslcAllowedValue;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRdfCollectionType;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.ValueType;
import org.eclipse.lyo.validate.constants.DataType;

@OslcNamespace(OslcConstants.SHACL_CORE_NAMESPACE)
@OslcName("property")
@OslcResourceShape(title = "SHACL Property Resource Shape", describes = OslcConstants.TYPE_SHACL_PROPERTY)
public class ShaclProperty extends AbstractResource {

	private URI path;

	//Value Type Constraints
	private URI classType;
	private DataType dataType;
	private URI nodeKind;

	//Cardinality Constraints
	private BigInteger minCount;
	private BigInteger maxCount;

	//Value Range Constraints
	private BigInteger minExclusive;
	private BigInteger maxExclusive;
	private BigInteger minInclusive;
	private BigInteger maxInclusive;

	//String Based Constraints
	private BigInteger minLength;
	private BigInteger maxLength;
	private String pattern;
	private String[] languageIn;
	private Boolean uniqueLang;

	//Values Based Constraints
	private  Object[] in;

	//Non Validating Property Shape Characteristics.
	private String name;
	private String description;
	private BigDecimal order;
	private URI group;

	//Shapes
	private URI severity;
	private String message;
	private Boolean isDeactivated;
	private URI node;


	//Property Pair Constraint Components
	private URI equals;
	private URI disjoint;
	private URI lessThan;
	private URI lessThanOrEquals;

	//Other Constraint Components
	private URI hasValue;


	public ShaclProperty() {
		super();
	}

	public ShaclProperty(final URI path,
			final DataType dataType, final BigInteger minCount, final BigInteger maxCount) {
		this();

		this.path = path;
		this.dataType = dataType;
		this.minCount = minCount;
		this.maxCount = maxCount;
	}

	@OslcDescription("path of a property")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "path")
	@OslcReadOnly
	@OslcName("path")
	public URI getPath() {
		return path;
	}

	@OslcDescription("Sets the order of a property")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "order")
	@OslcReadOnly
	@OslcName("order")
	public BigDecimal getOrder() {
		return order;
	}

	@OslcDescription("Indicate that the shape belongs to a group of related property shapes")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "group")
	@OslcReadOnly
	@OslcName("group")
	public URI getGroup() {
		return group;
	}

	@OslcAllowedValue({OslcConstants.XML_NAMESPACE + "boolean",
		OslcConstants.XML_NAMESPACE + "dateTime",
		OslcConstants.XML_NAMESPACE + "decimal",
		OslcConstants.XML_NAMESPACE + "double",
		OslcConstants.XML_NAMESPACE + "float",
		OslcConstants.XML_NAMESPACE + "integer",
		OslcConstants.XML_NAMESPACE + "string",
		OslcConstants.RDF_NAMESPACE + "XMLLiteral"})
	@OslcDescription("See list of allowed values for sh:datatype")
	@OslcOccurs(Occurs.ExactlyOne)
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "datatype")
	@OslcReadOnly
	@OslcName("datatype")
	@OslcTitle("Data Type")
	public URI getDataType() {
		if (dataType != null) {
			try {
				return new URI(dataType.toString());
			} catch (final URISyntaxException exception) {
				// This should never happen since we control the possible values of the ValueType enum.
				throw new RuntimeException(exception);
			}
		}

		return null;
	}

	@OslcDescription("Specifies the description")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "description")
	@OslcTitle("Description")
	@OslcValueType(ValueType.String)
	@OslcName("description")
	public String getDescription() {
		return description;
	}

	@OslcDescription("Specifies the message to be shown in resultMessage of Validation report")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "message")
	@OslcTitle("Message")
	@OslcValueType(ValueType.String)
	@OslcName("message")
	public String getMessage() {
		return message;
	}

	@OslcDescription("Specifies the name")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "name")
	@OslcTitle("Name")
	@OslcValueType(ValueType.String)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OslcDescription("Specifies the min count")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "minCount")
	@OslcReadOnly
	@OslcTitle("Min Count")
	@OslcValueType(ValueType.Integer)
	public BigInteger getMinCount() {
		return minCount;
	}

	@OslcDescription("Specifies the max count")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "maxCount")
	@OslcReadOnly
	@OslcTitle("Max Count")
	@OslcValueType(ValueType.Integer)
	public BigInteger getMaxCount() {
		return maxCount;
	}

	@OslcDescription("Specifies the range: Min Exclusive")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "minExclusive")
	@OslcValueType(ValueType.String)
	@OslcTitle("Range Min Exclusive")
	public BigInteger getMinExclusive() {
		return minExclusive;
	}

	@OslcDescription("Specifies the range: Max Exclusive")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "maxExclusive")
	@OslcValueType(ValueType.String)
	@OslcTitle("Range Max Exclusive")
	public BigInteger getMaxExclusive() {
		return maxExclusive;
	}

	@OslcDescription("Specifies the range: Min Inclusive")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "minInclusive")
	@OslcValueType(ValueType.String)
	@OslcTitle("Range Min Inclusive")
	public BigInteger getMinInclusive() {
		return minInclusive;
	}

	@OslcDescription("Specifies the range: Max Inclusive")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "maxInclusive")
	@OslcValueType(ValueType.String)
	@OslcTitle("Range Max Inclusive")
	public BigInteger getMaxInclusive() {
		return maxInclusive;
	}

	@OslcDescription("Specifies the minimum string length of each value node that satisfies the condition.")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "minLength")
	@OslcValueType(ValueType.Integer)
	@OslcTitle("Minimum Length")
	public BigInteger getMinLength() {
		return minLength;
	}

	@OslcDescription("Specifies the maximum string length of each value node that satisfies the condition.")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "maxLength")
	@OslcValueType(ValueType.Integer)
	@OslcTitle("Maximum Length")
	public BigInteger getMaxLength() {
		return maxLength;
	}

	@OslcDescription("Specifies a regular expression that each value node matches to satisfy the condition.")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "pattern")
	@OslcValueType(ValueType.String)
	@OslcTitle("Pattern")
	public String getPattern() {
		return pattern;
	}

	@OslcDescription("Specifies the allowed language tags for each value node limited by a given list of language tags.")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "languageIn")
	@OslcValueType(ValueType.String)
	@OslcTitle("LanguageIn")
	public String[] getLanguageIn() {
		return languageIn;
	}

	@OslcDescription("Specifies that no pair of value nodes may use the same language tag if set true.")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "uniqueLang")
	@OslcValueType(ValueType.Boolean)
	@OslcTitle("UniqueLang")
	public Boolean getUniqueLang() {
		return uniqueLang;
	}

	@OslcDescription("Use cases of this feature include shape reuse and debugging.")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "isDeactivated")
	@OslcValueType(ValueType.Boolean)
	@OslcTitle("Deactivated")
	public Boolean isDeactivated() {
		return isDeactivated;
	}

	@OslcDescription("Specifies the Class of a node")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "class")
	@OslcTitle("Class")
	@OslcName("class")
	public URI getClassType() {
		return classType;
	}

	@OslcDescription("Specifies the node kind. Values can be: sh:BlankNode, sh:IRI, sh:Literal sh:BlankNodeOrIRI, sh:BlankNodeOrLiteral and sh:IRIOrLiteral")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "nodeKind")
	@OslcTitle("Node Kind")
	public URI getNodeKind() {
		return nodeKind;
	}

	@OslcDescription("sh:node specifies the condition that each value node conforms to the given node shape.")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "node")
	@OslcTitle("Node")
	public URI getNode() {
		return node;
	}

	@OslcDescription("specifies the condition that each value node is a member of a provided SHACL list.")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "in")
	@OslcTitle("In")
	@OslcRdfCollectionType
	public Object[] getIn() {
		return in;
	}

	@OslcDescription("The specific values of sh:severity have no impact on the validation, but may be used by user interface tools to categorize validation results.")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "severity")
	@OslcReadOnly
	@OslcName("severity")
	public URI getSeverity() {
		return severity;
	}

	@OslcDescription("sh:equals specifies the condition that the set of all value nodes is equal to the set of objects of the "
			+ "triples that have the focus node as subject and the value of sh:equals as predicate.")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "equals")
	@OslcReadOnly
	@OslcName("equals")
	public URI getEquals() {
		return equals;
	}

	@OslcDescription("sh:disjoint specifies the condition that the set of value nodes is disjoint with the the set of objects of the triples "
			+ "that have the focus node as subject and the value of sh:equals as predicate.")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "disjoint")
	@OslcReadOnly
	@OslcName("disjoint")
	public URI getDisjoint() {
		return disjoint;
	}

	@OslcDescription("sh:lessThan specifies the condition that each value node is smaller than all the objects of the triples that have the "
			+ "focus node as subject and the value of sh:lessThan as predicate.")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "lessThan")
	@OslcReadOnly
	@OslcName("lessThan")
	public URI getLessThan() {
		return lessThan;
	}

	@OslcDescription("sh:lessThanOrEquals specifies the condition that each value node is smaller than or equal to all the objects of the triples"
			+ " that have the focus node as subject and the value of sh:lessThanOrEquals as predicate.")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "lessThanOrEquals")
	@OslcReadOnly
	@OslcName("lessThanOrEquals")
	public URI getLessThanOrEquals() {
		return lessThanOrEquals;
	}

	@OslcDescription("sh:hasValue specifies the condition that at least one value node is equal to the given RDF term.")
	@OslcPropertyDefinition(OslcConstants.SHACL_CORE_NAMESPACE + "hasValue")
	@OslcReadOnly
	@OslcName("hasValue")
	public URI getHasValue() {
		return hasValue;
	}

	public void setHasValue(URI hasValue) {
		this.hasValue = hasValue;
	}

	public void setEquals(URI equals) {
		this.equals = equals;
	}

	public void setDisjoint(URI disjoint) {
		this.disjoint = disjoint;
	}

	public void setLessThan(URI lessThan) {
		this.lessThan = lessThan;
	}

	public void setLessThanOrEquals(URI lessThanOrEquals) {
		this.lessThanOrEquals = lessThanOrEquals;
	}

	public void setOrder(BigDecimal order) {
		this.order = order;
	}

	public void setGroup(URI group) {
		this.group = group;
	}

	public void setPath(URI path) {
		this.path = path;
	}

	public void setSeverity(URI severity) {
		this.severity = severity;
	}

	public void setIn(Object[] in) {
		this.in = in;
	}

	public void addIn(Object newIn) {
		appendValue(in, newIn);
	}

	private Object[] appendValue(Object[] obj, Object newObj) {

		ArrayList<Object> temp = new ArrayList<Object>(Arrays.asList(obj));
		temp.add(newObj);
		return temp.toArray();

	}

	public void setNodeKind(URI nodeKind) {
		this.nodeKind = nodeKind;
	}

	public void setNode(URI node) {
		this.node = node;
	}

	public void setClassType(URI classType) {
		this.classType = classType;
	}

	public void setMinExclusive(BigInteger minExclusive) {
		this.minExclusive = minExclusive;
	}

	public void setMaxExclusive(BigInteger maxExclusive) {
		this.maxExclusive = maxExclusive;
	}

	public void setMinInclusive(BigInteger minInclusive) {
		this.minInclusive = minInclusive;
	}

	public void setMaxInclusive(BigInteger maxInclusive) {
		this.maxInclusive = maxInclusive;
	}

	public void setMinLength(BigInteger minLength) {
		this.minLength = minLength;
	}

	public void setMaxLength(BigInteger maxLength) {
		this.maxLength = maxLength;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public void setLanguageIn(String[] languageIn) {
		this.languageIn = languageIn;
	}

	public void setUniqueLang(Boolean uniqueLang) {
		this.uniqueLang = uniqueLang;
	}

	public void setDeactivated(Boolean deactivated) {
		this.isDeactivated = deactivated;
	}

	public void setDataType(DataType dataType) {
		this.dataType = dataType;
	}

	public void setMinCount(BigInteger minCount) {
		this.minCount = minCount;
	}

	public void setMaxCount(BigInteger maxCount) {
		this.maxCount = maxCount;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Property [path=" + path + ", classType=" + classType + ", dataType=" + dataType
				+ ", nodeKind=" + nodeKind + ", minCount=" + minCount + ", maxCount="
				+ maxCount + ", minExclusive=" + minExclusive + ", maxExclusive=" + maxExclusive + ", minInclusive="
				+ minInclusive + ", maxInclusive=" + maxInclusive + ", minLength=" + minLength + ", maxLength="
				+ maxLength + ", pattern=" + pattern + ", languageIn=" + Arrays.toString(languageIn) + ", uniqueLang="
				+ uniqueLang + ", in=" + Arrays.toString(in) + ", name=" + name + ", description=" + description
				+ ", severity=" + severity + ", message=" + message + "]";
	}

}
