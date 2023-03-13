package javamethodsandvariables;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the  print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme4InstanceAndStatic2 {

    //instance variables
    int instVar1 = 2;
    String instVar2 = "Attention";

    //static variables
    static double staticVar1 = 2.45;
    static String staticVar2 = "Details";

    //main method
    public static void main(String[] args) {
        Programme4InstanceAndStatic2 obj = new Programme4InstanceAndStatic2();
        obj.instanceMethod();
        Programme4InstanceAndStatic2.staticMethod();

    }

    //instance method
    public void instanceMethod() {
        System.out.println("Instance Method: ");
        System.out.println("instVar1: " + instVar1);
        System.out.println("instVar2: " + instVar2);
        System.out.println("staticVar1: " + staticVar1);
        System.out.println("staticVar2: " + staticVar2);

    }

    //static method
    public static void staticMethod() {
        System.out.println("Static Method: ");
        Programme4InstanceAndStatic2 obj = new Programme4InstanceAndStatic2();
        System.out.println("instanceVar1: " + obj.instVar1);
        System.out.println("instanceVar2: " + obj.instVar2);
        System.out.println("staticVar1: " + staticVar1);
        System.out.println("staticVar2: " + staticVar2);


    }


}
