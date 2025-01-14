import java.util.Scanner;

public class Miles{
	public static void main(String [] args){
	System.out.println("Welcome");
	System.out.println("Enter distance in kilometers ");
	Scanner sc=new Scanner(System.in);
	int kilometer=sc.nextInt();
    double miles=kilometer*0.621371;
	
	System.out.println("Distance in Miles is "+miles);
	sc.close();
	}
}