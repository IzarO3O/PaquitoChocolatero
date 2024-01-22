package unitate9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IdaSeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ikaslea ik = new Ikaslea();
		ik.setIzena("Julen");
		ik.setAbizenak("Merino Arrese");
		ik.setNan("11223344Z");
		ik.setBatazbestekoNota(5.0);
		
		//lotura egingo dut
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("ikasleak.dat");
			oos = new ObjectOutputStream(fos);
			
			//idatzi fitxategian
			oos.writeObject(ik);
			
			//fitxategia itxi
			oos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
