import java.util.Scanner;

public class AreaOfCircle{
	public static void main(String []args){
		System.out.println("Welcome");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius for area of circle");
		int radius=sc.nextInt();
		double area=3.14*radius*radius;
		
		System.out.println("Area of circle is "+area);
		sc.close();
	}
}