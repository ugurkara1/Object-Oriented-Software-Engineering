package calisannesne;

public class SistemProgramci extends programci{

	public SistemProgramci(String pozisyon, String adSoyad) {
		super(pozisyon, adSoyad);
	}
	public void sistemincele() {
		System.out.println( this.pozisyon +"sistem incele");
	}
}
