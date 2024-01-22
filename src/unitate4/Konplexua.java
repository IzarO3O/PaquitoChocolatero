package unitate4;

import java.util.Scanner;

public class Konplexua {
	private double erreala;
	private double irudikaria;
	
	public void errealaEskatu() {
		System.out.println("Eman parte erreala: ");
		Scanner teklatua = new Scanner (System.in);
		
		this.erreala = Double.parseDouble(teklatua.next());
		
	
	}
	
	public void irudikariEskatu() {
		System.out.println("Eman parte irudikaria: ");
		Scanner teklatua1 = new Scanner (System.in);
		
		this.irudikaria = Double.parseDouble(teklatua1.next());
		
	
	}
	
	public void biakEskatu() {
		System.out.println("Eman parte irudikaria: ");
		Scanner teklatua = new Scanner (System.in);
		
		this.irudikaria = Double.parseDouble(teklatua.next());
		
		System.out.println("Eman parte irudikaria: ");
		
		this.irudikaria = Double.parseDouble(teklatua.next());
		
		teklatua.close();
	}

	/**
	 * @param erreala
	 * @param irudikaria
	 */
	public Konplexua(double erreala, double irudikaria) {
		super();
		this.erreala = erreala;
		this.irudikaria = irudikaria;
	}
	
	public Konplexua() {
		
	}
	
	public Konplexua(Konplexua k) {
		this.erreala=k.erreala;
		this.irudikaria=k.irudikaria;
	}
	
	public void pantailaAtera(){
		System.out.println(this.erreala + " + " + this.irudikaria + "i");
		
	}

	public void konparatu(Konplexua k) {
		if (this.erreala>k.erreala) {
			System.out.println(this.erreala + " + " + this.irudikaria + "i>" + k.erreala + " + " + k.irudikaria + "i");

		}else if (this.erreala<k.erreala) {
			System.out.println(this.erreala + " + " + this.irudikaria + "i<" + k.erreala + " + " + k.irudikaria + "i");

		}else {
			System.out.println(this.erreala + " + " + this.irudikaria + "i=" + k.erreala + " + " + k.irudikaria + "i");

		}
	}

	public double getErreala() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getIrudikaria() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int compareTo(Konplexua k2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void gehitu(double erreala2, double irudikaria2) {
		// TODO Auto-generated method stub
		
	}
	
	
}
