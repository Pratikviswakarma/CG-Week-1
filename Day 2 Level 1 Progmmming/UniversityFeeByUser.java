// University's Fees by User Input

// import statement
import java.util.Scanner;

public class UniversityFeeByUser{
	public static void main(String []args){
	
	// Create Scanner reference 
	Scanner sc=new Scanner(System.in);
	// Student fee
	System.out.println("Enter Studnets fee");
	int fee=sc.nextInt();
	
	// discount percentage 
	System.out.println("Enter discount percentage");
	int discountPer=sc.nextInt();
	
	// discount
	int discount=(fee*discountPer)/100;
	
	// discounted fee or final fee
	int finalFee=fee-discount;
	
	// dispaly all deatails
	System.out.println("The discount ammount is INR "+discount+" and final discount fee is INR "+finalFee);
	
	// closing Scanner
	sc.close();
	
	}
}