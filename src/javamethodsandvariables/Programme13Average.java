package javamethodsandvariables;

/**
 * Write a Java program that takes three numbers as input to calculate and  print the average of the numbers.
 */

import java.util.Scanner;

public class Programme13Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        double number1 = scanner.nextDouble();       // number1 is a variable

        System.out.print("Enter the second number : ");
        double number2 = scanner.nextDouble();       // number2 is a variable

        System.out.print("Enter the third number : ");
        double number3 = scanner.nextDouble();       // number3 is a variable

        double average = (number1 + number2 + number3) / 3 ;
        System.out.print("The average of three numbers is : " + average);

        scanner.close();

    }


}
