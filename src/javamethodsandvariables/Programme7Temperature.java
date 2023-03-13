package javamethodsandvariables;


import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and  convert to degree Celsius
 * ((F − 32) × 5/9 = 0°C).
 */
public class Programme7Temperature {
    double F;
    double Celsius;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit : " );
       double F = scanner.nextDouble();
       double Celsius = ((F - 32) * 5) / 9;
        System.out.println("Convert the value to degree celsius = " + Celsius);
        scanner.close();
    }


}
