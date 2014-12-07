/**
 * 
 */
package org.wahlzeit.location;

/**
 * @author Violetta Tabirta
 *
 */
public class Water implements IWater {

	public static String Water; 
	
	public Water(){
		this(AfrikaWater.Water1);
	}
	
	public Water(AfrikaWater water){
		assertInvariants(water.toString());
		
		setWater(water);
	}
	
	
	private void assertInvariants(String obj) {
		assert obj != null;
	}
	
	/* (non-Javadoc)
	 * @see org.wahlzeit.location.IWater#setWater(org.wahlzeit.location.AfrikaWater)
	 */
	@Override
	public void setWater(AfrikaWater water) {
		assertInvariants(water.toString());
		
		this.Water = water.toString(); 
	}

	/* (non-Javadoc)
	 * @see org.wahlzeit.location.IWater#getWater()
	 */
	@Override
	public String getWater() {
		assertInvariants(this.Water);
		
		return this.Water;
	}

	/* (non-Javadoc)
	 * @see org.wahlzeit.location.IWater#addWater(org.wahlzeit.location.AfrikaWater)
	 */
	@Override
	public void addWater(AfrikaWater water) {
		assertInvariants(water.toString());
		
		this.Water += "; " +water.toString();
	}
}
