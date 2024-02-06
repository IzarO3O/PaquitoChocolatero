package erronka2;

public class JokalariSerializable {
    private String izena;
    private int abiadura;
    private int punteria;
    private int defentza;

    // Constructor, getters y setters

    public String toXML() {
        StringBuilder xml = new StringBuilder();
        xml.append("<Jokalaria>\n");
        xml.append("    <Izena>").append(izena).append("</Izena>\n");
        xml.append("    <Abiadura>").append(abiadura).append("</Abiadura>\n");
        xml.append("    <Punteria>").append(punteria).append("</Punteria>\n");
        xml.append("    <Defentza>").append(defentza).append("</Defentza>\n");
        xml.append("</Jokalaria>\n");
        return xml.toString();
    }
}


