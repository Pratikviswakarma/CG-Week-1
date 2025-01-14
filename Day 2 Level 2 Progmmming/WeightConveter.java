import java.util.Scanner;  // Import the Scanner class for user input

public class WeightConveter {  // Class definition
    public static void main(String[] args) {  // Main method

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.println("Enter weight in pound ");
        int pound = sc.nextInt();  // Read the weight in pounds

        // Convert the weight from pounds to kilograms (1 pound = 2.2 kilograms)
        double kilogram = pound * 2.2;

        // Display the weight in both pounds and kilograms
        System.out.println("The weight of the person in pound is " + pound + " and in kg is " + kilogram);

        // Close the Scanner to release resources
        sc.close();
    }
}
