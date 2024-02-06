package ebaluazioa2.serializazioa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestuFitxategia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fitxategia=null;
		FileReader fr=null;
		BufferedReader br =null;
		fitxategia=new File("proba.txt");
		
		//fitxategia existitzen ez denez errorea eman, orduan "surround with try/catch" 
		try {
			fr=new FileReader (fitxategia);
			br= new BufferedReader (fr);
			
			//honek errorea ematen duenez, ez egiteko try/catch asko, try-ean sartu eta "add catch to surrounded try"
			String lerroa;
			while ((lerroa=br.readLine())!=null){
			System.out.println(lerroa);
			}
			
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//proiektuaren karpetan (PROG\ariketak) sortu proba.txt, bertan idatzitakoa irakurri beharko luke
		
		
		//orain IDATZIKO dugu proba.txt-en eclipsetik
		//sartu dena try catch batean errorea saihesteko
		try {
			FileWriter fitxategiaIdatzi = null;
			PrintWriter pw = null;
			fitxategiaIdatzi = new FileWriter ("proba.txt");
			pw= new PrintWriter (fitxategia);
			
			pw.println("Idatzi egin dut!");
			
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
