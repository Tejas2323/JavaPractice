

public class Arguments {
    public static void main(String[] args) {
     
    String custName = args[0];
    int custId = Integer.parseInt(args[1]);
    String custAddress = args[2];
    double custBalance= Double.parseDouble(args[3]);
    long custAccountNum= Long.parseLong(args[4]);

    System.out.println("The customer name is " + custName);
    System.out.println("The customer ID is " + custId);
    System.out.println("The customer Address is " + custAddress);
    System.out.println("The customer Balance is " + custBalance);
    System.out.println("The customer Account number is " + custAccountNum);

    }
    } 
