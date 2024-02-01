package erronka2;
//NO ME SALE
import javax.xml.*;

//@XmlRootElement

public class Jokalaria {

	private String izena;
	private int pun;
	private int abi;
	private int def;

	public String getizena() {
		return izena;
	}
	public int getpunteria() {
		return pun;
	}
	public int getabiadura() {
		return abi;
	}
	public int getdefentza() {
		return def;
	}
	
	public void setizena (String izena) {
		this.izena = izena;
	}
	public void setpunteria (int pun) {
		this.pun = pun;
	}
	public void setabiadura (int abi) {
		this.abi = abi;
	}
	public void setdefentza(int def) {
		this.def = def;
	}
}
