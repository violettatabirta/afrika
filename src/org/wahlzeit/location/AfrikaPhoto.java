package org.wahlzeit.location;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.wahlzeit.model.Photo;
import org.wahlzeit.model.PhotoId;

/**
 * @author Violetta Tabirta
 *
 */
public class AfrikaPhoto extends Photo {
	
	AfrikaCategory afrika = new AfrikaCriteria(AfrikaClime.ClimateZone1, AfrikaVegetation.VegetationZone2, AfrikaResidents.Residents14, AfrikaWater.Water3);
	

	public static final String CLIME = "clime"; 
	public static final String VEGETATION = "vegetation"; 
	public static final String RESIDENTS = "residents"; 
	public static final String WATER = "water"; 

	protected String clime = afrika.getClime();
	protected String vegetation = afrika.getVegetation();
	protected String residents = afrika.getResidents();
	protected String water = afrika.getWater();

	/**
	 * 
	 */
	public AfrikaPhoto() {
		super();
	}

	
	/**
	 * @param id
	 */
	public AfrikaPhoto(PhotoId id) {
		super(id);
	}

	
	/**
	 * @param rset
	 * @throws SQLException 
	 */
	public AfrikaPhoto(ResultSet rset) throws SQLException  {
		super(rset);
	}

	
	public void readFrom(ResultSet rset) throws SQLException  {

		
			super.readFrom(rset);
			
			clime = rset.getString(CLIME);
			vegetation = rset.getString(VEGETATION);
			residents = rset.getString(RESIDENTS);
			water = rset.getString(WATER);
		
	}

	
	public void writeOn(ResultSet rset) throws SQLException {

		super.writeOn(rset);

		rset.updateString(CLIME, clime);
		rset.updateString(VEGETATION, vegetation);
		rset.updateString(RESIDENTS, residents);
		rset.updateString(WATER, water);
	}
}
