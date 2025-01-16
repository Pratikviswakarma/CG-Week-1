import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static int[][] findCharacterFrequency(String str) {
        int[] charFrequency = new int[256]; // Array to store frequency of each ASCII character

        // Loop through the string to calculate the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            charFrequency[str.charAt(i)]++;
        }

        // Count distinct characters to determine the size of the result array
        int distinctCount = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                distinctCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        int[][] result = new int[distinctCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                result[index][0] = i; // Store ASCII value of the character
                result[index][1] = charFrequency[i]; // Store frequency
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Find the frequency of characters
        int[][] characterFrequencies = findCharacterFrequency(input);

        // Display the result
        System.out.println("Character frequencies in the string are:");
        for (int i = 0; i < characterFrequencies.length; i++) {
            char character = (char) characterFrequencies[i][0];
            int frequency = characterFrequencies[i][1];
            System.out.println(character + ": " + frequency);
        }
    }
}
