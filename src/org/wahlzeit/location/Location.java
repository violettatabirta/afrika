/**
 * 
 */
package org.wahlzeit.location;


/**
 * @author Violetta Tabirta
 *
 */
public interface Location {

	/**
	 * @param mapCode
	 */
	public void setLocation(String mapCode);
	
	/**
	 * @param latitude
	 * @param longitude
	 */
	public void setLocation(double latitude, double longitude);

	

	/**
	 * @return
	 */
	public String getMapCode();
	
	
	/**
	 * @return
	 */
	public double getLatitude();

	/**
	 * @return
	 */
	public double getLongitude();

	

	/**
	 * @return
	 */
	public String asString();

	/**
	 * @param location
	 * @return
	 */
	public boolean doGetLocationType(String location);
}
