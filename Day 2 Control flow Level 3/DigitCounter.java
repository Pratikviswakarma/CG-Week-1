import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        // Get an integer input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize count variable to zero
        int count = 0;

        // Use a loop to iterate until number is not equal to 0
        while (number != 0) {
            // Remove the last digit from number
            number /= 10;
            // Increase count by 1 in each iteration
            count++;
        }

        // Display the count to show the number of digits
        System.out.println("Number of digits: " + count);
    }
}
