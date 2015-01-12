/**
 * 
 */
package org.wahlzeit.location;

import org.wahlzeit.model.PhotoFactory;

import junit.framework.TestCase;

/**
 * @author Violetta Tabirta
 *
 */
public class AfrikaPhotoTest extends TestCase {

	public static void main(final String[] args) {
		junit.textui.TestRunner.run(AfrikaPhotoTest.class);
	}

	public AfrikaPhotoTest(String name) {
		super(name);
	}

	/**
	 * 
	 */
	public void testAfrikaPhoto() {
		AfrikaPhoto afrikaPhoto = (AfrikaPhoto) PhotoFactory.getInstance()
				.createPhoto();

		TestCase.assertEquals(afrikaPhoto.clime, "Warm Temperate Climate");
		TestCase.assertEquals(afrikaPhoto.residents.toString(),
				AfrikaResidents.Residents15.toString());
		TestCase.assertEquals(afrikaPhoto.vegetation.toString(),
				AfrikaVegetation.VegetationZone2.toString());
		TestCase.assertEquals(afrikaPhoto.water.toString(),
				AfrikaWater.Water5.toString());

		TestCase.assertTrue(afrikaPhoto.getLocation() != null);

		TestCase.assertTrue(afrikaPhoto.subtropicalResidents != null);
		TestCase.assertTrue(afrikaPhoto.subtropicalVegetation != null);
		TestCase.assertTrue(afrikaPhoto.subtropicalWater != null);
<<<<<<< HEAD
	
	}

	public void testClimeFactory() {
		ClimeFactory climeFactory = new AfrikaClime(AfrikaClimeType.VOID_TYPE);
		IResidents residents = climeFactory.createPopulation();
		IVegetation vegetation = climeFactory.createVegetation();
		IWater water = climeFactory.createWater();

		TestCase.assertTrue(climeFactory != null);
		TestCase.assertTrue(residents.toString() != AfrikaResidents.Residents11
				.toString());
		TestCase.assertTrue(vegetation.toString() != AfrikaVegetation.VegetationZone5
				.toString());
		TestCase.assertTrue(water.toString() != AfrikaWater.Water5.toString());
=======
		
>>>>>>> branch 'master' of https://github.com/violettatabirta/afrika
	}
}
