package Errepikakorrak1;

import java.util.Scanner;

public class BATUZNBKW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z, batura=0;
		
		Scanner teklatua=new Scanner(System.in);
		System.out.println("Eman zenbaki bat mezedez");

		z=teklatua.nextInt();

		while (z!=0 ) {
			if (z>0) {
			batura=batura+z;
			z--;
			}
			else {
				System.out.println("Zenbaki hori ez du balio");
			}
				
		}
		System.out.println("zenbakien batura: " + batura);

	}

}
