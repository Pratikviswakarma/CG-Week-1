import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is valid (>= 1582)
        if (year >= 1582) {
            // Part 1: Multiple if-else statements
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }

            // Part 2: Single if statement with logical conditions
            if ((year >= 1582) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Year should be greater than or equal to 1582.");
        }

        scanner.close();
    }
}
