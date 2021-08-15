import java.util.Scanner;
class SwitchEx{
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
       
        sc.close();
        
      

        switch (a%2) {
            case 0:
                System.out.println("The number is even");
                break;
          
            default:
            System.out.println("The number is odd");
                
        }
    }
}