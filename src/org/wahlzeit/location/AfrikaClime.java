/**
 * 
 */
package org.wahlzeit.location;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author Violetta Tabirta
 *
 */
public class AfrikaClime implements ClimeFactory {

	protected AfrikaClimeType afrikaClimeType;
	private Map<String, AfrikaClime> properties;
	public static final AfrikaClime VOID = AfrikaClimeType.VOID_TYPE
			.makeAfrikaClimeInstance();

	/**
	 * @param afrikaClimeType
	 */
	public AfrikaClime(AfrikaClimeType afrikaClimeType) {
		this.afrikaClimeType = afrikaClimeType; 
		this.properties = new Hashtable<String, AfrikaClime>();
	}
	
	/**
	 * @param name
	 * @param afrikaClime
	 */
	public void put(String name, AfrikaClime afrikaClime){
		this.properties.put(name, afrikaClime);
		this.afrikaClimeType.put(name, afrikaClime.getAfrikaClimeType());
	}
	
	
	/**
	 * @param name
	 * @param afrikaClime
	 * @throws Exception
	 */
	public void set(String name, AfrikaClime afrikaClime) throws Exception {
		AfrikaClimeType gametype = this.afrikaClimeType.get(name);
		
		if(!gametype.equals(afrikaClime.getAfrikaClimeType())){
			throw new Exception ("Incompatible Types!");
		}
		
		properties.put(name, afrikaClime);
	}
	
	
	/**
	 * @return
	 */
	public AfrikaClimeType getAfrikaClimeType(){
		return afrikaClimeType;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.wahlzeit.location.ClimeFactory#createVegetation()
	 */
	@Override
	public IVegetation createVegetation() {
		return new Vegetation(this.afrikaClimeType.getVegetation());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.wahlzeit.location.ClimeFactory#createPopulation()
	 */
	@Override
	public IResidents createPopulation() {
		return new Residents(this.afrikaClimeType.getResidents());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.wahlzeit.location.ClimeFactory#createWater()
	 */
	@Override
	public IWater createWater() {
		return new Water(this.afrikaClimeType.getWater());
	}

}
