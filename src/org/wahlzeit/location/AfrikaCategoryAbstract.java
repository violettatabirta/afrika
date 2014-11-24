package org.wahlzeit.location;

/**
 * @author Violetta Tabirta
 *
 */
public abstract class AfrikaCategoryAbstract implements AfrikaCategory {

	public final void setClime(AfrikaClime clime) {
		doSetClime(clime);
	}

	public final String getClime() {
		return doGetClime();
	}

	public final void setVegetation(AfrikaVegetation vegetation) {
		doSetVegetation(vegetation);
	}

	public final String getVegetation() {
		return doGetVegetation();
	}

	public final void setWater(AfrikaWater water) {
		doSetWater(water);
	}

	public final String getWater() {
		return doGetWater();
	}

	public final void setResidents(AfrikaResidents residents) {
		doSetResidents(residents);
	}

	public final String getResidents() {
		return doGetResidents();
	}

	/**
	 * @param clime
	 */
	protected abstract void doSetClime(AfrikaClime clime);

	/**
	 * @return
	 */
	protected abstract String doGetClime();

	/**
	 * @param vegetation
	 */
	protected abstract void doSetVegetation(AfrikaVegetation vegetation);

	/**
	 * @return
	 */
	protected abstract String doGetVegetation();

	/**
	 * @param water
	 */
	protected abstract void doSetWater(AfrikaWater water);

	/**
	 * @return
	 */
	protected abstract String doGetWater();

	/**
	 * @param residents
	 */
	protected abstract void doSetResidents(AfrikaResidents residents);

	/**
	 * @return
	 */
	protected abstract String doGetResidents();
}
