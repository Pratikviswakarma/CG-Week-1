import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // Get an integer input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize sum variable to zero and store the original number
        int sum = 0;
        int originalNumber = number;

        // Use a while loop to access each digit of the number
        while (originalNumber != 0) {
            // Find the remainder (last digit) using modulus operator
            int digit = originalNumber % 10;
            // Add the digit to the sum
            sum += digit;
            // Remove the last digit from the number
            originalNumber /= 10;
        }

        // Check if the number is perfectly divisible by the sum
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }
    }
}
