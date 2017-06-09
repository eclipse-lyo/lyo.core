package org.eclipse.lyo.oslc4j.provider.jena;

import com.hp.hpl.jena.datatypes.DatatypeFormatException;
import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.vocabulary.RDF;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import org.eclipse.lyo.oslc4j.core.OslcGlobalNamespaceProvider;
import org.eclipse.lyo.oslc4j.core.annotation.OslcSchema;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Service;
import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;
import static org.eclipse.lyo.oslc4j.core.test.customnamespace.CustomNamespaceConstants
        .CUSTOM_PREFIX;
import static org.eclipse.lyo.oslc4j.core.test.customnamespace.CustomNamespaceConstants.CUSTOM_URL;
import static org.eclipse.lyo.oslc4j.core.test.customnamespace.CustomNamespaceConstants
        .GLOBAL_PREFIX;
import static org.eclipse.lyo.oslc4j.core.test.customnamespace.CustomNamespaceConstants.GLOBAL_URL;
import static org.eclipse.lyo.oslc4j.core.test.customnamespace.CustomNamespaceConstants
        .TEST1_PREFIX;
import static org.eclipse.lyo.oslc4j.core.test.customnamespace.CustomNamespaceConstants.TEST1_URL;
import static org.eclipse.lyo.oslc4j.core.test.customnamespace.CustomNamespaceConstants
        .TEST2_PREFIX;
import static org.eclipse.lyo.oslc4j.core.test.customnamespace.CustomNamespaceConstants.TEST2_URL;
import org.eclipse.lyo.oslc4j.core.test.customnamespace.CustomNamespaceResource;
import org.eclipse.lyo.oslc4j.provider.jena.resources.EmptyNameResource;
import org.eclipse.lyo.oslc4j.provider.jena.resources.TestResource;
import org.eclipse.lyo.oslc4j.provider.jena.resources.UnnamedResource;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created on 2017-06-09
 * @author Andrew Berezovskyi (andriib@kth.se)
 * @version $version-stub$
 * @since 0.0.1
 */
public class JenaModelHelperTest {
    private final String TEST_RESOURCE = "http://example.com/resources/testResource";
    private final String NAME_LOCAL_PART = "name";
    private final String DESCRIPTION_LOCAL_PART = "description";

    /**
     * Checks that OslcName annotation with empty string does not add RDF type
     * to the resource.
     */
    @Test
    public void testJenaOslcNameEmptyString() throws Exception {
        EmptyNameResource resource = createResource(EmptyNameResource.class);
        Model model = JenaModelHelper.createJenaModel(new Object[]{resource});
        List<RDFNode> rdfTypes = model.listObjectsOfProperty(RDF.type).toList();
        assertTrue("Model should not contain RDF type as OslcName is empty", rdfTypes.isEmpty());
    }

    /**
     * Checks that OslcName annotation with empty string does not add default
     * RDF type to the resource but adds the ones specified by addTypes method.
     */
    @Test
    public void testJenaOslcNameEmptyStringAndOtherTypes() throws Exception {
        EmptyNameResource resource = createResource(EmptyNameResource.class);
        String typeToAdd = "http://about.oslc.test/addedType";
        resource.getTypes().add(URI.create(typeToAdd));
        Model model = JenaModelHelper.createJenaModel(new Object[]{resource});
        List<RDFNode> rdfTypes = model.listObjectsOfProperty(RDF.type).toList();
        assertEquals("Model should contain only added RDF type", rdfTypes.size(), 1);
        verifyRDFTypes(new String[]{typeToAdd}, rdfTypes);
    }

    /**
     * Checks that OslcName annotation adds RDF type to the resource.
     */
    @Test
    public void testJenaRegularOslcName() throws Exception {
        TestResource resource = createResource(TestResource.class);
        Model model = JenaModelHelper.createJenaModel(new Object[]{resource});
        List<RDFNode> rdfTypes = model.listObjectsOfProperty(RDF.type).toList();
        assertFalse("Model should contain RDF types", rdfTypes.isEmpty());
        verifyRDFTypes(new String[]{TestResource.TEST_NAMESPACE + "Test"}, rdfTypes);
    }

