import java.util.*;

public class Power{
 public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 2 Numbers for Power");
      System.out.println("Enter First Number");
      int fno = sc.nextInt();
      System.out.println("Enter Second Number");
      int sno = sc.nextInt();
      System.out.println("Result is " + (int)Math.pow((double)fno, (double)sno));
      sc.close();
   }
  }