package Prototype;

public class Circle implements Shape{
	private String Color;

	public Circle(String color) {
		this.Color = color;
	}
	public Shape clone() {
		return new Circle(this.Color);
	}
	@Override
	public void draw() {
		System.out.println("Drawing a " + Color  + " circle.");
	}
	
	
}

