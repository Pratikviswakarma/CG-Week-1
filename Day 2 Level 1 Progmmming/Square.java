// Side of square 

// import statement
import java.util.Scanner;

public class Square{
	public static void main(String []args){
	
	// Create Scanner reference 
	Scanner sc=new Scanner(System.in);
	
	// Enter parimeter
	System.out.println("Enter parameter");
	double parimeter=sc.nextDouble();
	
	// calculating side
	double side=parimeter/4.0;

	// dispaly all details
	System.out.println("The length of the side is "+side+" whose perimeter is "+parimeter);
	
	// closing Scanner
	sc.close();
	
	}
}