package HaberObserver;

public class HaberKanali implements Kanal {
	private String Haber;
	@Override
    public void guncelle(Object Haber) {
		this.setHaber((String) Haber);
	}
	public void setHaber(String haber) {
        this.Haber = haber;
    }
	public String getHaber() {
        return Haber;
    }
	
}
