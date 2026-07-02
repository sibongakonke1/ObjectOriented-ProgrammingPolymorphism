package OOPP5;

//Subclass for Animal

class Dog extends Animal{
	
	Dog(String name){
		super(name);
		}
	
	    @Override
		public void makeSound(){
		System.out.println("Woof!");
	} 
	
	
	public static void main(String[] args) {
		Dog myDog=new Dog("Spoti");
		myDog.makeSound();	
	}
	

}

