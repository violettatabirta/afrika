/**
 * 
 */
/**
 * @author Violetta Tabirta
 *
 */
package org.wahlzeit.location;


import com.mapcode.Mapcode;
import com.mapcode.MapcodeCodec;
import com.mapcode.ParentTerritory;
import com.mapcode.Point;
import com.mapcode.Territory;
import com.mapcode.UnknownMapcodeException;
import com.mapcode.UnknownTerritoryException;

import java.io.File;
import java.io.IOException;
import java.util.List;


public abstract class Location {

	// constructor
	//
	public Location() {
	}


	abstract Point mapcodeDecode(final String decode);
	abstract String GPSDecode (double lat, double lon);

	
	// if mapcode ==> false
	// else if gps ==> true
	public static final boolean getLocationCodeType(final String location){
		char[] locations = location.toCharArray();
		
		for(final char entry : locations){
			if((entry <= 90 && entry >= 65) || (entry <= 122 && entry >= 97)){
				return false;
			}
		}
		
		return true;
	}
}
