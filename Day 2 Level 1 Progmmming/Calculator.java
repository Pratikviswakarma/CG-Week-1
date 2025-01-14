// Basic calculator 

// import statement
import java.util.Scanner;

public class Calculator{
	public static void main(String []args){
	
	// Create Scanner reference 
	Scanner sc=new Scanner(System.in);
	
	// Enter 2 number 
	System.out.println("Enter 2 Numbers ");
	System.out.println("Enter first number");
	int number1=sc.nextInt();
	System.out.println("Enter second number");
	int number2=sc.nextInt();
	
	// addition 
	int addition=number1+number2;
	
   // Subtraction 
	int subtraction=number1-number2;
	
	 // Multiplication 
	int multiplication=number1*number2;
	
	 // Division 
	int division=number1/number2;
	
	// dispaly all details
	System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+"and"+number2+"is "+addition+", "+subtraction+", "+multiplication+" and "+division) ;
	
	// closing Scanner
	sc.close();
	
	}
}