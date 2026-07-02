package OOPP5;

//Super class for Dog

public class Animal {
	String name;
	
	public Animal(String name) {
		this.name=name;		
	}
	
	public void makeSound(){
		System.out.println("Some animals make sounds");
	}
	
	
	public static void main (String[] args) {
		
		Animal animai;	     //This is the same as Animal animal=new Animal("Spoti"); We just wrote it on different lines
		
		animai=new Animal("Spoti");
		animai.makeSound();
		
		animai=new Dog("Ranger");
		animai.makeSound();
		
		
	    
	}
	

}
