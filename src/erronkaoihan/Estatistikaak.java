package erronkaoihan;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JTextArea;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Estatistikaak extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estatistikaak frame = new Estatistikaak();
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
	public Estatistikaak() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 742, 771);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
	
		
		JMenuItem mntmTaldea = new JMenuItem("         TALDEAK");
		mntmTaldea.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mntmTaldea);
		mntmTaldea.setFont(new Font("SansSerif", Font.BOLD, 13));
		
		
		JMenuItem mntmJokalaria = new JMenuItem("   JOKALARI IZENA");
		mntmJokalaria.setFont(new Font("SansSerif", Font.BOLD, 13));
		menuBar.add(mntmJokalaria);
		
		JLabel lblNewLabel = new JLabel("");
		menuBar.add(lblNewLabel);
		
		JMenuItem mntmHirukoitz = new JMenuItem("        HIRUKOITZAK");
		mntmHirukoitz.setFont(new Font("SansSerif", Font.BOLD, 13));
		menuBar.add(mntmHirukoitz);
		
		JMenuItem mntmBikoitz = new JMenuItem("          BIKOITZAK");
		mntmBikoitz.setFont(new Font("SansSerif", Font.BOLD, 13));
		menuBar.add(mntmBikoitz);
		
		JMenuItem mntmAske = new JMenuItem("              ASKEAK");
		mntmAske.setFont(new Font("SansSerif", Font.BOLD, 13));
		menuBar.add(mntmAske);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(136, 0, 29, 709);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(305, -27, 10, 860);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(424, -27, 10, 872);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(587, -27, 10, 846);
		contentPane.add(separator_3);
		
		JLabel lblJaysontatum = new JLabel("Jayson Tatum");
		lblJaysontatum.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblJaysontatum.setBounds(175, 0, 106, 33);
		contentPane.add(lblJaysontatum);
		
		JLabel NLjaylenbrown = new JLabel("Jaylen Brown");
		NLjaylenbrown.setFont(new Font("SansSerif", Font.PLAIN, 16));
		NLjaylenbrown.setBounds(175, 36, 106, 40);
		contentPane.add(NLjaylenbrown);
		
		JLabel lblKristapsPorzingis = new JLabel("Kristaps Porzingis");
		lblKristapsPorzingis.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblKristapsPorzingis.setBounds(164, 75, 131, 40);
		contentPane.add(lblKristapsPorzingis);
		
		JLabel lblJrueHoliday = new JLabel("Jrue Holiday");
		lblJrueHoliday.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblJrueHoliday.setBounds(175, 118, 106, 40);
		contentPane.add(lblJrueHoliday);
		
		JLabel lblDerrickWhite = new JLabel("Derrick White");
		lblDerrickWhite.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblDerrickWhite.setBounds(175, 156, 106, 33);
		contentPane.add(lblDerrickWhite);
		
		JLabel lblJoelEmbid = new JLabel("Joel Embiid");
		lblJoelEmbid.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblJoelEmbid.setBounds(175, 189, 106, 33);
		contentPane.add(lblJoelEmbid);
		
		JLabel lblTobiasHarris = new JLabel("Tobias Harris");
		lblTobiasHarris.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblTobiasHarris.setBounds(175, 222, 106, 33);
		contentPane.add(lblTobiasHarris);
		
		JLabel lblTyreseMaxey = new JLabel("Tyrese Maxey");
		lblTyreseMaxey.setHorizontalAlignment(SwingConstants.CENTER);
		lblTyreseMaxey.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblTyreseMaxey.setBounds(136, 255, 167, 33);
		contentPane.add(lblTyreseMaxey);
		
		JLabel lblKellyOubre = new JLabel("Kelly Oubre");
		lblKellyOubre.setHorizontalAlignment(SwingConstants.CENTER);
		lblKellyOubre.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblKellyOubre.setBounds(136, 288, 167, 33);
		contentPane.add(lblKellyOubre);
		
		JLabel lblPaulReed = new JLabel("Paul Reed");
		lblPaulReed.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaulReed.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblPaulReed.setBounds(136, 324, 173, 40);
		contentPane.add(lblPaulReed);
		
		JLabel lblTraeYoung = new JLabel("Trae Young ");
		lblTraeYoung.setHorizontalAlignment(SwingConstants.CENTER);
		lblTraeYoung.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblTraeYoung.setBounds(136, 362, 167, 35);
		contentPane.add(lblTraeYoung);
		
		JLabel lblPattyMils = new JLabel("Patty Mils");
		lblPattyMils.setHorizontalAlignment(SwingConstants.CENTER);
		lblPattyMils.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblPattyMils.setBounds(136, 397, 167, 33);
		contentPane.add(lblPattyMils);
		
		JLabel lblKobebufkin = new JLabel("Kobe Bufkin");
		lblKobebufkin.setHorizontalAlignment(SwingConstants.CENTER);
		lblKobebufkin.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblKobebufkin.setBounds(136, 428, 167, 35);
		contentPane.add(lblKobebufkin);
		
		JLabel lblMilesNorriss = new JLabel("Miles Norris");
		lblMilesNorriss.setHorizontalAlignment(SwingConstants.CENTER);
		lblMilesNorriss.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblMilesNorriss.setBounds(136, 463, 167, 33);
		contentPane.add(lblMilesNorriss);
		
		JLabel lblSethLundy = new JLabel("Seth Lundy");
		lblSethLundy.setHorizontalAlignment(SwingConstants.CENTER);
		lblSethLundy.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblSethLundy.setBounds(136, 495, 168, 37);
		contentPane.add(lblSethLundy);
		
		JLabel lblColeAnthony = new JLabel("Cole Anthony");
		lblColeAnthony.setHorizontalAlignment(SwingConstants.CENTER);
		lblColeAnthony.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblColeAnthony.setBounds(136, 542, 172, 31);
		contentPane.add(lblColeAnthony);
		
		JLabel lblJalenSuggs = new JLabel("Jalen Suggs");
		lblJalenSuggs.setHorizontalAlignment(SwingConstants.CENTER);
		lblJalenSuggs.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblJalenSuggs.setBounds(136, 575, 167, 31);
		contentPane.add(lblJalenSuggs);
		
		JLabel lblGaryHarris = new JLabel("Gary Harris");
		lblGaryHarris.setHorizontalAlignment(SwingConstants.CENTER);
		lblGaryHarris.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblGaryHarris.setBounds(136, 611, 167, 33);
		contentPane.add(lblGaryHarris);
		
		JLabel lblJoeIngles = new JLabel("Joe Ingles");
		lblJoeIngles.setHorizontalAlignment(SwingConstants.CENTER);
		lblJoeIngles.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblJoeIngles.setBounds(136, 639, 166, 33);
		contentPane.add(lblJoeIngles);
		
		JLabel lblCalebHoustan = new JLabel("Caleb Houstan ");
		lblCalebHoustan.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalebHoustan.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblCalebHoustan.setBounds(136, 672, 167, 37);
		contentPane.add(lblCalebHoustan);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		separator_4.setBounds(136, 76, 808, 13);
		contentPane.add(separator_4);
		
		JSeparator separator_4_1 = new JSeparator();
		separator_4_1.setBounds(161, 76, 955, 13);
		contentPane.add(separator_4_1);
		
		JSeparator separator_4_3 = new JSeparator();
		separator_4_3.setBounds(136, 156, 767, 13);
		contentPane.add(separator_4_3);
		
		JSeparator separator_4_4 = new JSeparator();
		separator_4_4.setBounds(0, 189, 949, 13);
		contentPane.add(separator_4_4);
		
		JSeparator separator_4_5 = new JSeparator();
		separator_4_5.setBounds(136, 222, 796, 13);
		contentPane.add(separator_4_5);
		
		JSeparator separator_4_6 = new JSeparator();
		separator_4_6.setBounds(136, 256, 796, 13);
		contentPane.add(separator_4_6);
		
		JSeparator separator_4_7 = new JSeparator();
		separator_4_7.setBounds(136, 288, 796, 13);
		contentPane.add(separator_4_7);
		
		JSeparator separator_4_8 = new JSeparator();
		separator_4_8.setBounds(136, 322, 796, 13);
		contentPane.add(separator_4_8);
		
		JSeparator separator_4_9 = new JSeparator();
		separator_4_9.setBounds(-22, 362, 955, 13);
		contentPane.add(separator_4_9);
		
		JSeparator separator_4_10 = new JSeparator();
		separator_4_10.setBounds(136, 395, 796, 13);
		contentPane.add(separator_4_10);
		
		JSeparator separator_4_11 = new JSeparator();
		separator_4_11.setBounds(136, 428, 796, 13);
		contentPane.add(separator_4_11);
		
		JSeparator separator_4_12 = new JSeparator();
		separator_4_12.setBounds(136, 462, 796, 13);
		contentPane.add(separator_4_12);
		
		JSeparator separator_4_13 = new JSeparator();
		separator_4_13.setBounds(136, 495, 796, 13);
		contentPane.add(separator_4_13);
		
		JSeparator separator_4_14 = new JSeparator();
		separator_4_14.setBounds(0, 542, 932, 13);
		contentPane.add(separator_4_14);
		
		JSeparator separator_4_15 = new JSeparator();
		separator_4_15.setBounds(0, 542, 932, 13);
		contentPane.add(separator_4_15);
		
		JSeparator separator_4_16 = new JSeparator();
		separator_4_16.setBounds(136, 575, 796, 13);
		contentPane.add(separator_4_16);
		
		JSeparator separator_4_17 = new JSeparator();
		separator_4_17.setBounds(136, 608, 796, 13);
		contentPane.add(separator_4_17);
		
		JSeparator separator_4_18 = new JSeparator();
		separator_4_18.setBounds(136, 641, 796, 13);
		contentPane.add(separator_4_18);
		
		JSeparator separator_4_19 = new JSeparator();
		separator_4_19.setBounds(136, 674, 796, 13);
		contentPane.add(separator_4_19);
		
		JSeparator separator_4_20 = new JSeparator();
		separator_4_20.setBounds(0, 711, 932, 13);
		contentPane.add(separator_4_20);
		
		JLabel lblHirukoitz_2 = new JLabel("5");
		lblHirukoitz_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHirukoitz_2.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHirukoitz_2.setBounds(305, 10, 118, 23);
		contentPane.add(lblHirukoitz_2);
		
		JLabel lblHirukoitz_1 = new JLabel("5");
		lblHirukoitz_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHirukoitz_1.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHirukoitz_1.setBounds(305, 43, 118, 23);
		contentPane.add(lblHirukoitz_1);
		
		JLabel lblHirukoitz_3 = new JLabel("3");
		lblHirukoitz_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblHirukoitz_3.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHirukoitz_3.setBounds(305, 85, 118, 23);
		contentPane.add(lblHirukoitz_3);
		
		JLabel lblHirukoitz_4 = new JLabel("1");
		lblHirukoitz_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblHirukoitz_4.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHirukoitz_4.setBounds(305, 123, 118, 23);
		contentPane.add(lblHirukoitz_4);
		
		JLabel lblHirukoitz_5 = new JLabel("0");
		lblHirukoitz_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblHirukoitz_5.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHirukoitz_5.setBounds(305, 156, 118, 23);
		contentPane.add(lblHirukoitz_5);
		
		JLabel lblHirukoitz_6 = new JLabel("2");
		lblHirukoitz_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblHirukoitz_6.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHirukoitz_6.setBounds(305, 189, 118, 23);
		contentPane.add(lblHirukoitz_6);
		
		JLabel lblHirukoitz_7 = new JLabel("3");
		lblHirukoitz_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblHirukoitz_7.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHirukoitz_7.setBounds(305, 223, 118, 32);
		contentPane.add(lblHirukoitz_7);
		
		JLabel lblHirukoitz_8 = new JLabel("2");
		lblHirukoitz_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblHirukoitz_8.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHirukoitz_8.setBounds(305, 260, 118, 23);
		contentPane.add(lblHirukoitz_8);
		
		JLabel lblHirukoitz_9 = new JLabel("0");
		lblHirukoitz_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblHirukoitz_9.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHirukoitz_9.setBounds(305, 293, 118, 23);
		contentPane.add(lblHirukoitz_9);
		
		JLabel lblHirukoitz_10 = new JLabel("1");
		lblHirukoitz_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblHirukoitz_10.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHirukoitz_10.setBounds(305, 323, 118, 40);
		contentPane.add(lblHirukoitz_10);
		
		JLabel lblHirukoitz_11 = new JLabel("6");
		lblHirukoitz_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblHirukoitz_11.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHirukoitz_11.setBounds(305, 368, 118, 23);
		contentPane.add(lblHirukoitz_11);
		
		JLabel lblHirukoitz_12 = new JLabel("1");
		lblHirukoitz_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblHirukoitz_12.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHirukoitz_12.setBounds(305, 397, 118, 28);
		contentPane.add(lblHirukoitz_12);
		
		JLabel lblHirukoitz_13 = new JLabel("3");
		lblHirukoitz_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblHirukoitz_13.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHirukoitz_13.setBounds(305, 433, 118, 30);
		contentPane.add(lblHirukoitz_13);
		
		JLabel lblHirukoitz_14 = new JLabel("2");
		lblHirukoitz_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblHirukoitz_14.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHirukoitz_14.setBounds(305, 463, 118, 33);
		contentPane.add(lblHirukoitz_14);
		
		JLabel lblHirukoitz_15 = new JLabel("0");
		lblHirukoitz_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblHirukoitz_15.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHirukoitz_15.setBounds(305, 495, 118, 45);
		contentPane.add(lblHirukoitz_15);
		
		JLabel lblHirukoitz_16 = new JLabel("3");
		lblHirukoitz_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblHirukoitz_16.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHirukoitz_16.setBounds(305, 542, 118, 31);
		contentPane.add(lblHirukoitz_16);
		
		JLabel lblBikoitz_1 = new JLabel("8");
		lblBikoitz_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBikoitz_1.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBikoitz_1.setBounds(430, 0, 158, 33);
		contentPane.add(lblBikoitz_1);
		
		JLabel lblAske_20 = new JLabel("5");
		lblAske_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblAske_20.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAske_20.setBounds(587, 0, 141, 40);
		contentPane.add(lblAske_20);
		
		JLabel lblCeltics = new JLabel("Celtics");
		lblCeltics.setHorizontalAlignment(SwingConstants.CENTER);
		lblCeltics.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblCeltics.setBounds(0, 0, 138, 189);
		contentPane.add(lblCeltics);
		
		JSeparator separator_4_3_1 = new JSeparator();
		separator_4_3_1.setBounds(136, 38, 767, 13);
		contentPane.add(separator_4_3_1);
		
		JSeparator separator_4_2 = new JSeparator();
		separator_4_2.setBounds(136, 118, 808, 13);
		contentPane.add(separator_4_2);
		
		JLabel lbl76ers = new JLabel("76ers");
		lbl76ers.setHorizontalAlignment(SwingConstants.CENTER);
		lbl76ers.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lbl76ers.setBounds(0, 192, 138, 163);
		contentPane.add(lbl76ers);
		
		JLabel lblHawks = new JLabel("Hawks");
		lblHawks.setHorizontalAlignment(SwingConstants.CENTER);
		lblHawks.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHawks.setBounds(0, 362, 138, 178);
		contentPane.add(lblHawks);
		
		JLabel lblMagic = new JLabel("Magic");
		lblMagic.setHorizontalAlignment(SwingConstants.CENTER);
		lblMagic.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblMagic.setBounds(0, 542, 138, 167);
		contentPane.add(lblMagic);
		
		JLabel lblHirukoitz_17 = new JLabel("1");
		lblHirukoitz_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblHirukoitz_17.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHirukoitz_17.setBounds(305, 575, 118, 31);
		contentPane.add(lblHirukoitz_17);
		
		JLabel lblHirukoitz_18 = new JLabel("3");
		lblHirukoitz_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblHirukoitz_18.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHirukoitz_18.setBounds(305, 640, 118, 31);
		contentPane.add(lblHirukoitz_18);
		
		JLabel lblHirukoitz_19 = new JLabel("1");
		lblHirukoitz_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblHirukoitz_19.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHirukoitz_19.setBounds(305, 678, 118, 31);
		contentPane.add(lblHirukoitz_19);
		
		JLabel lblHirukoitz_20 = new JLabel("2");
		lblHirukoitz_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblHirukoitz_20.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHirukoitz_20.setBounds(305, 611, 118, 31);
		contentPane.add(lblHirukoitz_20);
		
		JLabel lblAske_19 = new JLabel("2");
		lblAske_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblAske_19.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAske_19.setBounds(587, 40, 141, 33);
		contentPane.add(lblAske_19);
		
		JLabel lblBikoitz_2 = new JLabel("6");
		lblBikoitz_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBikoitz_2.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBikoitz_2.setBounds(424, 43, 167, 33);
		contentPane.add(lblBikoitz_2);
		
		JLabel lblBikoitz_3 = new JLabel("8");
		lblBikoitz_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblBikoitz_3.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBikoitz_3.setBounds(424, 75, 167, 40);
		contentPane.add(lblBikoitz_3);
		
		JLabel lblBikoitz_4 = new JLabel("7");
		lblBikoitz_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblBikoitz_4.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBikoitz_4.setBounds(424, 118, 167, 33);
		contentPane.add(lblBikoitz_4);
		
		JLabel lblBikoitz_5 = new JLabel("5");
		lblBikoitz_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblBikoitz_5.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBikoitz_5.setBounds(424, 156, 167, 33);
		contentPane.add(lblBikoitz_5);
		
		JLabel lblBikoitz_6 = new JLabel("11");
		lblBikoitz_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblBikoitz_6.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBikoitz_6.setBounds(424, 189, 167, 33);
		contentPane.add(lblBikoitz_6);
		
		JLabel lblBikoitz_7 = new JLabel("4");
		lblBikoitz_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblBikoitz_7.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBikoitz_7.setBounds(424, 222, 167, 33);
		contentPane.add(lblBikoitz_7);
		
		JLabel lblBikoitz_8 = new JLabel("5");
		lblBikoitz_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblBikoitz_8.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBikoitz_8.setBounds(424, 255, 167, 33);
		contentPane.add(lblBikoitz_8);
		
		JLabel lblBikoitz_9 = new JLabel("4");
		lblBikoitz_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblBikoitz_9.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBikoitz_9.setBounds(424, 288, 167, 33);
		contentPane.add(lblBikoitz_9);
		
		JLabel lblBikoitz_10 = new JLabel("6");
		lblBikoitz_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblBikoitz_10.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBikoitz_10.setBounds(424, 324, 167, 33);
		contentPane.add(lblBikoitz_10);
		
		JLabel lblBikoitz_11 = new JLabel("3");
		lblBikoitz_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblBikoitz_11.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBikoitz_11.setBounds(424, 362, 167, 33);
		contentPane.add(lblBikoitz_11);
		
		JLabel lblBikoitz_12 = new JLabel("5");
		lblBikoitz_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblBikoitz_12.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBikoitz_12.setBounds(424, 397, 167, 33);
		contentPane.add(lblBikoitz_12);
		
		JLabel lblBikoitz_13 = new JLabel("7");
		lblBikoitz_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblBikoitz_13.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBikoitz_13.setBounds(424, 430, 167, 33);
		contentPane.add(lblBikoitz_13);
		
		JLabel lblBikoitz_14 = new JLabel("2");
		lblBikoitz_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblBikoitz_14.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBikoitz_14.setBounds(424, 463, 167, 33);
		contentPane.add(lblBikoitz_14);
		
		JLabel lblBikoitz_15 = new JLabel("8");
		lblBikoitz_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblBikoitz_15.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBikoitz_15.setBounds(424, 495, 167, 45);
		contentPane.add(lblBikoitz_15);
		
		JLabel lblBikoitz_16 = new JLabel("1");
		lblBikoitz_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblBikoitz_16.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBikoitz_16.setBounds(424, 542, 167, 33);
		contentPane.add(lblBikoitz_16);
		
		JLabel lblBikoitz_17 = new JLabel("3");
		lblBikoitz_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblBikoitz_17.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBikoitz_17.setBounds(424, 575, 167, 33);
		contentPane.add(lblBikoitz_17);
		
		JLabel lblBikoitz_18 = new JLabel("7");
		lblBikoitz_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblBikoitz_18.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBikoitz_18.setBounds(424, 611, 167, 33);
		contentPane.add(lblBikoitz_18);
		
		JLabel lblBikoitz_19 = new JLabel("4");
		lblBikoitz_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblBikoitz_19.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBikoitz_19.setBounds(424, 639, 167, 33);
		contentPane.add(lblBikoitz_19);
		
		JLabel lblBikoitz_20 = new JLabel("0");
		lblBikoitz_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblBikoitz_20.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBikoitz_20.setBounds(424, 672, 167, 33);
		contentPane.add(lblBikoitz_20);
		
		JLabel lblAske_1 = new JLabel("1");
		lblAske_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAske_1.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAske_1.setBounds(587, 82, 141, 33);
		contentPane.add(lblAske_1);
		
		JLabel lblAske_2 = new JLabel("1");
		lblAske_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAske_2.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAske_2.setBounds(587, 118, 141, 33);
		contentPane.add(lblAske_2);
		
		JLabel lblAske_3 = new JLabel("6");
		lblAske_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblAske_3.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAske_3.setBounds(587, 156, 141, 33);
		contentPane.add(lblAske_3);
		
		JLabel lblAske_4 = new JLabel("0");
		lblAske_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblAske_4.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAske_4.setBounds(587, 189, 141, 33);
		contentPane.add(lblAske_4);
		
		JLabel lblAske_5 = new JLabel("2");
		lblAske_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblAske_5.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAske_5.setBounds(587, 222, 141, 33);
		contentPane.add(lblAske_5);
		
		JLabel lblAske_6 = new JLabel("3");
		lblAske_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblAske_6.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAske_6.setBounds(587, 255, 141, 33);
		contentPane.add(lblAske_6);
		
		JLabel lblAske_7 = new JLabel("4");
		lblAske_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblAske_7.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAske_7.setBounds(587, 288, 141, 33);
		contentPane.add(lblAske_7);
		
		JLabel lblAske_8 = new JLabel("1");
		lblAske_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblAske_8.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAske_8.setBounds(587, 324, 141, 40);
		contentPane.add(lblAske_8);
		
		JLabel lblAske_9 = new JLabel("4");
		lblAske_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblAske_9.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAske_9.setBounds(587, 362, 141, 33);
		contentPane.add(lblAske_9);
		
		JLabel lblAske_10 = new JLabel("3");
		lblAske_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblAske_10.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAske_10.setBounds(587, 397, 141, 33);
		contentPane.add(lblAske_10);
		
		JLabel lblAske_11 = new JLabel("2");
		lblAske_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblAske_11.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAske_11.setBounds(587, 430, 141, 33);
		contentPane.add(lblAske_11);
		
		JLabel lblAske_12 = new JLabel("1");
		lblAske_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblAske_12.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAske_12.setBounds(587, 463, 141, 33);
		contentPane.add(lblAske_12);
		
		JLabel lblAske_13 = new JLabel("0");
		lblAske_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblAske_13.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAske_13.setBounds(587, 495, 141, 45);
		contentPane.add(lblAske_13);
		
		JLabel lblAske_14 = new JLabel("3");
		lblAske_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblAske_14.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAske_14.setBounds(587, 542, 141, 33);
		contentPane.add(lblAske_14);
		
		JLabel lblAske_15 = new JLabel("1");
		lblAske_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblAske_15.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAske_15.setBounds(587, 575, 141, 33);
		contentPane.add(lblAske_15);
		
		JLabel lblAske_16 = new JLabel("2");
		lblAske_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblAske_16.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAske_16.setBounds(587, 611, 141, 33);
		contentPane.add(lblAske_16);
		
		JLabel lblAske_17 = new JLabel("3");
		lblAske_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblAske_17.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAske_17.setBounds(587, 639, 141, 33);
		contentPane.add(lblAske_17);
		
		JLabel lblAske_18 = new JLabel("4");
		lblAske_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblAske_18.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblAske_18.setBounds(587, 672, 141, 33);
		contentPane.add(lblAske_18);
		
		
		
	}
	private void setPreferredSize(int i, int j) {
		// TODO Auto-generated method stub	
	}
}