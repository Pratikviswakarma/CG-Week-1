// Operator precedence

// import statement
import java.util.Scanner;

public class IntOperation{
	public static void main(String []args){
	
	// Create Scanner reference 
	Scanner sc=new Scanner(System.in);
	
	// Numbers 
	System.out.println("Enter 3 numbers");
	System.out.println("Enter first number");
	int a=sc.nextInt();
	System.out.println("Enter second number");
	int b=sc.nextInt();
	System.out.println("Enter second number");
	int c=sc.nextInt();
	
	// analzing opertor precedence
	int addFirst=a+b*c;
	int mulFirst=a*b+c;
	int cFirst=c+a/b;
	int modFirst=a%b+c;
	
	// dispaly all details
	System.out.println("The result of Int operations are "+ addFirst+" "+mulFirst+" "+cFirst+" "+modFirst);
	
	// closing Scanner
	sc.close();
	
	}
}