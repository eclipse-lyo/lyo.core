package org.eclipse.lyo.oslc4j.provider.jena;

import java.io.IOException;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.NodeIterator;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Seq;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;
import static org.eclipse.lyo.oslc4j.provider.jena.JenaAssert.*;

/**
 * Created on 2018-05-15
 *
 * @author Andrew Berezovskyi (andriib@kth.se)
 * @version $version-stub$
 * @since 2.4.0
 */
public class JenaModelHelperTest {

    @Test
    public void testSeqMarshalling() throws IOException {
        final Model model = RDFHelper.loadResourceModel("sequence.ttl");

        // TODO check this with a new Model produced by JMH
//        assertThat(model).isomorphicWith(model);

        Resource resource = model.getResource(
                "http://com.project.foo.Container/myModule/1526309965491/children");
        Seq container = resource.as(Seq.class);
        NodeIterator iterator = container.iterator();
        for (int i = 1; iterator.hasNext(); i++) {
            assertTrue(iterator.next().asResource().getURI().contains("myInnerHeading" + i));
        }

    }

}
