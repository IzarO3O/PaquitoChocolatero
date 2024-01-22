package Errepikakorrak1;

import java.util.Scanner;

public class TRIAFIWA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner teklatua=new Scanner(System.in);
		System.out.println("Eman zenbaki bat");
		n=teklatua.nextInt();
		
		for (int i=0; i<n;i++) {
			for (int k=0;k<n;k++) {
				if (k<=i) {
					System.out.print(i+1);

				}

			}System.out.println();
		}
	}

}
