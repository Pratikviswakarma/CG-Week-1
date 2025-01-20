import java.util.Scanner;

public class TemperatureConverter {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the temperature in Fahrenheit to Celsius : ");
    double fahrenheit = sc.nextDouble();
    System.out.println("The temperature in Celsius to fahrenheit : " );
    double celsius =sc.nextDouble();

    System.out.println("The temperature in Fahrenheit to Celsius is: " + fahrenheitToCelsius(fahrenheit));
    System.out.println("The temperature in Celsius to Fahrenheit is: " + celsiusToFahrenheit(celsius));
    }
}
