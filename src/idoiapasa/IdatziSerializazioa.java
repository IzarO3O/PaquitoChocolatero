package ebaluazioa2.serializazioa;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class IdatziSerializazioa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ikaslea ik=new Ikaslea ();
		ik.setIzena("Idoia");
		ik.setAbizenak("Fernandez");
		ik.setNan("1234567");
		ik.setBatazbestekoNota(5.0);
		
		Ikaslea ik1=new Ikaslea ();
		ik1.setIzena("Jon");
		ik1.setAbizenak("Gandarias");
		ik1.setNan("7654321");
		ik1.setBatazbestekoNota(9.0);
		
		Ikaslea ik2=new Ikaslea ();
		ik2.setIzena("Julen");
		ik2.setAbizenak("Merino");
		ik2.setNan("11223344");
		ik2.setBatazbestekoNota(6.0);
		
		//lotura egingo dut
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try {
			fos = new FileOutputStream ("ikasleak.dat");
			oos =new ObjectOutputStream(fos);
			
			//idatzi fitxategian
			oos.writeObject(ik);
			oos.writeObject(ik1);
			oos.writeObject(ik2);

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
