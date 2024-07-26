package Facade;

public class ShapeMaker {
	//create facade a class
	private Shape circle;
	private Shape Rectangle;
	private Shape Square;
	
	public ShapeMaker() {
		circle=new circle();
		Rectangle=new Rectangle();
		Square =new Square();
	}
	public void drawCircle() {
		circle.draw();
	}
	public void drawRectangle() {
		Rectangle.draw();
	}
	public void drawSquare() {
		Square.draw();
	}
}
