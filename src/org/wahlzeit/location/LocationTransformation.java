package org.wahlzeit.location;

public class LocationTransformation {
	
	public static String LOCATION = "";

	public static String getLocation() {
		return LOCATION;
	}

	public void setLocation(String location) {
		this.LOCATION = location;
	}
	
	//constructor
	public LocationTransformation(){
		
	}
	
	// return GPS and MapCode
	public LocationTransformation(final String loc){

		GPSLocation gpsloc = new GPSLocation();
		MapCodeLocation mcl = new MapCodeLocation();
		
		if(new MapCodeLocation().getLocationCodeType(loc)){
			String[] lat_lon = loc.split(",");
			
			gpsloc.setLatitude(Double.parseDouble(lat_lon[0]));
			gpsloc.setLongitude(Double.parseDouble(lat_lon[1]));

			setLocation(mcl.GPSDecode(gpsloc.LATITUDE, gpsloc.LONGITUDE));	
		}else{
			setLocation(gpsloc.mapcodeDecode(loc).toString());
		}
	}
	
	//
	public static void main(final String[] args)
			throws com.mapcode.UnknownTerritoryException {
	
		System.out.println (new LocationTransformation("SOM 2GJ8.MSD").getLocation());
		System.out.println (new LocationTransformation("5.699517, 41.824744").getLocation());
	}
}