    /**
     * Checks that the absence of OslcName annotation adds default RDF type to
     * the resource.
     */
    @Test
    public void testJenaDefaultOslcName() throws Exception {
        UnnamedResource resource = createResource(UnnamedResource.class);
        Model model = JenaModelHelper.createJenaModel(new Object[]{resource});
        List<RDFNode> rdfTypes = model.listObjectsOfProperty(RDF.type).toList();
        assertFalse("Model should contain RDF types", rdfTypes.isEmpty());
        verifyRDFTypes(new String[]{TestResource.TEST_NAMESPACE + "UnnamedResource"}, rdfTypes);
    }

    /**
     * Creates an instance of {@link CustomNamespaceResource} and checks if
     * the custom namespaces returned by the class passed to the
     * {@link OslcSchema#customNamespaceProvider()} are in the
     * {@link Model#getNsPrefixMap()} that Jena creates.
     */
    @Test
    public void testJenaCustomNamespaceProvider() throws Exception {
        CustomNamespaceResource namespaceResource = createCustomNamespaceResource();
        Model model = JenaModelHelper.createJenaModel(new Object[]{namespaceResource});
        assertCustomNamespaces(model, TEST1_PREFIX, TEST1_URL);
        assertCustomNamespaces(model, TEST2_PREFIX, TEST2_URL);
        assertCustomNamespaces(model, CUSTOM_PREFIX, CUSTOM_URL);
    }

    /**
     * Adds custom prefix to the {@link OslcGlobalNamespaceProvider#getPrefixDefinitionMap()}
     * and checks if it is in the {@link Model#getNsPrefixMap()} created by Jena.
     */
    @Test
    public void testJenaGlobalNamespaceProvider() throws Exception {
        Map<String, String> globalNamespaceMappings = new HashMap<>(1);
        globalNamespaceMappings.put(GLOBAL_PREFIX, GLOBAL_URL);
        OslcGlobalNamespaceProvider.getInstance().setPrefixDefinitionMap(globalNamespaceMappings);
        CustomNamespaceResource namespaceResource = createCustomNamespaceResource();
        Model model = JenaModelHelper.createJenaModel(new Object[]{namespaceResource});
        assertCustomNamespaces(model, GLOBAL_PREFIX, GLOBAL_URL);
    }

    @Test
    public void testServiceProviderUsage() throws Exception {
        // Based on http://open-services
        // .net/bin/view/Main/OSLCCoreSpecTurtleExamples?sortcol=table;up=#Service_Provider_Resource
        // (oslc:usage added)
        InputStream is = JenaModelHelperTest.class.getResourceAsStream("/provider.ttl");
        assertNotNull("Could not read file: provider.ttl", is);
        Model m = ModelFactory.createDefaultModel();
        m.read(is, null, "TURTLE");

        ServiceProvider[] providers = (ServiceProvider[]) JenaModelHelper.fromJenaModel(m,
                ServiceProvider.class);

        // Do some basic validation on the service provider document read in.
        assertEquals("Incorrect number of service providers", 1, providers.length);
        Service[] services = providers[0].getServices();
        assertEquals(1, services.length);
        URI[] usages = services[0].getUsages();
        assertEquals("Incorrect number of services", 2, usages.length);

        // Check that the usages are there.
        List<URI> usageList = Arrays.asList(usages);
        assertTrue("Missing ex:usage1",
                usageList.contains(new URI("http://example.com/ns#usage1")));
        assertTrue("Missing ex:usage2",
                usageList.contains(new URI("http://example.com/ns#usage2")));
    }

    /**
     * Tests that BigDecimal is always returned in extended properties for
     * xsd:decimal, even for small numbers.
     * @throws Exception on test errors
     */
    @Test
    public void testNoDecimalCannonicolization() throws Exception {
        Model m = ModelFactory.createDefaultModel();
        Resource r = m.createResource(TEST_RESOURCE,
                m.createResource(TestResource.TEST_RESOURCE_TYPE));
        BigDecimal testDecimalValue = new BigDecimal(2700);
        final String DECIMAL_PROPERTY = TestResource.TEST_NAMESPACE + "decimalProp";
        r.addLiteral(m.createProperty(DECIMAL_PROPERTY), m.createTypedLiteral(testDecimalValue));

        TestResource[] resourceArray = (TestResource[]) JenaModelHelper.fromJenaModel(m,
                TestResource.class);
        assertEquals("Expected to find one resource", 1, resourceArray.length);

        TestResource any = resourceArray[0];
        assertEquals("Expected exactly one extended property", 1,
                any.getExtendedProperties().size());

        Object prop = any.getExtendedProperties().values().iterator().next();
        assertTrue("Property is not a BigDecimal", prop instanceof BigDecimal);
        assertEquals("Decimal is not expected value", testDecimalValue, prop);
    }

