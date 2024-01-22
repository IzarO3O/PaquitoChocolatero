package klaseak;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

/**
 * Saioa sartzeko erabiltzen den menua
 */
public class Login1 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Menuaren panela
	 */
	private JPanel contentPane;
	
	/**
	 * Erabiltzen den panela
	 */
	JTextField txtIniciarSesion;
	/**
	 * izena sartzeko kutxa
	 */
	private JTextArea txtrEmail;
	/**
	 * "izena sartu" esaten duen TextField bat
	 */
	JTextField txtpasahitza;
	/**
	 * pasahitza sartzeko kutxa
	 */
	private JTextArea txtrPasahitza;
	/**
	 * "pasahitza sartu" esaten duen TextField bat
	 */
	JButton btnEzDaukazuKonturik;
	/**
	 * Kontu bat sortzeko menua zabaltzen duen botoia
	 */
	private JTextArea txtrHasiSaioa;
	/**
	 * "Hasi saioa" esaten duen TextArea bat
	 */
	JButton btnHasisaioa;
	/**
	 * Saioa hasteko botoia
	 */
	private JPanel panel;
	/**
	 * Kutxa beltz bat logoaren azpian
	 */
	private JLabel lblNewLabel;
	/**
	 * Federazioaren logoa daukan label bat
	 */
	JTextField izenaSartu ;
	/**
	 * kontu berri bat sortzean izena sartzeko lekua
	 */
	JTextField pasahitzaKonfirmatu;
	/**
	 * kontu berri bat sortzean pasahitza konfirmatzeko lekua
	 */
	JButton btnSortu;
	/**
	 * kontu berria sortzeko botoia
	 */
	JTextField pasahitzaSartu;
	/**
	 * "Pasahitza sartu" esaten duen textField bat
	 */
	private JPanel kontuBerria;
	
	/**
	 * Menu honen eraikitzailea
	 */
	public Login1() {
		//Lehioa eta haren propietateak ezartzen dira
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setTitle("Hasi saioa");
		setBounds(100, 100, 600, 350);
		setIconImage(new ImageIcon(getClass().getResource("argazkiak/logo.png")).getImage());
		//panel nagusia eta haren propietateak ezartzen dira
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Hemendik aurrera sortzen dira panelaren elementuak
		txtIniciarSesion = new JTextField();
		txtIniciarSesion.setBounds(288, 87, 220, 32);
		contentPane.add(txtIniciarSesion);
		txtIniciarSesion.setColumns(10);
		
		txtrHasiSaioa = new JTextArea();
		txtrHasiSaioa.setEditable(false);
		txtrHasiSaioa.setFont(new Font("SansSerif", Font.BOLD, 20));
		txtrHasiSaioa.setText("Hasi saioa");
		txtrHasiSaioa.setBounds(288, 17, 161, 27);
		contentPane.add(txtrHasiSaioa);
		
		txtrEmail = new JTextArea();
		txtrEmail.setEditable(false);
		txtrEmail.setFont(new Font("SansSerif", Font.BOLD, 14));
		txtrEmail.setText("Izena\r\n");
		txtrEmail.setBounds(288, 55, 161, 22);
		contentPane.add(txtrEmail);
		
		txtpasahitza = new JTextField();
		txtpasahitza.setColumns(10);
		txtpasahitza.setBounds(288, 157, 220, 32);
		contentPane.add(txtpasahitza);
		
		txtrPasahitza = new JTextArea();
		txtrPasahitza.setEditable(false);
		txtrPasahitza.setFont(new Font("SansSerif", Font.BOLD, 14));
		txtrPasahitza.setText("Pasahitza");
		txtrPasahitza.setBounds(288, 130, 161, 22);
		contentPane.add(txtrPasahitza);
		
		btnHasisaioa = new JButton("Hasi saioa");
		btnHasisaioa.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnHasisaioa.setBackground(new Color(221, 197, 135));
		
		btnHasisaioa.setBounds(288, 200, 220, 27);
		contentPane.add(btnHasisaioa);
		
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 227, 350);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(13, 5, 200, 300);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("argazkiak/logo1.png")));
		
		btnEzDaukazuKonturik = new JButton("Ez daukazu konturik?");
		btnEzDaukazuKonturik.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEzDaukazuKonturik.setHorizontalAlignment(SwingConstants.LEFT);
		btnEzDaukazuKonturik.setBorder(null);
		btnEzDaukazuKonturik.setBackground(Color.WHITE);
		btnEzDaukazuKonturik.setBounds(287, 257, 140, 23);
		contentPane.add(btnEzDaukazuKonturik);
		
		//Kontu berri bat sortzeko menua zabaltzeko actionlistenerra
		btnEzDaukazuKonturik.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				kontuBerria();
			}
		});
		
		//Kontu berria sortzeko erabiltzen den panela
		kontuBerria = new JPanel();
		kontuBerria.setBounds(0,0 , 600, 350);
		kontuBerria.setLayout(null);
		
		//Hemendik aurrera daude kontua sortzeko beharrezkoak diren elementuak
		JLabel tIzenaSartu = new JLabel("Izena sartu");
		tIzenaSartu.setBounds(288, 5, 161, 22);
		kontuBerria.add(tIzenaSartu);
		izenaSartu = new JTextField();
		izenaSartu.setBounds(288, 37, 220, 32);
		kontuBerria.add(izenaSartu);
		
		JLabel tPasahitzaSartu = new JLabel("pasahitza sartu");
		tPasahitzaSartu.setBounds(288, 80, 161, 22);
		kontuBerria.add(tPasahitzaSartu);
		pasahitzaSartu = new JTextField();
		pasahitzaSartu.setBounds(288, 107, 220, 32);
		kontuBerria.add(pasahitzaSartu);
		
		JLabel tPasahitzaKonfirmatu = new JLabel("pasahitza konfirmatu");
		tPasahitzaKonfirmatu.setBounds(288,155,220,22);
		kontuBerria.add(tPasahitzaKonfirmatu);
		pasahitzaKonfirmatu = new JTextField();
		pasahitzaKonfirmatu.setBounds(288,177,220,32);
		kontuBerria.add(pasahitzaKonfirmatu);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 227, 350);
		kontuBerria.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(13, 5, 200, 300);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("argazkiak/logo1.png")));
		
		btnSortu = new JButton("Sortu kontua");
		btnSortu.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnSortu.setBackground(new Color(221, 197, 135));
		btnSortu.setBounds(288,234,220,32);
		//ActionListener honek kontua sortu eta gero exekutatzen den kodea ezartzen du
		btnSortu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			berrerazi();
			}
		});
		kontuBerria.add(btnSortu);
		
		
	}
	
	/**
	 * 
	 */
	public void kontuBerria(){
		add(kontuBerria);
		setContentPane(kontuBerria);
		
		
	}
	/**
	 * Kontua sortzeko menua itxti
	 */
	public void berrerazi() {
		izenaSartu.setText("");
		pasahitzaSartu.setText("");
		pasahitzaKonfirmatu.setText("");
		setContentPane(contentPane);
	}
}
