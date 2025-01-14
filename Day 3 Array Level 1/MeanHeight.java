// Height of player in footboll team

import java.util.Scanner;

public class MeanHeight{
	
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	// Array that store height of players and take input
	double[] arr=new double[11];
	for(int i=0;i<arr.length;i++){
	System.out.println("Enter height of player "+(i+1));
	arr[i]=sc.nextDouble();
	}
	
	// Calculating sum of all element
	double sum=0.0;
	for(int i=0;i<arr.length;i++){
	sum+=arr[i];
	}
	
	// Mean height of player
	double mean=sum/(arr.length);
	
	
	// Display the result
	System.out.println("The mean height of the football team is "+mean);
	
	// Closing scannner
	sc.close();
	
  }
}