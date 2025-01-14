import java.util.Scanner;

public class Addition{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 Numbers for Addition");
	System.out.println("Enter First Number");
	int fno=sc.nextInt();
	System.out.println("Enter Second Number");
	int sno=sc.nextInt();
	
	System.out.println("Result of Addition is "+ (fno+sno));
	sc.close();
	
	}
}