package nesne2;

public class ucgen extends Sekil{
	private int h;
	private int taban;
	public ucgen(int h,int taban) {
		this.h=h;
		this.taban=taban;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h=h;
	}
	public int getTaban() {
		return taban;
	}
	public void setTaban(int taban) {
		this.taban=taban;
	}
	@Override
	int alanhesapla() {
		return (int)((h*taban)/2);
	}
	int cevrehesapla() {
		return (int)(taban*3);
	}

}
