// Volume of Earth 

public class VolumeOfEarth{
	public static void main(String []args){
	// Radius of Earth
	int radiusOfEarth=6378;
	
	// Volume of earth in kilometers
	double earthVolInKm=(4/3)*3.14*radiusOfEarth*radiusOfEarth*radiusOfEarth;
	
	// volume of earth in miles
    double earthVolInMiles=earthVolInKm*1.6;

	// dispaly all deatails
	System.out.println("The volume of earth in cubic kilometers is "+earthVolInKm+" and cubic miles is "+earthVolInMiles);
	
	
	}
}