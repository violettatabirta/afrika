/**
 * 
 */
package org.violettatabirta.adap;

/**
 * @author Violetta Tabirta
 * 
 */
public class Residents implements IResidents {

	private static String resident;

	/**
	 * 
	 */
	public Residents() {
		this("");
	}

	/**
	 * @param residents
	 */
<<<<<<< HEAD
	public Residents(String residents) {
		assertInvariants(residents);
=======
	public Residents(AfrikaResidents residents) {
		assertInvariants(residents.toString());
>>>>>>> branch 'master' of https://github.com/violettatabirta/afrika
		
		setResidents(residents);
	}

	/**
	 * @param obj
	 */
	private void assertInvariants(String obj) {
		assert obj != null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.wahlzeit.location.IResidents#setResidents()
	 */
	@Override
	public void setResidents(String residents) {
		assertInvariants(residents);

<<<<<<< HEAD
		this.resident = residents;
=======
		this.resident = residents.toString();
>>>>>>> branch 'master' of https://github.com/violettatabirta/afrika
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.wahlzeit.location.IResidents#getResidents(org.wahlzeit.location.
	 * AfrikaResidents)
	 */
	@Override
	public String getResidents() {
		assertInvariants(this.resident);

		return this.resident;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.wahlzeit.location.IResidents#addResidents()
	 */
	@Override
	public void addResidents(String residents) {
		assertInvariants(residents);
		
		this.resident += "; " + residents;
	}

}
