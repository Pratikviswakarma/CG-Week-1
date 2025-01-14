import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Get input marks for Physics, Chemistry, and Maths
        System.out.print("Enter marks for Physics: ");
        double physics = scanner.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double maths = scanner.nextDouble();

        // Calculate total and percentage
        double totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300) * 100;

        // Determine the grade based on percentage
        String grade = "";
        String remarks = "";

        if (percentage >= 80) {
            grade = "Level 4";
            remarks = "Above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "Level 3";
            remarks = "At agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "Level 2";
            remarks = "Below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "Level 1";
            remarks = "Well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "Level 1";
            remarks = "Too below agency-normalized standards";
        } else {
            grade = "Remedial standards";
            remarks = "Below 39%";
        }

        // Print the average mark, grade, and remarks
        System.out.printf("Average Mark: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}
