class Math1{
    int add1,sub1;
     
    Math1(){
        System.out.println("Default constructor");
    }
    void disp(){
        System.out.println("Display");
    }
  
    
}
public class DefaultCons {
    public static void main(String[] args) {

        // Default Constructor (The moment you initiated constructor, it is called)
        Math1 m2= new Math1();
        System.out.println(m2.add1);
        System.out.println(m2.sub1);
        
        m2.disp();
    }
}
