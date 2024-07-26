package nesnetasarım;

public class Pentagon extends Shape {
	public Pentagon(Color c) {
		super(c);
	}
	@Override
	public void applyColor() {
		System.out.println("Pentagon içi renk ile dolu");
		color.applyColor();
	}
	
	
}
