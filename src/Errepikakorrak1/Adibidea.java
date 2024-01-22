package Errepikakorrak1;

import java.util.Scanner;

public class Adibidea{

	public static void main(String[] args) {
		
		int batura=0, zenbat;
		Scanner teklatua=new Scanner(System.in);
		System.out.println("zenbat zenbaki jarraian batu nahi dituzu:");
		
		zenbat=teklatua.nextInt();
		
		for (int i=0;i<zenbat;i++) {
			System.out.println(i+1);
			batura=batura+(i+1);
			
		}
		System.out.println("emaitza " + batura);
		teklatua.close();
	}
}
