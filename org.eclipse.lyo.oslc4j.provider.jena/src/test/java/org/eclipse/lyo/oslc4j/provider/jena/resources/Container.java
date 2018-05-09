package org.eclipse.lyo.oslc4j.provider.jena.resources;

import java.util.List;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRdfCollectionType;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;

/**
 *
 * @author rherrera
 */
@OslcName("Container")
@OslcNamespace("http://locahost:7001/vocabulary")
@OslcResourceShape(title = "ContainerTest")
public class Container extends AbstractResource {

    private String name;
    private List<Element> children;

    @OslcPropertyDefinition("http://locahost:7001/vocabulary/name")
    public final String getName() {
        return name;
    }
    /**
     * Sets the name of this artifact.
     * @param name the name of this artifact.
     */
    public final void setName(String name) {
        this.name = name;
    }

    @OslcRdfCollectionType(collectionType = OslcRdfCollectionType.RDF_LIST)
    @OslcPropertyDefinition("http://locahost:7001/vocabulary/childrenL")
    public List<Element> getChildrenL() {
        return children;
    }

    public void setChildrenL(List<Element> children) {
        this.children = children;
    }


    @OslcRdfCollectionType(collectionType = OslcRdfCollectionType.RDF_BAG)
    @OslcPropertyDefinition("http://locahost:7001/vocabulary/childrenB")
    public List<Element> getChildrenB() {
        return children;
    }

    public void setChildrenB(List<Element> children) {
        this.children = children;
    }

    @OslcRdfCollectionType(collectionType = OslcRdfCollectionType.RDF_ALT)
    @OslcPropertyDefinition("http://locahost:7001/vocabulary/childrenA")
    public List<Element> getChildrenA() {
        return children;
    }

    public void setChildrenA(List<Element> children) {
        this.children = children;
    }

    @OslcRdfCollectionType(collectionType = OslcRdfCollectionType.RDF_SEQ)
    @OslcPropertyDefinition("http://locahost:7001/vocabulary/childrenS")
    public List<Element> getChildrenS() {
        return children;
    }

    public void setChildrenS(List<Element> children) {
        this.children = children;
    }

}
