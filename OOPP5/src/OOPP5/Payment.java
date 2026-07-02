package OOPP5;

//Super class for CreditCardPayment and CashPayment

public class Payment {
	
	public void pay() {
		System.out.println("Thank you for the payment");
	}	
				
	public static void main(String[] args) {
		
		Payment myPay;
		
		myPay=new Payment();
		myPay.pay();
		
		myPay=new CreditCardPayment();
		myPay.pay();
		
		myPay=new CashPayment();
		myPay.pay();		
		}		
	}
	

