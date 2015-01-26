package org.violettatabirta.adap;

import com.mapcode.Mapcode;
import com.mapcode.MapcodeCodec;
import com.mapcode.Point;
import com.mapcode.UnknownMapcodeException;

/**
 * @author Violetta Tabirta
 *
 */
public class GPSLocation extends LocationAbstract {

	public double latitude = 0.0;
	public double longitude = 0.0;

	/**
	 * 
	 */
	public GPSLocation() {
		this(0, 0);
	}

	/**
	 * @param latitude
	 * @param longitude
	 */
	public GPSLocation(double latitude, double longitude) throws AssertionError, IllegalStateException, IllegalArgumentException, NumberFormatException {
		doSetLocation(latitude, longitude);
	}


	@Override
	protected void doSetLocation(double latitude, double longitude) {
		doSetLatitude(latitude);
		doSetLongitude(longitude);
	}

	@Override
	protected void doSetLocation(String mapCode) {
		Point GPSCoordinates;
		try {
			GPSCoordinates = MapcodeCodec.decode(mapCode);
			doSetLatitude(GPSCoordinates.getLatDeg());
			doSetLongitude(GPSCoordinates.getLonDeg());
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (UnknownMapcodeException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	protected double doGetLatitude() {
		return this.latitude;
	}

	/**
	 * @param latitude
	 */
	private final void doSetLatitude(double latitude) {
		this.latitude = latitude;

		assert (this.latitude == latitude);
	}

	@Override
	protected double doGetLongitude() {
		return this.longitude;
	}

	/**
	 * @param longitude
	 */
	private final void doSetLongitude(double longitude) {
		this.longitude = longitude;

		assert (this.longitude == longitude);
	}

	@Override
	protected String doGetMapCode() {
		Mapcode mapCodeElement = MapcodeCodec.encode(doGetLatitude(), doGetLongitude())
				.get(0);
		
		return mapCodeElement.getTerritory().toString() + " "
				+ mapCodeElement.getMapcode().toString();
	}

	@Override
	protected String doGetAsString() {
		return String.valueOf(doGetLatitude()) + ","
				+ String.valueOf(doGetLongitude());
	}
}
