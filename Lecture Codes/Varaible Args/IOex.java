import java.io.FileInputStream;


public class IOex {
    public static void main(String[] args) {
        try{

          
            FileInputStream fin = new FileInputStream("D:/Java Course/Lecture Codes/Varaible Args/test.txt");
            int i;
            
       
            while((i=fin.read())!=-1){
            // read is a method if FileInputStream for reading the characters
            System.out.print((char)i); //Typecasting, converted int to char
                }
           
        
           fin.close();

           
            
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}
