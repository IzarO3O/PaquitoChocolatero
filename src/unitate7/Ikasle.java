
package unitate7;

/**
 *  Ikasle klasea
 *  
 *  @author izaro
 */
public class Ikasle extends Pertsona {

	private String maila;
	private String zikloa;
	
	public Ikasle() {
		super();
	}

	/**
	 * @param maila
	 * @param zikloa
	 */
	public Ikasle(String maila, String zikloa) {
		super();
		this.maila = maila;
		this.zikloa = zikloa;
	}

	/**
	 * @return the maila
	 */
	public String getMaila() {
		return maila;
	}

	/**
	 * @param maila the maila to set
	 */
	public void setMaila(String maila) {
		this.maila = maila;
	}

	/**
	 * @return the zikloa
	 */
	public String getZikloa() {
		return zikloa;
	}

	/**
	 * @param zikloa the zikloa to set
	 */
	public void setZikloa(String zikloa) {
		this.zikloa = zikloa;
	}
	
	
}
