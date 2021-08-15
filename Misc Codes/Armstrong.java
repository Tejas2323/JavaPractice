import java.util.Scanner;
class Armstrong{
    public static void main(String[] args) {
        int a;
        System.out.println("Please enter a number");
        Scanner sc= new Scanner(System.in);
        
        a=sc.nextInt();
        String a1= String.valueOf(a);
        char a2[] = new char[a1.length()];
        
        double b[] = new double[a2.length];
        
        

       

         for (int i = 0; i < a2.length; i++) {
              a2[i]=a1.charAt(i);
          }

          for (int i = 0; i < b.length; i++) {
              b[i]=Character.getNumericValue(a2[i]);
          }

            for (int i = 0; i < b.length; i++) {
                b[i]=Math.pow(b[i], b.length);
            }

            
            int sum=0;
            for (int i = 0; i<b.length; i++) {
                sum+=b[i];
                
            }

            if (sum==a) {
               System.out.println(a + " is an Armstrong number"); 
            } else {
                System.out.println(a + " is not an Armstrong number"); 
            }






          
         


    }
}