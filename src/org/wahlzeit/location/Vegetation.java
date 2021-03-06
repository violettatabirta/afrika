/**
 * 
 */
package org.wahlzeit.location;

/**
 * @author Violetta Tabirta
 * 
 */
public class Vegetation implements IVegetation {

	private static String vegetationZone;

	/**
	 * default vegetation zone value
	 */
	public Vegetation() {
		this("");
	}

	public Vegetation(String vegetationZone) {
		assertInvariants(vegetationZone);

		setVegetation(vegetationZone);
	}

	private void assertInvariants(String obj) {
		assert obj != null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.wahlzeit.location.IVegetation#setVegetation(java.lang.String)
	 */
	@Override
	public void setVegetation(String vegetationZone) {
		assertInvariants(vegetationZone);

		this.vegetationZone = vegetationZone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.wahlzeit.location.IVegetation#getVegetation()
	 */
	@Override
	public String getVegetation() {
		assertInvariants(this.vegetationZone);

		return this.vegetationZone;
	}
}
