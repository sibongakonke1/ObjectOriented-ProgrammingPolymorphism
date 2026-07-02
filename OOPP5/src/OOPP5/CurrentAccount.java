package OOPP5;

//Subclass for BankAccount1

class CurrentAccount extends BankAccount1 {
	
	@Override
	public void withdraw() {
		System.out.println("This is your current account");
	}
}
