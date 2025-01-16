import java.util.Scanner;

public class TextSplitter {

    // Method to find the length of a string without using the built-in length() method
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

    // Method to compare two string arrays and return a boolean
    public static boolean compareArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String inputText = scanner.nextLine();

        // Using the built-in split() method
        String[] splitWords = inputText.split(" ");

        // Using the user-defined splitTextWithoutSplit() method
        String[] customSplitWords = splitTextWithoutSplit(inputText);

        // Comparing the results
        boolean isEqual = compareArrays(splitWords, customSplitWords);

        // Displaying the results
        System.out.println("Words using split() method:");
        for (String word : splitWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using custom splitTextWithoutSplit() method:");
        for (String word : customSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nAre the results equal? " + isEqual);
    }
}
