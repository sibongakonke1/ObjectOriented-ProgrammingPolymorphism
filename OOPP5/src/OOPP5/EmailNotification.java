package OOPP5;

//Subclass for Notification

class EmailNotification extends Notification {
		
	@Override
	public void send() {
		System.out.println("Sending email");
	}
	
}
