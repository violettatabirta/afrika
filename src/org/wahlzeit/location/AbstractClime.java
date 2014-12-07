package org.wahlzeit.location;

/**
 * @author Violetta Tabirta
 *
 */
public interface AbstractClime {
	public IVegetation createVegetation();
	public IResidents createPopulation();
	public IWater createWater();
}
