class Variableargex{

    static void display(String... values){
        System.out.println("Printing values");
        for(String s:values){ //For each loop
            System.out.println(s);
        }
    }

    static void display2(int... values2 ){
        System.out.println("Integer values");

        for (int i : values2) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        display(); // Since no args, simply print first sop, get out of for each loop
        display("Hi","Hello","Billow","Yanna","Rascala");
        display2();
        display2(1,2,3,4,5,6,7);
    }
}