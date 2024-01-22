package unitate9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class proba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fitxategia=null;
		FileReader fr=null;
		BufferedReader br =null;
		fitxategia=new File("proba.txt");
		try {
			fr=new FileReader (fitxategia);
			br=new BufferedReader(fr);
			
			String lerroa;
			while (lerroa=br.readLine())!=null{
				System.out.println(lerroa);
				}

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
