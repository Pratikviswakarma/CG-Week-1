// Maximum of 10 or until 0

import java.util.Scanner;

public class MaximumUntilZero{
	
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	double[] arr=new double[10];
	double sum=0.0;
	int index=0;
	
	while(true){
		System.out.println("Enter choice in number 0 and negative to break loop ");
		int choice=sc.nextInt();
		if(index==9 || choice==0 || choice<0 ){
		break;
		}
		arr[index]=choice;
		index++;
	}
	
	for(int i=0;i<arr.length;i++){
	sum+=arr[i];
	}
	
	// Display the result of array
	for(int i=0;i<arr.length;i++){
	System.out.println("Total value are "+arr[i]);
	}
	
	System.out.println("Total sum is "+sum);
	
	// Closing scannner
	sc.close();
	
  }
}