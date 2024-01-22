package ebaluazioa1;

import java.util.Scanner;

public class TXIKIAGOHANDIAGO {
	public static void main(String[] args) {
	
		//1. pantailatik atera mezu bat zenbaki bat eskatuz
		System.out.println ("Eman zenbaki bat mesedez");

		try (Scanner teklatua = new Scanner(System.in)) {
			System.out.println ("Eman beste zenbaki bat mesedez");

			Scanner teklatua2 = new Scanner(System.in);
					
				int n = teklatua.nextInt();
				int u = teklatua2.nextInt();
				
				if (n < u) {
					System.out.println("Zenbakirik altuena  " + u + " da"); 

					}
					else if (n>u){
					System.out.println ("Zenbakirik altuena " + n + " da");
					}
					else {
					System.out.println ("Bi zenbakiak berdinak dira");
					}
		}
		}
	
		
	}
	