package nesne21;

public class Circle implements Shape{
	private String Color;
	public Circle (String Color) {
		this.Color=Color;
	}
	public Shape clone() {
		return new Circle(this.Color);
		
	}
	@Override
	public void draw() {
		System.out.println("Drawing a " + Color  + " circle.");
		
	}
}
