package kalitimm;

public class memur extends calisan {
	String departman,mesai;
	
	public memur(String adSoyad, String eposta, String telefon, String departman, String mesai) {
		super(adSoyad, eposta, telefon);
		this.departman = departman;
		this.mesai = mesai;
	}

	/**
	 * @return the departman
	 */
	public String getDepartman() {
		return departman;
	}

	/**
	 * @param departman the departman to set
	 */
	public void setDepartman(String departman) {
		this.departman = departman;
	}

	/**
	 * @return the mesai
	 */
	public String getMesai() {
		return mesai;
	}

	/**
	 * @param mesai the mesai to set
	 */
	public void setMesai(String mesai) {
		this.mesai = mesai;
	}
	
	
}
