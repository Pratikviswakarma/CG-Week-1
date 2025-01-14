// Convert kilometers into miles

// import package 
import java.util.Scanner;


public class UserKilometerToMiles{
	public static void main(String []args){
	// Create Scanner's reference with system
	Scanner sc=new Scanner(System.in);
	
	// Take user input
	int kilometers=sc.nextInt();
	
	// convert kilometers into miles
	double kmToMiles=kilometers*1.6;
	
	// dispaly all deatails
	System.out.println("The total miles is "+kmToMiles+" mile for the given "+kilometers+"km");
	
	
	}
}