import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for month, day, and year
        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt();
        
        System.out.print("Enter day (1-31): ");
        int d = scanner.nextInt();
        
        System.out.print("Enter year: ");
        int y = scanner.nextInt();
        
        // Calculate y0, x, m0, and d0 using the given formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        
        // Print the day of the week
        System.out.println("Day of the week: " + d0);
    }
}
