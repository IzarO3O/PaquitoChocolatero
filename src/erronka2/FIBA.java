package erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.JLabel;

public interface FIBA extends MenuBar {

	public  JPanel FIBAA = new JPanel();
	public  JTextField txtIzena = new JTextField();
	public  JTextField txtEguzkilore = new JTextField();

	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
	
	
	public default void FIBARel() {
		
		FIBAA.setBounds(10, 10, 650, 350);
		FIBAA.setLayout(null);
		
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(10, 10, 300, 300);
		FIBAA.add(panel1);{
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 235, 98, 21);
		panel1.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));

		JComboBox comboBox2 = new JComboBox();
		comboBox2.setBounds(10, 235, 98, 21);
		panel1.add(comboBox2);
		comboBox2.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));

		JComboBox comboBox3 = new JComboBox();
		comboBox3.setBounds(10, 235, 98, 21);
		panel1.add(comboBox3);
		comboBox3.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));

		JComboBox comboBox4 = new JComboBox();
		comboBox4.setBounds(10, 235, 98, 21);
		panel1.add(comboBox4);
		comboBox4.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));

		JComboBox comboBox5 = new JComboBox();
		comboBox5.setBounds(10, 235, 98, 21);
		panel1.add(comboBox5);
		comboBox5.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));

		
		}
		
		
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(325, 10, 300, 300);
		FIBAA.add(panel2);{
			
		JComboBox comboBox12 = new JComboBox();
		comboBox12.setBounds(10, 235, 98, 21);
		panel2.add(comboBox12);
		comboBox12.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));

		JComboBox comboBox13 = new JComboBox();
		comboBox13.setBounds(10, 235, 98, 21);
		panel2.add(comboBox13);
		comboBox13.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));

		JComboBox comboBox14 = new JComboBox();
		comboBox14.setBounds(10, 235, 98, 21);
		panel2.add(comboBox14);
		comboBox14.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));

		JComboBox comboBox15 = new JComboBox();
		comboBox15.setBounds(10, 235, 98, 21);
		panel2.add(comboBox15);
		comboBox15.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));

		JComboBox comboBox16 = new JComboBox();
		comboBox16.setBounds(10, 235, 98, 21);
		panel2.add(comboBox16);
		comboBox16.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));

		}
		/*
		JButton Botoia = new JButton("Jolastu");
		Botoia.setBounds(270, 315, 100, 25);
		Botoia.setBounds(null);
		FIBAA.add(Botoia);
		*/
		


	}
	/*public default void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FIBA frame = new FIBA();
					frame.FIBA.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the frame.
	 
	public default void FIBA() {
		FIBA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FIBA.setBounds(100, 100, 693, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 235, 98, 21);
		contentPane.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));

		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(86, 343, 138, 21);
		contentPane.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(209, 235, 112, 21);
		contentPane.add(comboBox_2);
		comboBox_2.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));
		
		JButton btnNewButton = new JButton("Jolastu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(287, 390, 104, 21);
		contentPane.add(btnNewButton);

		
		JComboBox comboBox_3_2 = new JComboBox();
		comboBox_3_2.setBounds(537, 90, 132, 21);
		contentPane.add(comboBox_3_2);
		comboBox_3_2.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));

		
		JComboBox comboBox_3_3 = new JComboBox();
		comboBox_3_3.setBounds(378, 235, 132, 21);
		contentPane.add(comboBox_3_3);
		comboBox_3_3.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));

		
		JComboBox comboBox_3_5 = new JComboBox();
		comboBox_3_5.setBounds(547, 235, 132, 21);
		contentPane.add(comboBox_3_5);
		comboBox_3_5.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 53, 326, 327);
		contentPane.add(panel);
				panel.setLayout(null);
		
				JComboBox comboBox_4 = new JComboBox();
				comboBox_4.setBounds(193, 72, 99, 19);
				panel.add(comboBox_4);
				comboBox_4.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));
				
						JComboBox comboBox_3 = new JComboBox();
						comboBox_3.setBounds(28, 52, 88, 21);
						panel.add(comboBox_3);
						comboBox_3.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(353, 53, 326, 327);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
				
				JComboBox comboBox_3_1 = new JComboBox();
				comboBox_3_1.setBounds(20, 108, 132, 21);
				panel_1.add(comboBox_3_1);
				comboBox_3_1.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));
				
						
						JComboBox comboBox_3_4 = new JComboBox();
						comboBox_3_4.setBounds(95, 257, 132, 21);
						panel_1.add(comboBox_3_4);
						comboBox_3_4.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));
						
						txtIzena = new JTextField();
						txtIzena.setBounds(128, 20, 96, 19);
						contentPane.add(txtIzena);
						txtIzena.setText("Brakizefaloak");
						txtIzena.setColumns(10);
						
								
								txtEguzkilore = new JTextField();
								txtEguzkilore.setBounds(471, 20, 96, 19);
								contentPane.add(txtEguzkilore);
								txtEguzkilore.setText("Hidrozefalikoak");
								txtEguzkilore.setColumns(10);

		
	}*/
}
