package org.eclipse.lyo.oslc4j.adaptormodel.migration;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.lyo.oslc4j.adaptormodel.migration.messages"; //$NON-NLS-1$
	public static String ImportAIJob_AI_EXTENSION;
	public static String ImportAIJob_AI_NOT_FOUND_ERROR_MSG;
	public static String ImportAIJob_AIGEN_EXTENSION;
	public static String ImportAIJob_IMPORT_TASK_NAME;
	public static String ImportAIWizard_AI_FILE_EXTENSION;
	public static String ImportAIWizard_AIGEN_FILE_EXTENSION;
	public static String ImportAIWizardPage_IMPORT_AI_PAGE_NAME;
	public static String ImportAIWizardPage_IMPORT_AI_PAGE_TITLE;
	public static String ImportAIWizardPage_SELECT_AI_MSG;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
