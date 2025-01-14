import java.util.Scanner;  // Import the Scanner class for user input

public class ChocolateDistribution {  // Class definition
    public static void main(String[] args) {  // Main method

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the total number of chocolates
        System.out.println("Enter number of chocolate");
        int chocolate = sc.nextInt();  // Read the total number of chocolates

        // Prompt the user to enter the number of children
        System.out.println("Enter number of Children");
        int children = sc.nextInt();  // Read the number of children

        // Calculate how many chocolates each child gets when distributed equally
        int equallyDistributedChocolate = chocolate / children;  // Division for equal distribution

        // Calculate the number of remaining chocolates after equal distribution
        int remainingChocolate = chocolate % children;  // Modulus for remaining chocolates

        // Display the results: chocolates per child and remaining chocolates
        System.out.println("The numbers of chocolates each child gets is " + equallyDistributedChocolate + 
                           " and the number of remaining chocolate are " + remainingChocolate);

        // Close the Scanner to release resources
        sc.close();
    }
}
