import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Call the method to check if the strings are anagrams
        boolean areAnagrams = areAnagrams(str1, str2);

        // Output the result
        if (areAnagrams) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }

        scanner.close();
    }

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // If the strings are not the same length, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert the strings to character arrays
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        // Sort both character arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare the sorted arrays
        return Arrays.equals(array1, array2);
    }
}
