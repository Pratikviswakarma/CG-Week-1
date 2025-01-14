import java.util.Scanner;

public class StringReverser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to reverse the string using StringBuilder
        String reversedString = reverseString(input);

        // Output the reversed string
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }

    // Method to reverse a string using StringBuilder's reverse method
    public static String reverseString(String str) {
        // Create a StringBuilder object and append the string to it
        StringBuilder stringBuilder = new StringBuilder(str);

        // Use the reverse() method to reverse the string
        stringBuilder.reverse();

        // Convert the StringBuilder back to a string and return it
        return stringBuilder.toString();
    }
}
