public class VariableEg {
    static int a=10; // static/class variable (class scope)

    void show(){

        int b=20; // local variable (show method scope)
        System.out.println(b + " is a local variable");
    }
    public static void main(String[] args) {
        int c = 30; // Instance variable (Scope till main function)

        System.out.println(a + " is a static variable");
        VariableEg obj1 = new VariableEg();
        obj1.show(); // Using an object to run show method

        System.out.println(c + " is an instance variable");

    }
}
