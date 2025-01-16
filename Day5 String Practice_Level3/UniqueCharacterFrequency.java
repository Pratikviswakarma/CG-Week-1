import java.util.Scanner;

public class UniqueCharacterFrequency {

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String str) {
        int length = str.length();
        char[] tempArray = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            // Check if the character has appeared before in the string
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to the result array
            if (isUnique) {
                tempArray[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array with the exact number of unique characters
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempArray[i];
        }

        return uniqueChars;
    }

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String str) {
        int[] charFrequency = new int[256]; // Array to store frequency of each ASCII character

        // Loop through the string to calculate the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            charFrequency[str.charAt(i)]++;
        }

        // Get the unique characters
        char[] uniqueChars = findUniqueCharacters(str);

        // Create a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]); // Store character
            result[i][1] = String.valueOf(charFrequency[uniqueChars[i]]); // Store frequency
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Find the frequency of unique characters
        String[][] characterFrequencies = findCharacterFrequency(input);

        // Display the result
        System.out.println("Unique character frequencies in the string are:");
        for (int i = 0; i < characterFrequencies.length; i++) {
            System.out.println(characterFrequencies[i][0] + ": " + characterFrequencies[i][1]);
        }
    }
}
