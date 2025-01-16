import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int[] frequencyArray = new int[length];

        // Initialize frequency array and set duplicate characters to '0' in the char array
        for (int i = 0; i < length; i++) {
            if (charArray[i] == '0') {
                continue;
            }
            frequencyArray[i] = 1; // Initialize frequency to 1
            for (int j = i + 1; j < length; j++) {
                if (charArray[i] == charArray[j]) {
                    frequencyArray[i]++;
                    charArray[j] = '0'; // Mark duplicate characters as '0'
                }
            }
        }

        // Count distinct characters to determine the size of the result array
        int distinctCount = 0;
        for (int i = 0; i < length; i++) {
            if (charArray[i] != '0') {
                distinctCount++;
            }
        }

        // Create a 1D array to store characters and their frequencies
        String[] result = new String[distinctCount];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (charArray[i] != '0') {
                result[index] = charArray[i] + ": " + frequencyArray[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Find the frequency of characters
        String[] characterFrequencies = findCharacterFrequency(input);

        // Display the result
        System.out.println("Character frequencies in the string are:");
        for (String frequency : characterFrequencies) {
            System.out.println(frequency);
        }
    }
}
