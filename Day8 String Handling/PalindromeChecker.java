import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to check if the string is a palindrome
        boolean isPalindrome = isPalindrome(input);

        // Output the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

    // Method to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase for case-insensitive comparison
        String lowerStr = str.toLowerCase();

        // Initialize pointers for the start and end of the string
        int left = 0;
        int right = lowerStr.length() - 1;

        // Compare characters from both ends of the string
        while (left < right) {
            if (lowerStr.charAt(left) != lowerStr.charAt(right)) {
                return false; // Not a palindrome if characters don't match
            }
            left++;
            right--;
        }

        return true; // The string is a palindrome
    }
}
