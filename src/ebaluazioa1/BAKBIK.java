package ebaluazioa1;

import java.util.Scanner;

public class BAKBIK {
	public static void main(String[] args) {
	
		//1. pantailatik atera mezu bat zenbaki bat eskatuz
		System.out.println ("Eman zenbaki bat mesedez");
		try (//2. scaner objetua sortu
		Scanner teklatua = new Scanner(System.in)) {
			int n = teklatua.nextInt();
			if (n % 2 == 0) {
				System.out.println("Bikoitia"); 

				}
				else {
				System.out.println ("Bakoitia");
				}
		}
	
		
	}
	
}
