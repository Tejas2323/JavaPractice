class Stringex{
    public static void main(String[] args){


        // String using literal (stored in string constant pool)
        String s1 = "India";

        System.out.println(s1);

        // String is immutable (that cannot be changed, )
       
        s1=s1.concat(" country");
        System.out.println(s1);
        
        
        // String using new keyword (stored in heap memory)
        String s2 = new String("Object String");
        System.out.println(s2);
        

        

    }
}