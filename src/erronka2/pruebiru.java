package erronka2;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class pruebiru extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtDenboraldiarenIzena;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	
	public pruebiru() {
		setBackground(new Color(255, 0, 128));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 192));
		panel.setBounds(23, 34, 321, 400);
		add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Generatu");
		btnNewButton_2.setBounds(16, 5, 75, 21);
		panel.add(btnNewButton_2);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(16, 99, 114, 21);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel<String>(new String [] {
				"Boston Celtics", "Brooklyn Nets", "Chicago Bulls", "Cleveland Cavaliers", "Atlanta Hawks","Charlotte Hornets"}));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(150, 99, 114, 21);
		panel.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String [] {
				"Boston Celtics", "Brooklyn Nets", "Chicago Bulls", "Cleveland Cavaliers", "Atlanta Hawks","Charlotte Hornets"}));
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(16, 192, 114, 21);
		panel.add(comboBox_2);
		comboBox_2.setModel(new DefaultComboBoxModel<String>(new String [] {
				"Boston Celtics", "Brooklyn Nets", "Chicago Bulls", "Cleveland Cavaliers", "Atlanta Hawks","Charlotte Hornets"}));
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(150, 290, 114, 21);
		panel.add(comboBox_3);
		comboBox_3.setModel(new DefaultComboBoxModel<String>(new String [] {
				"Boston Celtics", "Brooklyn Nets", "Chicago Bulls", "Cleveland Cavaliers", "Atlanta Hawks","Charlotte Hornets"}));
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(150, 192, 114, 21);
		panel.add(comboBox_4);
		comboBox_4.setModel(new DefaultComboBoxModel<String>(new String [] {
				"Boston Celtics", "Brooklyn Nets", "Chicago Bulls", "Cleveland Cavaliers", "Atlanta Hawks","Charlotte Hornets"}));
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(16, 290, 114, 21);
		panel.add(comboBox_5);
		comboBox_5.setModel(new DefaultComboBoxModel<String>(new String [] {
				"Boston Celtics", "Brooklyn Nets", "Chicago Bulls", "Cleveland Cavaliers", "Atlanta Hawks","Charlotte Hornets"}));
		
		textField = new JTextField();
		textField.setBounds(51, 130, 32, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(189, 130, 32, 27);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(51, 221, 32, 27);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(189, 219, 32, 27);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(51, 317, 32, 27);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(189, 317, 32, 27);
		panel.add(textField_5);
		
		JLabel lblNewLabel = new JLabel("Ida");
		lblNewLabel.setBounds(26, 32, 200, 50);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_2_1 = new JButton("Gorde");
		btnNewButton_2_1.setBounds(214, 5, 75, 21);
		panel.add(btnNewButton_2_1);
		
	}
	
	public void menu () {
		txtDenboraldiarenIzena = new JTextField();
		txtDenboraldiarenIzena.setText("Denboraldiaren izena");
		txtDenboraldiarenIzena.setBounds(395, 18, 149, 41);
		add(txtDenboraldiarenIzena);
		txtDenboraldiarenIzena.setColumns(10);
		
		JButton btnNewButton = new JButton("Sortu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(554, 18, 168, 41);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sartu");
		btnNewButton_1.setBounds(554, 120, 168, 41);
		add(btnNewButton_1);
	}
	
	public void denboraldiBerri() {
		
		JMenu mnNewMenu = new JMenu("New menu");
		mnNewMenu.setBounds(20, 28, 111, 24);
		add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("1. Jaurdunaldia");
		mnNewMenu.add(mntmNewMenuItem);

	}

	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
