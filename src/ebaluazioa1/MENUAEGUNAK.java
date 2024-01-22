package ebaluazioa1;

import java.util.Scanner;

public class MENUAEGUNAK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z1, z2, aukera;
		Scanner teklatua = new Scanner(System.in);
				
		System.out.println();
		System.out.println("**************************");
		System.out.println("AS");
		System.out.println("AA");
		System.out.println("AZ");
		System.out.println("OG");
		System.out.println("OL");
		System.out.println("LA");
		System.out.println("IG");
		System.out.println("**************************");
		System.out.println("Eman zure aukera");
		aukera = teklatua.nextInt();
		
		switch (aukera) {
		case 1 :
			System.out.println("Astelehena");
			
			break;
		case 2 :
			System.out.println("Asteartea");

			break;
		case 3 :
			System.out.println("Asteazkena");

			
			break;
		case 4 :
			System.out.println("Osteguna");
			
			break;
		case 5 :
			System.out.println("Ostirala");
			
			break;
		case 6 :
			System.out.println("Larunbata");
			
			break;
		case 7 :
			System.out.println("Domeka");
			
			break;
			default: 
				System.out.println("aukera okerra");
				
				
			
			}
		}


	}