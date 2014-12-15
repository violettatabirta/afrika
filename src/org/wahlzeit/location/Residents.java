/**
 * 
 */
package org.wahlzeit.location;

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
		this(AfrikaResidents.Residents1);
	}

	/**
	 * @param residents
	 */
	public Residents(AfrikaResidents residents) {
		assertInvariants(residents.toString());
		
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
	public void setResidents(AfrikaResidents residents) {
		assertInvariants(residents.toString());

		this.resident = residents.toString();
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
	public void addResidents(AfrikaResidents residents) {
		assertInvariants(residents.toString());
		
		this.resident += "; " + residents.toString();
	}

}
