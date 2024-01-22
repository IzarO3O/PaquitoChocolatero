package Array;

import java.util.Scanner;

public class ARRAYBATU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrizea= new int [4][5];
		int a[] = new int [4];
		Scanner teklatua=new Scanner(System.in);
		int n;
		
		for (int i=0; i<4;i++) {
			for (int j=0; j<5;j++ ) {
				System.out.println("Eman zenbaki bat");
				matrizea[i][j]=teklatua.nextInt();
				a[j]=a[j]+matrizea[i][j];
				
			}
		}
	}

}
