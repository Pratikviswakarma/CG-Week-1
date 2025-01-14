// Area of Triangle

// import statement
import java.util.Scanner;

public class AreaOfTriangle{
	public static void main(String []args){
	
	// Create Scanner reference 
	Scanner sc=new Scanner(System.in);
	
	// Base and height
	System.out.println("Enter Base and Height");
	System.out.println("Enter Base");
	int base=sc.nextInt();
	System.out.println("Enter Height");
	int height=sc.nextInt();
	
	// calculating area of triangle
	double area=(1/2.0)*base*height;

	// dispaly all details
	System.out.println("Area of Triangle is "+area);
	
	// closing Scanner
	sc.close();
	
	}
}