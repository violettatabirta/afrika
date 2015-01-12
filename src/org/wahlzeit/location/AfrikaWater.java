package org.wahlzeit.location;

public enum AfrikaWater {
	Water1("Lake Malawi"),
	Water2("Lake Tanganyika"),
	Water3("Lake Chad"),
	Water4("Nile"),
	Water5("Lake Victoria"),
	Water6("Congo River"),
	Water7("Niger River"),
	Water8("Zambezi");
	
	private static final String[] array;
	
	/**
	 * 
	 */
	private final String name;

	/**
	 * @param s
	 */
	private AfrikaWater(String s) {
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
	
	static {
	    array = new String[AfrikaWater.values().length];
	    for (AfrikaWater value : AfrikaWater.values())
	        array[value.ordinal()] = value.toString();
	}
	public static String[] toArray () { return array; }
}
