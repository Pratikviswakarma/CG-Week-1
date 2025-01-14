import java.util.Scanner;

public class StringComparer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Call the method to compare the strings lexicographically
        int result = compareStringsLexicographically(str1, str2);

        // Output the comparison result
        if (result < 0) {
            System.out.println("The first string is lexicographically smaller.");
        } else if (result > 0) {
            System.out.println("The first string is lexicographically greater.");
        } else {
            System.out.println("The two strings are lexicographically equal.");
        }

        scanner.close();
    }

    // Method to compare two strings lexicographically using compareTo
    public static int compareStringsLexicographically(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
