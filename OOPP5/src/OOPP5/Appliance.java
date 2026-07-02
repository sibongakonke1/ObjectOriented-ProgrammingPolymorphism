package OOPP5;

//Super class from Television, Refrigerator, WashingMachine

public class Appliance {
		
public void turnOn() {
	System.out.println("Turn on the appliance ");
}

public static void main (String[] args){
	Appliance app;
	
	app=new Appliance();
	app.turnOn();
	
	app= new Television();
	app.turnOn();
	
	app=new WashingMachine();
	app.turnOn();
			
	}

}
