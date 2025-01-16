import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingCharacter(String str) {
        int[] charFrequency = new int[256]; // Array to store frequency of each ASCII character

        // Loop through the string to calculate the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            charFrequency[str.charAt(i)]++;
        }

        // Loop through the string to find the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            if (charFrequency[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        // If no non-repeating character is found, return a default value
        return '\0'; // Null character to indicate no non-repeating character found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(input);

        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
