// Tempreatute Conversion

// import statement
import java.util.Scanner;

public class TempreatuteConversion{
	public static void main(String []args){
	
	// Create Scanner reference 
	Scanner sc=new Scanner(System.in);
	
	// Celsius 
	System.out.println("Enter celsius");
	int celsius=sc.nextInt();
	
	// Converting celsius into fahrenheit 
	double fahrenheit=(celsius*9/5.0)+32;
	
	// dispaly all details
	System.out.println("The "+celsius+" celsius is "+fahrenheit+" fahrenheit");
	
	// closing Scanner
	sc.close();
	
	}
}