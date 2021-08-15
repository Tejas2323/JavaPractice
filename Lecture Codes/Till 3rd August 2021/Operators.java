public class Operators {
    public static void main(String[] args) {
        int a=10, b=5;

        //Arithmetic operators
        System.out.println("Addition is " + (a+b));
        System.out.println("Subtraction is " + (a-b));
        System.out.println("Multiplication is " + (a*b));
        System.out.println("Division is " + (a/b));
        System.out.println("Modulus is " + (a%b));

        //Unary operators
        
        System.out.println("Post Incremented " + a++);
        System.out.println(a);
        System.out.println("Pre Incremented " + ++a);
        System.out.println(a);
    }
}
