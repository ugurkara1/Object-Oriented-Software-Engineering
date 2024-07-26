package nesneproje;

public class Tatlı extends Menu{
	public Tatlı(String ad,double fiyat) {
		super(ad,fiyat);
	}

	@Override
	public void hazırla() {
		System.out.println("Tatlı hazırlanıyor :" +getAd());
	}
}
