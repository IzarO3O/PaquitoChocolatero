package pasatutaJulen;

import unitate5.Zenbaketa;

public class ZenbaketaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zenbaketa z1 = new Zenbaketa();
		
		z1.idatziZenbat();
		
		Zenbaketa z2 = new Zenbaketa("Julen", 3);
		Zenbaketa z3 = new Zenbaketa();
		Zenbaketa z4 = new Zenbaketa();
		Zenbaketa z5 = new Zenbaketa();
		Zenbaketa z6 = new Zenbaketa();

		z2.idatziZenbat();
		
		z1.idatziZenbat();
		
		z6.finalize();
		
		z1.idatziZenbat();

	}

}
