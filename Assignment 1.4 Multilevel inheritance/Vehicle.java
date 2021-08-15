

class Vehicle{
    int wheels;
    String brand;
    int speed;


    void run(){
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle{
    
    //Override method run
    @Override
    void run(){
        super.run(); // runs its Parent class method
        System.out.println("Bike is running");
    } 
}

//Class Vehicle -> Bike -> Yamaha
class Yamaha extends Bike{

    //Override method run
    @Override
    void run(){
        super.run(); // runs its Parent class method
        System.out.println("Yamaha is running fast");
    }

    
    public static void main(String[] args) {
        Yamaha y1 = new Yamaha();
        
        // brand and speed taken from Vehicle class
        y1.brand="Yamaha";
        y1.speed=250;
        
        //Run overriden method
        y1.run();
        System.out.println(y1.brand+ " brand and its speed is " + y1.speed);
    }
}

