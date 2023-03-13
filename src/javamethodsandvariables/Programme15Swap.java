package javamethodsandvariables;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Programme15Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first variable : ");
        int firstVariable = scanner.nextInt();

        System.out.print("Enter the second variable  : " );
        int secondVariable = scanner.nextInt();

        System.out.println("Before swapping: ");
        System.out.println("First variable : " + firstVariable);
        System.out.println("Second variable : " + secondVariable);

        //Swap variables using temporary variable
        int temp = firstVariable;
        firstVariable = secondVariable;
        secondVariable = temp;

        System.out.println("After swapping: ");
        System.out.println("First variable : " + firstVariable);
        System.out.println("Second variable : " + secondVariable);

        scanner.close();
    }

}
