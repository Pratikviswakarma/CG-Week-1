import java.util.Scanner;

public class FactorialRecursion {
    public static int factorial(int num) {
       if(num==0){
        return 1;
       } else{
        return num*factorial(num-1);
       }
    }

    public static void display(int num){
        System.out.println("The factorial of the number is: " + factorial(num));
   
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        display(num);
    }
}
