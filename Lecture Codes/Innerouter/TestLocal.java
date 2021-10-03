 class TestLocal {
    private int data = 50; //instance variable
    void disp(){
        //local class (created inside a method or block)
        class Testlocal1{
            void disp1(){
                System.out.println("Disp 1:" + data);
            }
            
        }
        Testlocal1 tl1 = new Testlocal1(); //it is not accessible outside this method hence instantiate here only
        tl1.disp1();
    }
    public static void main(String[] args) {
        TestLocal tl = new TestLocal();
        tl.disp();
    }
}
