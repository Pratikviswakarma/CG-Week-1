import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to toggle the case of each character
        String toggledString = toggleCase(input);

        // Output the modified string
        System.out.println("String after toggling case: " + toggledString);

        scanner.close();
    }

    // Method to toggle the case of each character
    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If the character is lowercase, convert it to uppercase
            if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            }
            // If the character is uppercase, convert it to lowercase
            else if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            }
            // If it's neither, just append the character as is (like digits or special characters)
            else {
                result.append(ch);
            }
        }

        // Return the toggled string
        return result.toString();
    }
}
