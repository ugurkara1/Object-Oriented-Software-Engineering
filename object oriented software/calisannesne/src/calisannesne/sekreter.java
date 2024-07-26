package calisannesne;

public class sekreter extends calisan {

	public sekreter(String pozisyon, String adSoyad) {
		super(pozisyon, adSoyad);
	}
	public void sekreter() {
		System.out.println("sekreter");
	}
	@Override
	public void calis() {
		System.out.println("sekreter 8 saat çalışır");
	}
}
