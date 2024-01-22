package unitate6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Hiztegia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aukera=0;
		Scanner teklatua = new Scanner(System.in);
		
		ArrayList<String> arrayListString=new ArrayList<String>();

		
		do{
			//menua erakutsi eta aukera irakurri
			menuaNagusiaErakutsi();
			System.out.println("  Idatzi zure aukera: ");
			aukera= Integer.valueOf(teklatua.next());
			
				switch (aukera) {
					case 1: {
						//String gehitu: string bat eskatu eta arraylistean sartu
						String s = teklatua.next();
						arrayListString.add(s);

						break;
					}
					case 2: {
						//String bilatu: String bat eskatu eta arraylistean bilatu
						String bila = teklatua.next();
						int indizea = arrayListString.indexOf(bila);
						if (indizea>=0) {
							System.out.println(indizea + "posizioan dago");
						}else {
							System.out.println("Ez dago zerrendan");
						}
						
						
						break;
					}
					case 3: {
						//String ezabatu: String bat eskatu eta zerrendan badago, ezabatu.
						String bila = teklatua.next();
						int indizea = arrayListString.indexOf(bila);
						if (indizea>=0) {
							arrayListString.remove(indizea);
						}else {
							System.out.println("Ez dago zerrendan");
						}
						
						
						break;
					}
					case 4: {
						//Array erakutsi: Arrayaren elementu guztiak aurkezten ditu, baldin badago
						//		elementuren bat.
						
						Collections.sort(arrayListString);

						for (String katea:arrayListString) {
							System.out.println(katea);
						}
						break;
					}
					case 0: {
						System.out.println(" Programa hemen bukatzen da. ");
						break;
					}
					default: {
						throw new IllegalArgumentException("Unexpected value: " + aukera);
					}
						
				}
		}while(aukera!=0);
	}

	public static void menuaNagusiaErakutsi() {
		System.out.println("  ");
		System.out.println("  ***********************");
		System.out.println("  ");
		System.out.println("  1.- String bat gehitu");
		System.out.println("  2.- String bat bilatu");
		System.out.println("  3.- String bat ezabatu");
		System.out.println("  4.- Array erakutsi");
		System.out.println("  ");
		System.out.println("  0.- Irten");
		System.out.println("  ***********************");
	}
}