package nesne2;

public class Daire extends Sekil {
	private int yaricap;
	public Daire(int yaricap) {
		this.yaricap=yaricap;
	}
	public int getYaricap() {
		return yaricap;
	}
	public void setYaricap(int yaricap) {
		this.yaricap=yaricap;
	}
	@Override
	int alanhesapla() {
		return (int) (Math.PI*yaricap*yaricap);
	}
	int cevrehesapla() {
		return (int) (2*Math.PI*yaricap);
	}
}
