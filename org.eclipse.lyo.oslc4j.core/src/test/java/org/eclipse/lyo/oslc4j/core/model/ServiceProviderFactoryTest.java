package org.eclipse.lyo.oslc4j.core.model;

import java.util.HashMap;
import javax.ws.rs.Path;
import org.eclipse.lyo.oslc4j.core.annotation.OslcCreationFactory;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created on 2017-26-05
 * @author Andrew Berezovskyi (andriib@kth.se)
 * @version $version-stub$
 * @since 0.0.1
 */
public class ServiceProviderFactoryTest {

    static final String FAKE_SERVICE = "fakeService";
    private static final String FAKE_CREATION_FACTORY = "fakeCreationFactory";
    private static final String FAKE_CREATION_FACTORY_WITH_ID = "fakeCreationFactory/{id}";
    private static final String ID_VALUE = "23";

    @Path(FAKE_SERVICE)
    class FakeService {
        @OslcCreationFactory(label = "fake creation factory", title = "fake")
        @Path(FAKE_CREATION_FACTORY)
        public void fakeCreationFactory() {}

        @OslcCreationFactory(label = "fake creation factory", title = "fake")
        @Path(FAKE_CREATION_FACTORY_WITH_ID)
        public void fakeCreationFactoryWithId() {}
    }

    @Test
    public void createCreationFactory() throws Exception {
        String baseURI = "http://fake.base";
        HashMap<String, Object> pathParameterValues = new HashMap<>();
        CreationFactory creationFactory = ServiceProviderFactory.createCreationFactory(baseURI,
                pathParameterValues, FakeService.class.getMethod("fakeCreationFactory"));

        assertEquals(creationFactory.getCreation().toString(),
                baseURI + "/" + FAKE_SERVICE + "/" + FAKE_CREATION_FACTORY);
    }

    @Test
    public void createCreationFactoryOnParametrisedMethod() throws Exception {
        String baseURI = "http://fake.base";
        HashMap<String, Object> pathParameterValues = new HashMap<>();
        pathParameterValues.put("id", ID_VALUE);
        CreationFactory creationFactory = ServiceProviderFactory.createCreationFactory(baseURI,
                pathParameterValues, FakeService.class.getMethod("fakeCreationFactoryWithId"));

        assertEquals(creationFactory.getCreation().toString(),
                baseURI + "/" + FAKE_SERVICE + "/" + FAKE_CREATION_FACTORY_WITH_ID.replace("{id}",
                        ID_VALUE));
    }

    @Test(expected = IllegalArgumentException.class)
    public void createCreationFactoryOnParametrisedMethodWithNullParam() throws Exception {
        String baseURI = "http://fake.base";
        HashMap<String, Object> pathParameterValues = new HashMap<>();
        pathParameterValues.put("id", null);
        ServiceProviderFactory.createCreationFactory(baseURI, pathParameterValues,
                FakeService.class.getMethod("fakeCreationFactoryWithId"));
    }

}
