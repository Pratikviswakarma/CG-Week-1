// Table of number

import java.util.Scanner;

public class Table{
	
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number for Table");
	int numForTable=sc.nextInt();
	
	// create a array that store number's Table
	int[] arrOfTable=new int[10];
	
	// Perform operations on array and counter 
	for(int i=0;i<arrOfTable.length;i++){
	arrOfTable[i]=(i+1)*numForTable;
	}
	
	// Display the result of array
	for(int i=0;i<arrOfTable.length;i++){
	System.out.println(numForTable+" * "+(i+1)+" = "+arrOfTable[i]);
	}
	
	
	
	// Closing scannner
	sc.close();
	
  }
}