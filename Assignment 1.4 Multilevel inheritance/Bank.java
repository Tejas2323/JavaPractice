public abstract class Bank {
    int balance=5000;

     final void deposit(int amount){
        balance = amount;
        System.out.println(+amount + " amount has been deposited.");
        System.out.println("Balance : " + balance);
    }

     void withdrawl(int amount){
        balance = balance - amount;
        System.out.println(amount + " has been sucessfully withdrawed");
        System.out.println("Balance : " + balance);
     }

     public static void main(String[] args) {
         SavingsAccount s1 = new SavingsAccount();
         s1.deposit(5000);
         s1.withdrawl(2000);

         SalaryAccount sa1 = new SalaryAccount();
         sa1.BalanceInfo();
         sa1.withdrawl(3000);


     }
    
}

class SavingsAccount extends Bank{
    int min_amt=500;

    

    @Override
    void withdrawl(int amount){
        if(amount<min_amt){
            System.out.println("Please withdraw minimum 500");
        }
        if(amount>balance){
            System.out.println("Insufficient balance, please try again");
        }
        else {
            super.withdrawl(amount);        // Used super keyword to define method of Parent class
        }
       
    }
}

abstract class CurrentAmount extends Bank{

    void BalanceInfo(){
        System.out.println("Your current balance is " + balance);
    }


}

class SalaryAccount extends CurrentAmount{
	
	
	@Override
	void withdrawl(int amount) {
		
		if(amount>balance) {
			System.out.println("Insufficient Funds");
		}
		else {

			super.withdrawl(amount);
		}
	}
	
}
