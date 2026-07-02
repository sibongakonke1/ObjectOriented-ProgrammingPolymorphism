package OOPP5;

//This is a super class for  Circle and  Rectangle

public class Shape {
	
	public void draw() {
		System.out.println("Draw shape");
	}
	
	public static void main (String[] args){
		
		Shape shape;
		
		shape=new Shape();
		shape.draw();
		
		shape=new Rectangle();
		shape.draw();
		
		
		shape=new Circle();
		shape.draw();
				
	}
	
}
