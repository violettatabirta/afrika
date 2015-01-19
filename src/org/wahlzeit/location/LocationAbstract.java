/**
 * 
 */
/**
 * @author Violetta Tabirta
 *
 */
package org.wahlzeit.location;


public abstract class LocationAbstract implements Location {

	/**
	 * @param latitude
	 * @param longitude
	 */
	protected abstract void doSetLocation(double latitude, double longitude);

	/* (non-Javadoc)
	 * @see org.wahlzeit.location.Location#setLocation(double, double)
	 */
	public final void setLocation(double latitude, double longitude) {

		doSetLocation(latitude, longitude);
	}

	/**
	 * @param mapCode
	 */
	protected abstract void doSetLocation(String mapCode) throws AssertionError, IllegalStateException, StringIndexOutOfBoundsException;

	/* (non-Javadoc)
	 * @see org.wahlzeit.location.Location#setLocation(java.lang.String)
	 */
	public final void setLocation(String mapCode) {

		try {
			doSetLocation(mapCode);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return
	 */
	protected abstract double doGetLatitude();

	/* (non-Javadoc)
	 * @see org.wahlzeit.location.Location#getLatitude()
	 */
	public final double getLatitude() {

		try {
			return doGetLatitude();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * @return
	 */
	protected abstract double doGetLongitude();

	/* (non-Javadoc)
	 * @see org.wahlzeit.location.Location#getLongitude()
	 */
	public final double getLongitude() {

		try {
			return doGetLongitude();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/* (non-Javadoc)
	 * @see org.wahlzeit.location.Location#getMapCode()
	 */
	public final String getMapCode() {
		return doGetMapCode();
	}

	/**
	 * @return
	 */
	protected abstract String doGetMapCode();

	/* (non-Javadoc)
	 * @see org.wahlzeit.location.Location#asString()
	 */
	public final String asString() {
		return doGetAsString();
	}

	/**
	 * @return
	 */
	protected abstract String doGetAsString();

	/**
	 * if mapcode ==> false else if gps ==> true
	 * 
	 * @param location
	 * @return
	 */
	/* (non-Javadoc)
	 * @see org.wahlzeit.location.Location#doGetLocationType(java.lang.String)
	 */
	public final boolean doGetLocationType(final String location) {
		char[] locations = location.toCharArray();

		for (final char entry : locations) {
			if ((entry <= 90 && entry >= 65) || (entry <= 122 && entry >= 97)) {
				return false;
			}
		}

		return true;
	}
}
