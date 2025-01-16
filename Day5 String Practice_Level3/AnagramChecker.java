import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Check if lengths of the two strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create arrays to store the frequency of characters in the strings
        int[] frequency1 = new int[256]; // For str1
        int[] frequency2 = new int[256]; // For str2

        // Find the frequency of characters in the first string
        for (int i = 0; i < str1.length(); i++) {
            frequency1[str1.charAt(i)]++;
        }

        // Find the frequency of characters in the second string
        for (int i = 0; i < str2.length(); i++) {
            frequency2[str2.charAt(i)]++;
        }

        // Compare the frequency of characters in the two strings
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the two strings
        System.out.println("Enter the first string:");
        String input1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String input2 = scanner.nextLine();

        // Check if the strings are anagrams
        boolean result = areAnagrams(input1, input2);

        // Display the result
        if (result) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
