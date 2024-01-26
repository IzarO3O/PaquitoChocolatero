package erronka2;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
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

public class Denboraldiak extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtDenboraldiarenIzena;
	private boolean jaur1 = false;

	/**
	 * Create the panel.
	 */
	
	public Denboraldiak() {
		menu();
	}
	
	public void menu () {
		setLayout(null);
		txtDenboraldiarenIzena = new JTextField();
		txtDenboraldiarenIzena.setText("Denboraldiaren izena");
		txtDenboraldiarenIzena.setBounds(591, 112, 96, 19);
		add(txtDenboraldiarenIzena);
		txtDenboraldiarenIzena.setColumns(10);
		
		JButton btnNewButton = new JButton("Sortu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnNewButton.setBounds(558, 38, 57, 21);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sartu");
		btnNewButton_1.setBounds(499, 86, 57, 21);
		add(btnNewButton_1);
	}
	
	public void denboraldiBerri() {
		this.denboraldiBerri();
		setBackground(new Color(255, 0, 128));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 192));
		panel.setBounds(10, 10, 321, 400);
		add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(16, 59, 114, 21);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel<String>(new String [] {
				"Boston Celtics", "Brooklyn Nets", "Chicago Bulls", "Cleveland Cavaliers", "Atlanta Hawks","Charlotte Hornets"}));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(150, 59, 114, 21);
		panel.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String [] {
				"Boston Celtics", "Brooklyn Nets", "Chicago Bulls", "Cleveland Cavaliers", "Atlanta Hawks","Charlotte Hornets"}));
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(16, 121, 114, 21);
		panel.add(comboBox_2);
		comboBox_2.setModel(new DefaultComboBoxModel<String>(new String [] {
				"Boston Celtics", "Brooklyn Nets", "Chicago Bulls", "Cleveland Cavaliers", "Atlanta Hawks","Charlotte Hornets"}));
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(150, 183, 114, 21);
		panel.add(comboBox_3);
		comboBox_3.setModel(new DefaultComboBoxModel<String>(new String [] {
				"Boston Celtics", "Brooklyn Nets", "Chicago Bulls", "Cleveland Cavaliers", "Atlanta Hawks","Charlotte Hornets"}));
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(150, 121, 114, 21);
		panel.add(comboBox_4);
		comboBox_4.setModel(new DefaultComboBoxModel<String>(new String [] {
				"Boston Celtics", "Brooklyn Nets", "Chicago Bulls", "Cleveland Cavaliers", "Atlanta Hawks","Charlotte Hornets"}));
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(16, 183, 114, 21);
		panel.add(comboBox_5);
		comboBox_5.setModel(new DefaultComboBoxModel<String>(new String [] {
				"Boston Celtics", "Brooklyn Nets", "Chicago Bulls", "Cleveland Cavaliers", "Atlanta Hawks","Charlotte Hornets"}));
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(46, 90, 45, 21);
		panel.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(181, 90, 45, 21);
		panel.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(46, 152, 45, 21);
		panel.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(181, 152, 45, 21);
		panel.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(46, 220, 45, 21);
		panel.add(spinner_4);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(181, 220, 45, 21);
		panel.add(spinner_5);
		
		JLabel lblNewLabel = new JLabel("Ida");
		lblNewLabel.setBounds(26, 10, 200, 50);
		panel.add(lblNewLabel);
		

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
		panel.add(btnNewButton_2);
		
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
					jaur1 = true;
				}
				}
			}
		});
		btnNewButton_2_1.setBounds(221, 273, 75, 21);
		panel.add(btnNewButton_2_1);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(215, 153, 204));
		panel_1.setBounds(376, 34, 337, 204);
		add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"1. Jaudunaldia", "2. Jaudunaldia", "3. Jaudunaldia", "4. Jaudunaldia", "5. Jaudunaldia", "6. Jaudunaldia", "7. Jaudunaldia", "8. Jaudunaldia", "9. Jaudunaldia", "10. Jaudunaldia"}));
		comboBox_6.setBounds(35, 10, 200, 50);
		panel_1.add(comboBox_6);
		
		Button button = new Button("Aukeratu");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (comboBox_6.getSelectedItem()=="2. Jaudunaldia"&&jaur1==false) {
				JOptionPane.showMessageDialog(new JFrame(), "Lehenengo jaurdunaldua amaitu behar duzu","Error",JOptionPane.WARNING_MESSAGE);

			}
			}
		});
		button.setBounds(147, 149, 116, 31);
		panel_1.add(button);

		
	}

	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
