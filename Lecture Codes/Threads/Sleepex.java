class Sleepex extends Thread{

    public void run(){
        for (int i = 0; i <5; i++) {
            try {
                Thread.sleep(1000); //any value you give will be in ms
                //when u explicitly call thread method, it raises an exception, need to handle it using try-catch
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        
        Sleepex s1 = new Sleepex();
        Sleepex s2 = new Sleepex();
        System.out.println("Thread Name: " + s1.getName());
        System.out.println("Priority: " + s2.getPriority());
        System.out.println("Thread Id: "+s1.getId());
        
        s1.start();
        s2.start();
        
    }
}