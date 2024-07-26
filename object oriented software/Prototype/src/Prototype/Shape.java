package Prototype;

public interface  Shape {
	//We define an interface called the acts as the prototype.it declares two methods: for making a copy of itself and for drawing the shape
	Shape clone();
	public void draw();
}
