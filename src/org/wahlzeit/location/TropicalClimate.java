/**
 * 
 */
package org.wahlzeit.location;

/**
 * @author Violetta Tabirta
 *
 */
public class TropicalClimate implements AbstractClime{

	private void assertInvariants(String obj) {
		assert obj != null;
	}
	
	/* (non-Javadoc)
	 * @see org.wahlzeit.location.AbstractClime#createVegetation()
	 */
	@Override
	public IVegetation createVegetation() {
		assertInvariants(AfrikaVegetation.VegetationZone9.toString());
		
		return new Vegetation(AfrikaVegetation.VegetationZone9);
	}

	/* (non-Javadoc)
	 * @see org.wahlzeit.location.AbstractClime#createPopulation()
	 */
	@Override
	public IResidents createPopulation() {
		assertInvariants(AfrikaResidents.Residents13.toString());
		
		return new Residents(AfrikaResidents.Residents13);
	}

	/* (non-Javadoc)
	 * @see org.wahlzeit.location.AbstractClime#createWater()
	 */
	@Override
	public IWater createWater() {
		assertInvariants(AfrikaWater.Water4.toString());
		
		return new Water(AfrikaWater.Water4);
	}
}
