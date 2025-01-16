import java.util.Scanner;
public class CheckLength {
// Method to check the length of the string
    public static int checkLength(String str) {
      int counter=0;
      while (true) {
        // Try block to catch the exception
        try{
            str.charAt(counter);
        counter++;
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: "+e.getMessage());
            break;
        }
      }
      // Return the length of the string
      return counter;
    }


    public static void main(String[] args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        // Taking the string as input
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        // Printing the length of the string
        int length=str.length();
        System.out.println("Length of the string by metthod: "+checkLength(str));
        System.out.println("Length of the string by inbuilt method: "+length);
    }
}