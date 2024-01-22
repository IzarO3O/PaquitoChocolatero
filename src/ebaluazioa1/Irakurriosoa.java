package ebaluazioa1;

import java.util.Scanner;

public class Irakurriosoa {
	public static void main(String[] args) {
	
		//1. pantailatik atera mezu bat zenbaki bat eskatuz
		System.out.println ("Eman zenbaki bat mesedez");
		//2. scaner objetua sortu
		Scanner teklatua = new Scanner(System.in);
		//3. scaner en bidez zenbakia irakurri eta bariable batean utzi
		int n = teklatua.nextInt();
		teklatua.close();
		//4. pantailatik azkeneko mezua atera
		System.out.println ("zure zenbakia " + n + " da");
		
		
	}
	
}
