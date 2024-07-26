package kalitimm;

public class ogretimuyesi extends akademisyen {
	String unvan;

	public ogretimuyesi(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String dersler,
			String unvan) {
		super(adSoyad, eposta, telefon, bolum, gorevler, dersler);
		this.unvan = unvan;
	}
	public String getUnvan() {
		return unvan;
	}


	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	@Override
	public void dersegir(int derssaati) {
		System.out.println(getUnvan()+" "+getAdSoyad()+ " " + getDersler()+ " saat: " +derssaati+" dersine  girdi");
	}
	
}
