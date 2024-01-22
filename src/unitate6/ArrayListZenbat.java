package unitate6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListZenbat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Integer aukera = 0;
		try (Scanner teklatua = new Scanner(System.in)) {
			do {
				System.out.println("Eman zenbaki bat:");

				aukera = teklatua.nextInt() ;
				if (aukera<6 && aukera>0) {
					lista.add(aukera);
				}else {
					System.out.println("1-5");
				}
				
			}while (aukera!=0);
			
			teklatua.close();
			
				Iterator<Integer>it=lista.iterator();
				int n=0;
				while (it.hasNext()){
				n=it.next();
				System.out.println(n);
				
			}
			
		}
	}

}
