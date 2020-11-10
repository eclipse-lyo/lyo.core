package org.eclipse.lyo.oslc4j.provider.proxy;

import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.IExtendedResource;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.ValueType;

@OslcNamespace("http://open-services.net/ns/core/shapes/3.0/requirements-management-shape.ttl#")
@OslcName("Requirement")
@OslcResourceShape(describes = "http://open-services.net/ns/rm#Requirement")
public interface IRequirementShape extends IExtendedResource {
    // Start of user code getterAnnotation:title
    // End of user code
    @OslcName("title")
    @OslcPropertyDefinition("http://purl.org/dc/terms/title")
    @OslcDescription("Title of the resource represented as rich text in XHTML content. SHOULD include only content that is valid inside an XHTML <span> element.")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.XMLLiteral)
    @OslcReadOnly(false)
    public String getTitle();

    // Start of user code getterAnnotation:description
    // End of user code
    @OslcName("description")
    @OslcPropertyDefinition("http://purl.org/dc/terms/description")
    @OslcDescription("Descriptive text about resource represented as rich text in XHTML content. SHOULD include only content that is valid and suitable inside an XHTML <div> element.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.XMLLiteral)
    @OslcReadOnly(false)
    public String getDescription();

    // Start of user code getterAnnotation:identifier
    // End of user code
    @OslcName("identifier")
    @OslcPropertyDefinition("http://purl.org/dc/terms/identifier")
    @OslcDescription("A unique identifier for a resource. Typically read-only and assigned by the service provider when a resource is created. Not typically intended for end-user display.")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getIdentifier();

    // Start of user code setterAnnotation:title
    // End of user code
    public void setTitle(final String title );

    // Start of user code setterAnnotation:description
    // End of user code
    public void setDescription(final String description );

    // Start of user code setterAnnotation:identifier
    // End of user code
    public void setIdentifier(final String identifier );

}
