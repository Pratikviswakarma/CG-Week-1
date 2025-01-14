import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0; // Initialize the total to 0.0
        double userInput;

        // Prompt the user for input
        System.out.print("Enter a number (enter 0 to stop): ");
        userInput = scanner.nextDouble();

        // Loop until the user enters 0
        while (userInput != 0) {
            total += userInput; // Add the user input to the total
            System.out.print("Enter another number (enter 0 to stop): ");
            userInput = scanner.nextDouble(); // Ask for input again
        }

        // Output the total sum
        System.out.println("The total sum is: " + total);

        scanner.close();
    }
}
