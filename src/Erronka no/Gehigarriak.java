package klaseak;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
/**
 * Gehigarriak panela eta haren elementuak
 */
public class Gehigarriak extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Kontaktu datuen titulua
	 */
	private JLabel lblKontaktua;
	
	/**
	 * Font bat, tituluetan erabiltzen dena
	 */
	private static Font tituluak;
	
	/**
	 * Font bat, testu orkorretan erabiltzen dena (adb, zuk idatzitakoa edo kontaktu informazioarena)
	 */
	private static Font testuArrunta;
	
	/**
	 * kontaktu informazioa gordetzen duen JTextArea bat
	 */
	private static JTextArea TAdatuak;
	
	/**
	 * 
	 * @param lehioa dimentsioak kalkulatzeko erabiltzen da
	 */
	public Gehigarriak (JFrame lehioa) {
		
		setLayout(null);
		setBounds(0,0,lehioa.getWidth(),lehioa.getHeight());
		
		//etiketa bat titulu bat jartzeko
		lblKontaktua = new JLabel("Kontaktu informazioa");
		add(lblKontaktua);
		lblKontaktua.setBounds(20,60,300,20);
		
		
		//letra mota sortu, tituluak jartzeko, negritaz 20px
		tituluak = new Font("tituluak",Font.BOLD,20);
		lblKontaktua.setFont(tituluak);
		
		//Text area bat, editaezina, enpresearen datuak jartzeko
		TAdatuak = new JTextArea("Enpresaren izena: Euskal Errugbi Federazioa"
					+"\r\n"
					+"Helbidea: Ornilla Doctor Kalea, 2, 48004 Bilbo, Bizkaia"
					+"\r\n"
					+"Teléfono: 931 17 51 10"
					+"\r\n"
					+"Posta elektronikoa: euskalerrugbifederazioa@gmail.com");
		add(TAdatuak);
		TAdatuak.setBounds(25,100,500,100);
		TAdatuak.setEditable(false);
		TAdatuak.setBackground(null);
		testuArrunta = new Font("testua",Font.PLAIN,15);
		TAdatuak.setFont(testuArrunta);
		
		//E-Maila idazteko lekuak dauzkan JPanel-a deitzen du
		Formularioa form = new Formularioa(lehioa);
		JScrollPane scrollPanel = new JScrollPane(form);
		scrollPanel.setBounds(20, 250, lehioa.getWidth()-60, lehioa.getHeight()-350);
		add(scrollPanel);
	}
	
	/**
	 * E-Maila idazteko lekuak dauzkan JPanel-a sortzen du
	 */
	private class Formularioa extends JPanel{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		/**
		 * JPanel-aren tamainaren dimentsioa
		 */
		private Dimension size;
		/**
		 * Formularioaren titulua
		 */
		private JLabel lblFormularioa;
		/**
		 * Izenaren titulua
		 */
		private JLabel lblIzena;
		/**
		 * E-Mailaren titulua
		 */
		private JLabel lblEmail;
		/**
		 * Mezuaren titulua
		 */
		private JLabel lblMezua;
		/**
		 * Izena idazteko textField bat
		 */
		private JTextField tfIzena;
		/**
		 * E-Mail-a idazteko textField bat
		 */
		private JTextField tfEmail;
		/**
		 * Mezua idazteko textArea bat
		 */
		private JTextArea tfMezua;
		/**
		 * Mezua bidaltzeko botoia
		 */
		private JButton btnBidali;
		
		/**
		 * Formularioaren konstruktorea
		 * @param lehioa
		 */
		public  Formularioa(JFrame lehioa) {
			size = new Dimension(lehioa.getWidth()-80,400);
			setPreferredSize(size);
			setLayout(null);
			setBounds(0,0,lehioa.getWidth(),lehioa.getHeight());
			
			
			//etiketa bat sortu testu batekin, eta letra tipo batekin
			lblFormularioa = new JLabel("Kontaktu formularioa");
			add(lblFormularioa);
			lblFormularioa.setBounds(20,0,300,20);
			lblFormularioa.setFont(tituluak);
			
			//etiketa bat sortu testu batekin eta letra mota batekin
			lblIzena = new JLabel ("Zure izena:");
			add(lblIzena);
			lblIzena.setBounds(20,30,100,20);
			lblIzena.setFont(testuArrunta);
			
			
			//text field bat sortu erabiltzaileak bere izena sartzeko
			tfIzena = new JTextField();
			add(tfIzena);
			tfIzena.setBounds(20,60,size.width-50,20);
			
			
			//etiketa bat sortu testu batekin eta letra mota batekin
			lblEmail = new JLabel ("Posta elektronikoa:");
			add(lblEmail);
			lblEmail.setBounds(20,90,200,20);
			lblEmail.setFont(testuArrunta);
			
			
			//text field bat erabiltzaileak bere posta elektronikoa sartzeko
			tfEmail = new JTextField();
			add(tfEmail);
			tfEmail.setBounds(20,120,size.width-50,20);
			
			//etiketa bat sortu testu batekin eta letra mota batekin
			lblMezua = new JLabel ("Mezua:");
			add(lblMezua);
			lblMezua.setBounds(20,150,200,20);
			lblMezua.setFont(testuArrunta);
			
			
			//text area bat sortu erabiltzaileak bere arazoa azaltzeko
			tfMezua = new JTextArea();
			add(tfMezua);
			tfMezua.setBounds(20,180,size.width-50,100);
			//borde bat jarri diogu
			Border border = BorderFactory.createLineBorder(Color.BLACK);
		    tfMezua.setBorder(BorderFactory.createCompoundBorder(border,
		            BorderFactory.createEmptyBorder(10, 10, 10, 10)));
			
		    //formularioa bidaltzeko botoi bat sortu
			btnBidali = new JButton("Bidali");
			add(btnBidali);
			btnBidali.setBounds(20, 300, 80, 40);
			
			btnBidali.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent a) {
					if (tfEmail.getText().equals("") || tfIzena.getText().equals("") || tfMezua.getText().equals("")) {
						JFrame notifikazioa = new JFrame();
						JLabel testua = new JLabel(" Ez dituzu kutxa guztiak bete");
						notifikazioa.add(testua);
						notifikazioa.setBounds(800,400,200,60);
						notifikazioa.setVisible(true);
						notifikazioa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					}
					else {
						Mail();
					}
					
				}});
		}
			/**
			 * Hemen joango da e-maila bidaltzeko kodea (Oraindik ez dago inplementatuta)
			 */
		void Mail(){			
			/**
			 * hau da gero bidaliko den mezua
			 */
			String mezua = ("izena: " + tfIzena.getText()
							+"\r\n"
							+"E-maila: " + tfEmail.getText()
							+ "\r\n"
							+"Mezua: " + tfMezua.getText());
			System.out.println(mezua);
			JFrame notifikazioa = new JFrame();
			JTextArea taTestua = new JTextArea(mezua);
			notifikazioa.add(taTestua);
			notifikazioa.setBounds(800,400,taTestua.getPreferredSize().width,160);
			notifikazioa.setVisible(true);
			notifikazioa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}	
	}
}

