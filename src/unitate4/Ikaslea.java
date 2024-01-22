package unitate4;

import java.util.Scanner;

public class Ikaslea {

	private String izena; 
	private String abizena;
	private int adina;
	private String aukera;
	
	public Ikaslea (String izena) {
		this.izena=izena;
	}
	public Ikaslea (String izena, String abizena) {
		this.izena=izena;
		this.abizena=abizena;
	}
	public Ikaslea (int adina) {
		this.adina=adina;
		
	
	}
	public Ikaslea (Ikaslea ik) {
		
		this.izena=ik.izena;
		this.abizena=ik.abizena;
		this.adina=ik.adina;
	}
		
	
	public Ikaslea() {
		
	}		

	
}
