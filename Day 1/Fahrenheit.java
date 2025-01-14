import java.util.Scanner;

public class Fahrenheit{
	public static void main(String []args){
	System.out.println("Welcome to Fahrenheit Conversion ");
	System.out.println("Enter Celsius for Fahrenheit ");
	Scanner sc=new Scanner(System.in);
	int celsius=sc.nextInt();
	int fahrenheit=(celsius*9/5)+32;
    System.out.println("Tempreature in Fahrenheit is "+fahrenheit);
	sc.close();
	
	}
}