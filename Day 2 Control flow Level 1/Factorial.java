import java.util.Scanner;

public class Factorial {
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
            int i = 1;

            // Compute the factorial using while loop
            while (i <= number) {
                factorial *= i; // Multiply factorial by i
                i++; // Increment i
            }

            // Print the factorial
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}
