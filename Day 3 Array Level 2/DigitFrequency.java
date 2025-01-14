import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // Frequency array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Find the digits in the number and update their frequency
        while (number != 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        // Display the frequency of each digit
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }

        scanner.close();
    }
}
