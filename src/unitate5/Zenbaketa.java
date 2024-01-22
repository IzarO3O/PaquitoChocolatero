package unitate5;

public class Zenbaketa {
	
	private static int kopurua;
	private int zenbat=0;
	private static String izena;
	
	public void idatziZenbat() {
		System.out.println("Sortutako objetuak: " + zenbat);
	}
	
	/**
	 * @param zenbat
	 */
	public Zenbaketa (String izena, int kopurua) {
		super ();
		this.izena = izena;
		this.kopurua=kopurua;
		zenbat++;
	}
	public Zenbaketa(int zenbat) {
		super();
		this.zenbat = zenbat;
	}

	public void finalize () {
		zenbat--;
	}
	public Zenbaketa(){
		zenbat++;
	}

}
