package javamethodsandvariables;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case
 */
public class Programme9Cases {

    public static void main(String[] args) {
        String uppStr;      //  variable
        String lowStr;     //   variable

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase String to convert: " );
        uppStr = scanner.nextLine();

        //convert to lower case
        String uppStr1 = uppStr.toLowerCase();
        System.out.println("The LowerCase String  = " + uppStr1);
        scanner.close();
    }

}
