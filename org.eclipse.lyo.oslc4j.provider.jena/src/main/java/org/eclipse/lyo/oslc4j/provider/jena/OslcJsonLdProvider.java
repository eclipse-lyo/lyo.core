package org.eclipse.lyo.oslc4j.provider.jena;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.ext.Provider;

/**
 * Created on 2018-03-03
 *
 * @author Andrew Berezovskyi (andriib@kth.se)
 * @version $version-stub$
 * @since 0.0.1
 */
@Provider
@Produces({"ld+json"})
@Consumes({"ld+json"})
public class OslcJsonLdProvider extends OslcRdfXmlProvider{ }
