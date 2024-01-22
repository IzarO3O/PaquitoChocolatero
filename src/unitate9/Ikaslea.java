package unitate9;

import java.io.Serializable;
import java.util.Objects;

public class Ikaslea implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4299274065993303442L;
	private String izena;
	private String abizenak;
	private String nan;
	private Double batazbestekoNota;
	
	/**
	 */
	public Ikaslea() {
		super();
	}
	
	/**
	 * @param izena
	 * @param abizenak
	 * @param nan
	 * @param batazbestekoNota
	 */
	public Ikaslea(String izena, String abizenak, String nan, Double batazbestekoNota) {
		super();
		this.izena = izena;
		this.abizenak = abizenak;
		this.nan = nan;
		this.batazbestekoNota = batazbestekoNota;
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
	 * @return the abizenak
	 */
	public String getAbizenak() {
		return abizenak;
	}
	/**
	 * @param abizenak the abizenak to set
	 */
	public void setAbizenak(String abizenak) {
		this.abizenak = abizenak;
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
	 * @return the batazbestekoNota
	 */
	public Double getBatazbestekoNota() {
		return batazbestekoNota;
	}
	/**
	 * @param batazbestekoNota the batazbestekoNota to set
	 */
	public void setBatazbestekoNota(Double batazbestekoNota) {
		this.batazbestekoNota = batazbestekoNota;
	}

	@Override
	public String toString() {
		return abizenak + ", " + izena;
	}

	@Override
	public int hashCode() {
		return Objects.hash(abizenak, batazbestekoNota, izena, nan);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ikaslea other = (Ikaslea) obj;
		return Objects.equals(abizenak, other.abizenak) && Objects.equals(batazbestekoNota, other.batazbestekoNota)
				&& Objects.equals(izena, other.izena) && Objects.equals(nan, other.nan);
	}
	
	

}
