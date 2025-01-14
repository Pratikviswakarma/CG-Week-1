import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Get an integer input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize sum variable to zero and store the original number
        int sum = 0;
        int originalNumber = number;

        // Use a while loop until the originalNumber is not equal to zero
        while (originalNumber != 0) {
            // Find the remainder (last digit) using modulus operator
            int remainder = originalNumber % 10;
            // Find the cube of the remainder and add it to the sum
            sum += Math.pow(remainder, 3);
            // Remove the last digit by using integer division
            originalNumber /= 10;
        }

        // Check if the sum is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
