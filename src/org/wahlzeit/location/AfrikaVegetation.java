package org.wahlzeit.location;

/**
 * @author Violetta Tabirta
 *
 */
public enum AfrikaVegetation {

	VegetationZone1("temperate steppe"),
	VegetationZone2("subtropical rainforest"),
	VegetationZone3("Mediterranean"),
	VegetationZone4("monsoon forest"),
	VegetationZone5("arid desert"),
	VegetationZone6("xeric shrubland"),
	VegetationZone7("dry steppe"),
	VegetationZone8("semiarid desert"),
	VegetationZone9("grass savanna"),
	VegetationZone10("tree savanna"),
	VegetationZone11("subtropical dry forest"),
	VegetationZone12("ropical rainforest")	;

	/**
	 * 
	 */
	private final String name;

	/**
	 * @param s
	 */
	private AfrikaVegetation(String s) {
		name = s;
		
		assertInvariants();
	}

	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	public String toString() {
		return name;
	}
	
	private void assertInvariants() {
		assert name != null;
	}
}
