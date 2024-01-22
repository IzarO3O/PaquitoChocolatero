package pasatutaJulen;

public class FigurakMain {
	public static void main(String[] args) {
		
		// 0.0 koordeantuan kokatuko den 5.5 erradioko zirkulua
		Zirkuluak z= new Zirkuluak(0,0,5.5);
		System.out.println("Zirkuluaren azalera: "+z.azalera());
		
		//alternatiba bat, objetu bera bererabiltzeko:
		Figurak f= new Zirkuluak(0,0,5.5);
		System.out.println("Zirkuluaren azalera: "+f.azalera());
		// ***ADI**** 
		// Apunteetan txarto dago, lau parametro pasatzen badiogu
		// laukizuzenaren eraikitzailea behar dugu:
		// 
		f=(Figurak) new Laukizuzenak(0,0,5.5,2.0);
		System.out.println("Laukiaren azalera: "+f.azalera());

		
	}
}
