package org.eclipse.lyo.oslc4j.provider.jena;

import java.io.IOException;
import java.io.InputStream;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFLanguages;

/**
 * Created on 2018-05-15
 *
 * @author Andrew Berezovskyi (andriib@kth.se)
 * @version $version-stub$
 * @since 0.0.1
 */
public class RDFHelper {

    /**
     * Load a Jena model from a JAR resource file
     * @param fileName path relative to '/src/test/resources'
     * @return Jena model
     * @throws IOException if class loader fails to read the resource
     */
    static Model loadResourceModel(final String fileName) throws IOException {
        final Model model;
        model = ModelFactory.createDefaultModel();
        try (InputStream s = JenaModelHelperTest.class.getClassLoader().getResourceAsStream
                (fileName)) {
            RDFDataMgr.read(model, s, RDFLanguages.filenameToLang(fileName));
//            RDFParser.create()
//                     .source(s)
//                     .lang(RDFLanguages.filenameToLang(fileName))
//                     .errorHandler(ErrorHandlerFactory.errorHandlerStrict)
////                     .base("http://example/base")
//                     .parse(graph);

        }
        return model;
    }
}
