/*!*****************************************************************************
 * Copyright (c) 2019 Andrew Berezovskyi.
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
 *	   Andrew Berezovskyi   - initial implementation
 *******************************************************************************/
package org.eclipse.lyo.oslc4j.provider.jena;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import org.eclipse.lyo.oslc4j.core.model.IResource;
import org.eclipse.lyo.oslc4j.core.model.OslcMediaType;

/**
 * A new JAX-RS provider to (un)marshall IResource's from/to most common RDF formats.
 * <p>
 * JMH accepts objects in general but there is a slight conflict in the JAX pipeline with the
 * Collections and Arrays, which are technically also Objects. If someone needs raw Objects, they
 * can use old Providers.
 *
 * @since 4.0.0
 */
@Provider
@Produces({OslcMediaType.APPLICATION_JSON_LD, OslcMediaType.TEXT_TURTLE,
        OslcMediaType.N_TRIPLES_MIME, OslcMediaType.RDF_JSON_MIME, OslcMediaType.RDF_THRIFT_MIME})
@Consumes({OslcMediaType.APPLICATION_JSON_LD, OslcMediaType.TEXT_TURTLE,
        OslcMediaType.N_TRIPLES_MIME, OslcMediaType.RDF_JSON_MIME, OslcMediaType.RDF_THRIFT_MIME})
public class UniversalResourceSingleProvider extends AbstractRdfProvider
        implements MessageBodyReader<IResource>, MessageBodyWriter<IResource> {

    private final int CANNOT_BE_DETERMINED_IN_ADVANCE = -1;

    @Override
    public boolean isReadable(final Class<?> type, final Type genericType,
            final Annotation[] annotations, final MediaType mediaType) {
        return true;
    }

    @Override
    public IResource readFrom(final Class<IResource> type, final Type genericType,
            final Annotation[] annotations, final MediaType mediaType,
            final MultivaluedMap<String, String> httpHeaders, final InputStream entityStream)
            throws IOException, WebApplicationException {
        final Object[] objects = readFrom(type, mediaType, entityStream);
        if (objects.length > 1) {
            throw new IllegalArgumentException("Can't unmarshal a single resource from a model " +
                    "with multiple matching resources");
        }
        final IResource resource = (IResource) objects[0];
        return resource;
    }

    @Override
    public boolean isWriteable(final Class<?> type, final Type genericType,
            final Annotation[] annotations, final MediaType mediaType) {
        return true;
    }

    @Override
    public long getSize(final IResource iResource, final Class<?> type, final Type genericType,
            final Annotation[] annotations, final MediaType mediaType) {
        return CANNOT_BE_DETERMINED_IN_ADVANCE;
    }

    @Override
    public void writeTo(final IResource iResource, final Class<?> type, final Type genericType,
            final Annotation[] annotations, final MediaType mediaType,
            final MultivaluedMap<String, Object> httpHeaders, final OutputStream entityStream)
            throws IOException, WebApplicationException {
        writeNonQueryObjectsTo(new Object[]{iResource}, entityStream, mediaType);
    }
}
