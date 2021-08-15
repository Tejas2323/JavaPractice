public class AssignOp {
   static int b=5;

    void method1(int a){
        a+=b; // a = a+b
        System.out.println(a); //15
        a-=b; // a= a-b  // a=15-5
        System.out.println(a); //10
    }

    static void method2(int a){
        a*=b; // a = a*b //
        System.out.println(a); //50
        a/=b; // a= a/b     // a=50/5
        System.out.println(a);  //10
    }
    public static void main(String[] args) {
        int num=10;
        AssignOp obj1 = new AssignOp();
        obj1.method1(num); //can execute non-static method only via objects
        method2(num); //can execute static methods directly without methods
    }
}
