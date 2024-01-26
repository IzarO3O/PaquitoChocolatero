package erronka2;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.Color;

public class Etxea extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Etxea() {
		Base();
			
			
		
		
		
	}
	
	void Base(){
		setBackground(new Color(241, 251, 117));
		setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Posizioa", "Taldea", "IP", "GP"
			}
		));
		table.setBounds(46, 134, 476, 117);
		add(table);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"22-23", "23-24", "24-25"}));
		comboBox.setBounds(429, 73, 200, 50);
		add(comboBox);

		}

}
