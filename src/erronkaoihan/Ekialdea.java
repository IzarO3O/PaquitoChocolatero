package erronkaoihan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Orrialde honetara heltzen da ekialde botoia sakatzerakoan Menu orrian
//Gure asmoa da orrialde honetan ateratzea konfrenetziaren 5 taldeak eta bere jokalari hoberenak

public class Ekialdea extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ekialdea frame = new Ekialdea();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
					
					
					
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ekialdea() {
		setTitle("EKIALDE");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 702, 390);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("");
		menuBar.add(mnNewMenu);
		
		//Ekialdeko konferentziaren 5 taldeak 
		JMenuItem mntmCeltics = new JMenuItem("       Celtics");
		mntmCeltics.setFont(new Font("SansSerif", Font.BOLD, 16));
		menuBar.add(mntmCeltics);
		
		JMenuItem mntm76ers = new JMenuItem("        76ers");
		mntm76ers.setFont(new Font("SansSerif", Font.BOLD, 16));
		menuBar.add(mntm76ers);
		
		JMenuItem mntmHawks = new JMenuItem("       Hawks");
		mntmHawks.setFont(new Font("SansSerif", Font.BOLD, 16));
		menuBar.add(mntmHawks);
		
		JMenuItem mntmMagic = new JMenuItem("       Magic");
		mntmMagic.setFont(new Font("SansSerif", Font.BOLD, 16));
		menuBar.add(mntmMagic);
		
		JMenuItem mntmBucks = new JMenuItem("       Bucks");
		mntmBucks.setHorizontalAlignment(SwingConstants.CENTER);
		mntmBucks.setFont(new Font("SansSerif", Font.BOLD, 16));
		menuBar.add(mntmBucks);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabelJaysontatum = new JLabel("Jayson Tatum");
		lblNewLabelJaysontatum.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblNewLabelJaysontatum.setBounds(26, 10, 106, 23);
		getContentPane().add(lblNewLabelJaysontatum);
		
		JLabel NLjaylenbrown = new JLabel("Jaylen brown");
		NLjaylenbrown.setFont(new Font("SansSerif", Font.PLAIN, 16));
		NLjaylenbrown.setBounds(26, 58, 106, 23);
		getContentPane().add(NLjaylenbrown);
		
		JLabel lblkristapsporzingis = new JLabel("Kristaps Porzingis");
		lblkristapsporzingis.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblkristapsporzingis.setBounds(10, 102, 131, 23);
		getContentPane().add(lblkristapsporzingis);
		
		JLabel lbljrueHoliday = new JLabel("Jrue Holiday");
		lbljrueHoliday.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lbljrueHoliday.setBounds(26, 148, 106, 23);
		getContentPane().add(lbljrueHoliday);
		
		JLabel lblDerrickWhite = new JLabel("Derrick white");
		lblDerrickWhite.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblDerrickWhite.setBounds(26, 191, 106, 23);
		getContentPane().add(lblDerrickWhite);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(142, -30, 12, 257);
		getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(280, -43, 12, 270);
		getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(416, -30, 12, 257);
		getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(547, -18, 12, 247);
		getContentPane().add(separator_3);
		
		JLabel lblJoelEmbiid = new JLabel("Joel Embiid");
		lblJoelEmbiid.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblJoelEmbiid.setBounds(164, 10, 106, 23);
		getContentPane().add(lblJoelEmbiid);
		
		JLabel lblTobiasHarris = new JLabel("Tobias Harris");
		lblTobiasHarris.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblTobiasHarris.setBounds(164, 58, 106, 23);
		getContentPane().add(lblTobiasHarris);
		
		JLabel lblTyereMaxey = new JLabel("Tyrese Maxey");
		lblTyereMaxey.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblTyereMaxey.setBounds(164, 102, 137, 23);
		getContentPane().add(lblTyereMaxey);
		
		JLabel lblKellyOubre = new JLabel("Kelly Oubre");
		lblKellyOubre.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblKellyOubre.setBounds(167, 148, 114, 23);
		getContentPane().add(lblKellyOubre);
		
		JLabel lblPaulreed = new JLabel("Paul reed");
		lblPaulreed.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblPaulreed.setBounds(180, 191, 106, 23);
		getContentPane().add(lblPaulreed);
		
		JLabel lbltraeYoung = new JLabel("Trae Young ");
		lbltraeYoung.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lbltraeYoung.setBounds(302, 10, 106, 23);
		getContentPane().add(lbltraeYoung);
		
		JLabel lblPattyMils = new JLabel("Patty Mils");
		lblPattyMils.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblPattyMils.setBounds(302, 58, 106, 23);
		getContentPane().add(lblPattyMils);
		
		JLabel lblKobeBufkin = new JLabel("Kobe Bufkin");
		lblKobeBufkin.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblKobeBufkin.setBounds(302, 102, 106, 23);
		getContentPane().add(lblKobeBufkin);
		
		JLabel lblMilesNorris = new JLabel("Miles Norris");
		lblMilesNorris.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblMilesNorris.setBounds(302, 148, 106, 23);
		getContentPane().add(lblMilesNorris);
		
		JLabel lblSethLundy = new JLabel("Seth Lundy");
		lblSethLundy.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblSethLundy.setBounds(302, 191, 106, 23);
		getContentPane().add(lblSethLundy);
		
		JLabel lblColeAnthony = new JLabel("Cole Anthony");
		lblColeAnthony.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblColeAnthony.setBounds(435, 10, 106, 23);
		getContentPane().add(lblColeAnthony);
		
		JLabel lblJalenSuggs = new JLabel("Jalen Suggs");
		lblJalenSuggs.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblJalenSuggs.setBounds(435, 58, 86, 23);
		getContentPane().add(lblJalenSuggs);
		
		JLabel lblGaryHarris = new JLabel("Gary Harris");
		lblGaryHarris.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblGaryHarris.setBounds(435, 102, 106, 23);
		getContentPane().add(lblGaryHarris);
		
		JLabel lblJoeIngles = new JLabel("Joe Ingles");
		lblJoeIngles.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblJoeIngles.setBounds(453, 148, 106, 23);
		getContentPane().add(lblJoeIngles);
		
		JLabel lblNCalebHoustan = new JLabel("Caleb Houstan ");
		lblNCalebHoustan.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblNCalebHoustan.setBounds(431, 191, 128, 23);
		getContentPane().add(lblNCalebHoustan);
		
		JLabel lblBrookLopez = new JLabel("Brook Lopez");
		lblBrookLopez.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBrookLopez.setBounds(569, 10, 106, 23);
		getContentPane().add(lblBrookLopez);
		
		JLabel lblBobbyPortis = new JLabel("Bobby Portis");
		lblBobbyPortis.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBobbyPortis.setBounds(569, 58, 106, 23);
		getContentPane().add(lblBobbyPortis);
		
		JLabel lblMalikBeasley = new JLabel("Malik Beasley");
		lblMalikBeasley.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblMalikBeasley.setBounds(569, 102, 106, 23);
		getContentPane().add(lblMalikBeasley);
		
		JLabel lblAJGreen = new JLabel("A.J. Green");
		lblAJGreen.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAJGreen.setBounds(582, 148, 106, 23);
		getContentPane().add(lblAJGreen);
		
		JLabel lblDamianLillard = new JLabel("Damian Lillard");
		lblDamianLillard.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblDamianLillard.setBounds(569, 191, 106, 23);
		getContentPane().add(lblDamianLillard);
		
		
		JSeparator separator_1_1_2_2 = new JSeparator();
		separator_1_1_2_2.setBounds(0, 228, 688, 11);
		getContentPane().add(separator_1_1_2_2);
		
		JSeparator separator_1_1_2_2_1 = new JSeparator();
		separator_1_1_2_2_1.setBounds(-31, 181, 719, 11);
		getContentPane().add(separator_1_1_2_2_1);
		
		JSeparator separator_1_1_2_2_2 = new JSeparator();
		separator_1_1_2_2_2.setBounds(-76, 135, 764, 11);
		getContentPane().add(separator_1_1_2_2_2);
		
		JSeparator separator_1_1_2_2_3 = new JSeparator();
		separator_1_1_2_2_3.setBounds(-57, 91, 745, 11);
		getContentPane().add(separator_1_1_2_2_3);
		
		JSeparator separator_1_1_2_2_4 = new JSeparator();
		separator_1_1_2_2_4.setBounds(-57, 43, 745, 11);
		getContentPane().add(separator_1_1_2_2_4);
		
		JButton btnJarraitu = new JButton("Jarraitu");
		btnJarraitu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnJarraitu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Estatistikaak frame = new Estatistikaak();
				frame.setVisible(true);
			}
		});
		btnJarraitu.setBounds(544, 272, 106, 35);
		getContentPane().add(btnJarraitu);
	
		
	}
}