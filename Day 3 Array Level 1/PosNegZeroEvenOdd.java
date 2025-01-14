// postive, negative or zero and evon or odd

import java.util.Scanner;

public class PosNegZeroEvenOdd{
	
	public static void main(String[] args){
	System.out.println("Enter 5 numbers ");
	Scanner sc=new Scanner(System.in);
	
	// create a array that store numbers
	int[] arr=new int[5];
	
	// take input
	for(int i=0;i<arr.length;i++){
	System.out.println("Enter numbers");
	arr[i]=sc.nextInt();
	}
	
	// Perform operations on numbers  
	for(int i=0;i<arr.length;i++){
	if(arr[i]>0)
	{
	   if(arr[i]%2==0)
	   {
	    System.out.println(arr[i]+" is postive and Even as well");
	   }else{
	   System.out.println(arr[i]+" is postive and odd as well");
	   }
	} else if(arr[i]<0)
	{
	System.out.println(arr[i]+" Number is negative");
	}else if(arr[i]==0){
	System.out.println(arr[i]+" Number is zero");
	}
	}
	
	// Performing operation on first and last element
	int fisLast=arr[0]-arr[arr.length-1];
	
	if(fisLast==0){
	System.out.println("Both number are equal");
	}else if(fisLast>0){
	System.out.println("First element is greater than last");
	} else{
	System.out.println("First element is smaller than last");
	}
	
	// Closing scannner
	sc.close();
	
  }
}