import java.util.Scanner;

public class WordWithLength {

    // Method to find the length of a string without using the length() method
    public static int findLength(String str) {
        int length = 0;
        while (true) {
            try {
                str.charAt(length);
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return length;
    }

    // Method to split the text into words using charAt() method
    public static String[] splitTextWithoutSplit(String text) {
        // Find the length of the string
        int length = findLength(text);
        
        // Count the number of words in the string
        int wordCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++;  // As the last word won't be followed by a space

        // Create an array to store the indexes of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int spaceIndex = 0;
        int wordIndex = 0;
        
        // Find the positions of the spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex] = i;
                spaceIndex++;
            }
        }

        // Create an array to store the words
        String[] words = new String[wordCount];
        int startIndex = 0;
        
        for (int i = 0; i < wordCount; i++) {
            int endIndex;
            if (i == wordCount - 1) {
                endIndex = length;
            } else {
                endIndex = spaceIndexes[i];
            }
            words[i] = text.substring(startIndex, endIndex);
            startIndex = endIndex + 1;
        }
        return words;
    }

    // Method to convert the word array into a 2D array with word and its length
    public static String[][] getWordWithLength(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int length = findLength(word);
            wordLengthArray[i][0] = word;
            wordLengthArray[i][1] = String.valueOf(length);
        }
        return wordLengthArray;
    }

    // Method to display the result in tabular format
    public static void displayResult(String[][] wordLengthArray) {
        System.out.printf("%-15s %-15s\n", "Word", "Length");
        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.printf("%-15s %-15d\n", wordLengthArray[i][0], Integer.parseInt(wordLengthArray[i][1]));
        }
    }

    public static void main(String[] args) {
        // Taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String inputText = scanner.nextLine();

        // Using the user-defined method to split text into words
        String[] words = splitTextWithoutSplit(inputText);

        // Get the words along with their lengths in a 2D array
        String[][] wordLengthArray = getWordWithLength(words);

        // Display the result in tabular format
        displayResult(wordLengthArray);
    }
}
