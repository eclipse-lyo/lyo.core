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
import org.junit.Test;
import org.junit.Assert;

/**
 * The Class ShaclMaxCountValidationTest.
 */
public class ShaclMaxCountValidationTest {

	/** The a resource. */
	AResource aResource;

	/**
	 * Shacl max count negativetest.
	 * 
	 * This test is failing because the max allowed cardinality of anintegerproperty is 0.
	 */
	@Test
	public void ShaclMaxCountNegativetest()  {

		try {
			aResource =  new AResource(new URI("http://www.sampledomain.org/sam#AResource"));
			//Invalid. Cardinality should be 0.
			aResource.setAnIntegerProperty(new BigInteger("1"));
			aResource.setAnotherIntegerProperty(new BigInteger("12"));
			aResource.setAStringProperty("Between");
			aResource.addASetOfDates(new Date());

			Model dataModel =  JenaModelHelper.createJenaModel(new Object[] {aResource});
			ShaclShape shaclShape = ShaclShapeFactory.createShaclShape(AResource.class);
			Model shapeModel =  JenaModelHelper.createJenaModel(new Object[] {shaclShape});

			Validator validator =  new ValidatorImpl();
			ValidationResultModel vr = validator.validate(dataModel, shapeModel);
			Assert.assertEquals(1, vr.getInvalidResources().size());
			Assert.assertEquals(0, vr.getValidResources().size());

			for(ResourceModel rm : vr.getInvalidResources()) {

				JSONObject obj = new JSONObject(rm.getResult().toJsonString2spaces());
				String actualError =  obj.getJSONArray("errors").getJSONObject(0).getString("error").split(" ")[0];

				Assert.assertFalse(rm.getResult().isValid());
				String expectedError = "sh:maxCountError";
				Assert.assertEquals(expectedError, actualError );
				Assert.assertEquals(1, rm.getResult().errors().size());
			}

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Exception should not be thrown");
		}


	}

	/**
	 * Shacl max count positivetest.
	 */
	@Test
	public void ShaclMaxCountPositivetest()  {

		try {
			aResource =  new AResource(new URI("http://www.sampledomain.org/sam#AResource"));
			aResource.setAnotherIntegerProperty(new BigInteger("12"));
			aResource.setAStringProperty("Between");
			aResource.addASetOfDates(new Date());

			Model dataModel =  JenaModelHelper.createJenaModel(new Object[] {aResource});
			ShaclShape shaclShape = ShaclShapeFactory.createShaclShape(AResource.class);
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
