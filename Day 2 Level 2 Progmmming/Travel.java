import java.util.Scanner;  // Import the Scanner class for user input

public class Travel {  // Class definition
    public static void main(String[] args) {  // Main method

        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter their name
        System.out.println("Enter name");
        String name = sc.next();  // Read the user's name

        // Prompt user to enter the 'from' city
        System.out.println("Enter form city");
        String formCity = sc.next();  // Read the 'from' city

        // Prompt user to enter the 'via' city
        System.out.println("Enter via city");
        String viaCity = sc.next();  // Read the 'via' city

        // Prompt user to enter the 'to' city
        System.out.println("Enter to city");
        String toCity = sc.next();  // Read the 'to' city

        // Prompt user to enter the distance in miles
        System.out.println("Enter distance in miles");
        int distance = sc.nextInt();  // Read the distance in miles

        // Prompt user to enter the time taken in hours
        System.out.println("Enter time taken in hours");
        int time = sc.nextInt();  // Read the time taken in hours

        // Display the travel details
        System.out.println(name + " is going from " + formCity + " via " + viaCity + " to " + toCity 
            + " whose distance is " + distance + " miles and time taken is " + time + " hours.");

        // Close the Scanner object to free up resources
        sc.close();
    }
}
