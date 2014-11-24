package org.wahlzeit.location;

/**
 * @author Violetta Tabirta
 *
 */
public interface AfrikaCategory {
	
	/**
	 * @param country
	 */
	void setClime(); 
	
	/**
	 * @return
	 */
	String getClime();
	
	/**
	 * @param vegetation
	 */
	void setVegetation();
	
	/**
	 * @return
	 */
	String getVegetation();
	
	/**
	 * @param water
	 */
	void setWater();
	
	/**
	 * @return
	 */
	String getWater();
	
	/**
	 * @param residents
	 */
	void setResidents();
	
	/**
	 * @return
	 */
	String getResidents();
}
