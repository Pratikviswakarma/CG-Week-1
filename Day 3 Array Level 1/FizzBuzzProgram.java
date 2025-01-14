import java.util.Scanner;

public class FizzBuzzProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for a number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Validate input
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        // Create a String array to save the results
        String[] results = new String[number + 1];
        
        // Loop from 0 to the given number
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }
        
        // Displaying the results with the index position
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
