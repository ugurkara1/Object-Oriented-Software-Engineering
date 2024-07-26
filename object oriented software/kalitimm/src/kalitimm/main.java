package kalitimm;

public class main {

	public static void main(String[] args) {
		calisan c1=new calisan("ahmet","@gmail.com","05553747");
		System.out.println(c1.getAdSoyad());
		ogretimuyesi o=new ogretimuyesi("mehmet", "@gmaik.comfd", "5464646", "CEnge", "hoca", "ceng-102", "doçent");
		o.giris();
		calisan c2=new calisan("veli", "@gmaik.comfd", "5464646");
		c2.giris();
		asistan a=new asistan("dilan yasar","@gmail.com","566885","fizyoterapi","hoca","föd","evet");
		System.out.println(a.giris());
		/*calisan c=new akademisyen("ugur","@gmail.kara","53654766934","ceng","hoca","bmg");*/
		//calisan[] girislistesi= {c,c1,o,c2,a };
		//calisan.listele(girislistesi);
		o.dersegir(10);
	}

}
