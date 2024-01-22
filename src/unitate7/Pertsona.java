package unitate7;

/**
 * Pertsona klasea
 * 
 * @author izaro
 * @version 1.0
 * 
 */
public class Pertsona {
	
	private String nan;
	private String izena;
	private String abizena;
	
	/**
	 * Eraikitzaile hutsa
	 */
	public Pertsona() {
		super();
	}

	/**
	 * Eraikitzaile parametroekin
	 * 
	 * @param nan
	 * @param izena
	 * @param abizena
	 */
	public Pertsona(String nan, String izena, String abizena) {
		super();
		this.nan = nan;
		this.izena = izena;
		this.abizena = abizena;
	}

	/**
	 * @return the nan
	 */
	public String getNan() {
		return nan;
	}

	/**
	 * @param nan the nan to set
	 */
	public void setNan(String nan) {
		this.nan = nan;
	}

	/**
	 * @return the izena
	 */
	public String getIzena() {
		return izena;
	}

	/**
	 * @param izena the izena to set
	 */
	public void setIzena(String izena) {
		this.izena = izena;
	}

	/**
	 * @return the abizena
	 */
	public String getAbizena() {
		return abizena;
	}

	/**
	 * @param abizena the abizena to set
	 */
	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}
	
	


}
