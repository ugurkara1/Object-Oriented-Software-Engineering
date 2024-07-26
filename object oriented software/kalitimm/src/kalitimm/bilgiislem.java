package kalitimm;

public class bilgiislem extends memur{
	String gorev;

	public bilgiislem(String adSoyad, String eposta, String telefon, String departman, String mesai, String gorev) {
		super(adSoyad, eposta, telefon, departman, mesai);
		this.gorev = gorev;
	}
	public String getGorev() {
		return gorev;
	}
	public void setGorev(String gorev) {
		this.gorev = gorev;
	}
	
}
