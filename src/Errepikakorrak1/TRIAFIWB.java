package Errepikakorrak1;

import java.util.Scanner;

public class TRIAFIWB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner teklatua=new Scanner(System.in);
		System.out.println("Eman zenbaki bat");
		n=teklatua.nextInt();
		
		for (int i=n; i<0;i--) {
			for (int k=n;k<0;k--) {
				if (k<=i) {
					System.out.print(i+1);

				}

			}System.out.println();
		}
	}

}
