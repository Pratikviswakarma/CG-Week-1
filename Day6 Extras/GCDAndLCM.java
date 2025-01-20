import java.util.Scanner;

public class GCDAndLCM {

    public static int gcd(int num1,int num2){
        if(num2==0){
            return num1;
        }
        return gcd(num2, num1%num2);
    }

    public static int lcm(int num1,int num2){
        return (num1*num2)/gcd(num1,num2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2=sc.nextInt();
        System.out.println("The GCD of the two numbers is: " + gcd(num1,num2));
        System.out.println("The LCM of the two numbers is: " + lcm(num1,num2));

        sc.close();
    }
}
