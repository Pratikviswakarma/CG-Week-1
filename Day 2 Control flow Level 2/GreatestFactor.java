import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the greatestFactor variable
        int greatestFactor = 1;

        // Loop to find the greatest factor (besides the number itself)
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;  // Break the loop once the greatest factor is found
            }
        }

        // Output the greatest factor
        System.out.println("The greatest factor of " + number + " (besides the number itself) is: " + greatestFactor);

        scanner.close();
    }
}
