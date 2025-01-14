// University's Fees 

public class UniversityFee{
	public static void main(String []args){
	// Student fee
	int fee=125000;
	
	// discount percentage 
	int discountPer=10;
	
	// discount
	int discount=(fee*discountPer)/100;
	
	// discounted fee or final fee
	int finalFee=fee-discount;
	
	// dispaly all deatails
	System.out.println("The discount ammount is INR "+discount+" and final discount fee is INR "+finalFee);
	
	
	}
}