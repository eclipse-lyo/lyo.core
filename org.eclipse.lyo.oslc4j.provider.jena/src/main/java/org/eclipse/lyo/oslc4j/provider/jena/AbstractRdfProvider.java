package org.eclipse.lyo.oslc4j.provider.jena;

import java.io.InputStream;
import java.io.OutputStream;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.RDFReader;
import org.apache.jena.rdf.model.RDFWriter;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFFormat;
import org.apache.jena.riot.RDFLanguages;
import org.apache.jena.util.FileUtils;
import org.eclipse.lyo.oslc4j.core.exception.MessageExtractor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created on 2018-05-27
 *
 * @author Andrew Berezovskyi (andriib@kth.se)
 * @version $version-stub$
 * @since 0.0.1
 */
public class AbstractRdfProvider {

    private final static Logger log = LoggerFactory.getLogger(AbstractRdfProvider.class);

    protected void writeTo(final boolean queryResult, final Object[] objects,
            final MediaType baseMediaType, final MultivaluedMap<String, Object> map,
            final OutputStream outputStream) throws WebApplicationException {
        String descriptionURI = null;
        String responseInfoURI = null;

        if (queryResult) {
            throw new IllegalArgumentException("Query Result resources have to be constructed "
                                                       + "before marshalling");
        }

        writeNonQueryObjectsTo(objects, outputStream, baseMediaType);
    }

    protected void writeNonQueryObjectsTo(final Object[] objects, final OutputStream outputStream,
            final MediaType serializationLanguage) {
        try {
            final Model model = JenaModelHelper.createJenaModel(objects);

            RDFWriter writer = getRdfWriter(serializationLanguage.toString(), model);

            if (serializationLanguage.equals(FileUtils.langXML) || serializationLanguage.equals(
                    FileUtils.langXMLAbbrev)) {
                // XML (and Jena) default to UTF-8, but many libs default to ASCII, so need
                // to set this explicitly
                writer.setProperty("showXmlDeclaration", "false");
                String xmlDeclaration = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
                outputStream.write(xmlDeclaration.getBytes());
            }
            writer.write(model, outputStream, null);
        } catch (final Exception exception) {
            log.warn(MessageExtractor.getMessage("ErrorSerializingResource"), exception);
            // TODO Andrew@2018-03-03: use another exception
            throw new WebApplicationException(exception);
        }
    }

    private RDFWriter getRdfWriter(final String serializationLanguage, final Model model) {
        RDFWriter writer = null;
        if (serializationLanguage.equals(FileUtils.langXMLAbbrev)) {
            // TODO Andrew@2018-05-27: do this for the RDF/XML-ABBREV only iff the users want it
            /* Personally, I don't like the idea of maintaining a separate ABBREV writer. I think
             we need to start introducing some flags where users can disable legacy functionality
              altogether and rely on Jena etc.*/
            writer = new RdfXmlAbbreviatedWriter();
        } else {
            final Lang lang = RDFLanguages.nameToLang(serializationLanguage);
//            RDFDataMgr.createGraphWriter(mapLang(lang));
//            final Graph graph = model.getGraph();
            writer = model.getWriter(lang.getName());
            // FIXME Andrew@2018-05-27: what's the purpose of name>lang>name conversion?
        }
        return writer;
    }

    private RDFFormat mapLang(final Lang lang) {
        // TODO Andrew@2018-05-27: allow configuration from users (compact vs pretty etc)
        final RDFFormat rdfFormat = new RDFFormat(lang);
        return rdfFormat;
    }

    /*===  READER  ================================*/

    protected Object[] readFrom(final Class<?> type, final MediaType mediaType, final InputStream
            inputStream)
            throws WebApplicationException {
        final Model model = ModelFactory.createDefaultModel();
        RDFDataMgr.read(
                model,
                inputStream,
                RDFDataMgr.determineLang(null, mediaType.toString(), null));
        try {
            return JenaModelHelper.fromJenaModel(model, type);
        } catch (final Exception exception) {
            // FIXME Andrew@2018-05-27: we shall just stop the JMH blanket of exceptions craziness
            throw new RuntimeException(exception);
//            throw new WebApplicationException(exception, buildBadRequestResponse(exception,
//                                                                      mediaType,
//                                                                      map));
        }
    }

}
