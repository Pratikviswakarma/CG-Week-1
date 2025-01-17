import java.util.Scanner;

public class BasicCalculator {

    public static double add(double num1,double num2){
        return num1+num2;
    }

    public static double subtract(double num1,double num2){
        return num1-num2;
    }

    public static double multiply(double num1,double num2){
        return num1*num2;
    }

    public static double division(double num1,double num2){
        return num1/num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();
       
        int operator=-1;
        while(operator!=0){
            System.out.println("Enter the operator \n \"1\" for addition,\n \"2\" for subtraction , \n \"3\" for multiplication and \n \"4\" for division and quit press 0 : ");
            operator=sc.nextInt();
        switch (operator) {
            case 1:
                double add=add(num1,num2);
                System.out.println("The sum of the two numbers is: " + add);
                break;
            case 2:
                double subtract=subtract(num1,num2);
                System.out.println("The difference of the two numbers is: " + subtract);
                break;
            case 3:
                double multiply=multiply(num1,num2);
                System.out.println("The product of the two numbers is: " + multiply);
                break;
            case 4:
                double division=division(num1,num2);
                System.out.println("The division of the two numbers is: " + division);
                break;
            default:
                break;
        }
    }
    sc.close();
    }
}
