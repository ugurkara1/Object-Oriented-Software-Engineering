package nesneproje;

public class Dondurma extends Menu {
	public Dondurma(String ad,double fiyat) {
		super(ad,fiyat);
	}
	@Override
	public void hazırla() {
		System.out.println("dondurma hazırlanıyor: "+getAd());
	}
	
}
