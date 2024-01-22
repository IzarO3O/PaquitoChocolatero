package Errepikakorrak1;

import java.util.Scanner;

public class FAKTORIALA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int batura=1, zenbat, x=0;
		Scanner teklatua=new Scanner(System.in);
		System.out.println("faktorialaren zenbakia:");
		
		zenbat=teklatua.nextInt();
		
		for (int i=0;i<zenbat;i++) {
			x=batura*batura;
			batura=batura+(i+1);
			
			
		}
		System.out.println("emaitza " + x);
		teklatua.close();
	}
	}


