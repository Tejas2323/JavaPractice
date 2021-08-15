class functionality{

    void math(int a,int b){
        System.out.println("Addition is "+ (a+b));
    }

    void math(int a, int b, int c){
        System.out.println("Multiplication is " + (a*b*c));
    }

    void math(int a, int b, int c, int d){
        System.out.println("Subtraction is " + (a/b/c/d));
    }
}

class Overloading{

    public static void 
    main(String[] args) {
        
        functionality f1 = new functionality();
        f1.math(1,2);
        f1.math(1,2,3);
        f1.math(10, 5, 1, 1);

    }
}