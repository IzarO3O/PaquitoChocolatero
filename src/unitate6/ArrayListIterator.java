package unitate6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListIterator {

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
			
				Iterator<String>it=lista.iterator();
				String s="";
				while (it.hasNext()){
				s=it.next();
				System.out.println(s);
				
			}
			
		}
	}

}
