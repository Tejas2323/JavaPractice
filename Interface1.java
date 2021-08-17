 //Interface is a blueprint of class
 interface Inter1{
    String company = "TEZ";
    void name();
    void id();
    void salary();

}

class Tez implements Inter1{

    @Override
    public void name() {
        System.out.println("Tejas");
        
    }

    @Override
    public void id() {
        System.out.println("23");
        
    }

    @Override
    public void salary() {
        
        System.out.println("2.3 LPA");
    }
    
}

public class Interface1 {
    public static void main(String[] args) {
        Tez t1 = new Tez();

        t1.name();
        t1.id();
        t1.salary();
    }
}
