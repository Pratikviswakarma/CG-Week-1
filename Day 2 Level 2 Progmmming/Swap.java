import java.util.Scanner;  // Import the Scanner class for taking input from the user

public class Swap {  // Class definition
    public static void main(String[] args) {  // Main method

        // Create Scanner reference for input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.println("Enter first number ");
        int number1 = sc.nextInt();  // Read first number

        // Prompt user to enter the second number
        System.out.println("Enter second number ");
        int number2 = sc.nextInt();  // Read second number

        // Use a temporary variable to swap the values of number1 and number2
        int temp = number1;  // Store number1 in temp
        number1 = number2;   // Assign the value of number2 to number1
        number2 = temp;      // Assign the value stored in temp to number2

        // Display the swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        // Close the Scanner to free up resources
        sc.close();
    }
}
