package javamethodsandvariables;

import java.util.Scanner;

/**
 * Write a Java program to compute the specified expressions and print the  output.
 * Test Data:
 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected Output : 2.138888888888889
 */
public class Programme12Expressions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for the expression ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)): ");

        double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));

        System.out.println("Result: " + result);
        scanner.close();
    }

}
