package HaberObserver;
import java.util.*;
public class HaberAjansı {
	private String Haber;
	private List<Kanal> kanallar=new ArrayList<>();
	public void gözlemciEkle(Kanal kanal) {
		this.kanallar.add(kanal);
	}
	
	public void gözlemciCıkar(Kanal kanal) {
		this.kanallar.remove(kanal);
	}
	public void setHaber(String Haber) {
        this.Haber = Haber;
        for (Kanal kanal : this.kanallar) {
            kanal.guncelle(this.Haber);
        }
    }
}
