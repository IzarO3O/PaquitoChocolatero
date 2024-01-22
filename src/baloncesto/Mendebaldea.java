package ERRONKA;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Scanner;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JMenu;

//Orrialde honetara heltzen da Mendebalde botoia sakatzerakoan Menu orrian
//Gure asmoa da orrialde honetan ateratzea konfrenetziaren 5 taldeak eta bere jokalari hoberenak
public class Mendebaldea extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void mouseClicked(MouseEvent e) {
			}
	
			public void run() {
				try {
					Mendebaldea frame = new Mendebaldea();
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

	public Mendebaldea() {
		setTitle("MENDEBALDE");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 702, 390);
		
		
		//menu bat sortu dugu ipintzeko taldeko izenak
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		
		//Mendebalde konferentziaren 5 taldeak
		JMenuItem mnwNuggets = new JMenuItem("    Nuggets");
		mnwNuggets.setFont(new Font("SansSerif", Font.BOLD, 16));
		menuBar.add(mnwNuggets);
		
		JMenuItem nmwMavericks = new JMenuItem("   Mavericks");
		nmwMavericks.setHorizontalAlignment(SwingConstants.LEFT);
		nmwMavericks.setFont(new Font("SansSerif", Font.BOLD, 16));
		menuBar.add(nmwMavericks);
		
		JMenuItem mnwWarriors = new JMenuItem("    Warriors");
		mnwWarriors.setHorizontalAlignment(SwingConstants.LEFT);
		mnwWarriors.setFont(new Font("SansSerif", Font.BOLD, 16));
		menuBar.add(mnwWarriors);
		
		JMenuItem mnwPelicans = new JMenuItem("      Pelicans");
		mnwPelicans.setFont(new Font("SansSerif", Font.BOLD, 17));
		menuBar.add(mnwPelicans);
		
		JMenu mnNewMenu = new JMenu("");
		menuBar.add(mnNewMenu);
		
		JMenuItem mnwLakers = new JMenuItem("       Lakers");
		mnwLakers.setFont(new Font("SansSerif", Font.BOLD, 16));
		menuBar.add(mnwLakers);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//bere jokalariak
		JLabel lbljalenPickett = new JLabel("Jalen Pickett");
		lbljalenPickett.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lbljalenPickett.setBounds(10, 10, 106, 23);
		contentPane.add(lbljalenPickett);
		
		JLabel NLNikolaJokic = new JLabel("Nikola Jokic");
		NLNikolaJokic.setFont(new Font("SansSerif", Font.PLAIN, 16));
		NLNikolaJokic.setBounds(10, 56, 106, 23);
		contentPane.add(NLNikolaJokic);
		
		JLabel lblJayHuff = new JLabel("Jay Huff");
		lblJayHuff.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblJayHuff.setBounds(26, 102, 131, 23);
		contentPane.add(lblJayHuff);
		
		JLabel lblzekeNnaji = new JLabel("Zeke Nnaji");
		lblzekeNnaji.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblzekeNnaji.setBounds(26, 149, 106, 23);
		contentPane.add(lblzekeNnaji);
		
		JLabel lblJalenPickett = new JLabel("Braxton Key");
		lblJalenPickett.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblJalenPickett.setBounds(10, 192, 106, 23);
		contentPane.add(lblJalenPickett);
		
		
		//botoi bat sortu egin dugu sakatzerakoan eramateko beste orrialde batera, kasu honetan, estadistikak
		JButton btnnm = new JButton("Jarraitu");
		btnnm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Estatistikaak newframe = new Estatistikaak();
				newframe.setVisible(true);
			}
		});

	
		JLabel lblKyrieIrving = new JLabel("Kyrie Irving");
		lblKyrieIrving.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblKyrieIrving.setBounds(158, 56, 106, 23);
		contentPane.add(lblKyrieIrving);
		
		JLabel lblGrantWilliams = new JLabel("Grant Williams");
		lblGrantWilliams.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblGrantWilliams.setBounds(144, 102, 106, 23);
		contentPane.add(lblGrantWilliams);
		
		JLabel lblDerricJones = new JLabel("Derric Jones ");
		lblDerricJones.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblDerricJones.setBounds(144, 149, 106, 23);
		contentPane.add(lblDerricJones);
		
		JLabel lblDereckLively = new JLabel("Dereck Lively");
		lblDereckLively.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblDereckLively.setBounds(144, 192, 106, 23);
		contentPane.add(lblDereckLively);
		
		JLabel lblLukaDoncic = new JLabel("Luka Doncic");
		lblLukaDoncic.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblLukaDoncic.setBounds(158, 10, 106, 23);
		contentPane.add(lblLukaDoncic);
		
		table = new JTable();
		table.setBounds(92, 357, 0, 0);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(249, 317, 1, 1);
		contentPane.add(table_1);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(126, -27, 58, 257);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(260, -27, 58, 257);
		contentPane.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_1.setBounds(401, -27, 58, 257);
		contentPane.add(separator_1_1);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_1_1.setBounds(554, -27, 58, 257);
		contentPane.add(separator_1_1_1);
		
		JSeparator separator_1_1_2 = new JSeparator();
		separator_1_1_2.setBounds(10, 230, 675, 11);
		contentPane.add(separator_1_1_2);
		
		JSeparator separator_1_1_2_1 = new JSeparator();
		separator_1_1_2_1.setBounds(-12, 187, 697, 11);
		contentPane.add(separator_1_1_2_1);
		
		JSeparator separator_1_1_2_2 = new JSeparator();
		separator_1_1_2_2.setBounds(0, 135, 685, 11);
		contentPane.add(separator_1_1_2_2);
		
		JSeparator separator_1_1_2_3 = new JSeparator();
		separator_1_1_2_3.setBounds(0, 89, 688, 11);
		contentPane.add(separator_1_1_2_3);
		
		JSeparator separator_1_1_2_4 = new JSeparator();
		separator_1_1_2_4.setBounds(0, 43, 688, 11);
		contentPane.add(separator_1_1_2_4);
		
		JLabel lblStephenCurry = new JLabel("Stephen Curry");
		lblStephenCurry.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblStephenCurry.setBounds(285, 10, 106, 23);
		contentPane.add(lblStephenCurry);
		
		JLabel lblLukaDoncic_2 = new JLabel("Klay Thompson");
		lblLukaDoncic_2.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblLukaDoncic_2.setBounds(274, 56, 117, 23);
		contentPane.add(lblLukaDoncic_2);
		
		JLabel lblLukaDoncic_3 = new JLabel("Draymond Green");
		lblLukaDoncic_3.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblLukaDoncic_3.setBounds(274, 102, 131, 23);
		contentPane.add(lblLukaDoncic_3);
		
		JLabel lblLukaDoncic_4 = new JLabel("Chirs Paul");
		lblLukaDoncic_4.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblLukaDoncic_4.setBounds(285, 149, 106, 23);
		contentPane.add(lblLukaDoncic_4);
		
		JLabel lblLukaDoncic_5 = new JLabel("Andrew Wiggins");
		lblLukaDoncic_5.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblLukaDoncic_5.setBounds(271, 192, 120, 23);
		contentPane.add(lblLukaDoncic_5);
		
		JLabel lblZionWilliamson = new JLabel("Zion Williamson");
		lblZionWilliamson.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblZionWilliamson.setBounds(421, 10, 120, 23);
		contentPane.add(lblZionWilliamson);
		
		JLabel lblBrandonIngram = new JLabel("Brandon Ingram");
		lblBrandonIngram.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblBrandonIngram.setBounds(424, 56, 120, 23);
		contentPane.add(lblBrandonIngram);
		
		JLabel lblJordanHawkins = new JLabel("Jordan Hawkins");
		lblJordanHawkins.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblJordanHawkins.setBounds(421, 102, 122, 23);
		contentPane.add(lblJordanHawkins);
		
		JLabel lblHerbertJones = new JLabel("Herbert Jones ");
		lblHerbertJones.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHerbertJones.setBounds(421, 149, 106, 23);
		contentPane.add(lblHerbertJones);
		
		JLabel lblDereckLively_5 = new JLabel("Jonas Valanciunas");
		lblDereckLively_5.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblDereckLively_5.setBounds(413, 192, 131, 23);
		contentPane.add(lblDereckLively_5);
		
		JLabel lblDereckLively_1_1 = new JLabel("LeBron James");
		lblDereckLively_1_1.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblDereckLively_1_1.setBounds(569, 10, 106, 23);
		contentPane.add(lblDereckLively_1_1);
		
		JLabel lblDereckLively_1_1_1 = new JLabel("Anthony Davis");
		lblDereckLively_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblDereckLively_1_1_1.setBounds(579, 56, 106, 23);
		contentPane.add(lblDereckLively_1_1_1);
		
		JLabel lblDereckLively_1_1_2 = new JLabel("Austin Reaves");
		lblDereckLively_1_1_2.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblDereckLively_1_1_2.setBounds(579, 102, 106, 23);
		contentPane.add(lblDereckLively_1_1_2);
		
		JLabel lblDereckLively_1_1_3 = new JLabel("D´Angelo Russell ");
		lblDereckLively_1_1_3.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblDereckLively_1_1_3.setBounds(560, 149, 125, 23);
		contentPane.add(lblDereckLively_1_1_3);
		
		JLabel lblDereckLively_1_1_4 = new JLabel("Tauren Prince");
		lblDereckLively_1_1_4.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblDereckLively_1_1_4.setBounds(579, 192, 106, 23);
		contentPane.add(lblDereckLively_1_1_4);
		
		JButton btnJarraitu = new JButton("Jarraitu");
		btnJarraitu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnJarraitu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Estatistikak2 frame = new Estatistikak2();
				frame.setVisible(true);
			}
		});
		btnJarraitu.setBounds(544, 272, 106, 35);
		contentPane.add(btnJarraitu);
		
		
		
		
			}
	}
