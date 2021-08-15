class Animals{

    final  int legs = 4;
    void display(){
        System.out.println("Living Creature");
    }

}

class Dog extends Animals{

   
    void display() {
     
        super.display();
        System.out.println("Dog says bhow bhow");

    }
}


public class Overriding {
    
    public static void main(String[] args) {
    
    Dog tommy = new Dog();

    System.out.println(tommy.legs);

    tommy.display();
    


}
    
     
}
