package javamethodsandvariables;

import java.util.Scanner;

public class Programme19StringToLowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputs = scanner.nextLine();
        String lowercase = inputs.toLowerCase(); // for converting into lower case
        System.out.println("Lowercase: " + lowercase);
        scanner.close();
    }
}
