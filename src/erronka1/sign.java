package erronka1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Toolkit;


public class sign extends erronka1.main implements erronka1.dialog{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sign window = new sign();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public sign() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//sign-aren tamaina eta kokapena autatu
		frame.setBounds(100, 100, 800, 500);
		//sign-aren tamaina ez aldatzeko
		frame.setResizable(false);
		//itzi ahal izateko
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//signUp-aren izenburua idatzi
		frame.setTitle("Registratu");
		//aplikazioaren irudia jarri
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("logo.png"));
		
		//sortu JLabel signUp-rentzako
		JLabel txtIzena = new JLabel("Erabiltzailearen izena");
		JLabel txtPasahitza = new JLabel("Erabiltzailearen pasahitza");
		JLabel txtPasahitzaKonfirmatu = new JLabel("Erabiltzailearen pasahitza");
		
		//signUp-en erabiltzailea sartzeko JTextField
		JTextField erabiltzailea = new JTextField();
		
		//signIn-en saioa hasteko JButton sortu
		JButton sahioaSartu = new JButton("Hasi Saioa");
		
		//signIn-en pasahitzaren alboan dagoen textua JLabel bat sortu
		JLabel txtPasahitzaIn = new JLabel("Erabiltzailearen pasahitza");
		
		//signUp-en pasahitza sartzeko eta konfirmatzeko bi JPasswordField
		JPasswordField pasahitza = new JPasswordField();
		JPasswordField pasahitzaKonfirmatu = new JPasswordField();
		
		//signIn-en pasahitza sartzeko JPasswordField
		JPasswordField pasahitzaSartu = new JPasswordField();
		
		//signIn-en erabiltzailea alboan dagoen textua JLabel bat sortu
		JLabel txtErabiltzailea = new JLabel("Erabiltzailea sartu");
		
		//signIn-en sartzeko erabiltzailea JTextField sortu
		JTextField erabiltzaileaSartu = new JTextField();
		
		//registratzeko botoia sortu
		JButton registratu = new JButton("Registratu");
		
		//signUp-etik signIn-eko panelera aldatzeko botoia sortu
		JButton hasiSahioa = new JButton("Hasi Saioa");
		
		dialogRel();
		
		//signUp eta signIn non kokatukoden JFramean
		signUpPane.setBounds(0, 0, 800, 500);
		signInPane.setBounds(0, 0, 800, 500);
		
		//sortu dugun JLabelak kokatu signUp-en
		txtIzena.setBounds(149, 120, 175, 14);
		txtPasahitza.setBounds(148, 145, 176, 14);
		txtPasahitza.setBounds(148, 145, 175, 14);
		txtPasahitzaKonfirmatu.setBounds(149, 170, 175, 14);
		
		//signIn-en JLabelak kokatu 
		txtErabiltzailea.setBounds(226, 120, 98, 14);
		txtPasahitzaIn.setBounds(226, 156, 98, 14);
		
		//signUp-en JTextField-a kokatu
		erabiltzailea.setBounds(334, 117, 137, 20);
		erabiltzailea.setColumns(10);
		
		//registratzeko botoia kokatu signUp-en
		registratu.setBounds(344, 223, 116, 38);
		
		//signUp-etik signIn-eko panelera aldatzeko kokatu
		hasiSahioa.setBounds(359, 265, 89, 23);
		//signUp-etik signIn-eko panelera aldatu
		hasiSahioa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    signInPane.setVisible(true);
			    signUpPane.setVisible(false);
			    frame.setTitle("Saioa sartu");
			}
		});
		
		//signUp-etik signIn-eko panela aldatu botoia bordea ez eukitzeko ezta atzeko kolorea
		hasiSahioa.setBorder(null);
		hasiSahioa.setBackground(null);
		
		//pasahitza eta pasahitza konfirmatzeko botoia kokatu
		pasahitza.setBounds(334, 142, 137, 20);
		pasahitzaKonfirmatu.setBounds(334, 167, 137, 20);
		pasahitzaKonfirmatu.setColumns(10);
		
		
		
		
		//registratzeko botoia funtzionalitea emon
		registratu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pasahitzen balioak artu eta char kate batean gorde
				char[] contrasenaChars = pasahitza.getPassword();
				char[] contrasenaKonfirmatuChars = pasahitzaKonfirmatu.getPassword();
				
				//char katearen balioa string-era pasatu
				String contrasena = new String(contrasenaChars);
				String contrasenaKonfirmatu = new String(contrasenaKonfirmatuChars);
				//konprobatu balioak zuzenak hala okerrak diren
				if (contrasena.equals(contrasenaKonfirmatu) && !contrasena.isEmpty() && !contrasenaKonfirmatu.isEmpty() && !erabiltzailea.getText().isEmpty()) {
				    dial.setVisible(true);
				    btnEztatu.setVisible(true);
				    dial.setSize(320, 200);
				    dial.setTitle("SignUp: Konfirmatu");
				    lblError.setText("Seguru saude sartu dituzun datuak zuzenak direla?");
				}else {
					//JDialog-a erakutzi
					dial.setVisible(true);
					//Emon ahal duen erroreak kudeatu
					if(erabiltzailea.getText().isEmpty() && contrasenaKonfirmatu.isEmpty() && contrasena.isEmpty()) {
						lblError.setText("Erabiltzailearen izena eta pasahitza idatzi.");
					}else if(erabiltzailea.getText().isEmpty()) {
						lblError.setText("Erabiltzailearen izena idatzi.");
					}else if(contrasenaKonfirmatu.isEmpty()) {
						lblError.setText("Pasahitzaren konfirmazioa idatzi.");
					}else if(!contrasena.equals(contrasenaKonfirmatu)){
						lblError.setText("Pasahitzak desberdinak dira.");
					}else if(contrasena.isEmpty()){
						lblError.setText("Pasahitza idatzi.");
					}
					
				}
				
			}
		});
		
		btnBaieztatu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//pasahitzen balioak artu eta char kate batean gorde
				char[] contrasenaChars = pasahitza.getPassword();
				char[] contrasenaKonfirmatuChars = pasahitzaKonfirmatu.getPassword();
				
				//char katearen balioa string-era pasatu
				String contrasena = new String(contrasenaChars);
				String contrasenaKonfirmatu = new String(contrasenaKonfirmatuChars);
				
				if (contrasena.equals(contrasenaKonfirmatu) && !contrasena.isEmpty() && !contrasenaKonfirmatu.isEmpty() && !erabiltzailea.getText().isEmpty()) {
					//pasahitzen balioak artu eta char kate batean gorde
					
					//string bibariableetan erabiltzailea eta pasahitza sartu			    
				    user = erabiltzailea.getText().toString();
				    pass = contrasena.toString();
				    
				    //signUp eta signIn-aren panelak ordezkatu eta izenburua aldatu
				    signInPane.setVisible(true);
				    signUpPane.setVisible(false);
				    frame.setTitle("Sahioa sartu");
				    dial.setVisible(false);
				}else {
					dial.setVisible(false);
				}
			}
		});
		
		btnEztatu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				erabiltzailea.setText(null);
				pasahitza.setText(null);
				pasahitzaKonfirmatu.setText(null);
				dial.setVisible(false);
			}
		});
		
		//erabiltzailea kokatu signIn-en
		erabiltzaileaSartu.setBounds(334, 117, 137, 20);
		erabiltzaileaSartu.setColumns(10);
		
		//pasahitza kokatu signIn-en
		pasahitzaSartu.setBounds(334, 153, 137, 20);
		pasahitzaSartu.setColumns(10);
		
		//sahioa sartzeko botoiari funtzionalitatea emon
		sahioaSartu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dial.setTitle("SingIn: ERROR");
				
				char[] contrasenaChars = pasahitzaSartu.getPassword();
				
				String contrasena = new String(contrasenaChars);
				if(erabiltzaileaSartu.getText().equals(user) && pass.equals(contrasena)){
					main.setVisible(true);
					frame.dispose();
				}else {
					//JDialog-aren izenburua aldatu
					dial.setTitle("SignIn: Error");
					
					//Emon ahal duen erroreak kudeatu
					if(erabiltzailea.getText().isEmpty() && contrasena.isEmpty()) {
						lblError.setText("Erabiltzailearen izena eta pasahitza idatzi.");
					}else if(erabiltzailea.getText().isEmpty()) {
						lblError.setText("Erabiltzailearen izena idatzi.");
					}else if(contrasena.isEmpty()){
						lblError.setText("Pasahitza idatzi.");
					}else if(!erabiltzailea.equals(user) && !contrasena.equals(pass)) {
						lblError.setText("Pasahitza eta erabiltzailea okerrak dira.");
					}else if(!contrasena.equals(pass)){
						lblError.setText("Pasahitzak okerra da.");
					}else if(!erabiltzailea.equals(user)){
						lblError.setText("Erabiltzailea okerra da.");
					}
					//JDialog-a erakutzi
					dial.setVisible(true);
				}
			}
		});
		//Botoia kokatu
		sahioaSartu.setBounds(350, 184, 100, 35);
		
		//default
		frame.getContentPane().add(signUpPane);
		frame.getContentPane().add(signInPane);
		signInPane.setVisible(false);
		
		//panelen Layout mota
		signInPane.setLayout(null);
		signUpPane.setLayout(null);
		
		//panelera gehitu objetuak signUp
		signUpPane.add(txtIzena);
		signUpPane.add(erabiltzailea);
		signUpPane.add(txtPasahitza);
		signUpPane.add(txtPasahitzaKonfirmatu);
		signUpPane.add(pasahitzaKonfirmatu);
		signUpPane.add(registratu);
		signUpPane.add(hasiSahioa);
		signUpPane.add(pasahitza);
		signUpPane.add(pasahitza);
		
		//panelera gehitu objetuak signIn
		signInPane.add(sahioaSartu);
		signInPane.add(erabiltzaileaSartu);
		signInPane.add(pasahitzaSartu);
		signInPane.add(txtErabiltzailea);
		signInPane.add(txtPasahitzaIn);
		
	}
	
	//erabiltzailearen izena eta pasahitza gorde String batean
	String user,pass;
	
	//signUp eta signIn-en JPanel-ak sortu
	JPanel signInPane = new JPanel();
	JPanel signUpPane = new JPanel();
	
}