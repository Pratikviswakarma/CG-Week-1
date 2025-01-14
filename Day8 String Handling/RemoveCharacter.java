import java.util.Scanner;

public class RemoveCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Input the character to be removed
        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        // Call the method to remove the character from the string
        String result = removeCharacter(input, charToRemove);

        // Output the result
        System.out.println("String after removing '" + charToRemove + "': " + result);

        scanner.close();
    }

    // Method to remove all occurrences of a specific character from the string
    public static String removeCharacter(String str, char ch) {
        // Use StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Append the character to the result if it's not the one to be removed
            if (currentChar != ch) {
                result.append(currentChar);
            }
        }

        // Return the final string with the character removed
        return result.toString();
    }
}
