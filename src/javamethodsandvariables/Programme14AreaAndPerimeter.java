package javamethodsandvariables;

import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a rectangle. Test Data:
 * Width = 5.5 Height = 8.5
 * Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Programme14AreaAndPerimeter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // variables
        double width = 5.6;
        double height = 8.5;

        // calculate the area of rectangle
        double area = width * height;

        // calculate the perimeter of rectangle
        double perimeter = 2 * (width + height);

        // printing the results
        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);

        scanner.close();

    }

}
