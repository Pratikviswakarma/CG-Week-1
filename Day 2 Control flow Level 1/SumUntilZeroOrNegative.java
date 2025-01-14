import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0; // Initialize the total to 0.0

        while (true) { // Infinite loop
            System.out.print("Enter a number (enter 0 or a negative number to stop): ");
            double userInput = scanner.nextDouble();

            // Check if the user entered 0 or a negative number
            if (userInput <= 0) {
                break; // Exit the loop
            }

            total += userInput; // Add the user input to the total
        }

        // Output the total sum
        System.out.println("The total sum is: " + total);

        scanner.close();
    }
}
