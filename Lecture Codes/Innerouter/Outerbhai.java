class Outerbhai{
    private int data=50; //instance varaible
    class Innerbhai{
        void disp(){
            System.out.println("Data : " + data);
        }
    }


public static void main(String[] args) {
    Outerbhai to =new Outerbhai();
    Outerbhai.Innerbhai in = to.new Innerbhai();
    //the way you call a method using instance name of a 
    //class classinstance.methodname
    //sameway u create an instance of innerclass
    in.disp();
}
}