public class ArrayM2 {
    static int[] arrayprint(){
        
        return  new int[]{1,2,3,4,5};

    }
    public static void main(String[] args) {
        
        int arr[] = arrayprint();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
