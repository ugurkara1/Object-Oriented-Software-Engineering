package nesneyazılım;
import java.util.Scanner;
public class AnaSinif {

	public static void main(String[] args) {
		//islemler toplama=new islemler();
		//toplama.sum(20, 20);
		//islemler cıkarma=new islemler();
		//cıkarma.cıkarma(20, 5);
		//islemler carpma=new islemler();
		//carpma.çarpma(20, 50);
		//islemler bölme =new islemler();
		//bölme.bölme(20,10);
		Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Yapılacak işlemi seçin:");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");

        int secim = scanner.nextInt();
        islemler hesapMakinesi = new islemler();
        switch (secim) {
            case 1:
                //System.out.println("Toplama işlemi sonucu: " + (sayi1-sayi2));
                hesapMakinesi.sum(sayi1, sayi2);
            	break;
            case 2:
                //System.out.println("Çıkarma işlemi sonucu: " + (sayi1 - sayi2));
                hesapMakinesi.cıkarma(sayi1, sayi2);
            	break;
            case 3:
                //System.out.println("Çarpma işlemi sonucu: " + (sayi1 * sayi2));
                hesapMakinesi.çarpma(sayi1, sayi2);
            	break;
            case 4:
                if (sayi2 != 0)
                    //System.out.println("Bölme işlemi sonucu: " + (sayi1 / sayi2));
                	hesapMakinesi.bölme(sayi1, sayi2);
                else
                    System.out.println("Bir sayı sıfıra bölünemez!");
                break;
            default:
                System.out.println("Geçersiz seçim!");
        }

        scanner.close();
    }

}

