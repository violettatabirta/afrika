/**
 * 
 */
package org.violettatabirta.adap;

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
	public void setLocation(double latitude, double longitude)
			throws AssertionError, IllegalStateException,
			IllegalArgumentException, NumberFormatException;

	/**
	 * @return
	 */
	public String getMapCode() throws AssertionError, IllegalStateException,
			StringIndexOutOfBoundsException;

	/**
	 * @return
	 */
	public double getLatitude() throws AssertionError, IllegalStateException,
			NumberFormatException;

	/**
	 * @return
	 */
	public double getLongitude() throws AssertionError, IllegalStateException,
			NumberFormatException;

	/**
	 * @return
	 */
	public String asString() throws AssertionError, IllegalStateException,
			StringIndexOutOfBoundsException;

	/**
	 * @param location
	 * @return
	 */
	public boolean doGetLocationType(String location) throws AssertionError,
			IllegalStateException, IllegalArgumentException,
			StringIndexOutOfBoundsException;
}
