package ebaluazioa1;

import java.util.Scanner;

public class SEGUNDO {
	public static void main(String[] args) {
	int s, m, o;
	Scanner teklatua = new Scanner(System.in);
	
		System.out.println ("Eman orduak mesedez");
			o = teklatua.nextInt();
			
		System.out.println ("Eman minutuak mesedez");
			m = teklatua.nextInt();
			
		System.out.println ("Eman segunduak mesedez");
			s = teklatua.nextInt();
		
			s = s++;
			if (s==60) {
				m++; 
				s = 0 ;
				}
				if (m == 60);{
					o++;
					m = 0 ;
				}
					if (o==24);{
						o = 0;
					}
			
		System.out.println ("Hurrengo segundoan "+ o +":"+ m +":"+s);
		}
		
		
	}
	
