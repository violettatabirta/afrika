package org.wahlzeit.location;

public enum AfrikaClime {

	ClimateZone1("Warm temperate climate"),
	ClimateZone2("Subtropical climate"),
	ClimateZone3("Tropical climate");

	/**
	 * 
	 */
	private final String name;

	/**
	 * @param s
	 */
	private AfrikaClime(String s) {
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
