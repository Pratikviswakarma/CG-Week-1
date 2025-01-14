import java.util.Scanner;

public class Average{
	public static void main(String []args){
	System.out.println("Welcome");
	System.out.println("Enter 3 (Three) Numbers ");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First Number");
	int fno=sc.nextInt();
	System.out.println("Enter Second Number");
	int sno=sc.nextInt();
	System.out.println("Enter Third Number");
	int tno=sc.nextInt();
	
	double avg=(fno+sno+tno)/3.0;
	
	System.out.println("Average of Three Numbers are "+avg);
	sc.close();
	}
}