import java.util.Scanner;

public class FizzBuzzByWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int i = 1; // Initialize the counter

            // Use while loop to iterate from 1 to the number
            while (i <= number) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } 
                // Check if the number is divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } 
                // Check if the number is divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
                // If none of the above conditions are true, print the number itself
                else {
                    System.out.println(i);
                }
                i++; // Increment the counter
            }
        }

        scanner.close();
    }
}
