package erronka2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Taldeak {
	public static ArrayList<Jokalaria> JarduanaldiakRandomList(ArrayList<Taldeak> taldeakList) {
	    
        int numEquipos = taldeakList.size();
        int mitadEquipos = numEquipos / 2;
        Collections.shuffle(taldeakList);
       
        FileOutputStream fos;
		ObjectOutputStream oos;
       
			
			ArrayList<Jokalaria> lehenengobueltaList = new ArrayList<Jokalaria>();
			ArrayList<Jokalaria> bigarrenbueltaList = new ArrayList<Jokalaria>();
        //lehenengo buelta egiteko i=jardunaldi zenbakia
        for (int i = 1; i < numEquipos; i++) {
        	
        	Jokalaria joanekoJardunaldia = new Jokalaria();
        	joanekoJardunaldia.setpunteria(i);
        	joanekoJardunaldia.setabiadura(i);
        	
        	Jokalaria bueltakoJardunaldia = new Jokalaria();
        	bueltakoJardunaldia.setpunteria(i+7);
        	bueltakoJardunaldia.setabiadura(i+7);
        	
            for (int j = 0; j < mitadEquipos; j++) {}
            lehenengobueltaList.add(joanekoJardunaldia);
            bigarrenbueltaList.add(bueltakoJardunaldia);
        }
       
         lehenengobueltaList.addAll(bigarrenbueltaList);
         return lehenengobueltaList;
   
 }

}