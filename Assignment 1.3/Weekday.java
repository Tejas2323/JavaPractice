import java.util.Random;
public class Weekday {
 
    static int number;
    public static void main(String[] args) {
        Random rn = new Random();
        number = rn.nextInt(7) + 1; // added plus 1 because max (7) is exclusive and won't generate if not

        System.out.println("Number generated: " + number);
        
        switch (number) {
            case 1:
                System.out.println("The first day is Monday");
                break;
            case 2:
                System.out.println("The second day is Tuesday");
                break;
            case 3:
                System.out.println("The third day is Wednesday");
                break;
            case 4:
                System.out.println("The fourth day is Thursday");
                break;
            case 5:
                System.out.println("The fifth day is Friday");
                break;
            case 6:
                System.out.println("The sixth day is Saturday");
                break;
            case 7:
                System.out.println("The seventh day is Sunday");
                break;
            default:
                break;
        }
    }
}
