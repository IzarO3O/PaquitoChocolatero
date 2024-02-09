package erronka2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import unitate9.Ikaslea;

public class JokalariSerializable {
    private String izena;
    private int abiadura;
    private int punteria;
    private int defentza;

    // Constructor, getters y setters

    FileInputStream fis;
	ObjectInputStream ois;
	Ikaslea ik=null;
	
	try {
		fis = new FileInputStream("jokalaria.dat");
		ois=new ObjectInputStream (fis);
		//irakurritako bytak konplexu klaseko datuak bihurtzen ditu
		ik=(Ikaslea)ois.readObject();
		ois.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


