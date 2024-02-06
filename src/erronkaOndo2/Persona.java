package erronkaOndo2;

public class Persona {
    private String nombre = "aksnfadñoandoaj";
    private int edad = 02222222222;
    private String ciudad;

    // Constructor, getters y setters

    public String toXML() {
        StringBuilder xml = new StringBuilder();
        xml.append("<persona>\n");
        xml.append("    <nombre>").append(nombre).append("</nombre>\n");
        xml.append("    <edad>").append(edad).append("</edad>\n");
        xml.append("    <ciudad>").append(ciudad).append("</ciudad>\n");
        xml.append("</persona>\n");
        return xml.toString();
    }
}


