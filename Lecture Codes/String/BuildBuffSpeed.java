class BuildBuffSpeed{
    public static void main(String[] args) {
        
        int N=77777777;
        long t;

        {
            StringBuffer sb = new StringBuffer();
            t = System.currentTimeMillis();
            for (int i = N; i --> 0 ;) {
                sb.append("");
            }
            System.out.println("StringBuffer took approx");
            System.out.println(System.currentTimeMillis() - t + " ms");
        }

        {
            StringBuilder sb = new StringBuilder();
            t = System.currentTimeMillis();
            for (int i = N; i > 0 ; i--) {
                sb.append("");
            }
            System.out.println("StringBuilder took approx");
            System.out.println(System.currentTimeMillis() - t + " ms");
        }

        
    }
}