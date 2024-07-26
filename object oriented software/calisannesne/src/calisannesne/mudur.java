package calisannesne;

public class mudur extends calisan{

	public mudur(String pozisyon,String adSoyad) {
		super(pozisyon,adSoyad);
		// TODO Auto-generated constructor stub
	}
	public void mudur() {
		System.out.println("müdür");
	}
	@Override
	public void calis() {
		System.out.println("müdür 8 saat çalışır");
	}
}
