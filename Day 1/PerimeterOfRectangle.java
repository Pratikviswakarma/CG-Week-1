import java.util.Scanner;

public class PerimeterOfRectangle{
	public static void main(String [] args){
	System.out.println("Welcome");
	System.out.println("Enter Length and Width ");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Length");
	int len=sc.nextInt();
	System.out.println("Enter Width");
	int wid=sc.nextInt();
	
	int perimeter=2*(len+wid);
	
	System.out.println("Perimeter of rectangle is "+perimeter);
	sc.close();
	
	
	}
}