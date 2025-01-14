import java.util.Scanner;

public class FactorialByFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int factorial = 1;

            // Compute the factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply factorial by i
            }

            // Print the factorial
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}
