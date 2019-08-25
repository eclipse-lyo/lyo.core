package org.eclipse.lyo.oslc4j.provider.proxy

import org.apache.jena.rdf.model.ModelFactory
import org.apache.jena.riot.Lang
import org.apache.jena.riot.RDFParser
import org.junit.Test

import org.junit.Assert.*

class OslcShapeGeneratorTest {

    @Test
    fun newShape() {
        val model = ModelFactory.createDefaultModel()
        RDFParser.fromString("""
            @prefix dcterms: <http://purl.org/dc/terms/>
            @prefix oslc_rm: <http://open-services.net/ns/rm#Requirement>
            @prefix : <http://example.lyo/#>
            
            :req1 a oslc_rm:Requirement;
                dcterms:identifier "REQ-1";
                dcterms:title "Hello";
                dcterms:description "Dummy requirement" .
        """.trimIndent())
            .lang(Lang.TURTLE)
            .parse(model.graph)

        val resource = model.getResource("http://example.lyo/#req1")

        val aRequirement: IRequirementShape = OslcShapeGenerator.newShape(resource,
                RequirementShape::class.java, IRequirementShape::class.java,
                listOf(Requirement::class.java, Resource::class.java))

        assertTrue(aRequirement.identifier == "REQ-1")
        assertTrue(aRequirement is IRequirementShape)
        assertTrue(aRequirement is Requirement)
        assertTrue(aRequirement is Resource)

        aRequirement.javaClass.interfaces.forEach {
            println("aResourse implements ${it.name}")
        }

    }
}
