import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Print the factors of the number
        System.out.println("The factors of " + number + " are:");

        // Loop from 1 to number-1 and check for factors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);  // Print the factor if the number is divisible by i
            }
        }

        // Also print the number itself as a factor (optional, since it is divisible by itself)
        System.out.println(number);

        scanner.close();
    }
}
