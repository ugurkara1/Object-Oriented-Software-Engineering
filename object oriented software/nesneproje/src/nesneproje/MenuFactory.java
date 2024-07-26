package nesneproje;

public class MenuFactory {
	public static Menu createMenu(String type,String ad,double price) {
		switch(type.toLowerCase()) {
		case "dondurma":
			return new Dondurma(ad,price);
		case "tatlı":
			return new Tatlı(ad,price);
		case "içecek":
			return new İcecek(ad,price);
		default:
			throw new IllegalArgumentException("Geçersiz menü öğesi : " + type);
		}
	}
}
