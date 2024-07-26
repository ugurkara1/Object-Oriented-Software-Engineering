package nesne2;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("hesaplamak istediğiniz şekil");
		System.out.println("1-dikdörtgen");
		System.out.println("2-daire");
		int secim=scanner.nextInt();
		switch (secim) {
			case 1:
				System.out.println("dikdörtgenin boyunu giriniz:");
				int boy=scanner.nextInt();
				System.out.println("dikdörtgenin enini giriniz:");
				int en=scanner.nextInt();
				Dikdörtgen dikdörtgen=new Dikdörtgen(boy, en);
				System.out.println("dikdörtgenin alanı:"+dikdörtgen.alanhesapla());
				System.out.println("dikdörtgenin çevresi:"+dikdörtgen.cevrehesapla());
				break;
			case 2:
				System.out.println("Dairenin yarıçapını giriniz:");
				int yaricap=scanner.nextInt();
				Daire daire=new Daire(yaricap);
				System.out.println("dairenin alanı:"+daire.alanhesapla());
				System.out.println("dairenin çevresi:"+daire.cevrehesapla());
				break;
			default:
				System.out.println("geçersiz seçim");
		}
		scanner.close();
	}

}
