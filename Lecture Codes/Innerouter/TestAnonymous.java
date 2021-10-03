abstract class TestAnonymous {
  abstract void disp();

}
class TestAnonymous1{
    public static void main(String[] args) {
        TestAnonymous ta = new TestAnonymous(){
            void disp(){
                System.out.println("Anonymous class test");
            }
        };
        ta.disp();
    }
}
