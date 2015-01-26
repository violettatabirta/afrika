package org.violettatabirta.adap;

import com.mapcode.Mapcode;
import com.mapcode.MapcodeCodec;
import com.mapcode.UnknownMapcodeException;

/**
 * @author Violetta Tabirta
 *
 */
public class MapCodeLocation extends LocationAbstract {

	private String mapcode = "";

	/**
	 * 
	 */
	public MapCodeLocation() {
	}

	/**
	 * @param mapcode
	 */
	public void MapCode(String mapcode) {
		doSetMapCode(mapcode);
	}

	/**
	 * @param latitude
	 * @param longitude
	 */
	public void MapCode(double latitude, double longitude) {
		doSetLocation(latitude, longitude);
	}

	@Override
	protected void doSetLocation(double latitude, double longitude) {
		Mapcode mapCodeElement = MapcodeCodec.encode(latitude, longitude)
				.get(0);
		doSetMapCode(mapCodeElement.getTerritory().toString() + " "
				+ mapCodeElement.getMapcode().toString());
	}

	@Override
	protected void doSetLocation(String mapcode) {
		doSetMapCode(mapcode);

	}

	@Override
	protected double doGetLatitude() {
		try {
			return MapcodeCodec.decode(doGetMapCode()).getLatDeg();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (UnknownMapcodeException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	protected double doGetLongitude() {
		try {
			return MapcodeCodec.decode(doGetMapCode()).getLonDeg();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (UnknownMapcodeException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	protected String doGetMapCode() {
		return mapcode;
	}

	@Override
	protected String doGetAsString() {
		return doGetMapCode();
	}

	/**
	 * @param mapcode
	 */
	private void doSetMapCode(String mapcode) {
		this.mapcode = mapcode;
	}
}
