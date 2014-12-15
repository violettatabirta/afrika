/**
 * 
 */
package org.wahlzeit.location;

import junit.framework.Test;
import junit.framework.TestSuite;


/**
 * @author Walter
 *
 */
public class AllTests {
	/**
	 * 
	 */
	public static Test suite() {
		TestSuite suite = new TestSuite();
		

		suite.addTestSuite(AfrikaPhotoTest.class);
		
		return suite;
	}
}
