class Privateex{

    private static int num=2;

    private static void display(){
        System.out.println("Private display");
    }

  
}

class Privatemodi{
    public static void main(String[] args) {
        Privateex obj1= new Privateex();

        System.out.println(obj1.num);
        obj1.display();
    }
}
