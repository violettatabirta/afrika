/**
 * 
 */
package org.wahlzeit.location;

/**
 * @author Violetta Tabirta
 * 
 */
public class WarmTemperateClimate implements AbstractClime {

	private void assertInvariants(String obj) {
		assert obj != null;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.wahlzeit.location.AbstractClime#createVegetation()
	 */
	@Override
	public IVegetation createVegetation() {
		return new Vegetation();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.wahlzeit.location.AbstractClime#createPopulation()
	 */
	@Override
	public IResidents createPopulation() {
		return new Residents();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.wahlzeit.location.AbstractClime#createWater()
	 */
	@Override
	public IWater createWater() {
		return new Water();
	}
}
