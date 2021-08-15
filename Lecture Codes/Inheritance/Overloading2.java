class functionality2{

    void math(double a,double b){
        System.out.println("Addition is "+ (a+b));
    }

    void math(int a, int b,int c){
        System.out.println("Multiplication is " + (a*b*c));
    }

    void math(float a, float b){
        System.out.println("Subtraction is " + (a-b));
    }

    void math(int a, int b){
        System.out.println("Division is " + (a/b));
    }
}

class Overloading2{

    public static void 
    main(String[] args) {
        
        functionality2 f1 = new functionality2();
        f1.math(12.55,20.55);
        f1.math(1,5,4);
        f1.math(10.2f,2.23f);
        f1.math(4,2);

    }
}
