abstract class Math3{
    public abstract void add(int a,int b);
    public abstract void sub(int a,int b);
    public abstract void mul(int a,int b);
    public abstract void div(int a,int b);

}


class Arith extends Math3{

    @Override
    public void add(int a, int b) {
       System.out.println(a+b);
        
    }

    @Override
    public void sub(int a, int b) {
        
        System.out.println(a-b);
    }

    @Override
    public void mul(int a, int b) {
        System.out.println(a*b);
    }

    @Override
    public void div(int a, int b) {
        
        System.out.println(a/b);
    }

   

   
  
}
class Abstrac{

    
    
    public static void main(String[] args) {
        Arith a1 = new Arith();

        a1.add(1,1);
        a1.sub(1,1);
        a1.mul(1,1);
        a1.div(1,1);
        
    }
}
