import java.util.Scanner;  // Import the Scanner class for user input

public class AthleteInTriangularPark {  // Class definition for the program
    public static void main(String[] args) {  // Main method

        // Create Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the three sides of the triangular park
        System.out.println("Enter three sides of triangle ");
        
        // Prompt for and read the first side of the triangle
        System.out.println("Enter first side of triangle in meter ");
        int side1 = sc.nextInt();  // Read the first side length

        // Prompt for and read the second side of the triangle
        System.out.println("Enter second side of triangle in meter");
        int side2 = sc.nextInt();  // Read the second side length

        // Prompt for and read the third side of the triangle
        System.out.println("Enter third side of triangle in meter");
        int side3 = sc.nextInt();  // Read the third side length

        // Convert the target distance from kilometers to meters
        int distance = 5 * 1000;  // 5 kilometers converted to meters

        // Calculate the perimeter of the triangular park
        int perimeter = side1 + side2 + side3;  // Sum of all sides

        // Calculate the number of rounds the athlete must run to cover 5 km
        int rounds = distance / perimeter;  // Total distance divided by perimeter

        // Display the total number of rounds needed to complete 5 km
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km ");

        // Close the Scanner to release resources
        sc.close();
    }
}
