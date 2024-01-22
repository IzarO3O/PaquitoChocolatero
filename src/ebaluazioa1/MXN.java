package ebaluazioa1;

import java.util.Scanner;

public class MXN {
	public static void main(String[] args) {
	
		//1. pantailatik atera mezu bat zenbaki bat eskatuz
		System.out.println ("Eman zenbaki bat mesedez");
		try (//2. scaner objetua sortu
		Scanner teklatua = new Scanner(System.in)) {
			int n = teklatua.nextInt();
			if (Math.sqrt(n) >= 100) {
				System.out.println("Zure zenbakia " + (n-100) + " da"); 

				}
				else {
				int z = (n - 100);
				System.out.println ("Zure zenbakia " + (z * -1) + " da");
				}
		}
	
		
	}
	
}