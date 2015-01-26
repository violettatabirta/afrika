package org.violettatabirta.adap;

/**
 * @author Violetta Tabirta
 *
 */
public interface ClimeFactory {
	public IVegetation createVegetation();
	public IResidents createPopulation();
	public IWater createWater();
}
