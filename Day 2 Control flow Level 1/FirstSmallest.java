import java.util.Scanner; 

public class FirstSmallest {  // Class definition
    public static void main(String[] args) { 
	
	    // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Numbers as input
        System.out.println("Enter a three numbers ");
        System.out.println("Enter number 1");
		int number1 = sc.nextInt();  
		System.out.println("Enter number 2");
		int number2 = sc.nextInt();  
		System.out.println("Enter number 3");
		int number3 = sc.nextInt();  
		
		// dispaly details
        System.out.println("Is the first number the smallest ? "+(number1>number2 && number1>number3));

        sc.close();
    }
}
