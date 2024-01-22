package pasatutaJulen;

class Zirkuluak extends Figurak{

	protected double erradioa;

	public Zirkuluak(int x,int y, double erradioa){
		super (x,y);
		this.erradioa=erradioa;
	}
	
	public double azalera (){
		return Math.PI* erradioa * erradioa;
	}
	
	public double perimetroa () {
		return 2*Math.PI*erradioa;
	}
}
