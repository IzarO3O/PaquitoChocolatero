package klaseak;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Saioak erregistratzeko eta konprobatzeko erabiltzen den klasea
 */
public class Kontuak {
	/**
	 * Java erabili ahal dituen izenen array flexible bat
	 */
	private ArrayList<String> izenak = new ArrayList<String>();
	/**
	 * Java erabili ahal dituen pasahitzen array flexible bat
	 */
	private ArrayList<String> pasahitzak = new ArrayList<String>();
	/**
	 * Sartutako saioaren izena
	 */
	private String izena;
	/**
	 * sartutako saioaren pasahitza
	 */
	private String pasahitza;
	/**
	 * Izenak dauzkan TXT fitxategia
	 */
	private File fIzenak;
	/**
	 * Pasahitzak dauzkan TXT fitxategia
	 */
	private File fPasahitzak;
	/**
	 * Klase honen edo JAR fitxategiaren kokaleku absolutua
	 */
	private String path;	
	/**
	 * Klasearen eraikitzaile orokorra
	 */
	public Kontuak() {
		artxiboaIrakurri(0);
	}
	/**
	 * Hasitako saioaren izena lortzeko funtzioa
	 * @return Hasitako saioaren izena bueltatzen du
	 */
	public String getIzena() {
		return izena;
	}
	/**
	 * Hasitako saioaren pasahitza lortzeko funtzioa
	 * @return Hasitako saioaren pasahitza bueltatzen du
	 */
	public String getPasahitza() {
		return pasahitza;
	}
	/**
	 * Saioa hasterakoan izena gordetzeko funtzioa
	 * @param izena1 saioa hasteko erabili nahi den izena
	 */
	public void setIzena(String izena1) {
		izena = izena1;
	}
	/**
	 * Saioa hasterakoan pasahitza gordetzeko funtzioa
	 * @param pasahitza1 saioa hasteko erabili nahi den pasahitza
	 */
	public void setPasahitza(String pasahitza1) {
		pasahitza = pasahitza1;
	}
	
	/**
	 * Sartutako izena eta pasahitza baliodunak ala ez diren egiaztatzen duen funtzioa
	 * @return true bueltatzen du izena eta pasahitza zuzenak badira, false bueltatzen du bat ala biak baliogabeak badira
	 */
	public boolean balioduna() {
		boolean zuzena = false;
		boolean izenZuzena = false;
		boolean pasahitzZuzena = false;
		for (int i = 0; i<=izenak.size()-1;i++) {
			if (izena.equals(izenak.get(i))) {
				izenZuzena = true;
				if (pasahitza.equals(pasahitzak.get(i))) {
					pasahitzZuzena = true;
			}
			
			}
		}
		if (izenZuzena == true && pasahitzZuzena == true) {
			zuzena = true;
			
		}
		return zuzena;
	}
	/**
	 * Izenen eta pasahitzen TXT fitxategiak irakurtzen dituen metodoa da, JAVA erbili ahal dituen izenen eta pasahitzen array-ak prestatzeko
	 * @param n 0 baldin bada, bakarrik irakurriko du artxiboa izenak array-a hutsik baldin badago. Balioa 0 ez bada, fitxategia bai ala bai irakurriko du Izenak array-a eguneratzeko
	 */
	private void artxiboaIrakurri(int n) {
		if (izenak.isEmpty()|| n != 0){
			path = new File(".").getAbsolutePath();
			fIzenak = new File(path + "//bezeroak//izenak.txt");
			fPasahitzak = new File (path + "//bezeroak//pasahitzak.txt");
			try {
				Scanner sIzenak = new Scanner(fIzenak);
				Scanner sPasahitzak = new Scanner(fPasahitzak);
				while (sIzenak.hasNext()) {
					izenak.add(sIzenak.nextLine());
				}
				while (sPasahitzak.hasNext()) {
					pasahitzak.add(sPasahitzak.nextLine());
				}
			sIzenak.close();
			sPasahitzak.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		
	}
	/**
	 * Izenen eta pasahitzen TXT fitxategiak eraldatzen ditu saio berri bat sortzeko
	 * @param izenaB Saio berriaren izena
	 * @param pasahitzaB Saio berriaren pasahitza
	 */
	public void saioBerria(String izenaB, String pasahitzaB) {
		artxiboaIrakurri(0);
		try {
			Scanner sIzenak = new Scanner(fIzenak);
			Scanner sPasahitzak = new Scanner(fPasahitzak);
			PrintWriter izenWriter = new PrintWriter(fIzenak);
			PrintWriter pasahitzWriter = new PrintWriter(fPasahitzak);
			for (int i = 0; i<=izenak.size()-1;i++) {
				izenWriter.println(izenak.get(i));
				pasahitzWriter.println(pasahitzak.get(i));
			}
			izenWriter.println(izenaB);
			pasahitzWriter.println(pasahitzaB);
			izenWriter.close();
			pasahitzWriter.close();
			sIzenak.close();
			sPasahitzak.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		artxiboaIrakurri(1);
	}
}
