package OOPP5;

//Super class for Dog1,Cat1,Cow1

public class Animal1 {
	
	public void makeSound() {
		System.out.println("Different animals make different sounds");		
	}
	
	public static void main(String[] args){
		Animal1 animal;
		
		animal= new Animal1();
		animal.makeSound();
		
		animal=new Cat1();
		animal.makeSound();
		
		animal=new Dog1();
		animal.makeSound();	
	}		 
}
