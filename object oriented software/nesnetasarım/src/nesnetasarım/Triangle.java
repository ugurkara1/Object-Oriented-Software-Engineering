package nesnetasarım;

public class Triangle extends Shape {
	public Triangle(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.println("Triangle renk ile dolu.");
		color.applyColor();
	}
	
}
