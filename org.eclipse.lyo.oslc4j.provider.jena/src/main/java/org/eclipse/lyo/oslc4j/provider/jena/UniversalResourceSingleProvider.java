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
 * JMH accepts objects in general but there is a slight conflict in the JAX pipeline with the
 * Collections and Arrays, which are technically also Objects. If someone needs raw Objects, they
 * can use old Providers.
 *
 * @author Andrew Berezovskyi (andriib@kth.se)
 * @version $version-stub$
 * @since 0.0.1
 */
@Provider
@Produces({OslcMediaType.APPLICATION_JSON_LD, OslcMediaType.TEXT_TURTLE, OslcMediaType
        .N_TRIPLES_MIME, OslcMediaType.RDF_JSON_MIME, OslcMediaType.RDF_THRIFT_MIME})
@Consumes({OslcMediaType.APPLICATION_JSON_LD, OslcMediaType.TEXT_TURTLE, OslcMediaType
        .N_TRIPLES_MIME, OslcMediaType.RDF_JSON_MIME, OslcMediaType.RDF_THRIFT_MIME})
public class UniversalResourceSingleProvider extends AbstractRdfProvider implements
        MessageBodyReader<IResource>, MessageBodyWriter<IResource>
{

    private final int CANNOT_BE_DETERMINED_IN_ADVANCE = -1;

    @Override
    public boolean isReadable(final Class<?> type, final Type genericType,
            final Annotation[] annotations, final MediaType mediaType) {
        // TODO Andrew@2018-05-27: test it 
        return true;
    }

    @Override
    public IResource readFrom(final Class<IResource> type, final Type genericType,
            final Annotation[] annotations, final MediaType mediaType,
            final MultivaluedMap<String, String> httpHeaders, final InputStream entityStream)
            throws IOException, WebApplicationException {
        final Object[] objects = readFrom(type, mediaType, entityStream);
        if(objects.length > 1) {
            throw new IllegalArgumentException("Can't unmarshal a single resource from a model "
                                                       + "with multiple matching resources");
        }
        final IResource resource = (IResource) objects[0];
        return resource;
    }

    @Override
    public boolean isWriteable(final Class<?> type, final Type genericType,
            final Annotation[] annotations, final MediaType mediaType) {
        // TODO Andrew@2018-05-27: test
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
        writeNonQueryObjectsTo(new Object[] {iResource}, entityStream, mediaType);
    }
}
