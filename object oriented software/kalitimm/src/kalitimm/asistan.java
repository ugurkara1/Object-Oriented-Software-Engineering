package kalitimm;

public class asistan extends akademisyen {
	String YüksekLisans;

	public asistan(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String dersler,
			String yüksekLisans) {
		super(adSoyad, eposta, telefon, bolum, gorevler, dersler);
		YüksekLisans = yüksekLisans;
	}
	public String getYüksekLisans() {
		return YüksekLisans;
	}
	public void setYüksekLisans(String yüksekLisans) {
		YüksekLisans = yüksekLisans;
	}
	@Override
	public void dersegir(int derssaati) {
		System.out.println(getAdSoyad()+ " " + getDersler() +" dersine asistan olarak girdi");
	}
	
}		
