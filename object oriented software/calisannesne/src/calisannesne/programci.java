package calisannesne;

public class programci extends calisan {

	public programci(String pozisyon,String adSoyad) {
		super(pozisyon,adSoyad);
		// TODO Auto-generated constructor stub
	}
	public void programci(){
		System.out.println(this.pozisyon +" Program yazar");
	}
	@Override
	public void calis() {
		System.out.println("12 saat çalışır");
	}
}
