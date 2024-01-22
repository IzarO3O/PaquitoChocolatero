package ebaluazioa1;

import java.util.Scanner;

public class TABNOTAK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota;
		
		Scanner teklatua = new Scanner (System.in);
		
		System.out.println("Sartu zure nota osoa");
		nota = teklatua.nextInt();
		
		teklatua.close();
		
		if (nota >=0 && nota <3) {
			System.out.println("OSO GUTXI");
		}	else if (nota >=3 && nota < 5) {
			System.out.println("GUTXI");
		}	else if (nota >=5 && nota < 6) {
			System.out.println("NAHIKO");
		}	else if (nota >=6 && nota < 7) {
			System.out.println("ONDO");
		}	else if (nota >=7 && nota < 9) {
			System.out.println("OSO ONDO");
		}	else if (nota >=9 && nota < 10) {
			System.out.println("BIKAIN");
		}	else {
				System.out.println("Sartu duzun nota ez da baliogarria");
			
			}
		}
				
	}


