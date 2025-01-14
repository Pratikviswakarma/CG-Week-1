// Write a program to convert the complete text to uppercase and compare the results
// Hint => 
// Take user input using the  Scanner nextLine() method to take the complete text into a String variable
// Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
// Write a method to compare two strings using the charAt() method and return a boolean result
// In the main() use the String built-in method toLowerCase() to get the Uppercase Text and compare the two strings using the user-defined method. And finally display the result

import java.util.Scanner;
public class Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take user input using the  Scanner nextLine() method to take the complete text into a String variable
        System.out.println("Enter the text: ");
        String text = sc.nextLine();
        // Call the user-defined method and the String built-in toLowerCase() method, compare the 2 strings, and finally display the result
        System.out.println("User-defined method: " + convertToUpperCase(text));
        System.out.println("Built-in method: " + text.toUpperCase());
        System.out.println(compareStrings(convertToUpperCase(text), text.toUpperCase()));
        sc.close();
    }

    // Write a method to compare two strings using the charAt() method and return a boolean result
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
    // Write a method using the String built-in charAt() method to convert each character if it
    // is lowercase to the Upper Case. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the
    // difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
    public static String convertToUpperCase(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result[i] = (char) (c - 32);
            } else {
                result[i] = c;
            }
        }
        return new String(result);
    }
}