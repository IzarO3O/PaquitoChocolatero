package Errepikakorrak1;

import java.util.Scanner;

public class BATUZNBKW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int batura=0, zenbat;
		Scanner teklatua=new Scanner(System.in);
		System.out.println("zenbat zenbaki jarraian batu nahi dituzu:");
		
		zenbat=teklatua.nextInt();
		
		for (int i=0;i<zenbat;i++) {
			batura=batura+(i+1);
			
		}
		System.out.println("emaitza " + batura);
		teklatua.close();
	}
	}


