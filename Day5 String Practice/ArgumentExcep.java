import java.util.Scanner;

public class ArgumentExcep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "";
        try {
            System.out.println("Enter the text:");
            text = scanner.nextLine();

            // Generate the IllegalArgumentException
            try {
                generateException(text);
            } catch (IllegalArgumentException e) {
                System.out.println("Exception caught in main: " + e.getMessage());
            }

            // Handle the IllegalArgumentException
            handleException(text);
        } finally {
            scanner.close();
        }

        // Generate the IllegalArgumentException
        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Handle the IllegalArgumentException
        handleException(text);
    }

    public static void generateException(String text) {
        // This will generate IllegalArgumentException
        System.out.println(text.substring(5, 2));
    }

    public static void handleException(String text) {
        try {
            // This will generate IllegalArgumentException
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
}