import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the starting countdown value
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();

        // Countdown loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement the counter
        }

        // Print launch message
        System.out.println("Liftoff!");

        scanner.close();
    }
}
