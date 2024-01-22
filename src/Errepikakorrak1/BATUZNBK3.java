package Errepikakorrak1;

import java.util.Scanner;

public class BATUZNBK3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z, batura=0;
		
		Scanner teklatua=new Scanner(System.in);
		System.out.println("Eman zenbaki bat mezedez");

		
		do {
			System.out.println("zenbat zenbaki jarraian batu nahi dituzu?");
			z=teklatua.nextInt();
			
		}while (z<0 );
			if (z>0) {
				}
			teklatua.close();
			
			for (int i=0;i<z;i++) {
				batura=batura+(i+1);
				
			}
			System.out.println("emaitza " + batura);
			teklatua.close();
		
	System.out.println("zenbakien batura: " + batura);
		
		}
	}