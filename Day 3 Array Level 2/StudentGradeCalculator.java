import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Arrays to store marks, percentages, and grades
        int[][] marks = new int[numberOfStudents][3]; // [0] = Physics, [1] = Chemistry, [2] = Maths
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        // Input marks for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                int mark = -1;

                // Validate marks input
                while (mark < 0) {
                    System.out.print("Enter marks for " + subject + ": ");
                    mark = scanner.nextInt();
                    if (mark < 0) {
                        System.out.println("Please enter a positive value for marks.");
                    }
                }
                marks[i][j] = mark;
            }
        }

        // Calculate percentage and grade for each student
        for (int i = 0; i < numberOfStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300.0) * 100; // Assuming each subject has a max of 100 marks

            // Determine grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "Level 4 - Above agency-normalized standards";
            } else if (percentages[i] >= 70) {
                grades[i] = "Level 3 - At agency-normalized standards";
            } else if (percentages[i] >= 60) {
                grades[i] = "Level 2 - Below but approaching agency-normalized standards";
            } else if (percentages[i] >= 50) {
                grades[i] = "Level 1 - Well below agency-normalized standards";
            } else if (percentages[i] >= 40) {
                grades[i] = "Level 1 - Too below agency-normalized standards";
            } else {
                grades[i] = "Remaining standards - Below 39%";
            }
        }

        // Display the marks, percentages, and grades of each student
        System.out.println("\nSummary:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
            System.out.println();
        }

        scanner.close();
    }
}
