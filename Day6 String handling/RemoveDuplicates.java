import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to remove duplicates
        String result = removeDuplicates(input);

        // Output the modified string
        System.out.println("String after removing duplicates: " + result);

        scanner.close();
    }

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] charPresence = new boolean[256]; // Array to track the presence of characters (ASCII size)

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If the character has not appeared before, add it to the result and mark it as present
            if (!charPresence[ch]) {
                result.append(ch);
                charPresence[ch] = true;
            }
        }

        // Return the modified string
        return result.toString();
    }
}
