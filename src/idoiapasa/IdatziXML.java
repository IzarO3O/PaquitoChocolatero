package ebaluazioa2.serializazioa;

import java.util.ArrayList;

public class IdatziXML {

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
		
		//Ikasle klasean sorto toXML metodoa
		ArrayList<Ikaslea> ikList = new ArrayList<Ikaslea>();
		ikList.add(ik);
		ikList.add(ik1);
		ikList.add(ik2);
		
		//XML-an etiketak aterako dira (html antzekoak baina personalizables)
		String outXML ="<klasea>\n";
		for (Ikaslea ikaslea:ikList) {
			outXML=outXML + ikaslea.toXML();
		}
		outXML= outXML + "</klasea>";
		
		System.out.println(outXML);
	}

}
