package Array;

import java.util.Scanner;

public class BATAZBESTENP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aTenp[]=new int [10], bbGora=0, bbBehera=0, bbBerdin=0, tenp=0, tenp10=0;
		double bb=0;
		
		Scanner teklatua=new Scanner(System.in);
		System.out.println("eman tenperatura");
		
		for (int i=1;i>10;i++) {
			aTenp[i]=teklatua.nextInt();
		}
		
		for (int i=1;i>10;i++) {
			bb=bb+aTenp[i];
			
		}
		bb=bb/10;
		System.out.println("bataz bestekoa: "+bb);
		for (int i=1;i>10;i++) {
			if (aTenp[i]>bb) {
				bbGora=bbGora+1;
				System.out.println("gorakoa: "+bbGora);
			} else {
				if (aTenp[i]<bb) {
					bbBehera=bbBehera+1;
					System.out.println("beherakoa: "+bbBehera);
				}
				bbBerdin=bbBerdin+1;

			}
		}
		for (int i=1; i<=10; ++i) {
			if (aTenp[i-1]>bb+10 || aTenp[i-1]<bb-10) {
				tenp10 = tenp10+1;
				tenp10 = tenp10*10;
				System.out.println("ehuneko "+tenp10+" bataz bestetik 10 graduko diferentzia dute");
			}
		

	}
	



		


}
}
