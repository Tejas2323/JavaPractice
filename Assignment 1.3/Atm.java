import java.util.Scanner;


public class Atm {

    static int balance=50000,withdraw;
    static int note[] = {2000,1000,500,200,100};
    static int[] noteCounter = new int[5];
    
    public static void main(String[] args) {
        
        System.out.println("Hello user, bank balance : " + balance);
        System.out.println("Please enter the amount to be withdrawn:");

        Scanner sc = new Scanner(System.in);
        withdraw = sc.nextInt();
        balance=balance-withdraw;

        //Count the currency

        for (int i = 0; i < 5; i++) {
            if(withdraw>=note[i]){
                noteCounter[i] = withdraw/note[i];
                withdraw = withdraw - noteCounter[i] * note[i];
            }
        }

        //Print the currency

        for (int i = 0; i < 5; i++) {
            if(noteCounter[i]!=0){
            System.out.println(noteCounter[i] + " note of " + note[i]);
        }
    }
        
        
        
        

        System.out.println("Remaining balance: " + balance);
        System.out.println("Have a nice day!");


    }
}
