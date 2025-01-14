import java.util.Scanner;  // Import the Scanner class for user input

public class SimpleInterest {  // Class definition
    public static void main(String[] args) {  // Main method

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the principal, rate, and time for calculating simple interest
        System.out.println("Enter principal, rate and time");

        // Prompt and read the principal amount
        System.out.println("Enter principal");
        int principal = sc.nextInt();  // Read the principal amount

        // Prompt and read the rate of interest
        System.out.println("Enter rate");
        int rate = sc.nextInt();  // Read the rate of interest

        // Prompt and read the time period in years
        System.out.println("Enter time");
        int time = sc.nextInt();  // Read the time period

        // Calculate the simple interest using the formula (Principal * Rate * Time) / 100
        int simpleInterest = (principal * rate * time) / 100;

        // Display the calculated simple interest along with the input values
        System.out.println("The Simple Interest is " + simpleInterest + 
                           " for principal " + principal + ", rate of interest " + rate + " and time " + time);

        // Close the Scanner to release resources
        sc.close();
    }
}
