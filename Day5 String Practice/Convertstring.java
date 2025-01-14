import java.util.*;

public class Convertstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = scanner.nextLine();

        // Convert text to uppercase using built-in method
        String upperCaseText = text.toUpperCase();

        // Convert text to uppercase using custom method
        String customUpperCaseText = convertToUpperCase(text);

        // Compare the two strings
        boolean areEqual = compareStrings(upperCaseText, customUpperCaseText);

        // Display the result
        System.out.println("Built-in toUpperCase: " + upperCaseText);
        System.out.println("Custom toUpperCase: " + customUpperCaseText);
        System.out.println("Are both strings equal? " + areEqual);

        // Split text into words and get their lengths
        String[] words = splitText(text);
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Display the words and their lengths
        System.out.println("Words and their lengths:");
        for (String[] wordWithLength : wordsWithLengths) {
            System.out.println("Word: " + wordWithLength[0] + ", Length: " + wordWithLength[1]);
            scanner.close();
        }
    }

    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static String[] splitText(String text) {
        List<String> words = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words.add(text.substring(start, i));
                start = i + 1;
            }
        }
        words.add(text.substring(start));
        return words.toArray(new String[0]);
    }

    public static int getStringLength(String text) {
        int length = 0;
        for (int i = 0; i < text.length(); i++) {
            length++;
        }
        return length;
    }

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }
}