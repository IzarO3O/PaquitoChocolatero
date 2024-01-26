package erronka2;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.NetPermission;
import java.net.URL;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSpinner;

public class FIBA extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private boolean ireki=false;

	/**
	 * Create the panel.
	 */
	
	public FIBA() {
		
		setBounds(0,0,710, 380);
		setBackground(new Color(128, 128, 128));
		setLayout(null);
		
		menuFIBA();
		
		
		
		
	}
	public void menuFIBA () {
		this.jokalariBerri();
		JButton btnNewButton = new JButton("Jolastu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(549, 13, 145, 30);
		add(btnNewButton);
		
		JButton btnJokalariBerria = new JButton("Jokalari Berria");
		btnJokalariBerria.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				ireki=true;
			}
		});
		btnJokalariBerria.setBounds(24, 13, 145, 30);
		add(btnJokalariBerria);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(128, 128, 255));
		comboBox_1.setBounds(183, 112, 64, 21);
		add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));
		//    panel.drawImage(background, 0, 0, null);
			
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(128, 128, 255));
		comboBox.setBounds(97, 189, 64, 21);
		add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));
			
				
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBackground(new Color(128, 128, 255));
		comboBox_3.setBounds(423, 85, 64, 21);
		add(comboBox_3);
		comboBox_3.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));
					
							
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBackground(new Color(128, 128, 255));
		comboBox_4.setBounds(475, 290, 64, 21);
		add(comboBox_4);
		comboBox_4.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));
							
									
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(new Color(128, 128, 255));
		comboBox_2.setBounds(163, 290, 64, 21);
		add(comboBox_2);
		comboBox_2.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));
									
											
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBackground(new Color(255, 128, 128));
		comboBox_8.setBounds(248, 259, 64, 21);
		add(comboBox_8);
		comboBox_8.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));
											
													
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setBackground(new Color(255, 128, 128));
		comboBox_9.setBounds(183, 85, 64, 21);
		add(comboBox_9);
		comboBox_9.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));
													
															
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBackground(new Color(255, 128, 128));
		comboBox_6.setBounds(475, 259, 64, 21);
		add(comboBox_6);
		comboBox_6.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));
															
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBackground(new Color(255, 128, 128));
		comboBox_5.setBounds(570, 189, 64, 21);
		add(comboBox_5);
		comboBox_5.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));
															
																	
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBackground(new Color(255, 128, 128));
		comboBox_7.setBounds(506, 112, 64, 21);
		add(comboBox_7);
		comboBox_7.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));
																	
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FIBA.class.getResource("/erronka2/court.jpg")));
		lblNewLabel.setBounds(55, 53, 617, 292);
		add(lblNewLabel);

	}
	
	public void jokalariBerri() {
		if (ireki==true) {
			JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(48, 28, 605, 309);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("IZENA");
		lblNewLabel_1.setBounds(46, 40, 45, 13);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(46, 63, 96, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ABIERA (0-120)");
		lblNewLabel_2.setBounds(43, 103, 126, 13);
		panel.add(lblNewLabel_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(46, 126, 30, 20);
		panel.add(spinner_3);
		
		JLabel lblNewLabel_3 = new JLabel("DEFENTZA (0-120)");
		lblNewLabel_3.setBounds(46, 156, 191, 13);
		panel.add(lblNewLabel_3);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(46, 179, 30, 20);
		panel.add(spinner_1);
		
		JLabel lblNewLabel_4 = new JLabel("PUNTERIA (0-120)");
		lblNewLabel_4.setBounds(39, 218, 147, 13);
		panel.add(lblNewLabel_4);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(46, 241, 30, 20);
		panel.add(spinner_2);
		
		JButton btnNewButton_1 = new JButton("SARTU");
		btnNewButton_1.setBounds(333, 62, 85, 21);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(new JFrame(), "Parametro guztiak idatzi","Error",JOptionPane.WARNING_MESSAGE);
				}else {
					int abi = (Integer) spinner_3.getValue();
					int pun = (Integer) spinner_1.getValue();
					int def = (Integer) spinner_2.getValue();

					if (abi>120||abi<0||def>120||def<0||pun>120||pun<0) {
						JOptionPane.showMessageDialog(new JFrame(), "Habilitatea ez da onartzen","Error",JOptionPane.WARNING_MESSAGE);
					}else {
						
					}
				}
		}});
		
				
				 
			}

			
			
		/*	public int getTextField(JSpinner spinner) {
				// TODO Auto-generated method stub
				return 4266;
			}*/
		
	}
}
