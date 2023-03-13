package javamethodsandvariables;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the  print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme3InstanceAndStatic {
    // instance variable
    int instVar = 1;

    // static variable
    static String s3 = "Optimistic";

    //main method
    public static void main(String[] args) {
        Programme3InstanceAndStatic obj = new Programme3InstanceAndStatic();
        //calling instance method
        obj.instanceMethod();
        Programme3InstanceAndStatic.staticMethod();




    }

    //instance method
    public void instanceMethod() {
        System.out.println("Instance variable inside instance method: " + instVar);
        System.out.println("Static variable inside instance method " + s3);

    }

    //static method
    public static void staticMethod() {
        Programme3InstanceAndStatic obj = new Programme3InstanceAndStatic();
        System.out.println("Instance variable in static method: " + obj.instVar);
        System.out.println("Static variable in static method: " + s3);



    }


}
