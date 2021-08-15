class A{
    void display(){
        System.out.println("Class A");
    }
}

class B extends A{
    void display1(){
        System.out.println("Class B");
    }
}

class C extends A{
    void display2(){
        System.out.println("Class C");
    }
}

class D extends A{
    void display3(){
        System.out.println("Class D");
    }
}




public class Hierarchy{
    public static void main(String[] args) {
        
        B b1 = new B();
        b1.display();
        b1.display1();

        C c1 = new C();
        c1.display();
        c1.display2();

        D d1 = new D();
        d1.display();
        d1.display3();
        
    }
}
