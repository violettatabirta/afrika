package org.wahlzeit.location;

import com.mapcode.Mapcode;
import com.mapcode.MapcodeCodec;
import com.mapcode.Point;
import com.mapcode.UnknownMapcodeException;
import com.mapcode.UnknownTerritoryException;

public class MapCodeLocation extends Location {

	// constructor
	public MapCodeLocation() {
	}

	// decode a latitude / longitude point into a MapCode
	//
	public final String GPSDecode(double lat, double lon) {

		Mapcode mc = MapcodeCodec.encode(lat, lon).get(0); 
		
		return mc.getTerritory().toString()  +" " +mc.getMapcode().toString();
	}

	@Override
	Point mapcodeDecode(String decode) {
		// TODO Auto-generated method stub
		return null;
	}
}
