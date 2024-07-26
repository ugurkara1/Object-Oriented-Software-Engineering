package calisannesne;

public class pazarlamaci extends calisan {

	public pazarlamaci(String pozisyon, String adSoyad) {
		super(pozisyon, adSoyad);
	}
	public void pazarlamacı() {
		System.out.println("pazarlamacı");
	}
	@Override
	public void calis() {
		System.out.println("pazarlamacı 5 saat çalışır");
	}
}
