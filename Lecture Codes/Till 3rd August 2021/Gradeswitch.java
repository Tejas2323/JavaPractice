
import java.util.Scanner;
public class Gradeswitch {
    public static void main(String[] args) {
        System.out.println("Enter marks");
        Scanner sc = new Scanner(System.in);
        int marks=sc.nextInt();
        sc.close();
        switch (marks) {
            case 70:
            System.out.println("Grade A");
            break;
            case 55:
            System.out.println("Grade B");
            break;
            case 40:
            System.out.println("Grade C");
            break;
            case 35:
            System.out.println("Grade D");
            break;
            default:
            System.out.println("Please provide valid marks");
            break;
                
        }
    }
}
