import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Method to check if a string is a palindrome by comparing characters from the start and end
    public static boolean isPalindromeIterative(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method to check if a string is a palindrome
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    // Logic 3: Method to check if a string is a palindrome using character arrays
    public static boolean isPalindromeUsingCharArray(String str) {
        char[] originalArray = str.toCharArray();
        char[] reverseArray = reverseString(str);

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper method to reverse a string using charAt() method
    public static char[] reverseString(String str) {
        int length = str.length();
        char[] reverseArray = new char[length];

        for (int i = 0; i < length; i++) {
            reverseArray[i] = str.charAt(length - 1 - i);
        }
        return reverseArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Palindrome check using iterative method
        boolean resultIterative = isPalindromeIterative(input);
        System.out.println("Is palindrome (Iterative check): " + resultIterative);

        // Palindrome check using recursive method
        boolean resultRecursive = isPalindromeRecursive(input, 0, input.length() - 1);
        System.out.println("Is palindrome (Recursive check): " + resultRecursive);

        // Palindrome check using character arrays
        boolean resultCharArray = isPalindromeUsingCharArray(input);
        System.out.println("Is palindrome (CharArray check): " + resultCharArray);
    }
}
