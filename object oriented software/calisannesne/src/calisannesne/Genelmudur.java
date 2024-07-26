package calisannesne;

public class Genelmudur extends mudur{

	public Genelmudur(String pozisyon, String adSoyad) {
		super(pozisyon, adSoyad);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void calis() {
		System.out.println("4 saat çalışır");
	}
	public void toplantıYönet() {
		System.out.println("toplantı yönetir");
	}
	
}
