import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ":");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid salary:");
                scanner.next();
            }
            salaries[i] = scanner.nextDouble();

            System.out.println("Enter years of service for employee " + (i + 1) + ":");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number of years:");
                scanner.next();
            }
            yearsOfService[i] = scanner.nextDouble();

            // Decrement index if invalid input for retry
            if (salaries[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input. Please enter positive values for salary and non-negative values for years of service.");
                i--;
            }
        }

        // Calculation loop
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Output the results
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        scanner.close();
    }
}
