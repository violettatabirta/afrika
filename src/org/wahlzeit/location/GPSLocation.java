package org.wahlzeit.location;

import com.mapcode.Mapcode;
import com.mapcode.MapcodeCodec;
import com.mapcode.Point;
import com.mapcode.UnknownMapcodeException;

public class GPSLocation extends Location {

	public static double LATITUDE = 0.0;
	public static double LONGITUDE = 0.0;

	public static double getLatitude() {
		return LATITUDE;
	}

	public static void setLatitude(double latitude) {
		LATITUDE = latitude;
	}

	public static double getLongitude() {
		return LONGITUDE;
	}
	
	public static void setLongitude(double longitude) {
		LONGITUDE = longitude;
	}
	
	//constructor
	public GPSLocation() {}
	
	
	
	// decode a Mapcode to a point, which also includes a territory-name
	//
	public Point mapcodeDecode(final String mc) {

		try {
			return MapcodeCodec.decode(mc);
		} catch (final UnknownMapcodeException ignored) {
			System.out
					.println("This should never happen in this example as the Mapcode is valid.");
		}

		return null;
	}

	@Override
	String GPSDecode(double lat, double lon) {
		// TODO Auto-generated method stub
		return null;
	}
}
