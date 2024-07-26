package Facade2;

public class RoomFacade {
	private Television tv;
	private SecrutiySystem secrutiy;
	private Refrigerator refrigerator;
	private RoomHeater roomheater;
	public RoomFacade() {
		tv=new Television();
		secrutiy=new SecrutiySystem();
		refrigerator=new Refrigerator();
		roomheater=new RoomHeater();
	}
	public void goingOut() {
		System.out.println("Going out for a walk");
		tv.switchOff();
		secrutiy.switchOn();
		refrigerator.switchOff();
		roomheater.switchOff();
	}
	public void comingBack() {
		System.out.println("Coming back to home");
		tv.switchOn();
		secrutiy.switchOff();
		refrigerator.switchOn();
		roomheater.switchOn();
	}
	
}
