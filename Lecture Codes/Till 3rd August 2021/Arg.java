public class Arg {

   static void add(int a, int b){
        int c = a+b;
        System.out.println("Addition of " + a + " and " +b + " is " +c);
        
    }
    public static void main(String[] args) {
        int a,b;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        add(a,b);
    }
}
