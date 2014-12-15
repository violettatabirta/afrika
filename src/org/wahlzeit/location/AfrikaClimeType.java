/**
 * 
 */
package org.wahlzeit.location;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author Violetta Tabirta
 *
 */
public class AfrikaClimeType {

	private String name;
	private AfrikaResidents population;
	private AfrikaVegetation vegetation;
	private AfrikaWater water;

	private Map<String, AfrikaClimeType> propertyAfrikaClime;
	public static final AfrikaClimeType VOID_TYPE = new AfrikaClimeType(
			"Warm Temperate Climate", AfrikaResidents.Residents11,
			AfrikaVegetation.VegetationZone5, AfrikaWater.Water5);

	/**
	 * @param population
	 * @param vegetation
	 * @param water
	 */
	public AfrikaClimeType(String name, AfrikaResidents population,
			AfrikaVegetation vegetation, AfrikaWater water) {
		this.name = name;
		this.population = population;
		this.vegetation = vegetation;
		this.water = water;
		this.propertyAfrikaClime = new Hashtable<String, AfrikaClimeType>();
	}

	public void put(String name, AfrikaClimeType afrikaClimeType) {
		propertyAfrikaClime.put(name, afrikaClimeType);
	}

	public AfrikaClimeType get(String name) {
		return propertyAfrikaClime.get(name);
	}

	public String getName() {
		return name;
	}

	public AfrikaClime makeAfrikaClimeInstance() {
		return new AfrikaClime(this);
	}

	public AfrikaResidents getResidents() {
		return population;
	}

	public AfrikaVegetation getVegetation() {
		return vegetation;
	}

	public AfrikaWater getWater() {
		return water;
	}

}
