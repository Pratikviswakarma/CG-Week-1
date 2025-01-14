import java.util.Scanner;

public class BMI_Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        // Create a 2D array to store height, weight, and BMI
        double[][] personData = new double[number][3];  // [0] = height, [1] = weight, [2] = BMI
        String[] weightStatus = new String[number];     // Array to store weight status

        // Input data for height and weight and calculate BMI
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");

            // Input for height and weight
            double height = -1, weight = -1;

            // Validate height
            while (height <= 0) {
                System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a positive value for height.");
                }
            }

            // Validate weight
            while (weight <= 0) {
                System.out.print("Enter weight (in kilograms) for person " + (i + 1) + ": ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a positive value for weight.");
                }
            }

            // Store height and weight in the 2D array
            personData[i][0] = height;
            personData[i][1] = weight;

            // Calculate BMI: BMI = weight / (height * height)
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine weight status based on BMI
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display height, weight, BMI, and weight status of each person
        System.out.println("\nSummary:");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][0] + " meters");
            System.out.println("Weight: " + personData[i][1] + " kilograms");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println();
        }

        scanner.close();
    }
}
