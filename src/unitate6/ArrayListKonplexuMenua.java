package unitate6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListKonplexuMenua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variableak deklaratu
		int aukera=0;
		Scanner teklatua = new Scanner(System.in);
		
		ArrayList<Konplexu> arrayListKonplexu=new ArrayList<Konplexu>();

		
		do{
			//menua erakutsi eta aukera irakurri
			menuaNagusiaErakutsi();
			System.out.println("  Idatzi zure aukera: ");
			aukera= Integer.valueOf(teklatua.next());
			
				switch (aukera) {
					case 1: {
						//String gehitu: string bat eskatu eta arraylistean sartu
						Konplexu k = new Konplexu();
						System.out.println("eman alde erreala:");
						k.setErreala(Double.parseDouble(teklatua.next()));
						System.out.println("eman alde irudikaria:");
						k.setIrudikaria(Double.parseDouble(teklatua.next()));
						
						arrayListKonplexu.add(k);
						break;
					}
					case 2: {
						//String bilatu: String bat eskatu eta arraylistean bilatu

						
						break;
					}
					case 3: {
						//String ezabatu: String bat eskatu eta zerrendan badago, ezabatu.

						break;
					}
					case 4: {
						//Array erakutsi: Arrayaren elementu guztiak aurkezten ditu, baldin badago
						//		elementuren bat.

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
