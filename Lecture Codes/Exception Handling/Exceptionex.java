


class Exceptionex{
    public static void main(String[] args) {
         try{
            int a=5;
            a=5/0;
        }

        catch(Exception e){
          System.out.println(e);
          System.out.println("Catch block code if catched exception");
        }
        finally{
            System.out.println("Finally block (always executed)");
            
        }
        System.out.println("Rest of the code");
        
    }
}