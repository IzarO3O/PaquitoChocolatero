package erronka2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class pruebitina {
	public static void writeJarduanaldiakRandom(ArrayList<Jokalaria> taldeakList, String xmlFilePath) {
		try {
           FileWriter writer = new FileWriter(xmlFilePath);
           writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
           writer.write("<denboraldia>\n");
           int numEquipos = taldeakList.size();
           int mitadEquipos = numEquipos / 2;
           //para barajar automaticamente los equipos
           Collections.shuffle(taldeakList);
           for (int jardunaldia = 1; jardunaldia <= numEquipos; jardunaldia++) {
           	writer.write("\t<jardunaldia."+jardunaldia+ ">\n");             
           	for (int j = 0; j < mitadEquipos; j++) {
                   int etxekoTaldea = j;
                   int kanpokoTaldea = numEquipos - 1 - j;               
                   if (j % 2 == 0) {
                       int temp = etxekoTaldea;
                       etxekoTaldea = kanpokoTaldea;
                       kanpokoTaldea = temp;
                   }                
	               String etxekoTaldeaIzena = taldeakList.get(etxekoTaldea).getizena();
	               String kanpokoTaldeaIzena = taldeakList.get(kanpokoTaldea).getizena();
	               writer.write("\t\t<partida id=\"" + (j+1) + "\">\n");
	               writer.write("\t\t\t<taldea>" + etxekoTaldeaIzena + "</taldea>\n");
	               writer.write("\t\t\t<taldea>" + kanpokoTaldeaIzena + "</taldea>\n");
	               writer.write("\t\t</partida>\n");
           	}
           	writer.write("\t</jardunaldia>\n");
           	//cambiar el orden para la siguiente jornada
           	Collections.rotate(taldeakList.subList(1, numEquipos), 1);
           }
           //para que siga haciendo jornadas hasta llegar a 7
           for (int i = 1; i <= numEquipos; i++) {
           	writer.write("\t<jardunaldia."+ (5+i) + ">\n");            
           	for (int j = 0; j < mitadEquipos; j++) {
                   int etxekoTaldea2 = j;
                   int kanpokoTaldea2 = numEquipos - 1 - j;                
                   if (j % 2 == 0) {
                   	//cambia los valores de
                       int temp = etxekoTaldea2;
                       etxekoTaldea2 = kanpokoTaldea2;
                       kanpokoTaldea2 = temp;
                   }
                  
	               String etxekoTaldeaIzena = taldeakList.get(etxekoTaldea2).getizena();
	               String kanpokoTaldeaIzena = taldeakList.get(kanpokoTaldea2).getizena();
	               writer.write("\t\t<partida id=\"" + (j+1) + "\">\n");
	               writer.write("\t\t\t<taldea>" + kanpokoTaldeaIzena + "</taldea>\n");
	               writer.write("\t\t\t<taldea>" + etxekoTaldeaIzena + "</taldea>\n");
	               writer.write("\t\t</partida>\n");
           	}
           writer.write("\t</jardunaldia>\n");
           Collections.rotate(taldeakList.subList(1, numEquipos), 1);
           }  
           writer.write("</denboraldiak>\n");
           writer.close();           
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
	/////////////////////////////////////////////////////////Jornadas Aleatorias .dat////////////////////////////////////////////////////////////////////////////////////////////////
	
}