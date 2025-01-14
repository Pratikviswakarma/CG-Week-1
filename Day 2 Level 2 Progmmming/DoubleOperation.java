// Operator precedence

// import statement
import java.util.Scanner;

public class DoubleOperation{
	public static void main(String []args){
	
	// Create Scanner reference 
	Scanner sc=new Scanner(System.in);
	
	// Numbers 
	System.out.println("Enter 3 numbers");
	System.out.println("Enter first number");
	double a=sc.nextDouble();
	System.out.println("Enter second number");
	double b=sc.nextDouble();
	System.out.println("Enter second number");
	double c=sc.nextDouble();
	
	// analzing opertor precedence
	double addFirst=a+b*c;
	double mulFirst=a*b+c;
	double cFirst=c+a/b;
	double modFirst=a%b+c;
	
	// dispaly all details
	System.out.println("The result of Int operations are "+ addFirst+" "+mulFirst+" "+cFirst+" "+modFirst);
	
	// closing Scanner
	sc.close();
	
	}
}