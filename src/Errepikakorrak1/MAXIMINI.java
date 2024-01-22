package Errepikakorrak1;

import java.util.Scanner;

public class MAXIMINI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, max=0, min=2147483647;

		do {
			Scanner teklatua=new Scanner(System.in);
			System.out.println("Eman zenbaki bat");
			n=teklatua.nextInt();
			
			if (n>=0) {
				
			
				if (n>max) {
				max=n;
				}
				if (n<min) {
				min=n;
				}
			}
			}
			while (n>0) ;
			
		System.out.println("Zure maximoa:"+ max);
		System.out.println("Zure minimoa:"+ min);
		
	}
			
		
			
}		
	


