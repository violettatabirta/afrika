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
	private String population;
	private String vegetation;
	private String water;

	private Map<String, AfrikaClimeType> propertyAfrikaClime;
	public static final AfrikaClimeType VOID_TYPE = new AfrikaClimeType(
			"Warm Temperate Climate", AfrikaResidents.Residents11.toString(),
			AfrikaVegetation.VegetationZone5.toString(), AfrikaWater.Water5.toString());

	/**
	 * @param population
	 * @param vegetation
	 * @param water
	 */
	public AfrikaClimeType(String name, String population,
			String vegetation, String water) {

		assert name != null : "Name can not to be empty";
		assert population != null : "Population can not to be empty";
		assert vegetation != null : "Vegetation can not to be empty";
		assert water != null : "Water has not to be empty";

		this.name = name;
		this.population = population;
		this.vegetation = vegetation;
		this.water = water;
		this.propertyAfrikaClime = new Hashtable<String, AfrikaClimeType>();
	}

	/**
	 * @param name
	 * @param afrikaClimeType
	 */
	public void put(String name, AfrikaClimeType afrikaClimeType) {
		assert name != null : "Name can not to be empty";
		assert afrikaClimeType != null : "AfrikaClimeType can not to be empty";

		propertyAfrikaClime.put(name, afrikaClimeType);
	}

	/**
	 * @param name
	 * @return
	 */
	public AfrikaClimeType get(String name) {
		assert name != null : "Name can not to be empty";

		return propertyAfrikaClime.get(name);
	}

	/**
	 * @return
	 */
	public String getName() {
		assert name != null : "Name can not to be empty";

		return name;
	}

	/**
	 * @return
	 */
	public AfrikaClime makeAfrikaClimeInstance() {
		assert this != null : "AfrikaClimeType can not to be empty and instanciated";

		return new AfrikaClime(this);
	}

	/**
	 * @return
	 */
	public String getResidents() {
		assert population != null : "Population can not to be empty";
		return population;
	}

	/**
	 * @return
	 */
	public String getVegetation() {
		assert vegetation != null : "Vegetation can not to be empty";
		
		return vegetation;
	}

	/**
	 * @return
	 */
	public String getWater() {
		assert water != null : "Water has not to be empty";
		
		return water;
	}

}
