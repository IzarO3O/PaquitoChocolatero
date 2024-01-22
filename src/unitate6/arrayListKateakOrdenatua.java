package unitate6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class arrayListKateakOrdenatua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayListString=new ArrayList<String>();
		
		arrayListString.add("A");
		arrayListString.add("I");
		arrayListString.add("C");
		arrayListString.add("D");
		arrayListString.add("B");
		
		Collections.sort(arrayListString);

		for (String katea:arrayListString) {
			System.out.println(katea);
		}

	}

}
