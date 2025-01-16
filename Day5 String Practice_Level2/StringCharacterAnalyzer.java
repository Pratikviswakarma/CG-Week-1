import java.util.Scanner;

public class StringCharacterAnalyzer {

    // Method to check if the character is a vowel, consonant, or not a letter
    public static String checkVowelOrConsonant(char ch) {
        // Convert to lowercase if it's an uppercase letter
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);  // Convert to lowercase using ASCII values
        }

        // Check if the character is a letter
        if (ch >= 'a' && ch <= 'z') {
            // Check if it's a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants in a string and return the character and its type in a 2D array
    public static String[][] findVowelsAndConsonants(String text) {
        String[][] result = new String[text.length()][2];

        // Loop through each character of the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type = checkVowelOrConsonant(ch);
            result[i][0] = String.valueOf(ch);  // Store the character
            result[i][1] = type;  // Store its type (Vowel, Consonant, or Not a Letter)
        }
        return result;
    }

    // Method to display the 2D array of characters and their types in a tabular format
    public static void displayCharacterTypes(String[][] result) {
        System.out.println("Character | Type");
        System.out.println("-----------------");
        for (int i = 0; i < result.length; i++) {
            if (result[i][0] != null) {  // Avoid printing null values
                System.out.println(result[i][0] + "        | " + result[i][1]);
            }
        }
    }

    // Method to trim leading and trailing spaces from a string using the charAt() method
    public static int[] trimSpaces(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Find the index of the first non-space character
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Find the index of the last non-space character
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt() method with given start and end indices
    public static String createSubstring(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the first part of the program
        System.out.println("Enter a string to analyze vowels and consonants:");
        String inputText = scanner.nextLine();

        // Calling the method to find vowels and consonants
        String[][] result = findVowelsAndConsonants(inputText);

        // Displaying the results in a tabular format
        displayCharacterTypes(result);

        // Taking user input for trimming spaces and creating a substring
        System.out.println("\nEnter a string to trim leading and trailing spaces:");
        String textToTrim = scanner.nextLine();

        // Calling the method to trim spaces and get start and end indices
        int[] trimIndices = trimSpaces(textToTrim);

        // Create and display the trimmed substring
        String trimmedText = createSubstring(textToTrim, trimIndices[0], trimIndices[1]);
        System.out.println("Trimmed text: " + trimmedText);
    }
}
