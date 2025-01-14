// Students Age

import java.util.Scanner;

public class StudentCanVote{
	
	public static void main(String[] args){
	System.out.println("Enter 10 student age for voting");
	Scanner sc=new Scanner(System.in);
	
	// create a array that store age of students
	int[] arr=new int[10];
	
	// take input
	for(int i=0;i<arr.length;i++){
	System.out.println("Enter age of student");
	arr[i]=sc.nextInt();
	}
	
	// itrate array and find student can able to vote or not
	for(int i=0;i<arr.length;i++){
	if(arr[i]<0)
	{
	System.out.println("Invalid Age");
	} else if(arr[i]>=18)
	{
	System.out.println("The student with the age "+arr[i]+" can vote.");
	}else{
	System.out.println("The student with the age "+arr[i]+" cannot vote.");
	}
	}
	// Closing scannner
	sc.close();
	
  }
}