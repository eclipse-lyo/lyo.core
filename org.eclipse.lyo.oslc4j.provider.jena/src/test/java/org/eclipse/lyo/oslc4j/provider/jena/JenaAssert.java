package org.eclipse.lyo.oslc4j.provider.jena;

import org.apache.jena.rdf.model.Model;
import org.assertj.core.api.AbstractAssert;

/**
 * Created on 2018-05-15
 *
 * @author Andrew Berezovskyi (andriib@kth.se)
 * @version $version-stub$
 * @since 0.0.1
 */
public class JenaAssert extends AbstractAssert<JenaAssert, Model> {
    public JenaAssert(final Model model) {
        super(model, JenaAssert.class);
    }

    public static JenaAssert assertThat(Model m) {
        return new JenaAssert(m);
    }

    public JenaAssert isomorphicWith(Model m) {
        isNotNull();

        if(!actual.isIsomorphicWith(m)) {
             failWithMessage("Expected models to be isomorphic, but they differ too much");
        }
        
        return this;
    }

}
