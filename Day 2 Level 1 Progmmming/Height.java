// Centimeters to foots

// import statement
import java.util.Scanner;

public class Height{
	public static void main(String []args){
	
	// Create Scanner reference 
	Scanner sc=new Scanner(System.in);
	// height in centimeters
	System.out.println("Enter height in centimeters");
	int centimeter=sc.nextInt();
	
	// coversion of centimeter into inches
	double inche=centimeter/2.54;
	
   // Calculating feet and remaining inches
    double foot = (centimeter / (12*2.54));
    double remainingInches = centimeter/2.54;
	

	// dispaly all details
	System.out.println("Your Height in cm is "+centimeter+" while in foot is "+foot+" and inches is "+remainingInches);
	
	// closing Scanner
	sc.close();
	
	}
}