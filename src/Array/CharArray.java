package Array;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String katea="Kaixo mundua";
				char[] kateaenp=katea.toCharArray();
				kateaenp[0]='A';
				katea=new String(kateaenp);
						System.out.println(katea);
		}

}
