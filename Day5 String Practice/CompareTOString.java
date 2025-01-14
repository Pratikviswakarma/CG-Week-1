import java.util.Scanner;
public class CompareTOString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take user input using the  Scanner next() method for 2 String variables
        System.out.println("Enter the first string: ");
        String str1 = scanner.next();
        // Take user input using the  Scanner next() method for 2 String variables
        System.out.println("Enter the second string: ");
        String str2 = scanner.next();
        System.out.println(compareStrings(str1, str2));
        scanner.close();
    }
    // Write a method to compare two strings using the charAt() method and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        // Use the String Built-In method to check if the results are the same and display the result
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
                
            }
        }

        return true;
        
    }
}
