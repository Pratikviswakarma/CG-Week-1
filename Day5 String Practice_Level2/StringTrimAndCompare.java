import java.util.Scanner;

public class StringTrimAndCompare {

    // Method to trim leading and trailing spaces from a string using charAt() method
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

    // Method to create a substring using charAt() method with start and end indices
    public static String createSubstring(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
    }

    // Method to compare two strings using the charAt() method and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string to trim leading and trailing spaces:");
        String inputText = scanner.nextLine();

        // Using the trimSpaces method to find start and end indices of non-space characters
        int[] trimIndices = trimSpaces(inputText);

        // Create the trimmed string using the custom method
        String trimmedTextUsingCharAt = createSubstring(inputText, trimIndices[0], trimIndices[1]);

        // Using the built-in trim() method to trim the spaces
        String trimmedTextUsingBuiltIn = inputText.trim();

        // Compare the custom trimmed string with the built-in trimmed string
        boolean isEqual = compareStrings(trimmedTextUsingCharAt, trimmedTextUsingBuiltIn);

        // Display the results
        System.out.println("Trimmed string using charAt() method: \"" + trimmedTextUsingCharAt + "\"");
        System.out.println("Trimmed string using built-in trim() method: \"" + trimmedTextUsingBuiltIn + "\"");
        System.out.println("Are the two trimmed strings equal? " + isEqual);
    }
}
