import java.util.Scanner;


public class Substring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take user input using the  Scanner next() method for 2 String variables
        System.out.println("Enter the first string: ");
        String str1 = scanner.next();
        // Take user input using the  Scanner next() method for 2 String variables
        System.out.println("Enter the second string: ");
        String str2 = scanner.next();
        System.out.println(compareStrings(str1, str2));
        // Take user input using the  Scanner next() method for 2 String variables
        System.out.println("Enter the string: ");
        String str = scanner.next();
        // Take user input using the  Scanner next() method for 2 String variables
        System.out.println("Enter the start index: ");
        int start = scanner.nextInt();
        // Take user input using the  Scanner next() method for 2 String variables
        System.out.println("Enter the end index: ");
        int end = scanner.nextInt();
        System.out.println(subString(str, start, end));
        scanner.close();
}

// Method to compare two strings using the charAt() method
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

// Method to create a substring from a string using the charAt() method
public static String subString(String str, int start, int end) {
    StringBuilder result = new StringBuilder();
    for (int i = start; i < end; i++) {
        result.append(str.charAt(i));
    }
    return result.toString();
}
}

