// Multiplication of Table

import java.util.Scanner;

public class MultiplicationTable{
	
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number for Table 6 to 9");
	int numForTable=sc.nextInt();
	
	// create a array that store number's Table
	int[] arr=new int[3];
	
	// Perform operations on array and counter 
	for(int i=0;i<arr.length;i++){
	arr[i]=(6+i)*numForTable;
	}
	
	// Display the result of array
	for(int i=0;i<arr.length;i++){
	System.out.println(numForTable+" * "+(i+6)+" = "+arr[i]);
	}
	
	// Closing scannner
	sc.close();
	
  }
}