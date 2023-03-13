package javamethodsandvariables;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme8Triangle {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the triangle: " );
        double b = scanner.nextDouble();
        System.out.println("Enter the height of the triangle: " );
        double h = scanner.nextDouble();

        //Area = (width*height)/2
        double area =(b*h)/2;
        System.out.println("Area of triangle is: " + area);
        scanner.close();
    }

}
