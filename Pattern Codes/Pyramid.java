import java.util.Scanner;
public class Pyramid{
 public static void main(String[] args) {
     boolean k=true;
     System.out.println("Enter the number of rows");

    Scanner sc = new Scanner(System.in);
    int row=sc.nextInt();
    sc.close();
    
     
    for (int i = 1; i <=row; i++) {
        
        for (int j = 1; j <=(2*row-1); j++) {
            if (j>=(row+1)-i && j<=(row-1)+i && k) {
                System.out.print("*");
                k=false;
            } else {
                System.out.print(" ");
                k=true;
            }
        }
        System.out.println();
    }





     }

 }   

