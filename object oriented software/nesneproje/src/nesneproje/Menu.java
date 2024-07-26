package nesneproje;

public abstract class Menu {
	private String ad;
	private double fiyat;
	
	public Menu(String ad,double fiyat) {
		this.ad=ad;
		this.fiyat=fiyat;
	}
	public String getAd() {
		return ad;
	}
	public double getFiyat() {
		return fiyat;
	}
	public abstract void hazırla();
	
}
