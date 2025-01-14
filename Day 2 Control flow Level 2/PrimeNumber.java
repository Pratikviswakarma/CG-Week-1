import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize isPrime as true assuming the number is prime
        boolean isPrime = true;

        // Check for numbers greater than 1
        if (number <= 1) {
            isPrime = false; // 1 and numbers less than 1 are not prime
        } else {
            // Loop through numbers from 2 to number-1
            for (int i = 2; i <= Math.sqrt(number); i++) {
                // Check if the number is divisible by any number between 2 and number-1
                if (number % i == 0) {
                    isPrime = false; // Number is divisible by a number other than 1 and itself
                    break; // Exit the loop as no need to check further
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}
