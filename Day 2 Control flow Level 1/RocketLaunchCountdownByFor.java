import java.util.Scanner;

public class RocketLaunchCountdownByFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the starting countdown value
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();

        // Countdown loop using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // Print launch message
        System.out.println("Liftoff!");

        scanner.close();
    }
}
