package kalitimm;

public abstract class akademisyen extends calisan{
	String bolum,gorevler;
	String dersler;
	
	public akademisyen(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String dersler) {
		super(adSoyad, eposta, telefon);
		this.bolum = bolum;
		this.gorevler = gorevler;
		this.dersler = dersler;
	}
	@Override
	public String giris() {
		return adSoyad+" A kapısından giriş yaptı";
		
	}
	public String getBolum() {
		return bolum;
	}
	public void setBolum(String bolum) {
		this.bolum = bolum;
	}
	public String getGorevler() {
		return gorevler;
	}
	public void setGorevler(String gorevler) {
		this.gorevler = gorevler;
	}
	public String getDersler() {
		return dersler;
	}
	public void setDersler(String dersler) {
		this.dersler = dersler;
	}

	public abstract void dersegir(int derssaati);
}
