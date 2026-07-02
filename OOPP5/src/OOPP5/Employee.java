package OOPP5;

//Super class for Developer

public class Employee {
	
	public  void work() {
		System.out.println("Emplotee is working");	
	}
	
	
	public static void main(String[] args) {
		
		Employee employee;
		
		employee=new Employee();
		employee.work();
		
		employee=new Developer();
		employee.work();
	}

}
