import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status
    public static String[][] calculateBMIStatus(double[][] heightWeightArray) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = heightWeightArray[i][0];
            double heightInCm = heightWeightArray[i][1];
            double heightInMeters = heightInCm / 100;

            double bmi = weight / (heightInMeters * heightInMeters);
            String status;

            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.format("%.2f", weight);
            result[i][1] = String.format("%.2f", heightInCm);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    // Method to display the result in tabular format
    public static void displayResult(String[][] bmiStatusArray) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", 
                bmiStatusArray[i][1], bmiStatusArray[i][0], 
                bmiStatusArray[i][2], bmiStatusArray[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] heightWeightArray = new double[10][2];

        // Taking user input for height and weight
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the weight (kg) of person " + (i + 1) + ":");
            heightWeightArray[i][0] = scanner.nextDouble();

            System.out.println("Enter the height (cm) of person " + (i + 1) + ":");
            heightWeightArray[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and status
        String[][] bmiStatusArray = calculateBMIStatus(heightWeightArray);

        // Display the result
        displayResult(bmiStatusArray);
    }
}
