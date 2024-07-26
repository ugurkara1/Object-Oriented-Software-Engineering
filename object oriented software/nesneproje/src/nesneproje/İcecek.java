package nesneproje;

public class İcecek extends Menu{
	public İcecek(String ad,double fiyat) {
		super(ad,fiyat);
	}
	@Override
	public void hazırla() {
		System.out.println("İçecek hazırlanıyor : "+ getAd());
	}
}
