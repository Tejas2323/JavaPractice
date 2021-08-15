public class RevString {
    
    static String s1="Tejas";
    static char[] c1=new char[s1.length()];
    

  
    public static void main(String[] args) {
        
        for(int i=0;i<s1.length(); i++){
            c1[i]=s1.charAt(i);

        }
        //Original Char
        for (int i = 0; i <c1.length; i++) {
            System.out.print(c1[i]);
        }
        System.out.println();
        //Reverse Char
        for (int i = c1.length-1; i>=0; i--) {
            System.out.print(c1[i]);
        }
    }
}
