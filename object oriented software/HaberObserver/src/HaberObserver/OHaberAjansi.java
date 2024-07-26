package HaberObserver;

//ONewsAgency sınıfı (Observable sınıfından türetilmiş)
public class OHaberAjansi extends Observable {
	private String Haber;

	public void setHaber(String Haber) {
		this.Haber = Haber;
		setChanged();
		notifyObservers(Haber);
	}
	// Test kodu
	OHaberAjansi observable = new OHaberAjansi();
	OHaberKanali observer = new OHaberKanali();

	observable.addObserver(observer);
	observable.setHaber("haber");
	assertEquals(observer.getHaber(), "haber");}
}
