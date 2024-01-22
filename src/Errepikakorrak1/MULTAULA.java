package Errepikakorrak1;

import java.util.Scanner;

public class MULTAULA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner teklatua=new Scanner(System.in);

		
		do {
			System.out.println("Eman zenbaki bat");
			n=teklatua.nextInt();

		}while (n<0 || n>10);
		
		for (int i=1;i<=9;i++)
		System.out.println(n+"*"+i+"="+n*i);

		}
 
		

		
	}

