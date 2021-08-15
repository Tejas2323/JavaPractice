public class Grade {
    public static void main(String[] args) {
        int marks=35;

        if (marks>=70) {
            System.out.println("Grade A");
        } else if(marks>=50 && marks<70) {
            System.out.println("Grade B");
        }
        else if(marks>=40 && marks<50){
            System.out.println("Grade C");
        }
        else if(marks>=35 && marks<40){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Failed :(");
        }
    }
}
