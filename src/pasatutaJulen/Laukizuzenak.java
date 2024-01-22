package pasatutaJulen;

class Laukizuzenak extends Figurak{
	
	

	protected double zabalera;
	protected double altuera;

	public Laukizuzenak (int x, int y, double zabalera, double altuera){
		super (x,y);
		this.zabalera=zabalera;
		this.altuera=altuera;
	}
	
	public double azalera(){
		return zabalera*altuera;
	}
	
	public double perimetroa() {
		return zabalera*2+altuera*2;
	}
}

