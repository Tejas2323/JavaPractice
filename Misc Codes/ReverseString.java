public class ReverseString {
    public static void main(String[] args) {
        String s1 = "faceless";
        char[] c1 = new char[s1.length()]; 

        for (int i = 0; i <s1.length(); i++) {
            c1[i] = s1.charAt(i);
        }
        System.out.println("Original String:");
        for (int i = 0; i < c1.length; i++) {
            System.out.print(c1[i]);
        }
        System.out.println();

        System.out.println("Reversed String:");
        for (int i = s1.length()-1; i>=0; i--) {
            System.out.print(c1[i]);
        }
        }
    }