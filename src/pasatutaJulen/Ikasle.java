package pasatutaJulen;

public class Ikasle {
	private String izena;
	private String abizena;
	private int adina;
	
	public Ikasle() {}

	public Ikasle(String izena, String abizena) {
		this.izena=izena;
		this.abizena=abizena;
	}
	public Ikasle(int adina) {
		this.adina=adina;
	}
	public Ikasle(Ikasle ik) {
		this.izena=ik.izena;
	}
}
