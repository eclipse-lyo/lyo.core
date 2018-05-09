package org.eclipse.lyo.oslc4j.provider.jena.resources;

import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;

/**
 *
 * @author rherrera
 */
@OslcName("Element")
@OslcNamespace("http://locahost:7001/vocabulary")
@OslcResourceShape(title = "ElementTest")
public class Element  extends AbstractResource {
   
    private String name;

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

    
}
