 class TestInterface {
    interface interface1{
        void disp();
    }
}
class TestInterface1 implements TestInterface.interface1{
@Override
public void disp() {
    System.out.println("Nested Interface");
}
public static void main(String[] args) {
  TestInterface.interface1 tni = new TestInterface1();
  tni.disp();
  //always save file with class name which contains main method
}
}
