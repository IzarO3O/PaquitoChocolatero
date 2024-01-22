package pasatutaJulen;

class triangelua extends Figurak{

	protected double oinarria;
	protected double altuera;

	public triangelua (int x,int y, double oinarria, double altuera){
		super(x,y);
		this.oinarria=oinarria;
		this.altuera=altuera;
	}
	
	public double azalera(){
		return((oinarria*altuera)/2);
	}
	
	public double perimetroa () {
		return oinarria*3;
	}
}