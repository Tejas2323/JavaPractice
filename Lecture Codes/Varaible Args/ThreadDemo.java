class ThreadDemo extends Thread
{
public void run()//it is default method of thread class
{
System.out.println("Thread is running");//thread is in //running state
}//after run method thread was terminated
public static void main(String[] args)
{

ThreadDemo td=new ThreadDemo();//its in NEW state
td.start();//after this the thread is in runnable state
}


}