class Animal{

     int legs;
    String profile= "Living organism";

     void description(){
        System.out.println("An animal is a living creature that can move freely");
    }

    void display(){
        System.out.println("Parent class");
    }
}

class Monkey extends Animal{

//method override
void description(){
    
    // super.description();
    System.out.println("Monkey likes banana");
    
}



}

public class Inheritanceex{
public static void main(String[] args) {
    
    Monkey m1 = new Monkey();
    m1.legs = 2;
    System.out.println(m1.legs);
    System.out.println(m1.profile);
    m1.display();
    m1.description();
  
}
}