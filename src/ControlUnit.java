import org.wahlzeit.location.AfrikaCategory;
import org.wahlzeit.location.AfrikaClime;
import org.wahlzeit.location.AfrikaCriteria;
import org.wahlzeit.location.AfrikaResidents;
import org.wahlzeit.location.AfrikaVegetation;
import org.wahlzeit.location.AfrikaWater;


public class ControlUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AfrikaCategory afrika = new AfrikaCriteria(AfrikaClime.ClimateZone1, AfrikaVegetation.VegetationZone2, AfrikaResidents.Residents14, AfrikaWater.Water3);
		
		System.out.println(afrika.getClime());
		
		System.out.println(afrika.getResidents());
		
		System.out.println(afrika.getVegetation());
		
		System.out.println(afrika.getWater());
	}

}
