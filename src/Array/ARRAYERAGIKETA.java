package Array;

import java.util.Scanner;

/**
 * 
 */
public class ARRAYERAGIKETA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aukera =0;
		Scanner teklatua = new Scanner(System.in);
		int[] nireArray = null;
		boolean hasieratua=false;
		
		do {
			System.out.println("ARRAYEKIN ERAGIKETAK:");
			System.out.println("=====================");
			System.out.println("");
			System.out.println("1.Arraya hasieratu.");
			System.out.println("2.Arraya ikusi.");
			System.out.println("3.Txertatu elementu bat.");
			System.out.println("4.Elementu bat ezabatu.");
			System.out.println("5.Irten");
			System.out.println("");
			System.out.print("Eman aukera bat: ");
			aukera = teklatua.nextInt();
			
			switch (aukera) {
			case 1: {
				//aukera 1 Arraya hasieratu.
				System.out.print("Zenbateko luzera izango du gure arraya: ");
				int luzera = teklatua.nextInt();
				System.out.println("");
				nireArray=new int[luzera];
				for(int i=0;i<luzera;i++) {
					nireArray[i]=0;
				}
				hasieratua=true;
				break;
			}
			case 2: {
				//aukera 2 Arraya ikusi.
				if(hasieratua==true) {
					for(int i=0;i<nireArray.length;i++) {
						System.out.print(nireArray[i] + " ");
					}
					System.out.println("");
					
				}else {
					System.out.println("Aukera okerra, ez duzu arraya hasieratu.");
					System.out.println("Mesedez egizu lehen aukera lehendabizi.");
					System.out.println("");
				}
				break;
			}
			case 3: {
				//aukera 3 Txertatu elementu bat.
				if(hasieratua==true) {
					int indizea;
					do {
						System.out.println("Eman sartu nahi duzun elementuaren indizea: ");
						indizea = teklatua.nextInt();
					}while(indizea<0 || indizea>nireArray.length);
					System.out.println("Eman sartu nahi duzun balioa: ");
					nireArray[indizea]=teklatua.nextInt();
					System.out.println("");
					
				}else {
					System.out.println("Aukera okerra, ez duzu arraya hasieratu.");
					System.out.println("Mesedez egizu lehen aukera lehendabizi.");
					System.out.println("");
				}
				break;
			}
			case 4: {
				//aukera 4 Elementu bat ezabatu.
				if(hasieratua==true) {
					int indizea;
					do {
						System.out.println("Eman ezabtu nahi duzun elementuaren indizea: ");
						indizea = teklatua.nextInt();
					}while(indizea<0 || indizea>nireArray.length);
					nireArray[indizea]=0;
					System.out.println(indizea + " elementua ezabatu da.");
					System.out.println("");
				}else {
					System.out.println("Aukera okerra, ez duzu arraya hasieratu.");
					System.out.println("Mesedez egizu lehen aukera lehendabizi.");
					System.out.println("");
				}
				break;
			}
			default:
				System.out.println("");
				System.out.println("Aukera okerra, ez duzu arraya hasieratu.");
				System.out.println("");
			}
			
		}while(aukera!=5);
		
		teklatua.close();

	}

}
