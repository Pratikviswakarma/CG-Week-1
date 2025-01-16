import java.util.Random;

public class StudentGradeCalculation {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math for students
    public static int[][] generateScores(int n) {
        Random random = new Random();
        int[][] scores = new int[n][3];

        // Generate random 2-digit scores for each student in PCM
        for (int i = 0; i < n; i++) {
            scores[i][0] = random.nextInt(90) + 10; // Physics score (between 10 and 99)
            scores[i][1] = random.nextInt(90) + 10; // Chemistry score (between 10 and 99)
            scores[i][2] = random.nextInt(90) + 10; // Maths score (between 10 and 99)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4]; // [total, average, percentage, round_percentage]

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Store total, average, and percentage, rounding off the percentage to 2 decimal places
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
            results[i][3] = Math.round(percentage * 100.0) / 100.0; // Rounded percentage to 2 decimal places
        }
        return results;
    }

    // Method to calculate the grade based on the percentage
    public static String[][] calculateGrade(double[][] results) {
        String[][] grades = new String[results.length][2];

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][3];

            if (percentage >= 80) {
                grades[i][0] = "A";
                grades[i][1] = "Level 4, Above agency-normized standards";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
                grades[i][1] = "Level 3, Agency-normized standards";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
                grades[i][1] = "Level 2, Below, but approaching agency-normized standards";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
                grades[i][1] = "Level 1, Well below agency-normized standards";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
                grades[i][1] = "Level 1, Too below agency-normized standards";
            } else {
                grades[i][0] = "R";
                grades[i][1] = "Remedial standards";
            }
        }
        return grades;
    }

    // Method to display the scorecard in tabular format
    public static void displayScorecard(int[][] scores, double[][] results, String[][] grades) {
        System.out.println("Student | Physics | Chemistry | Math | Total | Average | Percentage | Grade | Remarks");
        System.out.println("-----------------------------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("S%d      | %d      | %d         | %d    | %.2f   | %.2f    | %.2f%%     | %s    | %s%n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][3],
                    grades[i][0], grades[i][1]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 5; // You can change the number of students here

        // Step 1: Generate random scores for students
        int[][] scores = generateScores(numStudents);

        // Step 2: Calculate total, average, and percentage
        double[][] results = calculateResults(scores);

        // Step 3: Calculate grades based on percentage
        String[][] grades = calculateGrade(results);

        // Step 4: Display the scorecard in a tabular format
        displayScorecard(scores, results, grades);
    }
}
