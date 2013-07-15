/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Russell Boykin       - initial API and implementation
 *     Alberto Giammaria    - initial API and implementation
 *     Chris Peters         - initial API and implementation
 *     Gianluca Bernardini  - initial API and implementation
 *******************************************************************************/
package org.eclipse.lyo.oslc4j.test.test;

import java.io.IOException;
import java.io.StringBufferInputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.WebApplicationException;

import org.apache.wink.client.ClientResponse;
import org.eclipse.lyo.oslc4j.client.OslcRestClient;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreRelativeURIException;
import org.eclipse.lyo.oslc4j.core.model.Error;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.OslcMediaType;
import org.eclipse.lyo.oslc4j.provider.json4j.OslcRdfJsonProvider;
import org.eclipse.lyo.oslc4j.test.Constants;
import org.eclipse.lyo.oslc4j.test.Test;

@SuppressWarnings("deprecation")
public class TestInvalidTypesJson
       extends TestBase
{
    private static final String INVALID_ABOUT_RELATIVE_URI = "{\n" +
                                                             "    \"prefixes\":\n" +
                                                             "    {\n" +
                                                             "        \"rdf\":\"" + OslcConstants.RDF_NAMESPACE + "\"\n" +
                                                             "    },\n" +
                                                             "    \"rdf:type\":[{\"rdf:resource\":\"" + Constants.TYPE_TEST + "\"}],\n" +
                                                             "    \"rdf:about\":\"relative\"\n" +
                                                             "}";

    private static final String INVALID_RELATIVE_URI = "{\n" +
                                                       "    \"prefixes\":\n" +
                                                       "    {\n" +
                                                       "        \"rdf\":\"" + OslcConstants.RDF_NAMESPACE + "\",\n" +
                                                       "        \"oslc_test\":\"" + Constants.TEST_NAMESPACE + "\"\n" +
                                                       "    },\n" +
                                                       "    \"rdf:type\":[{\"rdf:resource\":\"" + Constants.TYPE_TEST + "\"}],\n" +
                                                       "    \"oslc_test:uriProperty\":{\"rdf:resource\":\"http//www.ibm.com\"}\n" +
                                                       "}";

    public TestInvalidTypesJson()
    {
        super();
    }

    public void testInvalidBigInteger()
    {
        test(NumberFormatException.class,
             createInvalid("bigIntegerProperty",
                           "Hello"));
    }

    public void testInvalidBoolean()
    {
        test(IllegalArgumentException.class,
             createInvalid("booleanProperty",
                           "Hello"));
    }

    public void testInvalidByte()
    {
        test(NumberFormatException.class,
             createInvalid("byteProperty",
                           "Hello"));
    }

    public void testInvalidDate()
    {
        test(IllegalArgumentException.class,
             createInvalid("dateProperty",
                           "Hello"));
    }

    public void testInvalidDouble()
    {
        test(NumberFormatException.class,
             createInvalid("doubleProperty",
                           "Hello"));
    }

    public void testInvalidFloat()
    {
        test(NumberFormatException.class,
             createInvalid("floatProperty",
                           "Hello"));
    }

    public void testInvalidInteger()
    {
        test(NumberFormatException.class,
             createInvalid("integerProperty",
                           "Hello"));
    }

    public void testInvalidLong()
    {
        test(NumberFormatException.class,
             createInvalid("longProperty",
                           "Hello"));
    }

    public void testInvalidPrimitiveBoolean()
    {
        test(IllegalArgumentException.class,
             createInvalid("primitiveBooleanProperty",
                           "Hello"));
    }

    public void testInvalidPrimitiveByte()
    {
        test(NumberFormatException.class,
             createInvalid("primitiveByteProperty",
                           "Hello"));
    }

    public void testInvalidPrimitiveDouble()
    {
        test(NumberFormatException.class,
             createInvalid("primitiveDoubleProperty",
                           "Hello"));
    }

    public void testInvalidPrimitiveFloat()
    {
        test(NumberFormatException.class,
             createInvalid("primitiveFloatProperty",
                           "Hello"));
    }

    public void testInvalidPrimitiveInteger()
    {
        test(NumberFormatException.class,
             createInvalid("primitiveIntegerProperty",
                           "Hello"));
    }

    public void testInvalidPrimitiveLong()
    {
        test(NumberFormatException.class,
             createInvalid("primitiveLongProperty",
                           "Hello"));
    }

    public void testInvalidPrimitiveShort()
    {
        test(NumberFormatException.class,
             createInvalid("primitiveShortProperty",
                           "Hello"));
    }

    public void testInvalidShort()
    {
        test(NumberFormatException.class,
             createInvalid("shortProperty",
                           "Hello"));
    }

    public void testInvalidStreamedAboutRelativeURI()
    {
        test(OslcCoreRelativeURIException.class,
             INVALID_ABOUT_RELATIVE_URI);
    }

    public void testInvalidJavaAboutRelativeURI()
           throws IOException,
                  URISyntaxException
    {
        final RelativeUri relativeUri = new RelativeUri();

        relativeUri.setAbout(new URI("relative"));

        final OslcRdfJsonProvider oslcRdfJsonProvider = new OslcRdfJsonProvider();

        try
        {
            oslcRdfJsonProvider.writeTo(relativeUri,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null);

            fail();
        }
        catch (final WebApplicationException exception)
        {
            verifyWebApplicationException(exception,
                                          OslcCoreRelativeURIException.class);
        }
    }

    public void testInvalidStreamedRelativeURI()
    {
        test(OslcCoreRelativeURIException.class,
             INVALID_RELATIVE_URI);
    }

    public void testInvalidJavaRelativeURI()
           throws IOException,
                  URISyntaxException
    {
        final RelativeUri relativeUri = new RelativeUri();

        relativeUri.setUri(new URI("relative"));

        final OslcRdfJsonProvider oslcRdfJsonProvider = new OslcRdfJsonProvider();

        try
        {
            oslcRdfJsonProvider.writeTo(relativeUri,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null);

            fail();
        }
        catch (final WebApplicationException exception)
        {
            verifyWebApplicationException(exception,
                                          OslcCoreRelativeURIException.class);
        }
    }

    public void testInvalidServerMessageBodyReaderRelativeURI()
    {
        final String creation = getCreation(OslcMediaType.APPLICATION_JSON,
                                            Constants.TEST_DOMAIN,
                                            Constants.TYPE_TEST);

        final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS,
                                                                 creation,
                                                                 OslcMediaType.APPLICATION_JSON);

        final ClientResponse clientResponse = oslcRestClient.addOslcResourceReturnClientResponse(INVALID_RELATIVE_URI);

        final Error error = clientResponse.getEntity(Error.class);

        assertNotNull(error);

        assertEquals(String.valueOf(HttpURLConnection.HTTP_BAD_REQUEST), error.getStatusCode());
        assertNotNull(error.getMessage());
    }

    private static String createInvalid(final String propertyName,
                                        final String invalidPropertyValue)
    {
        return "{\n" +
               "    \"prefixes\":\n" +
               "    {\n" +
               "        \"rdf\":\"" + OslcConstants.RDF_NAMESPACE + "\",\n" +
               "        \"oslc\":\"" + OslcConstants.OSLC_CORE_NAMESPACE + "\",\n" +
               "        \"dcterms\":\"" + OslcConstants.DCTERMS_NAMESPACE + "\",\n" +
               "        \"oslc_test\":\"" + Constants.TEST_NAMESPACE + "\"\n" +
               "    },\n" +
               "    \"rdf:type\":[{\"rdf:resource\":\"" + Constants.TYPE_TEST + "\"}],\n" +
               "    \"oslc_test:" + propertyName + "\":\"" + invalidPropertyValue + "\"\n" +
               "}";
    }

    @SuppressWarnings({
        "unchecked",
        "rawtypes"
    })
    private static void test(final Class<? extends Exception> exceptionClass,
                             final String                     json)
    {
        final StringBufferInputStream stringBufferInputStream = new StringBufferInputStream(json);

        final OslcRdfJsonProvider oslcRdfJsonProvider = new OslcRdfJsonProvider();

        try
        {
            oslcRdfJsonProvider.readFrom((Class) Test.class,
                                         null,
                                         null,
                                         null,
                                         null,
                                         stringBufferInputStream);

            fail();
        }
        catch (final WebApplicationException exception)
        {
            verifyWebApplicationException(exception,
                                          exceptionClass);
        }
        catch (final IOException exception)
        {
            fail("Unexpected IOException");
        }
    }
}
