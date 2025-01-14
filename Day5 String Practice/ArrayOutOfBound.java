// Write a program to demonstrate ArrayIndexOutOfBoundsException
// Hint => 
// Define a variable of array of names and take input from the user
// Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program. 
// Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
// From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

import java.util.Scanner;
public class ArrayOutOfBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take user input using the Scanner next() method for 2 String variables
        System.out.println("Enter the number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name: ");
            names[i] = sc.next();
        }
        System.out.println("Enter the index: ");
        int index = sc.nextInt();
        System.out.println(generateException(names, index));
        sc.close();
    }

    // Write a method to generate an ArrayIndexOutOfBoundsException
    public static String generateException(String[] names, int index) {
        try {
            return names[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "ArrayIndexOutOfBoundsException caught";
        } catch (Exception e) {
            return "Generic Exception caught";
        }
    }
}