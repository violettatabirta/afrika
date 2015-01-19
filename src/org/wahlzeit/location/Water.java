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
		this("");
	}
	
	public Water(String water) throws  IllegalStateException, NumberFormatException, StringIndexOutOfBoundsException{
		assertInvariants(water);
		
		setWater(water);
	}
	
	
	private void assertInvariants(String obj) throws AssertionError {
		assert obj != null;
	}
	
	/* (non-Javadoc)
	 * @see org.wahlzeit.location.IWater#setWater(org.wahlzeit.location.AfrikaWater)
	 */
	@Override
	public void setWater(String water) {
		assertInvariants(water);
		
		this.Water = water; 
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
	public void addWater(String water) {
		assertInvariants(water);
		
		this.Water += "; " +water;
	}
}
