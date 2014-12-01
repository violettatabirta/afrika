package org.wahlzeit.location;

/**
 * @author Violetta Tabirta
 *
 */
final public class TemperateZone {

	private final String climezone;// see afrika clime enum
	private final String vegetation;//see afrika vegetation enum
	private final String season; // winter/spring/summer/autumn/diurnal_climate

	/**
	 * private variable
	 */
	private static TemperateZone instance;

	/**
	 * creates and returns only one synchronized TemperateZone object 
	 * synchronized ensures that this method will be used by only one thread at the same time
	 * but, a lot of calls reduces the performance due to synchronized
	 */
	private static synchronized TemperateZone getInstance() {
		if (TemperateZone.instance == null) {
			TemperateZone.instance = new TemperateZone();
		}

		return TemperateZone.instance;
	}

	private TemperateZone() {
		this(null, null, null);
	}

	private TemperateZone(String climezone, String vegetation, String season) {
		this.climezone = climezone;
		this.vegetation = vegetation;
		this.season = season;
	}

	/**
	 * @returns climezone
	 */
	public String getClimezone() {
		return this.climezone;
	}

	/**
	 * @returns vegetation
	 */
	public String getVegetation() {
		return this.vegetation;
	}

	/**
	 * @returns season
	 */
	public String getSeason() {
		return this.season;
	}

	/**
	 * 
	 */
	public boolean equals(TemperateZone tempZone) {
		return (this.hashcode() == tempZone.hashcode());
	}

	/**
	 * @returns TemperateZones Hash Value
	 */
	public int hashcode() {
		return this.hashCode();
	}
}
