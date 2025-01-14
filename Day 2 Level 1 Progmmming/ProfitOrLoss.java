// Calculate Profit and loss 

public class ProfitOrLoss{
	public static void main(String []args){
	// Cost price
	int costPrice=129;
	
	// selling price
	int sellingPrice=191;
	
	// calculating Profit
	int profit=sellingPrice-costPrice;
	
	// calculating Profit percentage
	double profitPercentage=(profit*100)/costPrice;
	
	// dispaly all deatails
	System.out.println("The Cose Price in INR "+costPrice+" and Selling Price in INR "+sellingPrice+"\nThe Profit is INR "+profit+" and the Profit Percentage is "+profitPercentage);
	
	
	
	}
}