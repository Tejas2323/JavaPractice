class Math{
    int add,subtract,mul,div;

    // Parameterized constructor
    Math(int a, int b){
        add = a+b;
        subtract = a-b;
        mul = a*b;
        div = a/b;
    }
}

class ArithmeticP{
    public static void main(String[] args) {
       Math m1 = new Math(2,3);

       System.out.println(m1.add);
       System.out.println(m1.subtract);
       System.out.println(m1.mul);
       System.out.println(m1.div);
    }
}