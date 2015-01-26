package org.violettatabirta.adap;

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

	
	private static final String[] array;
	
	/**
	 * 
	 */
	private final String name;

	/**
	 * @param s
	 */
	private AfrikaVegetation(String s) throws IllegalStateException, IllegalArgumentException, StringIndexOutOfBoundsException  {
		name = s;
		
		assertInvariants();
	}

	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	public String toString()  {
		return name;
	}
	
	private void assertInvariants() throws AssertionError  {
		assert name != null;
	}
	
	static {
	    array = new String[AfrikaVegetation.values().length];
	    for (AfrikaVegetation value : AfrikaVegetation.values())
	        array[value.ordinal()] = value.toString();
	}
	public static String[] toArray () { return array; }
}
