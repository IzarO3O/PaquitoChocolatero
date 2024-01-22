package ebaluazioa1;

import java.util.Scanner;

public class KALKUBEZ {
	public static void main(String[] args) {
	
		//1. pantailatik atera mezu bat zenbaki bat eskatuz
		System.out.println ("Eman zenbaki bat mesedez");
		try (//2. scaner objetua sortu
		Scanner teklatua = new Scanner(System.in)) {
			int n = teklatua.nextInt();
			if (n > 20000) {
				System.out.println("Zure BEZa " + (n * 0.16 + n) + " da"); 

				}
				else {
				System.out.println ("Zure BEZa " + (n * 0.07 + n) + " da");
				}
		}
	
		
	}
	
}
