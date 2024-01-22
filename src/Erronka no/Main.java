package klaseak;
import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.*;
/**
 * Klase honek aplikazioa hastean exekutatzen den lehenengo gauza da, eta hemendik deitzen dira beste klase guztiak. Hemen gordetzen dira lehioaren, saioaren eta menuaren informazio guztia
 */
public class Main {
	/**
	 * Hasiera panela
	 */
	private static Hasiera hasiera;
	
	/**
	 * infoOrokorra panela
	 */
	private static InfoOrokorra infoOrokorra;
	
	/**
	 * lehioa eta haren dimentsioak
	 */
	private static JFrame lehioa;
	
	/**
	 * lehiaketa panela
	 */
	private static Lehiaketa lehiaketa;
	
	/**
	 * gehigarriak panela
	 */
	private static Gehigarriak gehigarriak;
	
	/**
	 * panel guztietan agertzen den JMenuBar menua
	 */
	private static Menua menu;
	
	/**
	 * saioa hasteko erabiltzen den lehioa
	 */
	private static Login1 sHHasiera;
	
	/**
	 * hasierako panelan ezartzeko den izena gordetzen den
	 */
	private static String izena;
	/**
	 * Lehioan dagoen panela deskribatzen du
	 */
	private static int panela = 1;
	/**
	 * Kontua eta haren datuak gordetzen ditu
	 */
	private static Kontuak kontua = new Kontuak();
	
