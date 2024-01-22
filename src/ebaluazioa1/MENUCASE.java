package ebaluazioa1;

import java.util.Scanner;

public class MENUCASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z1, z2, aukera;
		Scanner teklatua = new Scanner(System.in);
				
		System.out.println();
		System.out.println("**************************");
		System.out.println("1. Batu");
		System.out.println("2. Kendu");
		System.out.println("3. Biderkatu");
		System.out.println("4. Zatitu");
		System.out.println("5. Ondarra");
		System.out.println("0. Irten");
		System.out.println("**************************");
		System.out.println("Eman zure aukera");
		aukera = teklatua.nextInt();
		
		switch (aukera) {
		case 1 :
			System.out.println("sartu 1. zenbakia");
			z1 = teklatua.nextInt();
			System.out.println("sartu 2. zenbakia");
			z2 = teklatua.nextInt ();
			System.out.println("emaitza: " + (z1+z2));
			break;
		case 2 :
			System.out.println("sartu 1. zenbakia");
			z1 = teklatua.nextInt();
			System.out.println("sartu 2. zenbakia");
			z2 = teklatua.nextInt ();
			System.out.println("emaitza: " + (z1-z2));

			break;
		case 3 :
			System.out.println("sartu 1. zenbakia");
			z1 = teklatua.nextInt();
			System.out.println("sartu 2. zenbakia");
			z2 = teklatua.nextInt ();
			System.out.println("emaitza: " + (z1*z2));
			
			break;
		case 4 :
			do {
			System.out.println("sartu 1. zenbakia");
			z1 = teklatua.nextInt();
			}	while (z1==0);
			do {
			System.out.println("sartu 2. zenbakia");
			z2 = teklatua.nextInt ();
			}	while (z2==0);
			

			System.out.println("emaitza: " + (z1/z2));
			
			break;
		case 5 :
			System.out.println("sartu 1. zenbakia");
			z1 = teklatua.nextInt();
			System.out.println("sartu 2. zenbakia");
			z2 = teklatua.nextInt ();
			System.out.println("emaitza: " + (z1%z2));
			
			break;
			default: 
				System.out.println("aukera okerra");
				
				
			
			}
		}


	}
