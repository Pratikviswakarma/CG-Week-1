import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of n
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Check if the number is a natural number
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Compute sum using while loop
            int sumWhileLoop = 0;
            int i = 1;
            while (i <= n) {
                sumWhileLoop += i; // Add i to sum
                i++; // Increment i
            }

            // Compute sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Compare the results
            System.out.println("Sum using while loop: " + sumWhileLoop);
            System.out.println("Sum using formula: " + sumFormula);

            // Check if both results are the same
            if (sumWhileLoop == sumFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There seems to be an error.");
            }
        }

        scanner.close();
    }
}
