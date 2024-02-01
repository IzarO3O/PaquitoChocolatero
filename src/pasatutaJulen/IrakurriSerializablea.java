package pasatutaJulen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IrakurriSerializablea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis;
		ObjectInputStream ois;
		Ikaslea ik=null;
		try {
			fis = new FileInputStream("ikasleak.dat");
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

		System.out.println(ik.toString());


	}

}
