import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkVowelOrConsonant(char ch) {
        // Convert to lowercase if it's an uppercase letter
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);  // Convert to lowercase using ASCII values
        }

        // Check if the character is a letter
        if (ch >= 'a' && ch <= 'z') {
            // Check if it's a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants in a string and return their counts
    public static int[] countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Loop through each character of the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String result = checkVowelOrConsonant(ch);

            // Increment the counts based on the result
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        // Return the counts in an array: [vowelCount, consonantCount]
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        // Taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputText = scanner.nextLine();

        // Calling the method to count vowels and consonants
        int[] counts = countVowelsAndConsonants(inputText);

        // Displaying the result
        System.out.println("Vowels count: " + counts[0]);
        System.out.println("Consonants count: " + counts[1]);
    }
}
