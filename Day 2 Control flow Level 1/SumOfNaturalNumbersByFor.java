import java.util.Scanner;

public class SumOfNaturalNumbersByFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of n
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Check if the number is a natural number
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Compute sum using for loop
            int sumForLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumForLoop += i; // Add i to sum
            }

            // Compute sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Compare the results
            System.out.println("Sum using for loop: " + sumForLoop);
            System.out.println("Sum using formula: " + sumFormula);

            // Check if both results are the same
            if (sumForLoop == sumFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There seems to be an error.");
            }
        }

        scanner.close();
    }
}