    /**
     * Tests that DatatypeFormatException is thrown for invalid literal values like
     *
     * <pre>{@code <ex:booleanProperty rdf:datatype="http://www
     * .w3.org/2001/XMLSchema#boolean">invalid</ex:booleanProperty> }</pre>
     *
     * in extended property values.
     */
    @Test(expected = DatatypeFormatException.class)
    public void testInvalidBoolean() throws Exception {
        Model m = ModelFactory.createDefaultModel();
        Resource r = m.createResource(TEST_RESOURCE,
                m.createResource(TestResource.TEST_RESOURCE_TYPE));
        final String BOOLEAN_PROPERTY = TestResource.TEST_NAMESPACE + "booleanProp";
        r.addLiteral(m.createProperty(BOOLEAN_PROPERTY),
                m.createTypedLiteral("invalid", XSDDatatype.XSDboolean.getURI()));
        JenaModelHelper.fromJenaModel(m, TestResource.class);
    }

    private void verifyRDFTypes(String[] expectedRDFTypes, List<RDFNode> actualRDFTypes) {
        List<String> actualRdfTypesList = new ArrayList<>();
        for (RDFNode node : actualRDFTypes) {
            actualRdfTypesList.add(node.toString());
        }
        for (String expectedRdfType : expectedRDFTypes) {
            assertTrue("Resource should contain RDF type " + expectedRdfType,
                    actualRdfTypesList.contains(expectedRdfType));
        }
    }

    /**
     * Creates a new instance adding some test values.
     * @param resourceClass class.
     * @return new instance
     */
    private <T extends AbstractResource> T createResource(Class<T> resourceClass) throws Exception {
        T resource = resourceClass.newInstance();
        URI resourceAbout = URI.create("http://about.oslc.test/001");
        resource.setAbout(resourceAbout);
        QName qName = new QName(TEST1_URL, NAME_LOCAL_PART);
        resource.getExtendedProperties().put(qName, "Some Name");
        qName = new QName(TEST2_URL, DESCRIPTION_LOCAL_PART);
        resource.getExtendedProperties().put(qName, "Any Description");
        return resource;
    }

    /**
     * Creates a new instance adding some test values.
     * @return new instance
     */
    private CustomNamespaceResource createCustomNamespaceResource() {
        CustomNamespaceResource namespaceResource = new CustomNamespaceResource();
        URI aboutNamespaceResource = URI.create("http://about.custom.oslc.namespace/001");
        namespaceResource.setAbout(aboutNamespaceResource);
        URI typeNamespaceResource = URI.create(CustomNamespaceResource.CUSTOM_RESOURCE_TYPE);
        namespaceResource.getTypes().add(typeNamespaceResource);
        QName qName = new QName(TEST1_URL, NAME_LOCAL_PART);
        namespaceResource.getExtendedProperties().put(qName, "Some Name");
        qName = new QName(TEST2_URL, DESCRIPTION_LOCAL_PART);
        namespaceResource.getExtendedProperties().put(qName, "Any Description");
        return namespaceResource;
    }

    /**
     * Checks if the model contains the prefix and its mapped namespace.
     * @param model to be checked.
     * @param prefix that model should have.
     * @param namespaceURI mapped related to the prefix.
     */
    private void assertCustomNamespaces(Model model, String prefix, String namespaceURI) {
        assertTrue("The prefix map should contain the custom namespace mapping",
                model.getNsPrefixMap().containsKey(prefix));
        assertEquals("The prefix mapped should has a different namespaceURI.",
                model.getNsPrefixMap().get(prefix), namespaceURI);
    }

}
