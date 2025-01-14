import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Print multiples of the number below 100
        System.out.println("The multiples of " + number + " below 100 are:");

        // Loop from 100 down to 1 to find multiples
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);  // Print the multiple
            }
        }

        scanner.close();
    }
}
