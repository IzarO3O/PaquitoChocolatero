package Errepikakorrak1;

import java.util.Scanner;

public class AURKEZTUBIKBW {

	public static void main(String[] args) {
		
		int z;
		Scanner teklatua=new Scanner(System.in);
		System.out.println("Eman zenbaki bat mezedez");
		
		z=teklatua.nextInt();
		
		while (z!=0) {
			if (z%2==0) {
				System.out.println(z);
			
			
			}
			
		}
		System.out.println("emaitza " + z);
		teklatua.close();
	}
}

