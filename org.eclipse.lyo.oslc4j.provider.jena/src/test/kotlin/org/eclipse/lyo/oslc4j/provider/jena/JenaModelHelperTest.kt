package org.eclipse.lyo.oslc4j.provider.jena

import java.io.IOException
import java.lang.reflect.InvocationTargetException
import java.net.URI
import javax.xml.datatype.DatatypeConfigurationException
import org.apache.jena.ext.com.google.common.collect.ImmutableList
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException
import org.eclipse.lyo.oslc4j.provider.jena.helpers.RDFHelper
import org.eclipse.lyo.oslc4j.provider.jena.resources.Container
import org.eclipse.lyo.oslc4j.provider.jena.resources.Element
import org.junit.Test
import org.slf4j.LoggerFactory

import org.junit.Assert.*
import org.assertj.core.api.Assertions.*
import org.eclipse.lyo.oslc4j.provider.jena.helpers.JenaAssert.*

/**
 * Created on 2018-05-15
 *
 * @author Andrew Berezovskyi (andriib@kth.se)
 * @version $version-stub$
 * @since 2.4.0
 */
class JenaModelHelperTest {
    private val log = LoggerFactory.getLogger(JenaModelHelperTest::class.java)


    @Test
    @Throws(InvocationTargetException::class, DatatypeConfigurationException::class,
            OslcCoreApplicationException::class, IllegalAccessException::class, IOException::class)
    fun testSeqMarshalling() {
        val expectedModel = RDFHelper.loadResourceModel("container-element.ttl")

        val container = Container()
        container.about = URI.create("urn:containerA")

        val children = ImmutableList.of(element("A"), element("B"))
        container.childrenL = children
        container.childrenB = children

        val actualModel = JenaModelHelper.createJenaModel(arrayOf<Any>(container))

        //        log.info(RDFHelper.toTurtleString(actualModel));
        assertThat(actualModel).isomorphicWith(expectedModel)
    }

    private fun element(name: String): Element {
        val element = Element()
        element.about = URI.create(String.format("urn:%s", name))
        element.name = name
        return element
    }

}
