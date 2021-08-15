public class Fibonacci {

    static int fiblength,first=0,second=1,temp=1;   
    public static void main(String[] args) {
        
        //Command line argument converted as integer to execute fibonacci series till the number specified.
        fiblength = Integer.parseInt(args[0]);
       
        System.out.println(first);
        
      
           
           while(temp<=fiblength){
            System.out.println(temp);
            temp = first + second;
            first = second;
            second = temp;
           
           }
    }
}
