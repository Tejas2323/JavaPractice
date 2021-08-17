interface Rate{
    void name();
    void rateofinterest();
    
}

class BOI implements Rate{
    public void name(){
        System.out.println("Bank of India");
    }

    public void rateofinterest(){
        System.out.println("2.90% to 5.40% p.a");
    }
}

class ICICI implements Rate{
    public void name(){
        System.out.println("ICICI Bank");
    }

    public void rateofinterest(){
        System.out.println("2.50% to 5.50% p.a");
    }
}

class HDFC implements Rate{
    public void name(){
        System.out.println("HDFC Bank");
    }

    public void rateofinterest(){
        System.out.println("2.50% to 5.50% p.a");
    }
}



public class Bank {
    public static void main(String[] args) {
        BOI b1 = new BOI();
        b1.name();
        b1.rateofinterest();

        ICICI i1 = new ICICI();
        i1.name();
        i1.rateofinterest();

        HDFC h1 = new HDFC();
        h1.name();
        h1.rateofinterest();
    }
}
