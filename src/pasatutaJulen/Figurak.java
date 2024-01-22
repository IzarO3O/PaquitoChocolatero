package pasatutaJulen;

/**
 * Figura super klasea
 */
public abstract class Figurak {
	
	 protected int x;
	 protected int y;
	 		

	
	/**
	 * Figura super klasearen eraikitzailea non x eta y planoaren koordenadak izanfo dira.
	 * @param x
	 * @param y
	 */
	public Figurak (int x, int y){
		this.x=x;
		this.y=y;
	}
	
	/**
	 * Azalera definitzen duen metodo abstraktoa
	 * 	hurrengo azpiklaseetan definituko da
	 * 
	 * @return azaleraren balioa
	 */
	public abstract double azalera();
	
	public abstract double perimetroa();

}
