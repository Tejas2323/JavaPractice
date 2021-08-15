// //abstract class
// public abstract class Accounts {
// 	int balance;
	
// 	//concrete method
// 	final void deposit(int amount) {
// 		balance = amount;
// 		System.out.println("Amount Deposited to the account: "+balance);
// 	}
	
// 	//abstract method: concrete method without method body
// 	abstract void withdrawl(int amount);
	
// 	public static void main(String[] args) {
// 		Accounts s1 = new SavingsAccount();
// 		s1.deposit(50000);
// 		s1.withdrawl(10000);
		
// 		CurrentAccount s2 = new SalaryAccount();
// 		s2.BalanceEnquiry();
// 		s2.deposit(60000);
// 		s2.BalanceEnquiry();
// 		s2.withdrawl(30000);
// 	}
// }

// class SavingsAccount extends Accounts{
	
	
// 	int min_balance = 5000;
	
// 	@Override
// 	void withdrawl(int amount) {
// 		//TODO Auto-generated method stub
// 		System.out.println("Amount that can be withdrawed :"+(balance-min_balance));
// 		if (amount>balance) {
// 			System.out.println("Funds are not sufficient for withdrawl");
// 		}else {
// 			balance = balance-amount;
// 			System.out.print("Remaining balance :"+balance);
// 		}
			
// 	}
	
// }

// abstract class CurrentAccount extends Accounts{
	
// 	void BalanceEnquiry() {
// 		System.out.println("Balance is :"+balance);
// 	}

// }

// class SalaryAccount extends CurrentAccount{
	
	
// 	@Override
// 	void withdrawl(int amount) {
// 		// TODO Auto-generated method stub
		
// 		if(amount>balance) {
// 			System.out.println("Insufficient Funds");
// 		}
// 		else {
// 			System.out.println("Remaining Balance: "+(balance-amount));
// 		}
// 	}
	
// }




 






