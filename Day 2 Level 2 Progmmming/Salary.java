// Total Income

// import statement
import java.util.Scanner;

public class Salary{
	public static void main(String []args){
	
	// Create Scanner reference 
	Scanner sc=new Scanner(System.in);
	
	// Salary
	System.out.println("Enter Salary");
	int salary=sc.nextInt();
	
	// Bonus 
	System.out.println("Enter Bonus");
	int bonus=sc.nextInt();
	
	// Total Salary
	int totalSalary=salary+bonus;
	
	// dispaly all details
	System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+" Hence Total Income is INR "+totalSalary);
	
	// closing Scanner
	sc.close();
	
	}
}