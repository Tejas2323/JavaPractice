public class Grade {
    public static void main(String[] args) {
        int percent=70;

        if (percent>=70) {
            System.out.println("Grade A");
        } else if(percent>=50 && percent<70) {
            System.out.println("Grade B");
        }
        else if(percent>=40 && percent<50){
            System.out.println("Grade C");
        }
        else if(percent>=35 && percent<40){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Failed :(");
        }
    }
}
