package erronka2;
//NO ME SALE
import javax.xml.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.Serializable;


//@XmlRootElement

public class Jokalaria implements Serializable {

	//XmlMapper mapper = new XmlMapper();
	
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



    // Constructor, getters y setters

    public String toXML() {
        StringBuilder xml = new StringBuilder();
        xml.append("<Jokalaria>\n");
        xml.append("    <Izena>").append(izena).append("</Izena>\n");
        xml.append("    <Abiadura>").append(abi).append("</Abiadura>\n");
        xml.append("    <Punteria>").append(pun).append("</Punteria>\n");
        xml.append("    <Defentza>").append(def).append("</Defentza>\n");
        xml.append("</Jokalaria>\n");
        return xml.toString();
    }
}
