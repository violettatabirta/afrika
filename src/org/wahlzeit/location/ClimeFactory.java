package org.wahlzeit.location;

/**
 * @author Violetta Tabirta
 *
 */
public interface ClimeFactory {
	public IVegetation createVegetation();
	public IResidents createPopulation();
	public IWater createWater();
}
