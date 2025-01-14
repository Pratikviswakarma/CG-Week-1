import java.util.Scanner;

public class ReturnChar
{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take user input using the  Scanner next() method for 2 String variables
        System.out.println("Enter the string: ");
        String str = sc.next();
        // Call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, and finally display the result
        System.out.println("User-defined method: " + new String(returnCharacters(str)));
        System.out.println("Built-in method: " + new String(str.toCharArray()));
        System.out.println(compareArrays(returnCharacters(str), str.toCharArray()));
        sc.close();
        }
        public static char[] returnCharacters(String str) {
            // Write a method to return the characters in a string without using the toCharArray()
            char[] result = new char[str.length()];
            for (int i = 0; i < str.length(); i++) {
                result[i] = str.charAt(i);
            }
            return result;
            }
            public static boolean compareArrays(char[] arr1, char[] arr2) {
                // Write a method to compare two string arrays and return a boolean result
                if (arr1.length != arr2.length) {
                    return false;
                }
                for (int i = 0; i < arr1.length; i++) {
                    if (arr1[i] != arr2[i]) {
                        return false;
                    }
                }  
                return true;

    }   
}