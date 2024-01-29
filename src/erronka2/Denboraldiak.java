package erronka2;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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

public class Denboraldiak extends JPanel {

	private static final long serialVersionUID = 1L;
	private boolean jaur3 = false;
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

	/**
	 * Create the panel.
	 */
	
	public Denboraldiak() {
		setLayout(null);
		
		menu();
	}
	
	public void menu () {
		

		setBackground(new Color(255, 0, 128));
		setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 10, 721, 400);
		add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panela = new JPanel();
		panela.setBounds(10, 0, 321, 400);
		panel_2.add(panela);
		panela.setBackground(new Color(255, 128, 192));
		panela.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(16, 59, 114, 21);
		panela.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel<String>(new String [] {
				"Boston Celtics", "Brooklyn Nets", "Chicago Bulls", "Cleveland Cavaliers", "Atlanta Hawks","Charlotte Hornets"}));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(150, 59, 114, 21);
		panela.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String [] {
				"Boston Celtics", "Brooklyn Nets", "Chicago Bulls", "Cleveland Cavaliers", "Atlanta Hawks","Charlotte Hornets"}));
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(16, 121, 114, 21);
		panela.add(comboBox_2);
		comboBox_2.setModel(new DefaultComboBoxModel<String>(new String [] {
				"Boston Celtics", "Brooklyn Nets", "Chicago Bulls", "Cleveland Cavaliers", "Atlanta Hawks","Charlotte Hornets"}));
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(150, 183, 114, 21);
		panela.add(comboBox_3);
		comboBox_3.setModel(new DefaultComboBoxModel<String>(new String [] {
				"Boston Celtics", "Brooklyn Nets", "Chicago Bulls", "Cleveland Cavaliers", "Atlanta Hawks","Charlotte Hornets"}));
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(150, 121, 114, 21);
		panela.add(comboBox_4);
		comboBox_4.setModel(new DefaultComboBoxModel<String>(new String [] {
				"Boston Celtics", "Brooklyn Nets", "Chicago Bulls", "Cleveland Cavaliers", "Atlanta Hawks","Charlotte Hornets"}));
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(16, 183, 114, 21);
		panela.add(comboBox_5);
		comboBox_5.setModel(new DefaultComboBoxModel<String>(new String [] {
				"Boston Celtics", "Brooklyn Nets", "Chicago Bulls", "Cleveland Cavaliers", "Atlanta Hawks","Charlotte Hornets"}));
		
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
		
		JLabel lblNewLabel = new JLabel("Ida");
		lblNewLabel.setBounds(26, 10, 200, 50);
		panela.add(lblNewLabel);
		

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
		btnNewButton_2.setBounds(16, 263, 75, 21);
		panela.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Gorde");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedIndex()==comboBox_1.getSelectedIndex()||comboBox.getSelectedIndex()==comboBox_2.getSelectedIndex()||comboBox.getSelectedIndex()==comboBox_3.getSelectedIndex()||comboBox.getSelectedIndex()==comboBox_4.getSelectedIndex()||comboBox.getSelectedIndex()==comboBox_5.getSelectedIndex()||
						comboBox_1.getSelectedIndex()==comboBox_2.getSelectedIndex()||comboBox_1.getSelectedIndex()==comboBox_3.getSelectedIndex()||comboBox_1.getSelectedIndex()==comboBox_4.getSelectedIndex()||comboBox_1.getSelectedIndex()==comboBox_5.getSelectedIndex()||
						comboBox_2.getSelectedIndex()==comboBox_3.getSelectedIndex()||comboBox_2.getSelectedIndex()==comboBox_4.getSelectedIndex()||comboBox_2.getSelectedIndex()==comboBox_4.getSelectedIndex()||
						comboBox_3.getSelectedIndex()==comboBox_4.getSelectedIndex()||comboBox_3.getSelectedIndex()==comboBox_5.getSelectedIndex()||
						comboBox_4.getSelectedIndex()==comboBox_5.getSelectedIndex()) {
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
					jaur3 = true;
				}
				}
			}
		});
		btnNewButton_2_1.setBounds(221, 273, 75, 21);
		panela.add(btnNewButton_2_1);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(374, 23, 337, 204);
		panel_2.add(panel_1);
		panel_1.setBackground(new Color(215, 153, 204));
		panel_1.setLayout(null);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"1. Jaudunaldia", "2. Jaudunaldia", "3. Jaudunaldia", "4. Jaudunaldia", "5. Jaudunaldia", "6. Jaudunaldia", "7. Jaudunaldia", "8. Jaudunaldia", "9. Jaudunaldia", "10. Jaudunaldia"}));
		comboBox_6.setBounds(35, 10, 200, 50);
		panel_1.add(comboBox_6);
		
		Button button = new Button("Aukeratu");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (comboBox_6.getSelectedItem()=="2. Jaudunaldia"&&jaur3==false) {
				JOptionPane.showMessageDialog(new JFrame(), "Lehenengo jaurdunaldua amaitu behar duzu","Error",JOptionPane.WARNING_MESSAGE);

			}
			}
		});
		button.setBounds(147, 149, 116, 31);
		panel_1.add(button);

		panel_2.setVisible(false);

		
		JPanel panel1 = new JPanel();
		panel1.setBounds(20, 22, 708, 319);
		add(panel1);
		panel1.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Boston Celtics", "Cleveland Cavaliers", "TD Garden", "127", "112"},
				{"Broolyn Nets", "Atlanta Hawks", "Barclays Center", "97", "102"},
				{"Chicago Bulls", "Charlotte Hornets", "United Center", "114", "87"},
			},
			new String[] {
				"Etxea", "Kanpokoa", "Zelaia", "Etxeko puntuak", "Kanpoko puntuak"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.setBounds(10, 10, 233, 50);
		panel1.add(table);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Cleveland Cavaliers", "Boston Celtics", "Rocket Mortgage FieldHouse", "107", "121"},
				{"Atlanta Hawks", "Brooklyn Nets", "State Farm Arena", "87", "92"},
				{"Charlotte Hornets", "Chicago Bulls", "Spectrum Center", "97", "101"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table_1.setBounds(253, 10, 233, 50);
		panel1.add(table_1);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"Boston Celtics", "Atlanta Hawks", "TD Garden", "101", "107"},
				{"Cleveland Cavaliers", "Charlotte Hornets", "Rocket Mortgage FieldHouse", "96", "81"},
				{"Brooklyn Nets", "Chicago Bulls", "Barclays Center", "97", "98"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table_2.setBounds(498, 10, 200, 50);
		panel1.add(table_2);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{"Atlanta Hawks", "Boston Celtics", "State Farm Arena", "88", "102"},
				{"Charlotte Hornets", "Cleveland Cavaliers", "Spectrum Center", "90", "79"},
				{"Chicago Bulls", "Brooklyn Nets", "United Center", "102", "99"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table_3.setBounds(10, 94, 200, 50);
		panel1.add(table_3);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{"Boston Celtics", "Charlotte Hornets", "TD Garden", "101", "107"},
				{"Atlanta Hawks", "Chicago Bulls ", "State Farm Arena", "96", "81"},
				{"Cleveland Cavaliers", "Brooklyn Nets", "Rocket Mortgage FieldHouse", "97", "98"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table_4.setBounds(253, 94, 200, 50);
		panel1.add(table_4);
		
		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
				{"Charlotte Hornets", "Boston Celtics", "Spectrum Center", "97", "89"},
				{"Chicago Bulls", "Atlanta Hawks", "United Center", "104", "102"},
				{"Brooklyn Nets", "Cleveland Cavaliers", "Barclays Center", "88", "91"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table_5.setBounds(498, 94, 200, 50);
		panel1.add(table_5);
		
		table_6 = new JTable();
		table_6.setModel(new DefaultTableModel(
			new Object[][] {
				{"Boston Celtics", "Chicago Bulls", "TD Garden", "137", "146"},
				{"Charlotte Hornets", "Brooklyn Nets", "Spectrum Center", "79", "103"},
				{"Atlanta Hawks", "Cleveland Cavaliers", "State Farm Arena", "104", "112"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table_6.setBounds(10, 177, 200, 50);
		panel1.add(table_6);
		
		table_7 = new JTable();
		table_7.setModel(new DefaultTableModel(
			new Object[][] {
				{"Chicago Bulls", "Boston Celtics", "United Center", "137", "146"},
				{"Brooklyn Nets", "Charlotte Hornets", "Barclays Center", "79", "103"},
				{"Cleveland Cavaliers", "Atlnata Hawks", "Rocket Mortgage FieldHouse", "104", "112"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table_7.setBounds(253, 177, 200, 50);
		panel1.add(table_7);
		
		table_8 = new JTable();
		table_8.setModel(new DefaultTableModel(
			new Object[][] {
				{"Boston Celtics", "Brooklyn Nets", "TD Garden", "107", "116"},
				{"Chicago Bulls", "Cleveland Cavaliers", "United Center", "99", "87"},
				{"Charlotte Hornets ", "Atlanta Hawks", "Spectrum Center", "114", "119"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table_8.setBounds(498, 177, 200, 50);
		panel1.add(table_8);
		
		table_9 = new JTable();
		table_9.setModel(new DefaultTableModel(
			new Object[][] {
				{"Brooklyn Nets ", "Boston Celtics", "Barclays Center", "101", "86"},
				{"Cleveland Cavaliers", "Chicago Bulls", "Rocket Morgage FieldHouse", "107", "99"},
				{"Atlanta Hawks", "Charlotte Hornets", "87", "87", "94"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table_9.setBounds(253, 259, 200, 50);
		panel1.add(table_9);
		
		panel1.setVisible(false);
		
		setLayout(null);
		
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
	    		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (list.isSelectionEmpty()) {
					JOptionPane.showMessageDialog(new JFrame(), "Ez dago ezer listan","Error",JOptionPane.WARNING_MESSAGE);
				}else if (list.getSelectedValue()=="1. Denboraldia") {
					panel.setVisible(false);
					panel1.setVisible(true);	
				} else if (list.getSelectedValue()=="2. Denboraldia") {
					
				}else {
					panel.setVisible(false);
					panel1.setVisible(false);
					panel_2.setVisible(true);
				}
			}
		});
	    
	    btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = list.getModel().getSize();
				n= n+1;
				String i=Integer.toString(n);
				String s1 =i + ". Denboraldia";
				
				model.addElement(s1);
			}
		});
	    

	}
	
	public void denboraldiBi() {
		

		
	}
	
	
	public void denboraldiBerri() {
			}

	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
