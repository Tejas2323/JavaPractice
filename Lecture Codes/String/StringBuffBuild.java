public class StringBuffBuild {
    public static void main(String[] args) {
        
        //Most commonly used method is append (mutable string)
        StringBuffer s1 = new StringBuffer("Hello");
        s1.append(" World");
        System.out.println(s1);

        StringBuilder s2 = new StringBuilder("India");
        s2.append(" country");
        System.out.println(s2);

        //insert method to insert any character in between string
        s1.insert(6, ",");
        System.out.println(s1);

        //replace a char in a string
        s1.replace(6, 12, "everyone");
        System.out.println(s1);

        //reverse of a string
        System.out.println(s1.reverse());


        //to delete any char in between a string
        s2.delete(6, 13);
        System.out.println(s2);

        
        
        

        //both String Buffer and Builder are String mutable and append is most commonly used method.

        // String Buffer is slower but thread safe and synchronized.
        // String Builder is faster but thread unsafe and not synchronized. Typically used only on single thread. 



    }
}
