import java.util.Scanner;

public class ReplaceWordInSentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sentence
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();

        // Input the word to replace and the replacement word
        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.nextLine();

        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();

        // Call the method to replace the word
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        // Output the result
        System.out.println("Modified sentence: " + modifiedSentence);

        scanner.close();
    }

    // Method to replace the given word with another word in the sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Replace all occurrences of the old word with the new word
        return sentence.replace(oldWord, newWord);
    }
}
