package kalitimm;

public class calisan {
	protected String adSoyad,eposta,telefon;
	public calisan(String adSoyad, String eposta, String telefon) {
		this.adSoyad = adSoyad;
		this.eposta = eposta;
		this.telefon = telefon;
	}
	public String giris() {
		return adSoyad+" giriş yaptı";
	}
	/**
	 * @return the adSoyad
	 */
	public String getAdSoyad() {
		return adSoyad;
	}
	/**
	 * @param adSoyad the adSoyad to set
	 */
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}
	/**
	 * @return the eposta
	 */
	public String getEposta() {
		return eposta;
	}
	/**
	 * @param eposta the eposta to set
	 */
	public void setEposta(String eposta) {
		this.eposta = eposta;
	}
	/**
	 * @return the telefon
	 */
	public String getTelefon() {
		return telefon;
	}
	/**
	 * @param telefon the telefon to set
	 */
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public static void listele(calisan[] girisYapanlar) {
		for(calisan c:girisYapanlar) {
			System.out.println(c.giris());
		}
	}

}
