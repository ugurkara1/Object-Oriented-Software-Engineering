package calisannesne;

public class calisan {
	protected String pozisyon;
	protected String adSoyad;
	
	public calisan(String pozisyon, String adSoyad) {
		super();
		this.pozisyon = pozisyon;
		this.adSoyad=adSoyad;
	}

	public String getPozisyon() {
		return pozisyon;
	}

	public void setPozisyon(String pozisyon) {
		this.pozisyon = pozisyon;
	}

	public void calis() {
		System.out.println("çalışır");
	}
	
}
