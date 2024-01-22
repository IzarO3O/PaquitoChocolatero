package erronka1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;


public class SignUp implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua=new Scanner(System.in);
		
		int n = 1;
		String [] izenArray = new String [n] ;
		String [] izenPasahitza = new String [n] ;
		
		
		System.out.println("SIGN UP ORRIALDEA");
		
		System.out.println("Eman zure izena");
		izenArray [1]=teklatua.next();

		
		System.out.println("Eman zure pasahitza");
		izenPasahitza [1]=teklatua.next();
		 	
		n= n+1;
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
