package nesne2;

public class Dikdörtgen extends Sekil {
		private int boy;
		private int en;
		public Dikdörtgen(int boy,int en) {
			this.boy=boy;
			this.en=en;
		}
		public int getBoy() {
			return boy;
		}
		public void setBoy(int boy) {
			this.boy=boy;
		}
		public int getEn() {
			return en;
		}
		public void SetEn(int en) {
			this.en=en;
		}
		@Override
		int alanhesapla() {
			return boy*en;
		}
		int cevrehesapla() {
			return 2*(boy+en);
		}
}
