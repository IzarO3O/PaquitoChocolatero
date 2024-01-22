package unitate6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
public class ArrayListKateak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> lista = new ArrayList<String>();
		String aukera = "";
		try (Scanner teklatua = new Scanner(System.in)) {
			do {
				System.out.println("Eman hitz bat:");

				aukera = teklatua.nextLine() ;
				
				if (aukera!="") {
					lista.add(aukera);
				}else {
					break;
				}
				
			}while (aukera!="");
			
			teklatua.close();
			
			for (int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));	
			}
			
		}
		 
	
	}

}
