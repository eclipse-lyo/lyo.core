/*******************************************************************************
 * Copyright (c) 2017 Yash Khatri.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Yash Khatri - initial API and implementation and/or initial documentation
 *******************************************************************************/


/**
 * 
 * @author Yash Khatri
 * @version $version-stub$
 * @since 2.3.0
 */

package org.eclipse.lyo.validate;

import java.math.BigInteger;
import java.net.URI;
import java.util.Date;

import org.apache.jena.rdf.model.Model;
import org.eclipse.lyo.oslc4j.provider.jena.JenaModelHelper;
import org.eclipse.lyo.validate.impl.ValidatorImpl;
import org.eclipse.lyo.validate.model.ResourceModel;
import org.eclipse.lyo.validate.model.ValidationResultModel;
import org.eclipse.lyo.validate.shacl.ShaclShape;
import org.eclipse.lyo.validate.shacl.ShaclShapeFactory;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;


/**
 * The Class OslcAnnotationsBasedValidationTest.
 * 
 * 
 * @author Yash Khatri (yash.s.khatri@gmail.com)
 *
 */

public class OslcAnnotationsBasedValidationTest {

	/** The a resource. */
	AnOslcResource anOslcResource;

	/**
	 * OslcBased negative test.
	 * 
	 * This test will fail because the pattern for StringProperty does not satisfy.
	 * It should start with "B" to be valid. But Here in this example, it starts with "C".
	 */
	@Test
	public void OslcBasedNegativetest() {

		try {
			anOslcResource =  new AnOslcResource(new URI("http://www.sampledomain.org/sam#AnOslcResource"));
			anOslcResource.setAnotherIntegerProperty(new BigInteger("12"));
			anOslcResource.setAnIntegerProperty(new BigInteger("12"));
			anOslcResource.setIntegerProperty3(new BigInteger("12"));
			anOslcResource.setAStringProperty("Cat");
			anOslcResource.addASetOfDates(new Date());


			Model dataModel =  JenaModelHelper.createJenaModel(new Object[] {anOslcResource});
			ShaclShape shaclShape = ShaclShapeFactory.createShaclShape(AnOslcResource.class);
			shaclShape.setTargetClass(new URI(SampleAdaptorConstants.SAMPLEDOMAIN_NAMSPACE + SampleAdaptorConstants.ANOSLCRESOURCE));
			Model shapeModel =  JenaModelHelper.createJenaModel(new Object[] {shaclShape});
			
			Validator validator =  new ValidatorImpl();
			ValidationResultModel vr = validator.validate(dataModel, shapeModel);
			Assert.assertEquals(1, vr.getInvalidResources().size());
			Assert.assertEquals(0, vr.getValidResources().size());

			for(ResourceModel rm : vr.getInvalidResources()) {

				JSONObject obj = new JSONObject(rm.getResult().toJsonString2spaces());
				String actualError =  obj.getJSONArray("errors").getJSONObject(0).getString("error").split(" ")[0];

				Assert.assertFalse(rm.getResult().isValid());
				String expectedError = "sh:minCountError";
				Assert.assertEquals(expectedError, actualError );
				Assert.assertEquals(1, rm.getResult().errors().size());
			}




		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Exception should not be thrown");
		}


	}

	/**
	 * OslcBased positive test.
	 *
	 */
	@Test
	public void OslcBasedPositivetest() {

		try {
			anOslcResource =  new AnOslcResource(new URI("http://www.sampledomain.org/sam#anOslcResource"));
			anOslcResource.setAnotherIntegerProperty(new BigInteger("12"));
			anOslcResource.setAnIntegerProperty(new BigInteger("12"));
			anOslcResource.setIntegerProperty3(new BigInteger("12"));
			anOslcResource.setAStringProperty("Cat");
			anOslcResource.addASetOfDates(new Date());
			anOslcResource.setIntegerProperty2(new BigInteger("12"));

			Model dataModel =  JenaModelHelper.createJenaModel(new Object[] {anOslcResource});
			ShaclShape shaclShape = ShaclShapeFactory.createShaclShape(AnOslcResource.class);
			Model shapeModel =  JenaModelHelper.createJenaModel(new Object[] {shaclShape});

			Validator validator =  new ValidatorImpl();
			ValidationResultModel vr = validator.validate(dataModel, shapeModel);
			Assert.assertEquals(1, vr.getValidResources().size());
			Assert.assertEquals(0, vr.getInvalidResources().size());

			for(ResourceModel rm : vr.getValidResources()) {

				Assert.assertTrue(rm.getResult().isValid());
				Assert.assertEquals(0, rm.getResult().errors().size());
			}
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Exception should not be thrown");
		}
	}

}
