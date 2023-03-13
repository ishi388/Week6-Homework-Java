package javamethodsandvariables;

/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class Programme2Static {
    //Static variables
    static int a = 6;
    static String s2 = "Skeptical";

    //Main method
    public static void main(String[] args) {
        meTester();


    }

    //static method
    public static void meTester() {
        //call both static variables inside the print statement
        System.out.println("a = " + a);
        System.out.println("s2 = " + s2);


    }


}
