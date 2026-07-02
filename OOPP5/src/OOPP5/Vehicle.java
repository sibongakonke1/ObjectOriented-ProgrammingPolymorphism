package OOPP5;

//Superclass for car

public class Vehicle {
	
	public void startEngine(){
		System.out.println("Starting vehicle....");
	}
	
	public static void main(String[] args) {
		Vehicle vehicle;
		
		vehicle=new Vehicle();
		vehicle.startEngine();
			
	vehicle= new Car();
	vehicle.startEngine();
				
	}

}
