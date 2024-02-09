package erronka2;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Choice;
import java.awt.Button;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * 
 */
public class Denboraldiak extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean jaur3 = false;
	public static DefaultListModel model ;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTable table_7;
	private JTable table_8;
	private JTable table_9;
	
	public int chi1 = 0;
	public int che1 = 0;
	public int chg1 = 0;
	public int cci1 = 0;
	public int cce1 = 0;
	public int ccg1 = 0;
	public int bci1 = 0;
	public int bce1 = 0;
	public int bcg1 = 0;
	public int bni1 = 0;
	public int bne1 = 0;
	public int bng1 = 0;
	public int ahi1 = 0;
	public int ahe1 = 0;
	public int ahg1 = 0;
	public int cbi1 = 0;
	public int cbe1 = 0;
	public int cbg1 = 0;
	
	public int chi2 = 0;
	public int che2 = 0;
	public int chg2 = 0;
	public int cci2 = 0;
	public int cce2 = 0;
	public int ccg2 = 0;
	public int bci2 = 0;
	public int bce2 = 0;
	public int bcg2 = 0;
	public int bni2 = 0;
	public int bne2 = 0;
	public int bng2 = 0;
	public int ahi2 = 0;
	public int ahe2 = 0;
	public int ahg2 = 0;
	public int cbi2 = 0;
	public int cbe2 = 0;
	public int cbg2 = 0;
	
	public int chi3 = 0;
	public int che3 = 0;
	public int chg3 = 0;
	public int cci3 = 0;
	public int cce3 = 0;
	public int ccg3 = 0;
	public int bci3 = 0;
	public int bce3 = 0;
	public int bcg3 = 0;
	public int bni3 = 0;
	public int bne3 = 0;
	public int bng3 = 0;
	public int ahi3 = 0;
	public int ahe3 = 0;
	public int ahg3 = 0;
	public int cbi3 = 0;
	public int cbe3 = 0;
	public int cbg3 = 0;
	
	public int chi4 = 0;
	public int che4 = 0;
	public int chg4 = 0;
	public int cci4 = 0;
	public int cce4 = 0;
	public int ccg4 = 0;
	public int bci4 = 0;
	public int bce4 = 0;
	public int bcg4 = 0;
	public int bni4 = 0;
	public int bne4 = 0;
	public int bng4 = 0;
	public int ahi4 = 0;
	public int ahe4 = 0;
	public int ahg4 = 0;
	public int cbi4 = 0;
	public int cbe4 = 0;
	public int cbg4 = 0;
	
	public int chi5 = 0;
	public int che5 = 0;
	public int chg5 = 0;
	public int cci5 = 0;
	public int cce5 = 0;
	public int ccg5 = 0;
	public int bci5 = 0;
	public int bce5 = 0;
	public int bcg5 = 0;
	public int bni5 = 0;
	public int bne5 = 0;
	public int bng5 = 0;
	public int ahi5 = 0;
	public int ahe5 = 0;
	public int ahg5 = 0;
	public int cbi5 = 0;
	public int cbe5 = 0;
	public int cbg5 = 0;
	
	public static JList list;
	private JButton btnNewButton_3;
	private DefaultComboBoxModel comboBoxModel;
	private DefaultComboBoxModel comboBoxModel1;
	private DefaultComboBoxModel comboBoxModel2;
	private DefaultComboBoxModel comboBoxModel3;
	private DefaultComboBoxModel comboBoxModel4;
	private DefaultComboBoxModel comboBoxModel5;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	
	public static ArrayList<ArrayList<Object>>[] den1 = new ArrayList[6];
	public static ArrayList<Object> den1BC = new ArrayList<>();
	public static ArrayList<Object> den1BN = new ArrayList<>();
	public static ArrayList<Object> den1CB = new ArrayList<>();
	public static ArrayList<Object> den1CC = new ArrayList<>();
	public static ArrayList<Object> den1AH = new ArrayList<>();
	public static ArrayList<Object> den1CH = new ArrayList<>();
	public static ArrayList<ArrayList<Object>>[] den2 = new ArrayList[6];
	public static ArrayList<Object> den2BC = new ArrayList<>();
	public static ArrayList<Object> den2BN = new ArrayList<>();
	public static ArrayList<Object> den2CB = new ArrayList<>();
	public static ArrayList<Object> den2CC = new ArrayList<>();
	public static ArrayList<Object> den2AH = new ArrayList<>();
	public static ArrayList<Object> den2CH = new ArrayList<>();
	public static ArrayList<ArrayList<Object>>[] den3 = new ArrayList[6];
	public static ArrayList<Object> den3BC = new ArrayList<>();
	public static ArrayList<Object> den3BN = new ArrayList<>();
	public static ArrayList<Object> den3CB = new ArrayList<>();
	public static ArrayList<Object> den3CC = new ArrayList<>();
	public static ArrayList<Object> den3AH = new ArrayList<>();
	public static ArrayList<Object> den3CH = new ArrayList<>();
	public static ArrayList<ArrayList<Object>>[] den4 = new ArrayList[6];
	public static ArrayList<Object> den4BC = new ArrayList<>();
	public static ArrayList<Object> den4BN = new ArrayList<>();
	public static ArrayList<Object> den4CB = new ArrayList<>();
	public static ArrayList<Object> den4CC = new ArrayList<>();
	public static ArrayList<Object> den4AH = new ArrayList<>();
	public static ArrayList<Object> den4CH = new ArrayList<>();
	public static ArrayList<ArrayList<Object>>[] den5 = new ArrayList[6];
	public static ArrayList<Object> den5BC = new ArrayList<>();
	public static ArrayList<Object> den5BN = new ArrayList<>();
	public static ArrayList<Object> den5CB = new ArrayList<>();
	public static ArrayList<Object> den5CC = new ArrayList<>();
	public static ArrayList<Object> den5AH = new ArrayList<>();
	public static ArrayList<Object> den5CH = new ArrayList<>();
	
	boolean batDen = false;
	boolean biDen = false;
	boolean hiruDen = false;
	boolean lauDen = false;
	boolean bostDen = false;
	boolean hamarra = false;

	String A = "";
	String B = "";
	String C = "";
	String D = "";
	String E = "";
	String F = "";

	/**
	 * Create the panel.
	 */
	
	public Denboraldiak() {
		setLayout(null);
		
		menu();
	}
	
	public void menu () {
			
//DENB BERRI HASIERA
		setBackground(new Color(255, 0, 128));
		setLayout(null);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 10, 721, 377);
		add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panela = new JPanel();
		panela.setBounds(10, 10, 321, 353);
		panel_2.add(panela);
		panela.setBackground(new Color(255, 128, 192));
		panela.setLayout(null);
		
		
		comboBoxModel = new DefaultComboBoxModel();
		comboBoxModel.addElement("Boston Celtics");
		comboBoxModel.addElement("Brooklyn Nets");
		comboBoxModel.addElement("Chicago Bulls");
		comboBoxModel.addElement("Cleveland Cavaliers");
		comboBoxModel.addElement("Atlanta Hawks");
		comboBoxModel.addElement("Charlotte Hornets");
		
		comboBoxModel1 = new DefaultComboBoxModel();
		comboBoxModel1.addElement("Boston Celtics");
		comboBoxModel1.addElement("Brooklyn Nets");
		comboBoxModel1.addElement("Chicago Bulls");
		comboBoxModel1.addElement("Cleveland Cavaliers");
		comboBoxModel1.addElement("Atlanta Hawks");
		comboBoxModel1.addElement("Charlotte Hornets");
		
		comboBoxModel2 = new DefaultComboBoxModel();
		comboBoxModel2.addElement("Boston Celtics");
		comboBoxModel2.addElement("Brooklyn Nets");
		comboBoxModel2.addElement("Chicago Bulls");
		comboBoxModel2.addElement("Cleveland Cavaliers");
		comboBoxModel2.addElement("Atlanta Hawks");
		comboBoxModel2.addElement("Charlotte Hornets");
		
		comboBoxModel3 = new DefaultComboBoxModel();
		comboBoxModel3.addElement("Boston Celtics");
		comboBoxModel3.addElement("Brooklyn Nets");
		comboBoxModel3.addElement("Chicago Bulls");
		comboBoxModel3.addElement("Cleveland Cavaliers");
		comboBoxModel3.addElement("Atlanta Hawks");
		comboBoxModel3.addElement("Charlotte Hornets");
		
		comboBoxModel4 = new DefaultComboBoxModel();
		comboBoxModel4.addElement("Boston Celtics");
		comboBoxModel4.addElement("Brooklyn Nets");
		comboBoxModel4.addElement("Chicago Bulls");
		comboBoxModel4.addElement("Cleveland Cavaliers");
		comboBoxModel4.addElement("Atlanta Hawks");
		comboBoxModel4.addElement("Charlotte Hornets");
		
		comboBoxModel5 = new DefaultComboBoxModel();
		comboBoxModel5.addElement("Boston Celtics");
		comboBoxModel5.addElement("Brooklyn Nets");
		comboBoxModel5.addElement("Chicago Bulls");
		comboBoxModel5.addElement("Cleveland Cavaliers");
		comboBoxModel5.addElement("Atlanta Hawks");
		comboBoxModel5.addElement("Charlotte Hornets");
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(16, 59, 114, 21);
		panela.add(comboBox);
		comboBox.setModel(comboBoxModel);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(150, 59, 114, 21);
		panela.add(comboBox_1);
		comboBox_1.setModel(comboBoxModel1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(16, 121, 114, 21);
		panela.add(comboBox_2);
		comboBox_2.setModel(comboBoxModel2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(150, 121, 114, 21);
		panela.add(comboBox_3);
		comboBox_3.setModel(comboBoxModel3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(16, 183, 114, 21);
		panela.add(comboBox_4);
		comboBox_4.setModel(comboBoxModel4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(150, 183, 114, 21);
		panela.add(comboBox_5);
		comboBox_5.setModel(comboBoxModel5);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(46, 90, 45, 21);
		panela.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(181, 90, 45, 21);
		panela.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(46, 152, 45, 21);
		panela.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(181, 152, 45, 21);
		panela.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(46, 220, 45, 21);
		panela.add(spinner_4);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(181, 220, 45, 21);
		panela.add(spinner_5);
		

		JButton btnNewButton_2 = new JButton("Generatu");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			comboBox.setSelectedItem("Boston Celtics");	
			comboBox_1.setSelectedItem("Brooklyn Nets");
			comboBox_2.setSelectedItem("Chicago Bulls");
			comboBox_3.setSelectedItem("Cleveland Cavaliers");
			comboBox_4.setSelectedItem("Atlanta Hawks");
			comboBox_5.setSelectedItem("Charlotte Hornets");

			}
		});
		btnNewButton_2.setBounds(16, 273, 75, 21);
		panela.add(btnNewButton_2);
		
		
		JButton btnNewButton_2_1 = new JButton("Gorde");
		//FIN DENBORALDI BERRI
		//HASIERA MENU
		btnNewButton_2_1.setBounds(221, 273, 75, 21);
		panela.add(btnNewButton_2_1);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(374, 23, 337, 204);
		panel_2.add(panel_1);
		panel_1.setBackground(new Color(215, 153, 204));
		panel_1.setLayout(null);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"1. Jaurdunaldia", "2. Jaurdunaldia", "3. Jaurdunaldia", "4. Jaurdunaldia", "5. Jaurdunaldia", "6. Jaurdunaldia", "7. Jaurdunaldia", "8. Jaurdunaldia", "9. Jaurdunaldia", "10. Jaurdunaldia"}));
		comboBox_6.setBounds(76, 61, 200, 50);
		panel_1.add(comboBox_6);
		
		Button button = new Button("Aukeratu");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			if (comboBox_6.getSelectedItem()=="1. Jaurdunaldia") {
				
				comboBox.setSelectedItem(A);
				comboBox_1.setSelectedItem(B);
				comboBox_2.setSelectedItem(C);
				comboBox_3.setSelectedItem(D);
				comboBox_4.setSelectedItem(E);
				comboBox_5.setSelectedItem(F);
				
				spinner.setValue(0);
				spinner_1.setValue(0);
				spinner_2.setValue(0);
				spinner_3.setValue(0);
				spinner_4.setValue(0);
				spinner_5.setValue(0);

			}
				
			else if (comboBox_6.getSelectedItem()=="2. Jaurdunaldia"&&jaur3==false||comboBox_6.getSelectedItem()=="3. Jaurdunaldia"&&jaur3==false||comboBox_6.getSelectedItem()=="4. Jaurdunaldia"&&jaur3==false||comboBox_6.getSelectedItem()=="5. Jaurdunaldia"&&jaur3==false||comboBox_6.getSelectedItem()=="6. Jaurdunaldia"&&jaur3==false||comboBox_6.getSelectedItem()=="7. Jaurdunaldia"&&jaur3==false||comboBox_6.getSelectedItem()=="8. Jaurdunaldia"&&jaur3==false||comboBox_6.getSelectedItem()=="9. Jaurdunaldia"&&jaur3==false||comboBox_6.getSelectedItem()=="10. Jaurdunaldia"&&jaur3==false) {
				JOptionPane.showMessageDialog(new JFrame(), "Lehenengo jaurdunaldua amaitu behar duzu","Error",JOptionPane.WARNING_MESSAGE);

			}else if (comboBox_6.getSelectedItem()=="2. Jaurdunaldia"&&jaur3==true) {
				
				
				comboBox.setSelectedItem(E);
				comboBox_1.setSelectedItem(C);
				comboBox_2.setSelectedItem(D);
				comboBox_3.setSelectedItem(B);
				comboBox_4.setSelectedItem(F);
				comboBox_5.setSelectedItem(A);

				spinner.setEnabled(true);
				spinner_1.setEnabled(true);
				spinner_2.setEnabled(true);
				spinner_3.setEnabled(true);
				spinner_4.setEnabled(true);
				spinner_5.setEnabled(true);
				
				spinner.setValue(0);
				spinner_1.setValue(0);
				spinner_2.setValue(0);
				spinner_3.setValue(0);
				spinner_4.setValue(0);
				spinner_5.setValue(0);
				
				
			}else if (comboBox_6.getSelectedItem()=="3. Jaurdunaldia"&&jaur3==true) {
				comboBox.setSelectedItem(A);
				comboBox_1.setSelectedItem(D);
				comboBox_2.setSelectedItem(C);
				comboBox_3.setSelectedItem(F);
				comboBox_4.setSelectedItem(B);
				comboBox_5.setSelectedItem(E);

				spinner.setEnabled(true);
				spinner_1.setEnabled(true);
				spinner_2.setEnabled(true);
				spinner_3.setEnabled(true);
				spinner_4.setEnabled(true);
				spinner_5.setEnabled(true);
				
				spinner.setValue(0);
				spinner_1.setValue(0);
				spinner_2.setValue(0);
				spinner_3.setValue(0);
				spinner_4.setValue(0);
				spinner_5.setValue(0);
				
				
			
			}else if (comboBox_6.getSelectedItem()=="4. Jaurdunaldia"&&jaur3==true) {
				
				comboBox.setSelectedItem(E);
				comboBox_1.setSelectedItem(D);
				comboBox_2.setSelectedItem(C);
				comboBox_3.setSelectedItem(A);
				comboBox_4.setSelectedItem(F);
				comboBox_5.setSelectedItem(B);

				spinner.setEnabled(true);
				spinner_1.setEnabled(true);
				spinner_2.setEnabled(true);
				spinner_3.setEnabled(true);
				spinner_4.setEnabled(true);
				spinner_5.setEnabled(true);
				
				spinner.setValue(0);
				spinner_1.setValue(0);
				spinner_2.setValue(0);
				spinner_3.setValue(0);
				spinner_4.setValue(0);
				spinner_5.setValue(0);
				
			}else if (comboBox_6.getSelectedItem()=="5. Jaurdunaldia"&&jaur3==true) {
				comboBox.setSelectedItem(B);
				comboBox_1.setSelectedItem(C);
				comboBox_2.setSelectedItem(D);
				comboBox_3.setSelectedItem(F);
				comboBox_4.setSelectedItem(A);
				comboBox_5.setSelectedItem(E);

				spinner.setEnabled(true);
				spinner_1.setEnabled(true);
				spinner_2.setEnabled(true);
				spinner_3.setEnabled(true);
				spinner_4.setEnabled(true);
				spinner_5.setEnabled(true);
				
				spinner.setValue(0);
				spinner_1.setValue(0);
				spinner_2.setValue(0);
				spinner_3.setValue(0);
				spinner_4.setValue(0);
				spinner_5.setValue(0);
				
			}else if (comboBox_6.getSelectedItem()=="6. Jaurdunaldia"&&jaur3==true) {
				comboBox.setSelectedItem(F);
				comboBox_1.setSelectedItem(E);
				comboBox_2.setSelectedItem(D);
				comboBox_3.setSelectedItem(C);
				comboBox_4.setSelectedItem(B);
				comboBox_5.setSelectedItem(A);

				spinner.setEnabled(true);
				spinner_1.setEnabled(true);
				spinner_2.setEnabled(true);
				spinner_3.setEnabled(true);
				spinner_4.setEnabled(true);
				spinner_5.setEnabled(true);
				
				spinner.setValue(0);
				spinner_1.setValue(0);
				spinner_2.setValue(0);
				spinner_3.setValue(0);
				spinner_4.setValue(0);
				spinner_5.setValue(0);
			}else if (comboBox_6.getSelectedItem()=="7. Jaurdunaldia"&&jaur3==true) {
				comboBox.setSelectedItem(C);
				comboBox_1.setSelectedItem(E);
				comboBox_2.setSelectedItem(A);
				comboBox_3.setSelectedItem(F);
				comboBox_4.setSelectedItem(B);
				comboBox_5.setSelectedItem(D);

				spinner.setEnabled(true);
				spinner_1.setEnabled(true);
				spinner_2.setEnabled(true);
				spinner_3.setEnabled(true);
				spinner_4.setEnabled(true);
				spinner_5.setEnabled(true);
				
				spinner.setValue(0);
				spinner_1.setValue(0);
				spinner_2.setValue(0);
				spinner_3.setValue(0);
				spinner_4.setValue(0);
				spinner_5.setValue(0);
			}else if (comboBox_6.getSelectedItem()=="8. Jaurdunaldia"&&jaur3==true) {
				comboBox.setSelectedItem(E);
				comboBox_1.setSelectedItem(B);
				comboBox_2.setSelectedItem(D);
				comboBox_3.setSelectedItem(A);
				comboBox_4.setSelectedItem(F);
				comboBox_5.setSelectedItem(C);

				spinner.setEnabled(true);
				spinner_1.setEnabled(true);
				spinner_2.setEnabled(true);
				spinner_3.setEnabled(true);
				spinner_4.setEnabled(true);
				spinner_5.setEnabled(true);
				
				spinner.setValue(0);
				spinner_1.setValue(0);
				spinner_2.setValue(0);
				spinner_3.setValue(0);
				spinner_4.setValue(0);
				spinner_5.setValue(0);
			}else if (comboBox_6.getSelectedItem()=="9. Jaurdunaldia"&&jaur3==true) {
				comboBox.setSelectedItem(A);
				comboBox_1.setSelectedItem(C);
				comboBox_2.setSelectedItem(B);
				comboBox_3.setSelectedItem(F);
				comboBox_4.setSelectedItem(D);
				comboBox_5.setSelectedItem(E);

				spinner.setEnabled(true);
				spinner_1.setEnabled(true);
				spinner_2.setEnabled(true);
				spinner_3.setEnabled(true);
				spinner_4.setEnabled(true);
				spinner_5.setEnabled(true);
				
				spinner.setValue(0);
				spinner_1.setValue(0);
				spinner_2.setValue(0);
				spinner_3.setValue(0);
				spinner_4.setValue(0);
				spinner_5.setValue(0);
			}else if (comboBox_6.getSelectedItem()=="10. Jaurdunaldia"&&jaur3==true) {
				hamarra=true;
				comboBox.setSelectedItem(E);
				comboBox_1.setSelectedItem(A);
				comboBox_2.setSelectedItem(C);
				comboBox_3.setSelectedItem(B);
				comboBox_4.setSelectedItem(F);
				comboBox_5.setSelectedItem(D);

				spinner.setEnabled(true);
				spinner_1.setEnabled(true);
				spinner_2.setEnabled(true);
				spinner_3.setEnabled(true);
				spinner_4.setEnabled(true);
				spinner_5.setEnabled(true);
				
				spinner.setValue(0);
				spinner_1.setValue(0);
				spinner_2.setValue(0);
				spinner_3.setValue(0);
				spinner_4.setValue(0);
				spinner_5.setValue(0);
			}
			
			
			else {
				JOptionPane.showMessageDialog(new JFrame(), "ajf","Error",JOptionPane.WARNING_MESSAGE);

			}
			}
		});
		//HASIERA DENBORALDI 1
			button.setBounds(178, 152, 85, 28);
			panel_1.add(button);

			panel_2.setVisible(false);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(20, 22, 708, 319);
		add(panel1);
		panel1.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Boston Celtics", "Cleveland Cavaliers", new Integer(127), new Integer(112)},
				{"Broolyn Nets", "Atlanta Hawks", new Integer(97), new Integer(102)},
				{"Chicago Bulls", "Charlotte Hornets", new Integer(114), new Integer(87)},
			},
			new String[] {
				"Etxea", "Kanpokoa", "Etxeko puntuak", "Kanpoko puntuak"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(84);
		table.getColumnModel().getColumn(1).setPreferredWidth(84);
		table.getColumnModel().getColumn(2).setPreferredWidth(28);
		table.getColumnModel().getColumn(3).setPreferredWidth(28);
		
		bci1 = bci1+1; ccg1=ccg1+1;bng1=bng1+1; ahi1=ahi1+1; cbi1=cbi1+1;chg1=chg1+1;
		table.setBounds(10, 10, 233, 50);
		panel1.add(table);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Cleveland Cavaliers", "Boston Celtics", new Integer(107), new Integer(121)},
				{"Atlanta Hawks", "Brooklyn Nets", new Integer(87), new Integer(92)},
				{"Charlotte Hornets", "Chicago Bulls", new Integer(97), new Integer(101)},
			},
			new String[] {
				"Etxea", "Kanpokoa", "Etxeko puntuak", "Kanpoko puntuak"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(85);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(85);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(28);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(28);
		
		ccg1= ccg1+1; bci1=bci1+1; ahg1= ahg1+1; bni1=bni1+1; chg1=chg1+1; cbi1=cbi1+1;
		table_1.setBounds(253, 10, 233, 50);
		panel1.add(table_1);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"Boston Celtics", "Atlanta Hawks", new Integer(101), new Integer(107)},
				{"Cleveland Cavaliers", "Charlotte Hornets", new Integer(96), new Integer(81)},
				{"Brooklyn Nets", "Chicago Bulls", new Integer(97), new Integer(98)},
			},
			new String[] {
				"Etxea", "Kanpokoa", "Etxeko puntuak", "Kanpoko puntuak"
			}
		));
		table_2.getColumnModel().getColumn(0).setPreferredWidth(85);
		table_2.getColumnModel().getColumn(1).setPreferredWidth(85);
		table_2.getColumnModel().getColumn(2).setPreferredWidth(28);
		table_2.getColumnModel().getColumn(3).setPreferredWidth(28);
			
		bcg1=bcg1+1; ahi1=ahi1+1; cci1=cci1+1; chg1=chg1+1; bng1=bng1+1; cbi1=cbi1+1;
		table_2.setBounds(498, 10, 200, 50);
		panel1.add(table_2);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{"Atlanta Hawks", "Boston Celtics", new Integer(88), new Integer(102)},
				{"Charlotte Hornets", "Cleveland Cavaliers", new Integer(90), new Integer(79)},
				{"Chicago Bulls", "Brooklyn Nets", new Integer(102), new Integer(99)},
			},
			new String[] {
				"Etxea", "Kanpokoa", "Etxeko puntuak", "Kanpoko puntuak"
			}
		));
		table_3.getColumnModel().getColumn(0).setPreferredWidth(84);
		table_3.getColumnModel().getColumn(1).setPreferredWidth(84);
		table_3.getColumnModel().getColumn(2).setPreferredWidth(28);
		table_3.getColumnModel().getColumn(3).setPreferredWidth(28);
		
		ahg1=ahg1+1; bci1=bci1+1;chi1=chi1+1; ccg1=ccg1+1;cbi1=cbi1+1;bng1=bng1+1;
		table_3.setBounds(10, 94, 200, 50);
		panel1.add(table_3);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{"Boston Celtics", "Charlotte Hornets", new Integer(101), new Integer(107)},
				{"Atlanta Hawks", "Chicago Bulls ", new Integer(96), new Integer(81)},
				{"Cleveland Cavaliers", "Brooklyn Nets", new Integer(97), new Integer(98)},
			},
			new String[] {
				"Etxea", "Kanpokoa", "Etxeko puntuak", "Kanpoko puntuak"
			}
		));
		table_4.getColumnModel().getColumn(0).setPreferredWidth(85);
		table_4.getColumnModel().getColumn(1).setPreferredWidth(85);
		table_4.getColumnModel().getColumn(2).setPreferredWidth(28);
		table_4.getColumnModel().getColumn(3).setPreferredWidth(28);
		
		bcg1=bcg1+1; chi1=chi1+1; ahi1=ahi1+1; cbg1=cbg1+1;ccg1=ccg1+1;bni1=bni1+1;
		table_4.setBounds(253, 94, 200, 50);
		panel1.add(table_4);
		
		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
				{"Charlotte Hornets", "Boston Celtics", new Integer(97), new Integer(89)},
				{"Chicago Bulls", "Atlanta Hawks", new Integer(104), new Integer(102)},
				{"Brooklyn Nets", "Cleveland Cavaliers", new Integer(88), new Integer(91)},
			},
			new String[] {
				"Etxea", "Kanpokoa", "Etxeko puntuak", "Kanpoko puntuak"
			}
		));
		table_5.getColumnModel().getColumn(0).setPreferredWidth(85);
		table_5.getColumnModel().getColumn(1).setPreferredWidth(85);
		table_5.getColumnModel().getColumn(2).setPreferredWidth(28);
		table_5.getColumnModel().getColumn(3).setPreferredWidth(28);
		
		chi1=chi1+1;bcg1=bcg1+1;cbi1=cbi1+1; ahg1=ahg1+1; bng1=bng1+1; cci1=cci1+1;
		table_5.setBounds(498, 94, 200, 50);
		panel1.add(table_5);
		
		table_6 = new JTable();
		table_6.setModel(new DefaultTableModel(
			new Object[][] {
				{"Boston Celtics", "Chicago Bulls", new Integer(137), new Integer(146)},
				{"Charlotte Hornets", "Brooklyn Nets", new Integer(79), new Integer(103)},
				{"Atlanta Hawks", "Cleveland Cavaliers", new Integer(104), new Integer(112)},
			},
			new String[] {
				"Etxea", "Kanpokoa", "Etxeko puntuak", "Kanpoko puntuak"
			}
		));
		table_6.getColumnModel().getColumn(0).setPreferredWidth(84);
		table_6.getColumnModel().getColumn(1).setPreferredWidth(84);
		table_6.getColumnModel().getColumn(2).setPreferredWidth(28);
		table_6.getColumnModel().getColumn(3).setPreferredWidth(28);
		
		bcg1=bcg1+1;cbi1=cbi1+1; chg1=chg1+1;bni1=bni1+1;ahg1=ahg1+1;cci1=cci1+1;
		table_6.setBounds(10, 177, 200, 50);
		panel1.add(table_6);
		
		table_7 = new JTable();
		table_7.setModel(new DefaultTableModel(
			new Object[][] {
				{"Chicago Bulls", "Boston Celtics", new Integer(137), new Integer(146)},
				{"Brooklyn Nets", "Charlotte Hornets", new Integer(79), new Integer(103)},
				{"Cleveland Cavaliers", "Atlnata Hawks", new Integer(104), new Integer(112)},
			},
			new String[] {
				"Etxea", "Kanpokoa", "Etxeko puntuak", "Kanpoko puntuak"
			}
		));
		table_7.getColumnModel().getColumn(0).setPreferredWidth(85);
		table_7.getColumnModel().getColumn(1).setPreferredWidth(85);
		table_7.getColumnModel().getColumn(2).setPreferredWidth(28);
		table_7.getColumnModel().getColumn(3).setPreferredWidth(28);
		table_7.setBounds(253, 177, 200, 50);
		cbg1= cbg1+1;bci1=bci1+1; bng1=bng1+1;chi1=chi1+1;ccg1=ccg1+1;ahi1=ahi1+1; 
		panel1.add(table_7);
			
		table_8 = new JTable();
		table_8.setModel(new DefaultTableModel(
			new Object[][] {
				{"Boston Celtics", "Brooklyn Nets", new Integer(107), new Integer(116)},
				{"Chicago Bulls", "Cleveland Cavaliers", new Integer(99), new Integer(87)},
				{"Charlotte Hornets ", "Atlanta Hawks", new Integer(114), new Integer(119)},
			},
			new String[] {
				"Etxea", "Kanpokoa", "Etxeko puntuak", "Kanpoko puntuak"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Object.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				true, true, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_8.getColumnModel().getColumn(0).setPreferredWidth(85);
		table_8.getColumnModel().getColumn(1).setPreferredWidth(85);
		table_8.getColumnModel().getColumn(2).setPreferredWidth(28);
		table_8.getColumnModel().getColumn(3).setPreferredWidth(28);
			
		bcg1=bcg1+1; bni1=bni1+1; cbi1=cbi1+1; ccg1=ccg1+1; chg1=chg1+1; ahi1=ahi1+1;
		table_8.setBounds(498, 177, 200, 50);
		panel1.add(table_8);
			
		table_9 = new JTable();
		table_9.setModel(new DefaultTableModel(
			new Object[][] {
				{"Brooklyn Nets ", "Boston Celtics", new Integer(101), new Integer(86)},
				{"Cleveland Cavaliers", "Chicago Bulls", new Integer(107), new Integer(99)},
				{"Atlanta Hawks", "Charlotte Hornets", new Integer(87), new Integer(94)},
			},
			new String[] {
				"Etxea", "Kanpokoa", "Etxeko puntuak", "Kanpoko puntuak"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Object.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				true, true, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_9.getColumnModel().getColumn(0).setPreferredWidth(84);
		table_9.getColumnModel().getColumn(1).setPreferredWidth(84);
		table_9.getColumnModel().getColumn(2).setPreferredWidth(28);
		table_9.getColumnModel().getColumn(3).setPreferredWidth(28);
			
		bni1=bni1+1;bcg1=bcg1+1;cci1=cci1+1; cbg1=cbg1+1; ahg1=ahg1+1; chi1=chi1+1;
		
		den1BC.add("Boston Celtics");
		den1BC.add(bci1);
		den1BC.add(bcg1);

		den1BN.add("Brooklyn Nets");
		den1BN.add(bni1);
		den1BN.add(bng1);

		den1CB.add("Chicago Bulls");
		den1CB.add(cbi1);
		den1CB.add(cbg1);

		den1CC.add("Cleveland Cavaliers");
		den1CC.add(cci1);
		den1CC.add(ccg1);

		den1AH.add("Atlanta Hawks");
		den1AH.add(ahi1);
		den1AH.add(ahg1);

		den1CH.add("Charlotte Hornets");
		den1CH.add(chi1);
		den1CH.add(chg1);

		den1[0] = new ArrayList<>();
		den1[0].add(den1BC);

		den1[1] = new ArrayList<>();
		den1[1].add(den1BN);

		den1[2] = new ArrayList<>();
		den1[2].add(den1CB);

		den1[3] = new ArrayList<>();
		den1[3].add(den1CC);

		den1[4] = new ArrayList<>();
		den1[4].add(den1AH);

		den1[5] = new ArrayList<>();
		den1[5].add(den1CH);
		
		for (int i= 0 ; i<den1.length; i++) {
		System.out.println(den1[i]);	
		}
		
		
		table_9.setBounds(253, 259, 200, 50);
		panel1.add(table_9);
			
		btnNewButton_3 = new JButton("Bueltatu");
			
		btnNewButton_3.setBounds(25, 288, 80, 21);
		panel1.add(btnNewButton_3);
			
		panel1.setVisible(false);
			
		setLayout(null);
		
		//DENBORALDI1 AMAIERA
		
		//MENU JARRAIPENA
		
		DefaultListModel<String> model = new DefaultListModel<>();
		
		model.addElement("1. Denboraldia");
		model.addElement("2. Denboraldia");
	    
	    JPanel panel = new JPanel();
	    panel.setBounds(74, 28, 614, 301);
	    add(panel);
	    panel.setLayout(null);
	    
	    	JList list = new JList(model);
	    	list.setBounds(26, 34, 200, 244);
	   		panel.add(list);
	   		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	   		
	    	JButton btnNewButton = new JButton("Sortu");
	    	btnNewButton.setBounds(495, 10, 77, 21);
	   		panel.add(btnNewButton);
	    		
	    	JButton btnNewButton_1 = new JButton("Sartu");
	    	btnNewButton_1.setBounds(495, 44, 77, 21);
	    	panel.add(btnNewButton_1);
	    		
	    		//ACTION LISTENER-EN TOKIA
	    	
	    	btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel.setVisible(true);
					panel1.setVisible(false);
			}
	    });
	    	btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (list.isSelectionEmpty()) {
					JOptionPane.showMessageDialog(new JFrame(), "Hautatu denboraldi bat mesedez","Error",JOptionPane.WARNING_MESSAGE);
				}else if (list.getSelectedValue()=="1. Denboraldia") {
					batDen=true;
					biDen=false;
					hiruDen=false;
					lauDen=false;
					bostDen=false;
					panel.setVisible(false);
					panel1.setVisible(true);	
				} else if (list.getSelectedValue()=="2. Denboraldia") {
					batDen=false;
					biDen=true;
					hiruDen=false;
					lauDen=false;
					bostDen=false;
					panel.setVisible(false);
					panel_2.setVisible(true);
					panela.setVisible(true);
					panel_1.setVisible(true);
					
					comboBox.setSelectedItem("Chicago Bulls");
					comboBox.setEnabled(false);

					comboBox_1.setSelectedItem("Charlotte Hornets");
					comboBox_1.setEnabled(false);

					comboBox_2.setSelectedItem("Boston Celtics");
					comboBox_2.setEnabled(false);

					comboBox_3.setSelectedItem("Cleveland Cavaliers");
					comboBox_3.setEnabled(false);

					comboBox_4.setSelectedItem("Brooklyn Nets");
					comboBox_4.setEnabled(false);

					comboBox_5.setSelectedItem("Atlanta Hawks");
					comboBox_5.setEnabled(false);
					
					spinner.setEnabled(true);
					spinner.setValue(0);
					spinner_1.setEnabled(true);
					spinner_1.setValue(0);
					spinner_2.setEnabled(true);
					spinner_2.setValue(0);
					spinner_3.setEnabled(true);
					spinner_3.setValue(0);
					spinner_4.setEnabled(true);
					spinner_4.setValue(0);
					spinner_5.setEnabled(true);
					spinner_5.setValue(0);
					
					
				}else if (list.getSelectedValue().equals("3. Denboraldia")) {
					batDen=false;
					biDen=false;
					hiruDen=true;
					lauDen=false;
					bostDen=false;
					
					panel.setVisible(false);
					panel1.setVisible(false);
					panel_2.setVisible(true);
					
					
					spinner.setValue(0);
					spinner_1.setEnabled(true);
					spinner_1.setValue(0);
					spinner_2.setEnabled(true);
					spinner_2.setValue(0);
					spinner_3.setEnabled(true);
					spinner_3.setValue(0);
					spinner_4.setEnabled(true);
					spinner_4.setValue(0);
					spinner_5.setEnabled(true);
					spinner_5.setValue(0);
				}
				else if (list.getSelectedValue().equals("4. Denboraldia")) {
					batDen=false;
					biDen=false;
					hiruDen=false;
					lauDen=true;
					bostDen=false;
					
					panel.setVisible(false);
					panel1.setVisible(false);
					panel_2.setVisible(true);
					
					spinner.setEnabled(true);
					spinner.setValue(0);
					spinner_1.setEnabled(true);
					spinner_1.setValue(0);
					spinner_2.setEnabled(true);
					spinner_2.setValue(0);
					spinner_3.setEnabled(true);
					spinner_3.setValue(0);
					spinner_4.setEnabled(true);
					spinner_4.setValue(0);
					spinner_5.setEnabled(true);
					spinner_5.setValue(0);
				}
				else if (list.getSelectedValue().equals("5. Denboraldia")) {
					batDen=false;
					biDen=false;
					hiruDen=false;
					lauDen=false;
					bostDen=true;
					
					panel.setVisible(false);
					panel1.setVisible(false);
					panel_2.setVisible(true);
					
					spinner.setEnabled(true);
					spinner.setValue(0);
					spinner_1.setEnabled(true);
					spinner_1.setValue(0);
					spinner_2.setEnabled(true);
					spinner_2.setValue(0);
					spinner_3.setEnabled(true);
					spinner_3.setValue(0);
					spinner_4.setEnabled(true);
					spinner_4.setValue(0);
					spinner_5.setEnabled(true);
					spinner_5.setValue(0);
				}
			}
		});
	    	//GORDE BOTOIA
			btnNewButton_2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (comboBoxModel.getSelectedItem()==comboBoxModel1.getSelectedItem()||comboBoxModel.getSelectedItem()==comboBoxModel2.getSelectedItem()||comboBoxModel.getSelectedItem()==comboBoxModel3.getSelectedItem()||comboBoxModel.getSelectedItem()==comboBoxModel4.getSelectedItem()||comboBoxModel.getSelectedItem()==comboBoxModel5.getSelectedItem()||
							comboBoxModel1.getSelectedItem()==comboBoxModel2.getSelectedItem()||comboBoxModel1.getSelectedItem()==comboBoxModel3.getSelectedItem()||comboBox_1.getSelectedItem()==comboBox_4.getSelectedItem()||comboBox_1.getSelectedItem()==comboBox_5.getSelectedItem()||
							comboBox_2.getSelectedItem()==comboBox_3.getSelectedItem()||comboBox_2.getSelectedItem()==comboBox_4.getSelectedItem()||comboBox_2.getSelectedItem()==comboBox_4.getSelectedItem()||
							comboBox_3.getSelectedItem()==comboBox_4.getSelectedItem()||comboBox_3.getSelectedItem()==comboBox_5.getSelectedItem()||
							comboBox_4.getSelectedItem()==comboBox_5.getSelectedItem()) {
						JOptionPane.showMessageDialog(new JFrame(), "Ezin dira taldeak errepiaktu","Error",JOptionPane.WARNING_MESSAGE);
					} else {
					int puntu0=(Integer) spinner.getValue();
					int puntu1=(Integer) spinner_1.getValue();
					int puntu2=(Integer) spinner_2.getValue();
					int puntu3=(Integer) spinner_3.getValue();
					int puntu4=(Integer) spinner_4.getValue();
					int puntu5=(Integer) spinner_5.getValue();
					
					
					if (puntu0<0||puntu1<0||puntu2<0||puntu3<0||puntu4<0||puntu5<0) {
						JOptionPane.showMessageDialog(new JFrame(), "Ezin dira puntu negatiboak euki","Error",JOptionPane.WARNING_MESSAGE);

					}else {
						btnNewButton_2_1.setEnabled(false);

						if (biDen=true) {
							
							A = (String) comboBox.getSelectedItem();
							B = (String) comboBox_1.getSelectedItem();
							C = (String) comboBox_2.getSelectedItem();
							D = (String) comboBox_3.getSelectedItem();
							E = (String) comboBox_4.getSelectedItem();
							F = (String) comboBox_5.getSelectedItem();

							
							spinner.setEnabled(false);
							spinner_1.setEnabled(false);
							spinner_2.setEnabled(false);
							spinner_3.setEnabled(false);
							spinner_4.setEnabled(false);
							spinner_5.setEnabled(false);
							
							// Bigarren denboraldian lehenengo comboBox-aren kasuak
							if (comboBox.getSelectedItem().equals("Boston Celtics")&&(int)spinner.getValue()>(int)spinner_1.getValue()) {
								bci2= bci2+1;
							}else if (comboBox.getSelectedItem().equals("Boston Celtics")&&(int)spinner.getValue()<(int)spinner_1.getValue()) {
								bcg2= bcg2+1;
							}else if(comboBox.getSelectedItem().equals("Boston Celtics")&&(int)spinner.getValue()==(int)spinner_1.getValue()){
								bce2= bce2+1;
							}
							if (comboBox.getSelectedItem().equals("Brooklyn Nets")&&(int)spinner.getValue()>(int)spinner_1.getValue()) {
								bni2= bni2+1;
							}else if (comboBox.getSelectedItem().equals("Brooklyn Nets")&&(int)spinner.getValue()<(int)spinner_1.getValue()) {
								bng2= bng2+1;
							}else if(comboBox.getSelectedItem().equals("Brooklyn Nets")&&(int)spinner.getValue()==(int)spinner_1.getValue()){
								bne2= bne2+1;
							}
							if (comboBox.getSelectedItem().equals("Chicago Bulls")&&(int)spinner.getValue()>(int)spinner_1.getValue()) {
								cbi2= cbi2+1;
							}else if (comboBox.getSelectedItem().equals("Chicago Bulls")&&(int)spinner.getValue()<(int)spinner_1.getValue()) {
								cbg2= cbg2+1;
							}else if(comboBox.getSelectedItem().equals("Chicago Bulls")&&(int)spinner.getValue()==(int)spinner_1.getValue()){
								cbe2= cbe2+1;
							}
							if (comboBox.getSelectedItem().equals("Cleveland Cavaliers")&&(int)spinner.getValue()>(int)spinner_1.getValue()) {
								cci2= cci2+1;
							}else if (comboBox.getSelectedItem().equals("Cleveland Cavaliers")&&(int)spinner.getValue()<(int)spinner_1.getValue()) {
								ccg2= ccg2+1;
							}else if(comboBox.getSelectedItem().equals("Cleveland Cavaliers")&&(int)spinner.getValue()==(int)spinner_1.getValue()){
								cce2= cce2+1;
							}
							if (comboBox.getSelectedItem().equals("Atlanta Hawks")&&(int)spinner.getValue()>(int)spinner_1.getValue()) {
								ahi2= ahi2+1;
							}else if (comboBox.getSelectedItem().equals("Atlanta Hawks")&&(int)spinner.getValue()<(int)spinner_1.getValue()) {
								ahg2= ahg2+1;
							}else if(comboBox.getSelectedItem().equals("Atlanta Hawks")&&(int)spinner.getValue()==(int)spinner_1.getValue()){
								ahe2= ahe2+1;
							}
							if (comboBox.getSelectedItem().equals("Charlotte Hornets")&&(int)spinner.getValue()>(int)spinner_1.getValue()) {
								chi2= chi2+1;
							}else if (comboBox.getSelectedItem().equals("Charlotte Hornets")&&(int)spinner.getValue()<(int)spinner_1.getValue()) {
								chg2= chg2+1;
							}else if(comboBox.getSelectedItem().equals("Charlotte Hornets")&&(int)spinner.getValue()==(int)spinner_1.getValue()){
								che2= che2+1;
							}
							
							
							// Bigarren denboraldian bigarren comboBox-aren kasuak
							if (comboBox_1.getSelectedItem().equals("Boston Celtics")&&(int)spinner_1.getValue()>(int)spinner.getValue()) {
								bci2= bci2+1;
							}else if (comboBox_1.getSelectedItem().equals("Boston Celtics")&&(int)spinner_1.getValue()<(int)spinner.getValue()) {
								bcg2= bcg2+1;
							}else if(comboBox_1.getSelectedItem().equals("Boston Celtics")&&(int)spinner_1.getValue()==(int)spinner.getValue()){
								bce2= bce2+1;
							}
							if (comboBox_1.getSelectedItem().equals("Brooklyn Nets")&&(int)spinner_1.getValue()>(int)spinner.getValue()) {
								bni2= bni2+1;
							}else if (comboBox_1.getSelectedItem().equals("Brooklyn Nets")&&(int)spinner_1.getValue()<(int)spinner.getValue()) {
								bng2= bng2+1;
							}else if(comboBox_1.getSelectedItem().equals("Brooklyn Nets")&&(int)spinner_1.getValue()==(int)spinner.getValue()){
								bne2= bne2+1;
							}
							if (comboBox_1.getSelectedItem().equals("Chicago Bulls")&&(int)spinner_1.getValue()>(int)spinner.getValue()) {
								cbi2= cbi2+1;
							}else if (comboBox_1.getSelectedItem().equals("Chicago Bulls")&&(int)spinner_1.getValue()<(int)spinner.getValue()) {
								cbg2= cbg2+1;
							}else if(comboBox_1.getSelectedItem().equals("Chicago Bulls")&&(int)spinner_1.getValue()==(int)spinner.getValue()){
								cbe2= cbe2+1;
							}
							if (comboBox_1.getSelectedItem().equals("Cleveland Cavaliers")&&(int)spinner_1.getValue()>(int)spinner.getValue()) {
								cci2= cci2+1;
							}else if (comboBox_1.getSelectedItem().equals("Cleveland Cavaliers")&&(int)spinner_1.getValue()<(int)spinner.getValue()) {
								ccg2= ccg2+1;
							}else if(comboBox_1.getSelectedItem().equals("Cleveland Cavaliers")&&(int)spinner_1.getValue()==(int)spinner.getValue()){
								cce2= cce2+1;
							}
							if (comboBox_1.getSelectedItem().equals("Atlanta Hawks")&&(int)spinner_1.getValue()>(int)spinner.getValue()) {
								ahi2= ahi2+1;
							}else if (comboBox_1.getSelectedItem().equals("Atlanta Hawks")&&(int)spinner_1.getValue()<(int)spinner.getValue()) {
								ahg2= ahg2+1;
							}else if(comboBox_1.getSelectedItem().equals("Atlanta Hawks")&&(int)spinner_1.getValue()==(int)spinner.getValue()){
								ahe2= ahe2+1;
							}
							if (comboBox_1.getSelectedItem().equals("Charlotte Hornets")&&(int)spinner_1.getValue()>(int)spinner.getValue()) {
								chi2= chi2+1;
							}else if (comboBox_1.getSelectedItem().equals("Charlotte Hornets")&&(int)spinner_1.getValue()<(int)spinner.getValue()) {
								chg2= chg2+1;
							}else if(comboBox_1.getSelectedItem().equals("Charlotte Hornets")&&(int)spinner_1.getValue()==(int)spinner.getValue()){
								che2= che2+1;
							}

							
							// Bigarren denboraldian hirugarren comboBox-aren kasuak
							if (comboBox_2.getSelectedItem().equals("Boston Celtics")&&(int)spinner_2.getValue()>(int)spinner_3.getValue()) {
								bci2= bci2+1;
							}else if (comboBox_2.getSelectedItem().equals("Boston Celtics")&&(int)spinner_2.getValue()<(int)spinner_3.getValue()) {
								bcg2= bcg2+1;
							}else if(comboBox_2.getSelectedItem().equals("Boston Celtics")&&(int)spinner_2.getValue()==(int)spinner_3.getValue()){
								bce2= bce2+1;
							}
							if (comboBox_2.getSelectedItem().equals("Brooklyn Nets")&&(int)spinner_2.getValue()>(int)spinner_3.getValue()) {
								bni2= bni2+1;
							}else if (comboBox_2.getSelectedItem().equals("Brooklyn Nets")&&(int)spinner_2.getValue()<(int)spinner_3.getValue()) {
								bng2= bng2+1;
							}else if(comboBox_2.getSelectedItem().equals("Brooklyn Nets")&&(int)spinner_2.getValue()==(int)spinner_3.getValue()){
								bne2= bne2+1;
							}
							if (comboBox_2.getSelectedItem().equals("Chicago Bulls")&&(int)spinner_2.getValue()>(int)spinner_3.getValue()) {
								cbi2= cbi2+1;
							}else if (comboBox_2.getSelectedItem().equals("Chicago Bulls")&&(int)spinner_2.getValue()<(int)spinner_3.getValue()) {
								cbg2= cbg2+1;
							}else if(comboBox_2.getSelectedItem().equals("Chicago Bulls")&&(int)spinner_2.getValue()==(int)spinner_3.getValue()){
								cbe2= cbe2+1;
							}
							if (comboBox_2.getSelectedItem().equals("Cleveland Cavaliers")&&(int)spinner_2.getValue()>(int)spinner_3.getValue()) {
								cci2= cci2+1;
							}else if (comboBox_2.getSelectedItem().equals("Cleveland Cavaliers")&&(int)spinner_2.getValue()<(int)spinner_3.getValue()) {
								ccg2= ccg2+1;
							}else if(comboBox_2.getSelectedItem().equals("Cleveland Cavaliers")&&(int)spinner_2.getValue()==(int)spinner_3.getValue()){
								cce2= cce2+1;
							}
							if (comboBox_2.getSelectedItem().equals("Atlanta Hawks")&&(int)spinner_2.getValue()>(int)spinner_3.getValue()) {
								ahi2= ahi2+1;
							}else if (comboBox_2.getSelectedItem().equals("Atlanta Hawks")&&(int)spinner_2.getValue()<(int)spinner_3.getValue()) {
								ahg2= ahg2+1;
							}else if(comboBox_2.getSelectedItem().equals("Atlanta Hawks")&&(int)spinner_2.getValue()==(int)spinner_3.getValue()){
								ahe2= ahe2+1;
							}
							if (comboBox_2.getSelectedItem().equals("Charlotte Hornets")&&(int)spinner_2.getValue()>(int)spinner_3.getValue()) {
								chi2= chi2+1;
							}else if (comboBox_2.getSelectedItem().equals("Charlotte Hornets")&&(int)spinner_2.getValue()<(int)spinner_3.getValue()) {
								chg2= chg2+1;
							}else if(comboBox_2.getSelectedItem().equals("Charlotte Hornets")&&(int)spinner_2.getValue()==(int)spinner_3.getValue()){
								che2= che2+1;
							}
							

							// Bigarren denboraldian laugarren comboBox-aren kasuak
							if (comboBox_3.getSelectedItem().equals("Boston Celtics")&&(int)spinner_3.getValue()>(int)spinner_2.getValue()) {
								bci2= bci2+1;
							}else if (comboBox_3.getSelectedItem().equals("Boston Celtics")&&(int)spinner_3.getValue()<(int)spinner_2.getValue()) {
								bcg2= bcg2+1;
							}else if(comboBox_3.getSelectedItem().equals("Boston Celtics")&&(int)spinner_3.getValue()==(int)spinner_2.getValue()){
								bce2= bce2+1;
							}
							if (comboBox_3.getSelectedItem().equals("Brooklyn Nets")&&(int)spinner_3.getValue()>(int)spinner_2.getValue()) {
								bni2= bni2+1;
							}else if (comboBox_3.getSelectedItem().equals("Brooklyn Nets")&&(int)spinner_3.getValue()<(int)spinner_2.getValue()) {
								bng2= bng2+1;
							}else if(comboBox_3.getSelectedItem().equals("Brooklyn Nets")&&(int)spinner_3.getValue()==(int)spinner_2.getValue()){
								bne2= bne2+1;
							}
							if (comboBox_3.getSelectedItem().equals("Chicago Bulls")&&(int)spinner_3.getValue()>(int)spinner_2.getValue()) {
								cbi2= cbi2+1;
							}else if (comboBox_3.getSelectedItem().equals("Chicago Bulls")&&(int)spinner_3.getValue()<(int)spinner_2.getValue()) {
								cbg2= cbg2+1;
							}else if(comboBox_3.getSelectedItem().equals("Chicago Bulls")&&(int)spinner_3.getValue()==(int)spinner_2.getValue()){
								cbe2= cbe2+1;
							}
							if (comboBox_3.getSelectedItem().equals("Cleveland Cavaliers")&&(int)spinner_3.getValue()>(int)spinner_2.getValue()) {
								cci2= cci2+1;
							}else if (comboBox_3.getSelectedItem().equals("Cleveland Cavaliers")&&(int)spinner_3.getValue()<(int)spinner_2.getValue()) {
								ccg2= ccg2+1;
							}else if(comboBox_3.getSelectedItem().equals("Cleveland Cavaliers")&&(int)spinner_3.getValue()==(int)spinner_2.getValue()){
								cce2= cce2+1;
							}
							if (comboBox_3.getSelectedItem().equals("Atlanta Hawks")&&(int)spinner_3.getValue()>(int)spinner_2.getValue()) {
								ahi2= ahi2+1;
							}else if (comboBox_3.getSelectedItem().equals("Atlanta Hawks")&&(int)spinner_3.getValue()<(int)spinner_2.getValue()) {
								ahg2= ahg2+1;
							}else if(comboBox_3.getSelectedItem().equals("Atlanta Hawks")&&(int)spinner_3.getValue()==(int)spinner_2.getValue()){
								ahe2= ahe2+1;
							}
							if (comboBox_3.getSelectedItem().equals("Charlotte Hornets")&&(int)spinner_3.getValue()>(int)spinner_2.getValue()) {
								chi2= chi2+1;
							}else if (comboBox_3.getSelectedItem().equals("Charlotte Hornets")&&(int)spinner_3.getValue()<(int)spinner_2.getValue()) {
								chg2= chg2+1;
							}else if(comboBox_3.getSelectedItem().equals("Charlotte Hornets")&&(int)spinner_3.getValue()==(int)spinner_2.getValue()){
								che2= che2+1;
							}
							
							

							// Bigarren denboraldian bostgarren comboBox-aren kasuak
							if (comboBox_4.getSelectedItem().equals("Boston Celtics")&&(int)spinner_4.getValue()>(int)spinner_5.getValue()) {
								bci2= bci2+1;
							}else if (comboBox_4.getSelectedItem().equals("Boston Celtics")&&(int)spinner_4.getValue()<(int)spinner_5.getValue()) {
								bcg2= bcg2+1;
							}else if(comboBox_4.getSelectedItem().equals("Boston Celtics")&&(int)spinner_4.getValue()==(int)spinner_5.getValue()){
								bce2= bce2+1;
							}
							if (comboBox_4.getSelectedItem().equals("Brooklyn Nets")&&(int)spinner_4.getValue()>(int)spinner_5.getValue()) {
								bni2= bni2+1;
							}else if (comboBox_4.getSelectedItem().equals("Brooklyn Nets")&&(int)spinner_4.getValue()<(int)spinner_5.getValue()) {
								bng2= bng2+1;
							}else if(comboBox_4.getSelectedItem().equals("Brooklyn Nets")&&(int)spinner_4.getValue()==(int)spinner_5.getValue()){
								bne2= bne2+1;
							}
							if (comboBox_4.getSelectedItem().equals("Chicago Bulls")&&(int)spinner_4.getValue()>(int)spinner_5.getValue()) {
								cbi2= cbi2+1;
							}else if (comboBox_4.getSelectedItem().equals("Chicago Bulls")&&(int)spinner_4.getValue()<(int)spinner_5.getValue()) {
								cbg2= cbg2+1;
							}else if(comboBox_4.getSelectedItem().equals("Chicago Bulls")&&(int)spinner_4.getValue()==(int)spinner_5.getValue()){
								cbe2= cbe2+1;
							}
							if (comboBox_4.getSelectedItem().equals("Cleveland Cavaliers")&&(int)spinner_4.getValue()>(int)spinner_5.getValue()) {
								cci2= cci2+1;
							}else if (comboBox_4.getSelectedItem().equals("Cleveland Cavaliers")&&(int)spinner_4.getValue()<(int)spinner_5.getValue()) {
								ccg2= ccg2+1;
							}else if(comboBox_4.getSelectedItem().equals("Cleveland Cavaliers")&&(int)spinner_4.getValue()==(int)spinner_5.getValue()){
								cce2= cce2+1;
							}
							if (comboBox_4.getSelectedItem().equals("Atlanta Hawks")&&(int)spinner_4.getValue()>(int)spinner_5.getValue()) {
								ahi2= ahi2+1;
							}else if (comboBox_4.getSelectedItem().equals("Atlanta Hawks")&&(int)spinner_4.getValue()<(int)spinner_5.getValue()) {
								ahg2= ahg2+1;
							}else if(comboBox_4.getSelectedItem().equals("Atlanta Hawks")&&(int)spinner_4.getValue()==(int)spinner_5.getValue()){
								ahe2= ahe2+1;
							}
							if (comboBox_4.getSelectedItem().equals("Charlotte Hornets")&&(int)spinner_4.getValue()>(int)spinner_5.getValue()) {
								chi2= chi2+1;
							}else if (comboBox_4.getSelectedItem().equals("Charlotte Hornets")&&(int)spinner_4.getValue()<(int)spinner_5.getValue()) {
								chg2= chg2+1;
							}else if(comboBox_4.getSelectedItem().equals("Charlotte Hornets")&&(int)spinner_4.getValue()==(int)spinner_5.getValue()){
								che2= che2+1;
							}
							
							
							
							// Bigarren denboraldian seigarren comboBox-aren kasuak
							if (comboBox_5.getSelectedItem().equals("Boston Celtics")&&(int)spinner_5.getValue()>(int)spinner_4.getValue()) {
								bci2= bci2+1;
							}else if (comboBox_5.getSelectedItem().equals("Boston Celtics")&&(int)spinner_5.getValue()<(int)spinner_4.getValue()) {
								bcg2= bcg2+1;
							}else if(comboBox_5.getSelectedItem().equals("Boston Celtics")&&(int)spinner_5.getValue()==(int)spinner_4.getValue()){
								bce2= bce2+1;
							}
							if (comboBox_5.getSelectedItem().equals("Brooklyn Nets")&&(int)spinner_5.getValue()>(int)spinner_4.getValue()) {
								bni2= bni2+1;
							}else if (comboBox_5.getSelectedItem().equals("Brooklyn Nets")&&(int)spinner_5.getValue()<(int)spinner_4.getValue()) {
								bng2= bng2+1;
							}else if(comboBox_5.getSelectedItem().equals("Brooklyn Nets")&&(int)spinner_5.getValue()==(int)spinner_4.getValue()){
								bne2= bne2+1;
							}
							if (comboBox_5.getSelectedItem().equals("Chicago Bulls")&&(int)spinner_5.getValue()>(int)spinner_4.getValue()) {
								cbi2= cbi2+1;
							}else if (comboBox_5.getSelectedItem().equals("Chicago Bulls")&&(int)spinner_5.getValue()<(int)spinner_4.getValue()) {
								cbg2= cbg2+1;
							}else if(comboBox_5.getSelectedItem().equals("Chicago Bulls")&&(int)spinner_5.getValue()==(int)spinner_4.getValue()){
								cbe2= cbe2+1;
							}
							if (comboBox_5.getSelectedItem().equals("Cleveland Cavaliers")&&(int)spinner_5.getValue()>(int)spinner_4.getValue()) {
								cci2= cci2+1;
							}else if (comboBox_5.getSelectedItem().equals("Cleveland Cavaliers")&&(int)spinner_5.getValue()<(int)spinner_4.getValue()) {
								ccg2= ccg2+1;
							}else if(comboBox_5.getSelectedItem().equals("Cleveland Cavaliers")&&(int)spinner_5.getValue()==(int)spinner_4.getValue()){
								cce2= cce2+1;
							}
							if (comboBox_5.getSelectedItem().equals("Atlanta Hawks")&&(int)spinner_5.getValue()>(int)spinner_4.getValue()) {
								ahi2= ahi2+1;
							}else if (comboBox_5.getSelectedItem().equals("Atlanta Hawks")&&(int)spinner_5.getValue()<(int)spinner_4.getValue()) {
								ahg2= ahg2+1;
							}else if(comboBox_5.getSelectedItem().equals("Atlanta Hawks")&&(int)spinner_5.getValue()==(int)spinner_4.getValue()){
								ahe2= ahe2+1;
							}
							if (comboBox_5.getSelectedItem().equals("Charlotte Hornets")&&(int)spinner_5.getValue()>(int)spinner_4.getValue()) {
								chi2= chi2+1;
							}else if (comboBox_5.getSelectedItem().equals("Charlotte Hornets")&&(int)spinner_5.getValue()<(int)spinner_4.getValue()) {
								chg2= chg2+1;
							}else if(comboBox_5.getSelectedItem().equals("Charlotte Hornets")&&(int)spinner_5.getValue()==(int)spinner_4.getValue()){
								che2= che2+1;
							}
							
							if (hamarra==true) {
								Denb2GetSet Talde = new Denb2GetSet ();
								
								Denb2GetSet.TaldeIzen = "Boston Celtics";
								Denb2GetSet.Irabaziak = bci2;
								Denb2GetSet.Galerak = bcg2;
								Denb2GetSet.Berdina = bce2;
								
								den2BC.add("Boston Celtics");
								den2BC.add(bci2);
								den2BC.add(bcg2);
								den2BC.add(bce2);

								den2BN.add("Brooklyn Nets");
								den2BN.add(bni2);
								den2BN.add(bng2);
								den2BN.add(bne2);
								
								den2CB.add("Chicago Bulls");
								den2CB.add(cbi2);
								den2CB.add(cbg2);
								den2CB.add(cbe2);

								den2CC.add("Cleveland Cavaliers");
								den2CC.add(cci2);
								den2CC.add(ccg2);
								den2CC.add(cce2);

								den1AH.add("Atlanta Hawks");
								den1AH.add(ahi2);
								den1AH.add(ahg2);
								den1AH.add(ahe2);

								den1CH.add("Charlotte Hornets");
								den1CH.add(chi2);
								den1CH.add(chg2);
								den1CH.add(che2);

								den1[0] = new ArrayList<>();
								den1[0].add(den1BC);

								den1[1] = new ArrayList<>();
								den1[1].add(den1BN);

								den1[2] = new ArrayList<>();
								den1[2].add(den1CB);

								den1[3] = new ArrayList<>();
								den1[3].add(den1CC);

								den1[4] = new ArrayList<>();
								den1[4].add(den1AH);

								den1[5] = new ArrayList<>();
								den1[5].add(den1CH);
								hamarra=false;
							}
							
							jaur3=true;
							
						}else if(hiruDen=true) {
							if (comboBox.getSelectedItem().equals("Boston Celtics")&&(int)spinner.getValue()>(int)spinner_1.getValue()) {
								bci2= bci2+1;
							}else if (comboBox.getSelectedItem().equals("Boston Celtics")&&(int)spinner.getValue()<(int)spinner_1.getValue()) {
								bce2= bce2+1;
							}else if(comboBox.getSelectedItem().equals("Boston Celtics")&&(int)spinner.getValue()==(int)spinner_1.getValue()){
								bce2= bce2+1;
							}
							if (comboBox.getSelectedItem().equals("Cleveland Cavaliers")&&(int)spinner.getValue()>(int)spinner_1.getValue()) {
								cci2= cci2+1;
							}else if (comboBox.getSelectedItem().equals("Cleveland Cavaliers")&&(int)spinner.getValue()<(int)spinner_1.getValue()) {
								cce2= cce2+1;
							}else if(comboBox.getSelectedItem().equals("Cleveland Cavaliers")&&(int)spinner.getValue()==(int)spinner_1.getValue()){
								cce2= cce2+1;
							}
							

						}else if (lauDen=true) {
							
						} else if(bostDen=true) {
							
						}
						
						

						comboBox.setEnabled(false);
						comboBox_1.setEnabled(false);
						comboBox_2.setEnabled(false);
						comboBox_3.setEnabled(false);
						comboBox_4.setEnabled(false);
						comboBox_5.setEnabled(false);
						spinner.setEnabled(false);
						spinner_1.setEnabled(false);
						spinner_2.setEnabled(false);
						spinner_3.setEnabled(false);
						spinner_4.setEnabled(false);
						spinner_5.setEnabled(false);

						String A = (String) comboBox.getSelectedItem();
						String B = (String) comboBox_1.getSelectedItem();
						String C = (String) comboBox_2.getSelectedItem();
						String D = (String) comboBox_3.getSelectedItem();
						String E = (String) comboBox_4.getSelectedItem();
						String F = (String) comboBox_5.getSelectedItem();
						
						
					}
					}
				}
			});
	    
	    btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = list.getModel().getSize();
				if (x>=5) {
					JOptionPane.showMessageDialog(new JFrame(), "Maximoa 5 da","Error",JOptionPane.WARNING_MESSAGE);

				} else {
				int n = list.getModel().getSize();
				n= n+1;
				String i=Integer.toString(n);
				String s1 =i + ". Denboraldia";
				
				model.addElement(s1);
				
				Dimension q = Etxea.comboBox.getSize();

				int a = n +21;
				int z = a+1;
				String w=Integer.toString(a);
				String r=Integer.toString(z);
		
				String s2 =w + "-" + r;
					
				Etxea.comboBox.addItem(s2);
				}
				
			}
		});
	    

	}
	
	public void bigade() {
		
	}

	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
