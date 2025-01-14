// Tempreatute Conversion

// import statement
import java.util.Scanner;

public class FahrenheiToCelsius{
	public static void main(String []args){
	
	// Create Scanner reference 
	Scanner sc=new Scanner(System.in);
	
	// Celsius 
	System.out.println("Enter Fahrenheit");
	int fahrenheit=sc.nextInt();
	
	// Converting fahrenheit into celsius 
	double celsius=(fahrenheit-32)*5/9.0;
	
	// dispaly all details
	System.out.println("The "+fahrenheit+" fahrenheit is "+celsius+" celsius");
	
	// closing Scanner
	sc.close();
	
	}
}