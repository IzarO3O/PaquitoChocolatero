package unitate5;

import java.util.Objects;
import java.util.Scanner;

public class Razionala implements Comparable <Razionala>{


	private int zenbakitzailea, izendatzaile;
	
	/**
	* @param zenbakitzailea
	* @param izendatzaile
	*/
	public Razionala() {
		super();
		this.zenbakitzailea = 0;
		this.izendatzaile = 1;
	}

	public Razionala(int zenbakitzailea, int izendatzaile) {
		super();
		this.zenbakitzailea = zenbakitzailea;
		this.izendatzaile = izendatzaile;
	}
	public Razionala(int zenbakitzailea) {
		super();
		this.zenbakitzailea = zenbakitzailea;
	}
	
	public Razionala(Razionala r) {
		super();
		this.zenbakitzailea = r.zenbakitzailea;
		this.izendatzaile = r.izendatzaile;
	}


	public int getZenbakitzailea() {
		return zenbakitzailea;
	}

	public void setZenbakitzailea(int zenbakitzailea) {
		this.zenbakitzailea = zenbakitzailea;
	}

	public int getIzendatzaile() {
		return izendatzaile;
	}

	public void setIzendatzaile(int izendatzaile) {
		this.izendatzaile = izendatzaile;
	}

	@Override
	public String toString() {
		return this.zenbakitzailea + "/”" + this.izendatzaile;
	}

	@Override
	public int hashCode() {
		return Objects.hash(izendatzaile, zenbakitzailea);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Razionala other = (Razionala) obj;
		return izendatzaile == other.izendatzaile && zenbakitzailea == other.zenbakitzailea;
	}

	@Override
	public int compareTo(Razionala r) {
		// TODO Auto-generated method stub
		if (this.izendatzaile/this.zenbakitzailea>r.izendatzaile/r.zenbakitzailea) {
			return 1;
		} else if (this.izendatzaile/this.zenbakitzailea<r.izendatzaile/r.zenbakitzailea){
			return -1;
		}else  {
			return 0;
		}
		
	}
	Scanner teklatua = new Scanner(System.in);
	int izendatzailea = teklatua.nextInt();
	int zenbakitzaile = teklatua.nextInt();
	
	

	
	

}
