package org.wahlzeit.location;

public enum AfrikaResidents {
	Residents1("Aka"),
	Residents2("Baka"),
	Residents3("Banda"),
	Residents4("Chewa"),
	Residents5("Chewa"),
	Residents6("Gbaya"),
	Residents7("Sara"),
	Residents8("Zande"),
	Residents9("Saho"),
	Residents10("Somali"),
	Residents11("Oromo"),
	Residents12("Tigre"),
	Residents13("Berbers"),
	Residents14("Copts"),
	Residents15("Hutu"),
	Residents16("Kamba");
	
	/**
	 * 
	 */
	private final String name;

	/**
	 * @param s
	 */
	private AfrikaResidents(String s) {
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
