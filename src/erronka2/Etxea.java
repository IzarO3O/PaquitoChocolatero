package erronka2;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Etxea extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	public static ComboBoxModel aaa;
	public static final JComboBox comboBox = new JComboBox();

	/**
	 * Create the panel.
	 */
	public Etxea() {
		Base();
			
			
		
		
		
	}
	
	void Base(){
		setBackground(new Color(241, 251, 117));
		setLayout(null);
		
		comboBox.setBounds(429, 73, 179, 43);
	    comboBox.addItem("22-23");
	    comboBox.addItem("23-24");

		add(comboBox);
		

		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setAlignmentY(Component.TOP_ALIGNMENT);
		scrollPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		scrollPane.setBounds(88, 163, 509, 119);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
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
				"Taldea", "IP", "GP", "Berdinak"
			}
		));
		
		JLabel lblNewLabel = new JLabel("1");
		lblNewLabel.setBounds(63, 183, 15, 13);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2");
		lblNewLabel_1.setBounds(63, 200, 15, 13);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("3");
		lblNewLabel_2.setBounds(63, 217, 15, 13);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("4");
		lblNewLabel_3.setBounds(63, 233, 15, 13);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("5");
		lblNewLabel_4.setBounds(63, 248, 15, 13);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("6");
		lblNewLabel_5.setBounds(63, 265, 15, 13);
		add(lblNewLabel_5);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem()=="22-23") {
					JOptionPane.showMessageDialog(new JFrame(), "1 den","Error",JOptionPane.WARNING_MESSAGE);
					table.setModel(new DefaultTableModel (
							new Object[][]  {
								{null, null, null},
								{null, null, null},
								{null, null, null},
								{null, null, null},
								{null, null, null},
								{null, null, null},
							},
							new String[] {
									"Taldea", "IP", "GP"
								}
							));

				}else if (comboBox.getSelectedItem()=="23-24") {
					JOptionPane.showMessageDialog(new JFrame(), "2 den","Error",JOptionPane.WARNING_MESSAGE);

				}
			}
		});

		}
}
