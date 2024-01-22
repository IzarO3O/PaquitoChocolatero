package unitate7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import unitate6.Konplexu;

public class IkasleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aukera = 0;
		Scanner teklatua = new Scanner(System.in);
		ArrayList<Ikasle> ikasleList=new ArrayList<Ikasle>();

		
		do {
			menuaIdatzi();
			System.out.println("Eman zure aukera: ");
			aukera = Integer.valueOf(teklatua.next());
			switch (aukera) {
				case 1: {
					//Ikasleak sartu
					Ikasle ik = new Ikasle();
					System.out.println("eman izena:");
					String i = teklatua.next();
					ik.setIzena(i);
					
					System.out.println("eman abizena:");
					String a = teklatua.next();
					ik.setIzena(a);
					
					System.out.println("eman nan:");
					String n = teklatua.next();
					ik.setIzena(n);
					
					System.out.println("eman zikloa:");
					String z = teklatua.next();
					ik.setIzena(z);
					
					System.out.println("eman maila:");
					String m = teklatua.next();
					ik.setIzena(m);
					
					ikasleList.add(ik);
					break;
				}
				case 2: {
					//Ikasleak kontsultatu Nan-ez
					System.out.println("Eman NAN:");
					String n = teklatua.next();
					boolean aurkituDut=false;
					for (Ikasle ikasle:ikasleList) {
						if (ikasle.getNan().equals(n)) {
							 aurkituDut = true;
							System.out.println("Izena " + ikasle.getIzena());
							System.out.println("Abizena " + ikasle.getAbizena());
							System.out.println("Nan " + ikasle.getNan());
							System.out.println("Zikloa " + ikasle.getZikloa());
							System.out.println("Maila " + ikasle.getMaila());

						}
						if (!aurkituDut) {
							System.out.println("Ez dago sisteman");
						}
					}
					
					
					break;
				}
				case 3: {
					//Ikasleak ezabatu
					System.out.println("eman nan");
					String nan =teklatua.next();
					boolean aurkituDut=false;
					
					for (Ikasle ikasle:ikasleList) {
						if (ikasle.getNan().equals(nan)) {
							aurkituDut=true;
							break;
						}
					}
					
					if (!aurkituDut) {
						System.out.println("Ez dago zerrendan");
					}
					
					break;
				}
				case 4: {
					//Taldeen zerrendak atera
					
					ArrayList<String> zikloak = new ArrayList<String>();
					
					for (Ikasle ikasle:ikasleList) {
						if (!zikloak.contains(ikasle.getZikloa())) {
							zikloak.add(ikasle.getZikloa());
						}
					}
					
					for (String z:zikloak) {
						System.out.println("Zikloa: "+z);
						for (Ikasle ikasle:ikasleList) {
							if (ikasle.getZikloa().equals(z) && ikasle.getMaila().equals("1")) {
								System.out.println("Izena " + ikasle.getIzena());
								System.out.println("Abizena " + ikasle.getAbizena());
								System.out.println("Nan " + ikasle.getNan());
								System.out.println("Zikloa " + ikasle.getZikloa());
								System.out.println("Maila " + ikasle.getMaila());
							}
						}
						for (Ikasle ikasle:ikasleList) {
							if (ikasle.getZikloa().equals(z) && ikasle.getMaila().equals("2")) {
								System.out.println("Izena " + ikasle.getIzena());
								System.out.println("Abizena " + ikasle.getAbizena());
								System.out.println("Nan " + ikasle.getNan());
								System.out.println("Zikloa " + ikasle.getZikloa());
								System.out.println("Maila " + ikasle.getMaila());
							} 
						}
					}
					
					break;
				}
				case 0: {
					System.out.println("Programa ixten");
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + aukera);
			}
		}while (aukera!=0);
		System.out.println();
	}

	public static void menuaIdatzi() {
		System.out.println("");
		System.out.println("********************************");
		System.out.println(" 1.-Ikasleak sartu");
		System.out.println(" 2.-Ikasleak kontsultatu Nan-ez");
		System.out.println(" 3.-Ikasleak ezabatu");
		System.out.println(" 4.-Taldeen zerrendak atera");
		System.out.println("");
		System.out.println(" 0.-Irten");
		System.out.println("********************************");
		System.out.println("");
	}
}
