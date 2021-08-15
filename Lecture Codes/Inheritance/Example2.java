class A{

    int legs;
    void msg(){
        System.out.println("Message from class A");
    }
}

class B extends A{
    
    void display(){
    
        System.out.println("Class B display");
    }
}

class C extends B{

    void display2(){

        System.out.println("Class C display");
    }
}

public class Example2 {
    public static void main(String[] args) {
        C obj1 = new C();

        obj1.legs= 2;
        System.out.println(obj1.legs);
        obj1.display();
        obj1.msg();
        obj1.display2();
    }
}
