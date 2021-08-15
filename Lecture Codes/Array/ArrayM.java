public class ArrayM {
    

    static void arrayprint(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4};

        arrayprint(a);
    }
}
