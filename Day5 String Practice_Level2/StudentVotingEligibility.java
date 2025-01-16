import java.util.Random;
import java.util.Scanner;

public class StudentVotingEligibility {

    // Method to generate random ages for students
    public static int[] generateRandomAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        
        // Generate random 2-digit age (between 10 and 99)
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10;  // Random number between 10 and 99
        }
        return ages;
    }

    // Method to check if the student can vote based on their age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            // Validate the age for negative values
            if (ages[i] < 0) {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Invalid Age - Cannot Vote";
            } else if (ages[i] >= 18) {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Can Vote";
            } else {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayVotingEligibility(String[][] result) {
        System.out.println("Age  | Eligibility");
        System.out.println("-----------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "  | " + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of students (10 students)
        System.out.println("Enter the number of students (10): ");
        int numStudents = 10; // Hardcoded to 10 as per the problem

        // Generate random ages for the students
        int[] ages = generateRandomAges(numStudents);

        // Check voting eligibility based on age
        String[][] eligibilityResult = checkVotingEligibility(ages);

        // Display the result in tabular format
        displayVotingEligibility(eligibilityResult);
    }
}
