public class TestStatic {
    static int data = 50;
    static private int data1 = 30;

    static class TestStatic1{  //static nested class
        void disp(){
            System.out.println(data);
            System.out.println(data1);
        }
    }
    public static void main(String[] args) {
        TestStatic.TestStatic1 tst = new TestStatic.TestStatic1();
        tst.disp();
    }
}
