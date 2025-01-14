// quotient and reminder

// import statement
import java.util.Scanner;

public class QuatientAndReminder{
	public static void main(String []args){
	
	// Create Scanner reference 
	Scanner sc=new Scanner(System.in);
	
	// Numbers 
	System.out.println("Enter 2 numbers");
	System.out.println("Enter first number");
	int number1=sc.nextInt();
	System.out.println("Enter second number");
	int number2=sc.nextInt();
	
	// calculating quotient and reminder
	int quotient=number1/number2;
	int reminder=number1%number2;

	// dispaly all details
	System.out.println("The Quotient is "+quotient+" and reminder is "+reminder+" of two number "+number1+" and "+number2);
	
	// closing Scanner
	sc.close();
	
	}
}