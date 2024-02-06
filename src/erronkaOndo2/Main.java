package erronkaOndo2;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona = new Persona();

        // Obtener la representación XML de la persona
        String xmlPersona = persona.toXML();

        // Escribir el XML en un archivo
        try {
            FileWriter writer = new FileWriter("C:\\PROG\\JAVA\\src\\erronkaOndo2\\persona.xml");
            writer.write(xmlPersona);
            writer.close();
            System.out.println("¡Archivo XML generado exitosamente!");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo XML: " + e.getMessage());
        }
    }
}


