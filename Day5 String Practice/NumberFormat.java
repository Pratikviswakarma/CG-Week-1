import java.util.Scanner;
public class NumberFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take user input using the Scanner next() method for 2 String variables
        System.out.println("Enter the string: ");
        String str = sc.next();
        System.out.println(generateException(str));
        sc.close();
    }

    // Write a method to generate a NumberFormatException
    public static String generateException(String str) {
        try {
            return String.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            return "NumberFormatException caught";
        } catch (Exception e) {
            return "Generic Exception caught";
        }
    }
}