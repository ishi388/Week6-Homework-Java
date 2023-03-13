package javamethodsandvariables;

/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Programme1Instance {
    // instance variables
    int a = 10;
    String s1 = "Be Happy";
    //  main method
    public static void main(String[] args) {
        Programme1Instance obj = new Programme1Instance();
        obj.myPrint();

    }
     public void myPrint(){
         System.out.println("a: " + a + ", s1: " + s1);



     }
}
