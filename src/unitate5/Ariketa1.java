package unitate5;

import unitate4.Konplexua;

public class Ariketa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Konplexua k1 = new Konplexua();
		
		Konplexua k2 = new Konplexua(k1.getErreala(), k1.getIrudikaria());
				
		k2.gehitu (k1.getErreala(), k1.getIrudikaria());
		
		System.out.println(k1.toString());
		System.out.println(k2.toString());
		
		if (k1.compareTo(k2)==1) {
			System.out.println(k1.toString() + " > " + k2.toString());
		} else if (k1.compareTo(k2)==-1){
			System.out.println(k1.toString() + " < " + k2.toString());
		} else
			System.out.println(k1.toString() + " = " + k2.toString());
		
	//	k1.errealaEskatu();
		
		//k1.irudikariEskatu();
		
		//k1.pantailaAtera();
		
	}

}
