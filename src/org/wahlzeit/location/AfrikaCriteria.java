package org.wahlzeit.location;

/**
 * @author Violetta Tabirta
 *
 */
public class AfrikaCriteria extends AfrikaCategoryAbstract {
	private String clime, vegetation, residents, water;

	/**
	 * 
	 */
	public AfrikaCriteria() {
	}

	public AfrikaCriteria(AfrikaClime climatezone1, AfrikaVegetation vegetationzone2, AfrikaResidents residents14,
			AfrikaWater water3) {
		doSetClime(climatezone1);
		doSetVegetation(vegetationzone2);
		doSetResidents(residents14);
		doSetWater(water3);
	}

	@Override
	public void setClime() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setVegetation() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setWater() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setResidents() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void doSetClime(AfrikaClime clime) {
		this.clime = clime.toString();

		assert (this.clime == clime.toString());
	}

	@Override
	protected String doGetClime() {

		return this.clime;
	}

	@Override
	protected void doSetVegetation(AfrikaVegetation vegetation) {
		this.vegetation = vegetation.toString();

		assert (this.vegetation == vegetation.toString());
	}

	@Override
	protected String doGetVegetation() {

		return this.vegetation;
	}

	@Override
	protected void doSetWater(AfrikaWater water) {
		this.water = water.toString();

		assert (this.water == water.toString());
	}

	@Override
	protected String doGetWater() {

		return this.water;
	}

	@Override
	protected void doSetResidents(AfrikaResidents residents) {
		this.residents = residents.toString();

		assert (this.residents == residents.toString());
	}

	@Override
	protected String doGetResidents() {

		return this.residents;
	}

}
