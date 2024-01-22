package ebaluazioa1;

import java.util.Scanner;

public class SOLDATRET {
	public static void main(String[] args) {
	
		//1. pantailatik atera mezu bat zenbaki bat eskatuz
		System.out.println ("Eman soldata bat mesedez");

		Scanner teklatua = new Scanner(System.in);	

			int n = teklatua.nextInt();
			
			if (n < 1000) {
				System.out.println("soldataren atxikipena  " + n*0.1 + " da eta soldata garbia " + n*1.1); 

				}
				else if (n > 1000){
				System.out.println ("soldatare atxikipena  " + n*0.12 + " da, eta soldata garbia " + n*1.12);
				}
				else {
				System.out.println ("soldatare atxikipena  " + n*0.14 + " da, eta soldata garbia " + n*1.14);
				}
		}
	
		
	}
	