import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        playGame();
    }

    // Main game logic
    private static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Think of a number between 1 and 100.");
        int secretNumber = scanner.nextInt();
        System.out.println("You chose: " + secretNumber);
        System.out.println("The computer will try to guess it.");

        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            int guess = generateGuess(random, low, high);
            char feedback = getUserFeedback(scanner, guess);
            guessedCorrectly = processFeedback(feedback, guess);
            
            if (feedback == 'h') {
                high = guess - 1;
            } else if (feedback == 'l') {
                low = guess + 1;
            }
        }
        scanner.close();
    }

    // Function to generate a random guess within the current bounds
    private static int generateGuess(Random random, int low, int high) {
        return random.nextInt(high - low + 1) + low; 
    }

    // Function to get feedback from the user
    private static char getUserFeedback(Scanner scanner, int guess) {
        System.out.println("Is your number " + guess + "?");
        System.out.println("Enter 'h' if the guess is too high, 'l' if it's too low, or 'c' if it's correct.");
        return scanner.next().charAt(0);
    }

    // Function to process user feedback and determine if the guess was correct
    private static boolean processFeedback(char feedback, int guess) {
        switch (feedback) {
            case 'h':
                return false;
            case 'l':
                return false;
            case 'c':
                System.out.println("Hooray! The computer guessed your number.");
                return true;
            default:
                System.out.println("Invalid input. Please enter 'h', 'l', or 'c'.");
                return false;
        }
    }
}
