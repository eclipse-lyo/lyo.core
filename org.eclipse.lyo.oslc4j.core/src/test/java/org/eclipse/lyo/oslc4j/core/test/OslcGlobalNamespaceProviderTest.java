/*******************************************************************************
 * Copyright (c) 2013 IBM Corporation.
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
 *	   Daniel Figueiredo Caetano - initial implementation
 *******************************************************************************/
package org.eclipse.lyo.oslc4j.core.test;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;
import org.eclipse.lyo.oslc4j.core.OslcGlobalNamespaceProvider;
import org.junit.Test;

/**
 * Tests the behavior of {@link OslcGlobalNamespaceProvider}.
 *
 * @author Daniel Figueiredo Caetano
 *
 */
public class OslcGlobalNamespaceProviderTest {

	/**
	 * Tests the unique application instance of the {@link OslcGlobalNamespaceProvider}.
	 */
	@Test
	public void testSingletonInstance() {
        OslcGlobalNamespaceProvider provider = OslcGlobalNamespaceProvider.getInstance();
        OslcGlobalNamespaceProvider secondProvider = OslcGlobalNamespaceProvider.getInstance();

        assertSame("There should be only one instance of the OslcGlobalNamespaceProvider class",
                provider, secondProvider);
    }

	/**
     * Tests if the map can be set to another new map or to null.
     */
    @Test
    public void testSetNullMap() {
        OslcGlobalNamespaceProvider provider = OslcGlobalNamespaceProvider.getInstance();
        Map<String, String> namespaceMappings = new HashMap<>(1);

        namespaceMappings.put("any", "http://any.test.com#");
        provider.setPrefixDefinitionMap(namespaceMappings);

        assertThat(provider.getPrefixDefinitionMap()).containsExactly(
                new AbstractMap.SimpleImmutableEntry<>("any", "http://any.test.com#"));
    }

    @Test
    public void globalNamespaceMapIsNotNull() throws Exception {
        OslcGlobalNamespaceProvider provider = OslcGlobalNamespaceProvider.getInstance();

        assertNotNull("Global Namespace Map should not be null when created.",
                provider.getPrefixDefinitionMap());
    }

    @Test
    public void globalNamespaceMapIsClearedWhenSetNullAttempted() throws Exception {
        OslcGlobalNamespaceProvider provider = OslcGlobalNamespaceProvider.getInstance();

        provider.getPrefixDefinitionMap().put("test", "http://anything.com");
        provider.setPrefixDefinitionMap(null);

        assertTrue("Map should be cleared and never set to null.",
                provider.getPrefixDefinitionMap().isEmpty());
    }
}
