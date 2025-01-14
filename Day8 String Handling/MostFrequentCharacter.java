import java.util.Scanner;

public class MostFrequentCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to find the most frequent character
        char mostFrequentChar = findMostFrequentCharacter(input);

        // Output the result
        System.out.println("The most frequent character is: " + mostFrequentChar);

        scanner.close();
    }

    // Method to find the most frequent character
    public static char findMostFrequentCharacter(String str) {
        int[] frequency = new int[256]; // ASCII characters (0 to 255)
        int maxCount = 0;
        char mostFrequentChar = '\0';

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Increment the frequency of the character
            frequency[ch]++;

            // If this character's frequency is greater than the max, update the max and the most frequent character
            if (frequency[ch] > maxCount) {
                maxCount = frequency[ch];
                mostFrequentChar = ch;
            }
        }

        return mostFrequentChar;
    }
}
