package oops.Account;

public class TestAccount {
	public static void main(String[] args){
		
		Account a1=new Account();
		a1.insert(1001,"Rana",1000);
		a1.display();
		a1.checkBalance();
		a1.deposit(2000);
		a1.withdrawn(1500);
		a1.checkBalance();
		
	}
	}
	

