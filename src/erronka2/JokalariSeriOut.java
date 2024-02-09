package erronka2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class JokalariSeriOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jokalaria jk = new Jokalaria();
		jk.setizena("Julen");
		jk.setpunteria(1);
		jk.setabiadura(1122);
		jk.setdefentza(5);
		
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
