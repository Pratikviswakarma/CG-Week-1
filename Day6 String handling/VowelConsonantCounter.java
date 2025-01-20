import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to count vowels and consonants
        int[] counts = countVowelsAndConsonants(input);

        // Output the result
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);

        scanner.close();
    }

    // Method to count vowels and consonants
    public static int[] countVowelsAndConsonants(String str) {
        int vowelsCount = 0;
        int consonantsCount = 0;

        // Convert the string to lowercase for easier comparison
        String lowerCaseInput = str.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < lowerCaseInput.length(); i++) {
            char ch = lowerCaseInput.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            }
            // Check if the character is a consonant
            else if (ch >= 'a' && ch <= 'z') {
                consonantsCount++;
            }
        }

        // Return the counts as an array
        return new int[]{vowelsCount, consonantsCount};
    }
}
