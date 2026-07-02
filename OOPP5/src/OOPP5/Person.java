package OOPP5;

//Superclass for Student, Teacher, Doctor

public class Person {
	
	public void introduce(){
		System.out.println("Hello, I'm a student studying Computer Science.");
	}
	
	public static  void main (String[] args){
		Person person;
			
		person=new Person();
		person.introduce();
		
		person=new Student();
		person.introduce();
			
		person= new Teacher();
		person.introduce();
		
		person= new Doctor();
		person.introduce();
					
	}
}
