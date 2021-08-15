
public class Prime {
    
    static int number;
    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        else if(num==2){
            return true;
        }
        else if(num%2==0){
            return false;
        }
        else{
            for (int i = 3; i <=Math.sqrt(num); i+=2) {
                if(num%i==0){
                    return false;
                }
                return true;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        number=Integer.parseInt(args[0]);
        isPrime(number);

        if(isPrime(number)){
            System.out.println(number + " is a prime number");
        }
        else{
            System.out.println(number + " is not a prime number");
        }
       


       
    
}

}
