package garapen;

public class Kalkulagailu{
	
	public static int batuketa (int i, int j) {
		return (i + j);
	}
	
	public static int kenketa (int i, int j) {
		return (i - j);
	}
	
	public static int biderketa (int i,int j) {
		return (i*j);
	}
	
	public static void main(String[] args) {
		int i,j,m;
		j = 8;
		Kalkulagailu klk = new Kalkulagailu();
		System.out.println("8 biderketa taula"); 
		for(i= 1; i<=10;i++){
			System.out.println("" + i + " * " + j + " = "+ klk.biderketa(i,j));
		}
	}
}