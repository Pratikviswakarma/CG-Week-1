import java.util.Scanner; 

public class DivisibleByfive {  // Class definition
    public static void main(String[] args) { 
	
	    // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Number as input
        System.out.println("Enter a number for divisible by 5 or not ");
        int number = sc.nextInt();  
		
		// dispaly details
        System.out.println("Is the number "+number+" divisible by 5 ? "+(number%5==0));

        sc.close();
    }
}
