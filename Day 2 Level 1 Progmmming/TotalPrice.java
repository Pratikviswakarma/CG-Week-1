// Calculate total price

// import statement
import java.util.Scanner;

public class TotalPrice{
	public static void main(String []args){
	
	// Create Scanner reference 
	Scanner sc=new Scanner(System.in);
	
	// Unitprice and quantity 
	System.out.println("Enter unit price and quantity");
	System.out.println("Enter unit price");
	double unitPrice=sc.nextInt();
	System.out.println("Enter quantity");
	int quantity=sc.nextInt();
	
	// calculating total price 
	double totalPrice=unitPrice*quantity;
	
	// dispaly all details
	System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
	
	// closing Scanner
	sc.close();
	
	}
}