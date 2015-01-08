package org.eclipse.lyo.oslc4j.codegenerator.launcher.egf;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.lyo.oslc4j.codegenerator.launcher.egf.messages"; //$NON-NLS-1$
	public static String AMGHandler_ERROR_MSG;
	public static String AMGHandler_FACTORY_COMPONENT_ERROR_MSG;
	public static String AMGHandler_JOB_NAME;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
