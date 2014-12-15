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

	ClimeFactory climeFactory = new AfrikaClime(new AfrikaClimeType(
			"Warm Temperate Climate",  getPopulation(),
			getVegetation() , getWater()));
	

	IResidents subtropicalResidents = climeFactory.createPopulation();
	IVegetation subtropicalVegetation = climeFactory.createVegetation();
	IWater subtropicalWater = climeFactory.createWater();

	public static final String CLIME = "clime";
	public static final String VEGETATION = "vegetation";
	public static final String RESIDENTS = "residents";
	public static final String WATER = "water";

	protected String clime = "Warm Temperate Climate";
	protected String vegetation = subtropicalVegetation.getVegetation();
	protected String residents = subtropicalResidents.getResidents();
	protected String water = subtropicalWater.getWater(); 

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
	public AfrikaPhoto(ResultSet rset) throws SQLException {
		super(rset);
	}

	public void readFrom(ResultSet rset) throws SQLException {
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
	
	/**
	 * @return
	 */
	public String getVegetation(){
		return this.vegetation;
	}
	
	/**
	 * @param vegetation
	 */
	public void setVegetation(String vegetation){
		this.vegetation = vegetation; 
	}
	
	/**
	 * @return
	 */
	public String getPopulation(){
		return this.residents;
	}
	
	/**
	 * @param population
	 */
	public void setPopulation(String population){
		this.residents = population;
	}
	
	/**
	 * @return
	 */
	public String getWater(){
		return this.water;
	}
	
	/**
	 * @param water
	 */
	public void setWater(String water){
		this.water = water;
	}
}
