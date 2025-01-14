// Write a program to demonstrate StringIndexOutOfBoundsException
// Hint => 
// Define a variable of type String and take user input to assign a value
// Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. This will generate a runtime exception and abruptly stop the program.
// Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. Then write try catch block for Exception while accessing the String method
// From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

import java.util.Scanner;

public class IndexOutOfBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take user input using the Scanner next() method for 2 String variables
        System.out.println("Enter the string: ");
        String str = sc.next();
        System.out.println("Enter the index: ");
        int index = sc.nextInt();
        System.out.println(generateException(str, index));
        sc.close();
    }

    // Write a method to generate a StringIndexOutOfBoundsException
    public static String generateException(String str, int index) {
        try {
            return String.valueOf(str.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            return "StringIndexOutOfBoundsException caught";
        }
    }
}
