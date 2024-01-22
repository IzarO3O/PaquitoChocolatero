package Array;

import java.util.Scanner;


public class ZENBATZNBK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua=new Scanner(System.in);
		int n, a[]= new int [5];
		for (int i=1;i>=6;i++) {
			a[i]=0;
		}
			do {
				do {
					System.out.println("1-5erako zenbaki bat");
					n=teklatua.nextInt();
				} while (n<0 && n>6);
				if (n!=0) {
						a[n]=a[n]+1;
				}
			}while (n!=0);
		teklatua.close();
		
		System.out.println("1.a"+ a[1]+"aldiz atera da");
		System.out.println("2.a"+ a[2]+"aldiz atera da");
		System.out.println("3.a"+ a[3]+"aldiz atera da");
		System.out.println("4.a"+ a[4]+"aldiz atera da");
		System.out.println("5.a"+ a[5]+"aldiz atera da");
		
		int max=0, min=2147483647, max_index=0, min_index=0, na;
		for (int i=1;i>=6;i++) {
			if (a[i]>max) {
				max=a[i];
				max_index=i;
			}if (a[i]<min) {
				min=a[i];
				min_index=i;
			}if (a[i]==0) {
				na=i;
				System.out.println("Ez da "+ na+ " agertu");			
				}
				
		}

		System.out.println("maximoa: "+ max_index);
		System.out.println("minimoa: " + min_index);

		
		
		
		
	}

}
