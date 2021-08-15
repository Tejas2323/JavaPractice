public class Pangram {

    public static boolean checkPangram(String str) {
        boolean[] mark = new boolean[26];

        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            // If uppercase character, subtract 'A' to find index.
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A'; 
            }
            // If lowercase character, subtract 'a' to find index.
            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z'){
                index = str.charAt(i) - 'a'; 
            }
            mark[index] = true;
        }
        for (int i = 0; i <= 25; i++)
            if (!mark[i])
                return (false);
            
            
                return (true);
            
            }
    public static void main(String[] args) {
        System.out.println(checkPangram("The quick brown fox jumps over the lazy dog"));
        
        // String str2 = "d";
        // int index1 = 0;
        // index1 = str2.charAt(0) - 'a';

        // System.out.println(index1);

        }
}