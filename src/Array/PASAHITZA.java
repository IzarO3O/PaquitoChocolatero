package Array;

import java.util.Scanner;

public class PASAHITZA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kont=0;
		String n ="";
		String p="";
		String [] izenArray = {"bla", "ble", "bli", "blo", "blu", "pla", "ple", "pli", "plo", "plu"};
		String[] izenPasahitza = {"p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10"};
		
		Scanner teklatua=new Scanner(System.in);
			
		boolean sartu=false;
		
		do {
		System.out.println("Eman zure izena");
		n=teklatua.next();
		System.out.println("Eman zure pasahitza");
		p=teklatua.next();
		
		for (int i=0;i<10;i++) {
			if (n.equals(izenArray[i]) && p.equals(izenPasahitza[i])) {
				sartu=true;
			} 
		}
		
		kont++;	
		} while (kont<3 && sartu==false);
		
		
		if (sartu==true) {
			System.out.println("oleole lo caracole");
		}else {
			System.out.println("mierdoso");
		}
		
		

		
		teklatua.close();
	}

}
