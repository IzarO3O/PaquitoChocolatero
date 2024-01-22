package ebaluazioa1;

import java.util.Scanner;

public class Gauzak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balioa, beherapena, prezioOsoa, azkenik;
		int kopurua;
		
		Scanner teklatua = new Scanner (System.in);
		
		System.out.println("Sartu zure produktu kopurua");
		kopurua = teklatua.nextInt();
		
		System.out.println("Sartu zure produktu kopurua");
		balioa = teklatua.nextDouble();
		teklatua.close();
		prezioOsoa= kopurua*balioa;
		System.out.println("Prezio osoa" + prezioOsoa);
		
		if (kopurua > 100) {
			beherapena= prezioOsoa*0.4;
			System.out.println("Beherapena:" + prezioOsoa*0.4);
			azkenik = prezioOsoa-beherapena;
			System.out.println("Azkeneko prezioa: "+ azkenik);
			
		}	if (kopurua<=100 && kopurua>25){
			System.out.println("Beherapena: "+ prezioOsoa*0.2);
			
		}	if (kopurua <= 10 && kopurua>0) {
			System.out.println("beherapena: 0");
			System.out.println("Azkeneko prezioa:" + prezioOsoa);
		}
		}
		
	}


