package kalitimm;

public class guvenlik extends memur {
	String belge;

	public guvenlik(String adSoyad, String eposta, String telefon, String departman, String mesai, String belge) {
		super(adSoyad, eposta, telefon, departman, mesai);
		this.belge = belge;
	}
	public String getBelge() {
		return belge;
	}
	public void setBelge(String belge) {
		this.belge = belge;
	}
	

}
