package klaseak;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
/**
 * Klase honek JPanel batetik habiatzen da eta Hasieraren edukierak prestatzen ditu
 */
public class Hasiera extends JPanel{
	/**
	 * Federazioaren logoa
	 */
	private JLabel lblLogo;
	/**
	 * Saioa hasteko menua zabaltzen duen botoia
	 */
	public JButton btnLogin;
	/**
	 * Web gunea zabaltzeko botoia
	 */
	private JButton btnWeb;
	/**
	 * Aplikazioaren edukierak adierazten dituen testua
	 */
	private JTextArea txtMapa;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Erabiltzailearen izena adierazten du
	 */
	public TextField izenaOndo;
	/**
	 * Izenaren Font-a
	 */
	private static Font izena;
	/**
	 * Panelaren eraikitzailea
	 * @param lehioa panelaren dimentsioak kalkulatzeko erabiltzen den JFrame-a
	 */
	public Hasiera(JFrame lehioa) {
		setBackground(new Color(255, 255, 255));
		setBounds(0,0,lehioa.getWidth(),lehioa.getHeight());
		setLayout(null);
		
		//jarri saioa hasteko izena
		izenaOndo = new TextField();
		izenaOndo.setBounds(lehioa.getWidth()-150,250,100,40);
		izena = new Font("izena",Font.ITALIC,20);
		izenaOndo.setFont(izena);
		//defektuz testua ikusezin bihurtu
		izenaOndo.setVisible(false);
		add(izenaOndo);
		izenaOndo.setEditable(false);
		
		//Logoa jarri
		ImageIcon logo = new ImageIcon(getClass().getResource("argazkiak/logo.jpg"));
		lblLogo = new JLabel(logo);
		lblLogo.setBounds(lehioa.getWidth()-150,10,100,100);
		add(lblLogo);
		
		//Botoi bat argazki batekin saioa hasteko
		ImageIcon login = new ImageIcon(getClass().getResource("argazkiak/logon.png"));
		btnLogin = new JButton(login);
		//btnLogin.setBackground(new Color(0, 255, 0));
		btnLogin.setBounds(lehioa.getWidth()-150,150,100,100);
		add(btnLogin);
		
		//Botoi bat argazki batekin webgunera irekitzeko
		ImageIcon web = new ImageIcon(getClass().getResource("argazkiak/web.png"));
		btnWeb = new JButton(web);
		btnWeb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent f) {
				webZabaldu();
			}});
		//btnWeb.setBackground(new Color(0, 255, 0));
		btnWeb.setBounds(lehioa.getWidth()-150, 300, 100, 100);
		add(btnWeb);
		
		
		txtMapa = new JTextArea();
		txtMapa.setText("Webgunearen mapa:\r\n*Hasiera (Hemen zaude)\r\n\r\n*Informazio orokorra\r\n\t-Gure taldea\r\n\t-Arautegia\r\n\r\n*Lehiaketa\r\n\t-Partiduen emaitzak\r\n\t-Sailkapena\r\n\t-Estadistikak\r\n\r\n*Gehigarriak\r\n\t-Kokapena\r\n\t-Telefonoa\r\n\t-E-maila");
		//txtMapa.setBackground(new Color(0, 255, 0));
		txtMapa.setBounds(10, 96, 200, 421);
		add(txtMapa);		
		
		Berriak berriak = new Berriak(lehioa);
		
		JScrollPane scrollPanel = new JScrollPane(berriak);
		int zabalera = lehioa.getSize().width-430;
		if (zabalera>1078) {
			zabalera = 1096;
		}
		scrollPanel.setBounds(lehioa.getWidth()/2-zabalera/2, 50, zabalera, lehioa.getSize().height-100);
		//scrollPanel.setBounds(50, 50, 1300, 700);
		add(scrollPanel);
		//AJUSTAR TAMAÑO PARA QUE ESCALE CON LA PANTALLA
		
	}

	/**
	 * Web gune lokal bat zabaltzen duen funtzioa
	 */
	private static void webZabaldu() {
		//klasearen edo JAR fitxategiaren kokalekua lortzen du
		String path = new File(".").getAbsolutePath();
		//klasearen kokalekuari webgunearen kokalekua relatiboa gehitzen zaio
		File web = new File(path + "//web//html//index.html");
	
			try {
				//Sistemari esaten dio web gunearen fitxategi lokala zabaltzea aplikazio predeterminatuarekin
				Desktop.getDesktop().open(web);
			} catch (IOException e) {
				e.printStackTrace();
			}		
	}
	/**
	 * Klase pribatu bat, berriak edukitzen duena
	 */
	private class Berriak extends JPanel{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		/**
		 * Lehenengo berriaren testua
		 */
		private JTextArea berri1;
		/**
		 * Lehenengo berriaren argazkia
		 */
		private JLabel berri1A;
		/**
		 * Bigarren berriaren testua
		 */
		private JTextArea berri2;
		/**
		 * Bigarren berriaren argazkia
		 */
		private JLabel berri2A;
		/**
		 * Panel honen eraikitzailea
		 * @param lehioa tamaina kalkulatzeko
		 */
		public Berriak(JFrame lehioa){
			setLayout(null);
			setBackground(new Color(255,255,255));
			Dimension tamaina = new Dimension(1078, 1480);
			setPreferredSize(tamaina);
			setMaximumSize(tamaina);
			
			//Text area bat berri bat jartzeko
			berri1 = new JTextArea("Emakumezkoen Euskadiko senior selekzioak Parisera bidaiatuko du maiatzaren 16an Central Seven txapelketa jokatzera."
					+ "\r\n"
					+ "Nazio parte hartzaileak Alemania, Wonder sevens, limsette, Georgia, Tuks, Saavy sevens, Inglaterra y Switzers rugby izango dira."
					+ "\r\n"
					+ "Parisen egongo dira maiatzaren 16tik 19ra bitarte.");
			
			//text arearen ezarpenak
			berri1.setBounds((tamaina.width/2-310),520,700,70);	
			//berri1.setBackground(new Color(255,0,0));
			add(berri1);
			berri1.setEditable(false);
			
			//berriaren argazkia
			ImageIcon berri1Arg = new ImageIcon(Hasiera.class.getResource("argazkiak/Euskadi-1-1078x516.jpg"));
			berri1A = new JLabel(berri1Arg);
			Dimension arg1D = new Dimension(berri1A.getPreferredSize());
			
			//argazkiaren ezarpenak
			berri1A.setBounds(tamaina.width/2-539,0,1078,arg1D.height);
			add(berri1A);
			
			
			//bigarren berriaren text area
			berri2 = new JTextArea("Errugbi VII-ko emakume eta gizonezkoen Euskadiko selekzioak martxan jarri dira dagoeneko, martxoan eta apirilean jokatuko diren Toulon eta Pariseko txapelketei begira."
					+"\r\n"
					+"Gorka Bueno, gizonezkoen selekzioaren entrenatzaile modura eta Isabel Bergareche eta Javi Aguado emakumezkoen selekzioen arduran izango dira.");
			
			//text arearen ezarpenak
			berri2.setBounds(tamaina.width/2-440,1378,880,50);
			add(berri2);
			berri2.setEditable(false);
			
			
			//bigarren argazkia jartzeko
			ImageIcon berri2Arg = new ImageIcon(Hasiera.class.getResource("argazkiak/Toulon.jpeg"));
			berri2A = new JLabel(berri2Arg);
			
			//bigarren argazkiaren ezarpenak
			berri2A.setBounds(tamaina.width/2-512,600,1024,768);
			add(berri2A);
		}
		
	}
}