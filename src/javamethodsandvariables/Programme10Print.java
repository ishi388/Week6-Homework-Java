package javamethodsandvariables;

/**
 * "+------------------------+"
 * "| |"
 * "| CORNER STORE |"
 * "| |"
 * "| 2015-03-29 04:38PM |"
 * "| |"
 * "| Gallons: 10.870 |"
 * "| Price/gallon: $ 2.089 |"
 * "| |"
 * "| Fuel total: $ 22.71 |"
 * "| |"
 * "+------------------------+"
 */
public class Programme10Print {
    public static void main(String[] args) {

        String line = "+------------------------+";
        String storeName = "| CORNER STORE |";
        String date = "| 2015-03-29 04:38PM |";
        String gallons = "| Gallons: 10.870 |";
        String pricePerGallon = "| Price/gallon: $ 2.089 |";
        String fuelTotal = "| Fuel total: $ 22.71 |";

        System.out.println(line);
        System.out.println(" | |" );
        System.out.println(storeName);
        System.out.println("| |");
        System.out.println(date);
        System.out.println("| |");
        System.out.println(gallons);
        System.out.println(pricePerGallon);
        System.out.println("| |");
        System.out.println(fuelTotal);
        System.out.println("| |");
        System.out.println(line);
    }

}
