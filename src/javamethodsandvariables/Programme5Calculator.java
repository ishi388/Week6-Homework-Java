package javamethodsandvariables;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication  and division methods
 * all with parameters and use string concatenation  methods.
 * (Note: Two static and Two instance methods.)
 */
public class Programme5Calculator {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Programme5Calculator obj = new Programme5Calculator();
        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();
        int resultAdd = add(number1, number2);
        int resultSubtract = subtraction(number1, number2);
        int resultMultiply = obj.multiply(number1, number2);
        int resultDivision= obj.division(number1, number2);

        System.out.println("The sum of " + number1 + " and " + number2 + " is " + resultAdd);
        System.out.println("The difference of " + number1 + " and " + number2 + " is " + resultSubtract);
        System.out.println("The product of " + number1 + " and " + number2 + " is " + resultMultiply);
        System.out.println("The quotient of " + number1 + " and " + number2 + " is " + resultDivision);

    }
    //static methods for addition and subtraction
    public static int add(int a, int b){
        return a + b;
    }
    
     public static int subtraction(int a, int b){
        return a - b;
    }
    //instance methods for multiplication and division
    public int multiply(int a, int b){
        return a * b;

    }
    public int division(int a, int b){
        return a/b;



    }



}
