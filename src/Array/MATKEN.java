package Array;

import java.util.Scanner;

/**
 * Bi matrize eskatu eta arteko kenketa beste matrizean sartzen du
 * 
 * @author chulapirula
 * @version 1.0
 * 
 */
public class MATKEN {

	/**
	 * hau gure MATKEN klasearen metodo orokorra da
	 * @param args parametroak jasoko ditugu
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matA=new int [3][2];
		int [][] matB=new int [3][2];
		int [][] matEmaitza=new int [3][2];
		Scanner teklatua=new Scanner (System.in);
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<2;j++) {
				System.out.println("Eman zenbaki bat: ");
				matA [i][j]=teklatua.nextInt();
			}
		}
		
		System.out.println("Lehenengo matrizea beteta");

		for (int i=0;i<3;i++) {
			for (int j=0;j<2;j++) {
				System.out.println("Eman zenbaki bat: ");
				matB [i][j]=teklatua.nextInt();
			}
		}
		
		System.out.println("Bigarren matrizea beteta");
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<2;j++) {
				matEmaitza [i][j]=matA [i][j]-matB [i][j];
			}
		}
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<2;j++) {
				System.out.println(matA[i][j] +" ");
			}System.out.println("");
		}
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<2;j++) {
				System.out.println(matB [i][j]+ " ");
			}System.out.println("");
		}
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<2;j++) {
				System.out.println(matEmaitza [i][j]+ " ");
				
			}System.out.println("");
		}
		
		

				
	}

}
