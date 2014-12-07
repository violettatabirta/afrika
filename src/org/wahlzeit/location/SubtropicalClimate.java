/**
 * 
 */
package org.wahlzeit.location;

/**
 * @author Violetta Tabirta
 * 
 */
public class SubtropicalClimate implements AbstractClime {

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
		assertInvariants(AfrikaVegetation.VegetationZone4.toString());

		return new Vegetation(AfrikaVegetation.VegetationZone4);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.wahlzeit.location.AbstractClime#createPopulation()
	 */
	@Override
	public IResidents createPopulation() {
		assertInvariants(AfrikaResidents.Residents7.toString());

		return new Residents(AfrikaResidents.Residents7);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.wahlzeit.location.AbstractClime#createWater()
	 */
	@Override
	public IWater createWater() {
		assertInvariants(AfrikaWater.Water5.toString());

		return new Water(AfrikaWater.Water5);
	}
}
