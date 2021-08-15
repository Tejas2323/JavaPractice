class ObjMethodEg{

static void show(){
    System.out.println("This is static method");
}

void show1(){
    System.out.println("This is non-static method called by an object");
}
    public static void main(String[] args) {
        show(); //can run without any object since it is static

        ObjMethodEg obj1 = new ObjMethodEg();
        obj1.show1();   //non-static methods should be called via an object
        
    }
}