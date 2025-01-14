import java.util.Scanner;

public class SubstringOccurrences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string and the substring
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to count: ");
        String substring = scanner.nextLine();

        // Call the method to count occurrences of the substring
        int count = countSubstringOccurrences(mainString, substring);

        // Output the result
        System.out.println("The substring occurs " + count + " times in the main string.");

        scanner.close();
    }

    // Method to count occurrences of the substring
    public static int countSubstringOccurrences(String mainString, String substring) {
        int count = 0;
        int index = 0;

        // Loop to find all occurrences of the substring
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // Move the index after the current occurrence
        }

        return count;
    }
}
