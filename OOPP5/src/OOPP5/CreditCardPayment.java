package OOPP5;

//Subclass for payment

class CreditCardPayment extends Payment {
	
	@Override
	public void pay() {
		System.out.println("Thank you for using your credit card");	
	}
	
}
