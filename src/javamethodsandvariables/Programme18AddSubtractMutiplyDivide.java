package javamethodsandvariables;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and  remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Programme18AddSubtractMutiplyDivide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();
        // Arithmetic operations performed
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;
       // Printing arithmetic calculations
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " x " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);
        System.out.println(num1 + " mod " + num2 + " = " + remainder);
        scanner.close();
    }

   }