import java.util.Scanner;

public class SimpleInterest{
	public static void main(String []args){
	System.out.println("Welcome");
	System.out.println("Enter Principal, Rate and Time");
	System.out.println("Enter Principal");
	Scanner sc=new Scanner(System.in);
	int principal=sc.nextInt();
	System.out.println("Enter Rate");
	int rate=sc.nextInt();
	System.out.println("Enter Time");
	int time=sc.nextInt();
	
	int simInt=(principal*rate*time)/100;
	System.out.println("Your simpleInterest is "+simInt);
	sc.close();
	
	}
}