package javamethodsandvariables;

/**
 * Write a Java program to convert a decimal number to binary number.  Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */

import java.util.Scanner;

public class Programme17DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number : ");
        int decimal = scanner.nextInt();

        String binary = "";
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal /= 2;

        }
        System.out.println("Binary number is: " + binary);
        scanner.close();
    }

}