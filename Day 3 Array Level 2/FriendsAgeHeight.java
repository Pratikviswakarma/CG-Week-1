import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input loop
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age for " + names[i] + ":");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid age:");
                scanner.next();
            }
            ages[i] = scanner.nextInt();

            System.out.println("Enter height for " + names[i] + " (in cm):");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid height:");
                scanner.next();
            }
            heights[i] = scanner.nextDouble();
        }

        // Find youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Output the results
        System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex] + ".");
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm.");

        scanner.close();
    }
}
