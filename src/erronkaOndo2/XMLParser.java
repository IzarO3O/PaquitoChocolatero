package erronkaOndo2;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import java.io.File;

public class XMLParser {
    public static void main(String[] args) {
        try {
            File archivoXML = new File("C:\\PROG\\JAVA\\src\\erronkaOndo2\\prueba.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(archivoXML);
            doc.getDocumentElement().normalize();

            NodeList listaLibros = doc.getElementsByTagName("libro");

            for (int i = 0; i < listaLibros.getLength(); i++) {
                Element elementoLibro = (Element) listaLibros.item(i);
                String titulo = elementoLibro.getElementsByTagName("titulo").item(0).getTextContent();
                String autor = elementoLibro.getElementsByTagName("autor").item(0).getTextContent();
                String anio = elementoLibro.getElementsByTagName("anio").item(0).getTextContent();

                System.out.println("Título: " + titulo);
                System.out.println("Autor: " + autor);
                System.out.println("Año: " + anio);
                System.out.println("-----------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

