package Factory;

public class TelefonBayi {
	public static void main(String[] args) {
		Telefon s8=TelefonFactory.getTelefon("s8", "2600mah", 4, 7);
		Telefon note8=TelefonFactory.getTelefon("note8", "3200", 5, 8);
		System.out.println("s8 için telefon özellikleri");
		System.out.println(s8);
		System.out.println("note8 için telefon özellikleri");
		System.out.println(note8);

	}
}
