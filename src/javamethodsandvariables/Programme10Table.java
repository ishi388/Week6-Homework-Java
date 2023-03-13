package javamethodsandvariables;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its  multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */

public class Programme10Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        int a = 1;
        printMultiplicationTable(num, a);
    }

    public static void printMultiplicationTable(int num, int a) {
        if (a <= 10) {
            System.out.println(num + " x " + a + " = " + (num * a));
            printMultiplicationTable(num, a + 1);


        }

    }

}




