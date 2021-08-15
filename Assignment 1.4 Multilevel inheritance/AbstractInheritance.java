

abstract class Animal{
    int legs;
    float speed;

    // this method is declared and has to be defined if a class inherits
   public abstract void sound();

   public void description(){
       System.out.println("An animal is a living being");
   } 
}

class Dog extends Animal{
    
    @Override
    public void description(){
        super.description();
        System.out.println("Dogs are very loyal");
        
    }
   public void sound(){
    System.out.println("Dog says bhow bhow");
    }
    


}

class Cat extends Animal{
    
    @Override
    public void description() {
        
        System.out.println("Cat is afraid of Dogs");
        
    }

    public void sound(){
     System.out.println("Cat says meeeoooww");
     }
     
 
 
 }

 class Main {
     
     
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.legs=4;
        d1.speed=20;
        d1.description();
        System.out.println("Dogs have " + d1.legs + " legs");
        System.out.println("Dogs can run at " + d1.speed + " speed");
        

        Cat c1 = new Cat();
        c1.legs=4;
        c1.speed=10;
        c1.description();
        c1.sound();
        System.out.println("Cats have " + c1.legs + " legs");
        System.out.println("Cats can run at " + c1.speed + " speed");
    }
}
