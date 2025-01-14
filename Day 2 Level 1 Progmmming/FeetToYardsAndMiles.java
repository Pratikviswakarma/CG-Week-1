// Convert distance in yards and miles to feet  

// import statement
import java.util.Scanner;

public class FeetToYardsAndMiles{
	public static void main(String []args){
	
	// Create Scanner reference 
	Scanner sc=new Scanner(System.in);
	
	// Distance in feet 
	System.out.println("Enter distance in feet");
	int distanceInFeet=sc.nextInt();
	
	// calculating yards and miles
	double distanceInYards=3.0;
    double distanceInMiles=1760.0;
	double yards=distanceInFeet/distanceInYards;
	double miles=distanceInFeet/distanceInMiles;
	
	// dispaly all details
	System.out.println("The distance in yards "+yards+" distance in miles  "+miles);
	
	// closing Scanner
	sc.close();
	
	}
}