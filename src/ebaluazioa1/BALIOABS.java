package ebaluazioa1;

import java.util.Scanner;

public class BALIOABS {
	public static void main(String[] args) {
	
		//1. pantailatik atera mezu bat zenbaki bat eskatuz
		System.out.println ("Eman zenbaki bat mesedez");
		try (//2. scaner objetua sortu
		Scanner teklatua = new Scanner(System.in)) {
			int n = teklatua.nextInt();
			if (n<0 ) {
				System.out.println("Aldagaiaren balio absolutua " + n + " da"); 

				}
				else {
				System.out.println ("Aldagaiaren balio absolutua "  + (n * -1)  + " da");

				}
		
		}
	
		
	}
	
}
