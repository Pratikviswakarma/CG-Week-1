import java.util.Scanner;

public class LongestWordFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Call the method to find the longest word
        String longestWord = findLongestWord(sentence);

        // Output the longest word
        System.out.println("The longest word is: " + longestWord);

        scanner.close();
    }

    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        // Split the sentence into words using space as a delimiter
        String[] words = sentence.split(" ");

        // Initialize variables to store the longest word and its length
        String longestWord = "";
        int maxLength = 0;

        // Loop through each word in the array
        for (String word : words) {
            // If the current word is longer than the previous longest word, update
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }

        return longestWord;
    }
}
