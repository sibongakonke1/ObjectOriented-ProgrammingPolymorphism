package OOPP5;

//Superclass for CurrentAccount and SavingsAccount1

public class BankAccount1 {
	
	public void withdraw() {
		System.out.print("Thank you for withdrawn");	
	}
	
	public static void main(String[] args){
		BankAccount1 account;
		
		account=new BankAccount1();
		account.withdraw();
		
		account=new CurrentAccount();
		account.withdraw();
		
		account=new SavingsAccount1();
		account.withdraw();		
	}
}
