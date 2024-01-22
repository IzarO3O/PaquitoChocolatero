package Errepikakorrak1;

import java.util.Scanner;

public class FIBONACCI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, batura1=0, batura2=1, batura3=0;
		do { 
			System.out.println("zenbaki bat?");
		
		Scanner teklatua=new Scanner(System.in);

		n=teklatua.nextInt();
		}while (n<0);
		
		if (n>=1) {
			System.out.println(batura1+ " ");
			
		if (n>2) {
			
			
		}
		for (int i=0;i<n;i++) {
			batura1=batura1+batura2;
			batura2=batura1+batura2;
		}
			
			System.out.println(batura2);
	}

	}
	
}
