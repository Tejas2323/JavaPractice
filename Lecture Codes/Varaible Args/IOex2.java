
import java.io.*;
public class IOex2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("D:/Java Course/Lecture Codes/Varaible Args/output.txt");
            // fout.write(65); //It will replace the entire contents with D - 68 according to IOStream numbers
            String s= "Hello World!";
            byte b[]=s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success!");
        }

        catch(Exception e){
            System.out.println(e);
        }
    }
}
