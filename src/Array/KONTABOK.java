package Array;

import java.util.Scanner;

public class KONTABOK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua=new Scanner(System.in);
		int kontA=0, kontE=0, kontI=0, kontO=0, kontU=0;
		String [] b= {"a", "e", "i", "o", "u"};
		System.out.println("eman ezaldi bat:");
		String katea=teklatua.nextLine();
		
		String n;
		for (int i=1;i<katea.length();i++) {
			if (katea.charAt(i)=='a' || katea.charAt(i)=='A') {
				kontA++;
			}
			if (katea.charAt(i)=='e' || katea.charAt(i)=='E') {
				kontE++;
			}
			if (katea.charAt(i)=='i' || katea.charAt(i)=='I') {
				kontI++;
			}
			if (katea.charAt(i)=='o' || katea.charAt(i)=='O') {
				kontO++;
			}
			if (katea.charAt(i)=='u' || katea.charAt(i)=='U') {
				kontU++;
			}
		}

		System.out.println("a"+ b[1]+"aldiz atera da");
		System.out.println("e"+ b[2]+"aldiz atera da");
		System.out.println("i"+ b[3]+"aldiz atera da");
		System.out.println("o"+ b[4]+"aldiz atera da");
		System.out.println("u"+ b[5]+"aldiz atera da");
		
		
		
		
				
				
		



	}

}
