package javamethodsandvariables;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the  area.(Formula of Area A=PI*r*r).
 */
public class Programme6Circle {
    public static void main(String[] args) {
        int radius;
        double area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        radius = scanner.nextInt();
        area = (radius * radius) * Math.PI;
        System.out.println("Area of the circle is : " + area);
        scanner.close();

    }


}