	/**
	 * 
	 * @param args ez da inoiz erabiltzen baina beharrezkoa da exekutagarria funtzionatzeko
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lehioa = new JFrame();
					lehioa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					lehioa.setSize(1200,600);
					lehioa.setResizable(true);
					lehioa.setVisible(false);					
					lehioa.addPropertyChangeListener(null);
					lehioa.setIconImage(new ImageIcon(getClass().getResource("argazkiak/logo.png")).getImage());
					lehioa.addComponentListener(new ComponentAdapter() {
					    public void componentResized(ComponentEvent e) {
					    	switch (panela){
					    	case 1:
					    		hasieraEzarri(lehioa);
					    		break;
					    	case 2:
					    		infoOrokorraEzarri(lehioa);
					    		break;
					    	case 3:
					    		lehiaketaEzarri(lehioa);
					    		break;
					    	case 4:
					    		gehigarriakEzarri(lehioa);
					    	}
					    	
					        // Your custom logic here
					    }
					});
					SaioHasieraEzarri();
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Metodo honek lehioaren panela aldatzen du hasiera menua ikusteko
	 * @param lehioa JFrame-a hartzen du dimentsioak kalkulatzeko
	 */
	private static void hasieraEzarri(JFrame lehioa) {
		//menu bat sortzen du
		panela = 1; 
		menuAldatu();
		
		//hasiera panela sortzen du eta lehioaren informazioa pasatzen dio dimentsioak kalkulatzeko
		hasiera = new Hasiera(lehioa);
		
		//saioa hasita dagoen egiaztatzen du
		if (izena != null) {
			//hasiera panelaren barruan dagoen JTextField-aren textua ezartzen du kontuaren izena ikusteko
			hasiera.izenaOndo.setText(izena);
			//hasiera panelaren JTextField-a ikusgarri egiten du
			hasiera.izenaOndo.setVisible(true);
		}
		//menua hasiera panelan gehitzen du
		hasiera.add(menu);
		
		//lehiora gehitzen dio hasiera panela eta ikusgarri egiten du
		lehioa.add(hasiera);
		lehioa.setContentPane(hasiera);	
		
		//Login botoiari actionlistener bat ezartzen zaio saioa aldatzeko gaitasuna izateko
		hasiera.btnLogin.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//@see SaioHasieraEzarri
			SaioHasieraEzarri();
		}});
	}
	/**
	 * Lehio berri bat sortzen du saio hasiera egiteko
	 */
	private static void SaioHasieraEzarri() {
		//actionListener bat sortzen du saio berri bat sortzeko menua agertzeko
		ActionListener saioaSortu = new ActionListener() {
			public void actionPerformed(ActionEvent g) {
				//saio berriaren datuak aldagaietan gordetzen ditu
				String izena = sHHasiera.izenaSartu.getText();
				String pasahitza = sHHasiera.pasahitzaSartu.getText();
				String konf = sHHasiera.pasahitzaKonfirmatu.getText();
				
				//egiaztatzen du pasahitza eta konfirmazio pasahitza berdinak diren ala ez
				if (pasahitza.equals(konf)&& !izena.equals("")&& !pasahitza.equals("")) {
					//pasahitza eta konfirmazio bat egiten badute, saio berri bat sortzen da 
					kontua.saioBerria(izena, pasahitza);
				}
				else {
					//pasahitza eta konfirmazioa desberdinak izatekotan, notifikazio bat botatzen du
					JFrame notifikazioa = new JFrame();
					JLabel testua = new JLabel(" Ez dituzu kutxa guztiak bete edo pasahitza eta konfirmazioa ez dute bat egiten");
					notifikazioa.add(testua);
					notifikazioa.setBounds(800,400,460,60);
					notifikazioa.setVisible(true);
					notifikazioa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}
			}
		};
		//ActionListener bat sortzen dugu sLogin botoian saioa hasteko
		ActionListener sLogin = new ActionListener() {
			public void actionPerformed(ActionEvent f) {
				kontua.setIzena(sHHasiera.txtIniciarSesion.getText());
				kontua.setPasahitza(sHHasiera.txtpasahitza.getText());
				if (kontua.balioduna()) {
					//programaren lehio nagusia zabaltzen da
					lehioa.setVisible(true);
					sHHasiera.setVisible(false);
					menuAldatu();

					hasieraEzarri(lehioa);
					//cambiar el texto de izenaOndo dentro de Hasiera
					hasiera.izenaOndo.setText(kontua.getIzena());
					//hacer que el texto "IzenaOndo" de Hasiera se vea
					hasiera.izenaOndo.setVisible(true);
					izena = kontua.getIzena();
				}
				else {
					//saioaren balioak ezabatzen dira eta notifikazio bat botatzen da
					kontua.setIzena(null);
					kontua.setPasahitza(null);
					JFrame notifikazioa = new JFrame();
					JLabel testua = new JLabel(" Izena edo pasahitza ez dira zuzenak");
					notifikazioa.add(testua);
					notifikazioa.setBounds(800,400,230,60);
					notifikazioa.setVisible(true);
					notifikazioa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}
			}
		};
		//Loginaren lehioa sortzen da
		sHHasiera = new Login1();
		sHHasiera.setVisible(true);
		
		//ActionListenerrak behar diren lekuetan aplikatzen dira
		sHHasiera.txtIniciarSesion.addActionListener(sLogin);
		sHHasiera.txtpasahitza.addActionListener(sLogin);
		sHHasiera.btnHasisaioa.addActionListener(sLogin);
		
		sHHasiera.izenaSartu.addActionListener(saioaSortu);
		sHHasiera.pasahitzaSartu.addActionListener(saioaSortu);
		sHHasiera.pasahitzaSartu.addActionListener(saioaSortu);
		sHHasiera.btnSortu.addActionListener(saioaSortu);
	}
	/**
	 * InfoOrokorra panela sortzen da eta lehioan ikasgai egiten da
	 * @param lehioa JFrame-a hartzen du dimentsioak kalkulatzeko
	 */
	private static void infoOrokorraEzarri(JFrame lehioa) {
		panela = 2;
		menuAldatu();
		infoOrokorra = new InfoOrokorra(lehioa);
		infoOrokorra.add(menu);
		lehioa.add(infoOrokorra);
		lehioa.setContentPane(infoOrokorra);
	}
	/**
	 * lehiaketa panela sortzen da eta lehioan ikasgai egiten da
	 * @param lehioa JFrame-a hartzen du dimentsioak kalkulatzeko
	 */
	private static void lehiaketaEzarri (JFrame lehioa) {
		panela = 3;
		menuAldatu();
		lehiaketa = new Lehiaketa(lehioa);
		lehiaketa.add(menu);
		lehioa.add(lehiaketa);
		lehioa.setContentPane(lehiaketa);
	}
	/**
	 * gehigarriak panela sortzen da eta lehioan ikasgai egiten da
	 * @param lehioa JFrame-a hartzen du dimentsioak kalkulatzeko
	 */
	private static void gehigarriakEzarri (JFrame lehioa) {
		panela = 4;
		menuAldatu();
		gehigarriak = new Gehigarriak(lehioa);
		gehigarriak.add(menu);
		lehioa.add(gehigarriak);
		lehioa.setContentPane(gehigarriak);
	}
	/**
	 * MenuBar bat sortzen da nabigazioa ahalbidetzeko
	 */
	private static void menuAldatu() {
		ActionListener sHasiera = new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				hasieraEzarri(lehioa);
			}
		};
		ActionListener sInfoOrokorra = new ActionListener() {
			public void actionPerformed(ActionEvent b) {
				infoOrokorraEzarri(lehioa);
			}
		};
		ActionListener sLehiaketa = new ActionListener() {
			public void actionPerformed(ActionEvent d) {
				lehiaketaEzarri(lehioa);
			}
		};
		ActionListener sGehigarriak = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gehigarriakEzarri(lehioa);
			}
		};
		menu = new Menua(lehioa);
		menu.btnHasiera.addActionListener(sHasiera);
		menu.btnGehigarriak.addActionListener(sGehigarriak);
		menu.btnInfoOrokorra.addActionListener(sInfoOrokorra);
		menu.btnLehiaketa.addActionListener(sLehiaketa);	
	}	
	
}

