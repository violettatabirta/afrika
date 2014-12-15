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
		assert afrikaClimeType != null : "AfrikaClimeType can not to be empty";
		assert properties != null : "Properties can not to be empty and should be instanciated";
		
		this.afrikaClimeType = afrikaClimeType; 
		this.properties = new Hashtable<String, AfrikaClime>();
	}
	
	/**
	 * @param name
	 * @param afrikaClime
	 */
	public void put(String name, AfrikaClime afrikaClime){
		assert name != null : "Name can not to be empty";
		assert afrikaClime != null : "AfrikaClime can not to be empty";
		
		this.properties.put(name, afrikaClime);
		this.afrikaClimeType.put(name, afrikaClime.getAfrikaClimeType());
	}
	
	
	/**
	 * @param name
	 * @param afrikaClime
	 * @throws Exception
	 */
	public void set(String name, AfrikaClime afrikaClime) throws Exception {
		assert name != null : "Name can not to be empty";
		assert afrikaClime != null : "AfrikaClime can not to be empty";
		
		AfrikaClimeType afrikaclimetype = this.afrikaClimeType.get(name);
		
		assert afrikaclimetype != null : "TameType can not to be empty";
		
		if(!afrikaclimetype.equals(afrikaClime.getAfrikaClimeType())){
			throw new Exception ("Incompatible Types!");
		}
		
		properties.put(name, afrikaClime);
	}
	
	
	/**
	 * @return
	 */
	public AfrikaClimeType getAfrikaClimeType(){
		assert afrikaClimeType != null : "AfrikaClimeType can not to be empty";
		
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
