
import java.util.Random;
import java.util.Scanner;



public class RPS {
   static int count=1 , score1=0, score2=0;
   static String n1="Rock" , n2="Paper", n3="Scissor";
   static String n4;

    void Parameter(int num){
        if(num==1){
            n4=n1;
        }
        else if(num==2){
            n4=n2;
        }
        else{
            n4=n3;
        }
        
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Rock Paper Scissors game! (Best of 3)");
        System.out.println("Select an option: 1. Rock 2. Paper 3. Scissor");
        Scanner sc= new Scanner(System.in);
        
        Random rand = new Random();
       
        // nextInt as provided by Random is exclusive of the top value so you need to add 1 
        int randomNum;
        
        RPS obj = new RPS();

       
        while (count<=5) {
            if (score1==3) {
                System.out.println("You won the game already!");
                break;
            }

            if (score2==3) {
                System.out.println("You lost the game already :(");
                break;
            }
            int num = sc.nextInt();
            randomNum = rand.nextInt((3 - 1) + 1) + 1;
           

            if (randomNum==num) {
               obj.Parameter(num);
               
                System.out.println("BOT: " + n4 + " You: " + n4);
                System.out.println("Draw");
                randomNum = rand.nextInt((3 - 1) + 1) + 1;
                
                count ++;
            } else if(randomNum==1 && num==2) {
                System.out.println("BOT: Rock You: Paper");
                System.out.println("You Win!");
                randomNum = rand.nextInt((3 - 1) + 1) + 1;
                score1++;
                count++;
            }
            else if(randomNum==2 && num==1){
                System.out.println("BOT: Paper You: Rock");
                System.out.println("You Lose :(");
                randomNum = rand.nextInt((3 - 1) + 1) + 1;
                score2++;
                count++;
            }
            else if(randomNum==2 && num==3){
                System.out.println("BOT: Paper You: Scissor");
                System.out.println("You Win!");
                randomNum = rand.nextInt((3 - 1) + 1) + 1;
                score1++;
                count++;
            }
            else if(randomNum==3 && num==2){
                System.out.println("BOT: Scissor You: Paper");
                System.out.println("You Lose :(");
                randomNum = rand.nextInt((3 - 1) + 1) + 1;
                score2++;
                count++;
            }
            else if(randomNum==1 && num==3){
                System.out.println("BOT: Rock You: Scissor");
                System.out.println("You Lose :(");
                randomNum = rand.nextInt((3 - 1) + 1) + 1;
                score2++;
                count++;
            }
            else if(randomNum==3 && num==1){
                System.out.println("BOT: Scissor You: Rock");
                System.out.println("You Win!");
                randomNum = rand.nextInt((3 - 1) + 1) + 1;
                score1++;
                count++;
            }
            else{
                continue;
            }
        }
      
       if (score1>=3) {
            System.out.println("");
            System.out.println("You won the game! :D");
       }
       else if(score2>=3){
        System.out.println("");
        System.out.println("You lost the game :(");
        
       }
       else{
            System.out.println("");
            System.out.println("Game tied");
       }
        
    }

}
