import java.util.Scanner;

public class StudentGradeCalculator2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Initialize variables
        int subjects = 3; // Physics, Chemistry, Maths
        double[][] marks = new double[numberOfStudents][subjects];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Input marks for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = scanner.nextDouble();
            System.out.print("Chemistry: ");
            marks[i][1] = scanner.nextDouble();
            System.out.print("Maths: ");
            marks[i][2] = scanner.nextDouble();
        }

        // Compute percentages and grades
        for (int i = 0; i < numberOfStudents; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (total / (subjects * 100)) * 100;

            // Determine grade based on percentage
            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 75) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        // Display percentages and grades
        System.out.println("Student-wise Percentage and Grade:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("Student %d: Percentage = %.2f%%, Grade = %c%n", i + 1, percentages[i], grades[i]);
        }
    }
}
