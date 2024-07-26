package nesneproje;

public class Main {

	public static void main(String[] args) {
		try {
			 Menu dondurma = MenuFactory.createMenu("dondurma", "Fıstıklı Dondurma", 3.50);
	         Menu tatlı = MenuFactory.createMenu("tatlı", "Baklava", 5.00);
	         Menu içecek = MenuFactory.createMenu("içecek", "Limonata", 2.50);	
	         
	         
	         dondurma.hazırla();
	         tatlı.hazırla();
	         içecek.hazırla();
	         
	         Menu pizza = MenuFactory.createMenu("pizza", "Sucuklu", 2.50);	

		} catch (Exception e) {
			 System.err.println(e.getMessage());		}
	}

}
