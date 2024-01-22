package erronkaoihan;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class EmaitzaKalku extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_6;
	private JSeparator separator_1;
	private JLabel lblTitulu;
	private JButton btnNewButton_1;
	private JLabel lblAbisuaTaldea1;
	private JLabel lblAbisuaDoblea1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	

	

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmaitzaKalku frame = new EmaitzaKalku();
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
	public EmaitzaKalku() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 924, 695);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(18, 181, 408, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Kalkulatu");
		btnNewButton.setBounds(36, 421, 183, 42);
		contentPane.add(btnNewButton);
		
		
		JLabel lblAukeratuTalde1 = new JLabel("Aukeratu Ekialdeko Konferentziako talde bat:");
		lblAukeratuTalde1.setBounds(18, 78, 408, 13);
		contentPane.add(lblAukeratuTalde1);
		
		JLabel lblZenbatLibre1 = new JLabel("Zenbat aske sartu ditu guztira:");
		lblZenbatLibre1.setBounds(18, 158, 408, 13);
		contentPane.add(lblZenbatLibre1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(18, 259, 408, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(18, 491, 882, 141);
		contentPane.add(textField_3);
		
		JLabel lblZenbatTriple1 = new JLabel("Zenbat triple:");
		lblZenbatTriple1.setBounds(18, 236, 408, 13);
		contentPane.add(lblZenbatTriple1);
		
		JLabel lblZenbatDoble1 = new JLabel("Zenbat doble:");
		lblZenbatDoble1.setBounds(18, 320, 408, 13);
		contentPane.add(lblZenbatDoble1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(18, 343, 408, 19);
		contentPane.add(textField_6);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(18, 401, 869, 8);
		contentPane.add(separator_1);
		
		lblTitulu = new JLabel("NBA-KO PARTIDU EMAITZEN KALKULAGAILUA");
		lblTitulu.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulu.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 22));
		lblTitulu.setBounds(36, 23, 845, 42);
		contentPane.add(lblTitulu);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "76ers", "Celtics", "Pacers", "Hawks", "Bucks"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(18, 101, 408, 21);
		contentPane.add(comboBox);
		
		btnNewButton_1 = new JButton("Ezabatu");
		btnNewButton_1.setBounds(683, 421, 183, 42);
		contentPane.add(btnNewButton_1);
		
		lblAbisuaTaldea1 = new JLabel("");
		lblAbisuaTaldea1.setForeground(new Color(255, 0, 0));
		lblAbisuaTaldea1.setBounds(18, 132, 213, 19);
		contentPane.add(lblAbisuaTaldea1);
		
		lblAbisuaTaldea1.setText("");
		
		JLabel lblAbisuaLibrea1 = new JLabel("");
		lblAbisuaLibrea1.setForeground(Color.RED);
		lblAbisuaLibrea1.setBounds(18, 210, 213, 19);
		contentPane.add(lblAbisuaLibrea1);
		
		JLabel lblAbisuaTriplea1 = new JLabel("");
		lblAbisuaTriplea1.setForeground(Color.RED);
		lblAbisuaTriplea1.setBounds(18, 291, 213, 19);
		contentPane.add(lblAbisuaTriplea1);
		
		lblAbisuaDoblea1 = new JLabel("");
		lblAbisuaDoblea1.setForeground(Color.RED);
		lblAbisuaDoblea1.setBounds(18, 372, 213, 19);
		contentPane.add(lblAbisuaDoblea1);
		
		JLabel lblAukeratuTalde2 = new JLabel("Aukeratu Mendebaldeko Konferentziako talde bat:");
		lblAukeratuTalde2.setBounds(480, 78, 408, 13);
		contentPane.add(lblAukeratuTalde2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "Nuggets", "Mavericks", "Timberwolves", "Rockets", "Thunder"}));
		comboBox_1.setToolTipText("");
		comboBox_1.setBounds(480, 101, 408, 21);
		contentPane.add(comboBox_1);
		
		JLabel lblAbisuaTaldea2 = new JLabel("");
		lblAbisuaTaldea2.setForeground(Color.RED);
		lblAbisuaTaldea2.setBounds(480, 132, 213, 19);
		contentPane.add(lblAbisuaTaldea2);
		
		JLabel lblZenbatLibre2 = new JLabel("Zenbat aske sartu ditu guztira:");
		lblZenbatLibre2.setBounds(480, 159, 408, 13);
		contentPane.add(lblZenbatLibre2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(480, 182, 408, 19);
		contentPane.add(textField_4);
		
		JLabel lblAbisuaLibrea2 = new JLabel("");
		lblAbisuaLibrea2.setForeground(Color.RED);
		lblAbisuaLibrea2.setBounds(480, 211, 213, 19);
		contentPane.add(lblAbisuaLibrea2);
		
		JLabel lblZenbatTriple2 = new JLabel("Zenbat triple:");
		lblZenbatTriple2.setBounds(480, 240, 408, 13);
		contentPane.add(lblZenbatTriple2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(480, 265, 408, 19);
		contentPane.add(textField_5);
		
		JLabel lblAbisuaTriplea2 = new JLabel("");
		lblAbisuaTriplea2.setForeground(Color.RED);
		lblAbisuaTriplea2.setBounds(480, 294, 213, 19);
		contentPane.add(lblAbisuaTriplea2);
		
		JLabel lblZenbatDoble2 = new JLabel("Zenbat doble:");
		lblZenbatDoble2.setBounds(480, 323, 408, 13);
		contentPane.add(lblZenbatDoble2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(480, 346, 408, 19);
		contentPane.add(textField_7);
		
		JLabel lblAbisuaDoblea2 = new JLabel("");
		lblAbisuaDoblea2.setForeground(Color.RED);
		lblAbisuaDoblea2.setBounds(480, 375, 213, 19);
		contentPane.add(lblAbisuaDoblea2);
		
		btnNewButton_1.addActionListener((ActionListener)new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				comboBox.setSelectedItem(null);
				comboBox_1.setSelectedItem(null);
				
				
				
			}
	
		});
		
	
		
		btnNewButton.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int zbk1 = 0;
				int zbk2 = 0;
				int zbk3 = 0;
				int zbk4 = 0;
				int zbk5 = 0;
				int zbk6 = 0;
				
				String aux1 = null;
				String aux2 = null;
				
				
				
						
						
				if(comboBox.getSelectedItem()==null || comboBox.getSelectedItem().equals("")) {
					
				lblAbisuaTaldea1.setText("Aukeratu behar duzu talde bat!");
					
				}
				else {
				lblAbisuaTaldea1.setText("");
				aux1 = comboBox.getSelectedItem().toString();
				}
				
				if(textField_1.getText()==null || textField_1.getText().equals("")) {
					lblAbisuaLibrea1.setText("Aukeratu behar duzu talde bat!");
					textField_3.setText(" ");
					
				} else {
					lblAbisuaLibrea1.setText("");
					zbk1 = Integer.parseInt(textField_1.getText());
				}
				
				if(textField_2.getText()==null || textField_2.getText().equals("") ) {
					lblAbisuaTriplea1.setText("Aukeratu behar duzu talde bat!");
				} else {
					lblAbisuaTriplea1.setText("");
					zbk2 = Integer.parseInt(textField_2.getText());
				}
				
				if(textField_6.getText()==null || textField_6.getText().equals("")) {
					lblAbisuaDoblea1.setText("Aukeratu behar duzu talde bat!");
				} else {
					lblAbisuaDoblea1.setText("");
					zbk3 = Integer.parseInt(textField_6.getText());
				}
				
				if(comboBox_1.getSelectedItem()==null || comboBox_1.getSelectedItem().equals("")) {
					
					lblAbisuaTaldea2.setText("Aukeratu behar duzu talde bat!");
				}
				else {
					lblAbisuaTaldea2.setText("");
					aux2 = comboBox_1.getSelectedItem().toString();
				}
				
				if(textField_4.getText()==null || textField_4.getText().equals("")) {
					lblAbisuaLibrea2.setText("Aukeratu behar duzu talde bat!");
				} else {
					lblAbisuaLibrea2.setText("");
					zbk4= Integer.parseInt(textField_4.getText());
				}
				
				if(textField_5.getText()==null || textField_5.getText().equals("")) {
					lblAbisuaTriplea2.setText("Aukeratu behar duzu talde bat!");
				} else {
					lblAbisuaTriplea2.setText("");
					zbk5 = Integer.parseInt(textField_5.getText());
				}
				
				if(textField_7.getText()==null || textField_7.getText().equals("")) {
					lblAbisuaDoblea2.setText("Aukeratu behar duzu talde bat!");
				} else {
					lblAbisuaDoblea2.setText("");
					zbk6 = Integer.parseInt(textField_7.getText());
				}
				

				
				//int zbk1 = Integer.parseInt(textField_1.getText());
				//int zbk2 = Integer.parseInt(textField_2.getText());
				//int zbk3 = Integer.parseInt(textField_6.getText());
				
				zbk1 = (zbk1 * 1);
				zbk2 = (zbk2 * 3);
				zbk3 = (zbk3 * 2);
				
				int emaitza1 = zbk1 + zbk2 + zbk3;
					
				
				zbk4 = (zbk4 * 1);
				zbk5 = (zbk5 * 3);
				zbk6 = (zbk6 * 2);
				
				int emaitza2 = zbk4 + zbk5 + zbk6;
				
					
				if(emaitza1 > emaitza2) {
					
					textField_3.setText( aux1 + " taldeak " + emaitza1 +" puntu lortu ditu eta " + aux2 + " taldeak "+ emaitza2 + ". Beraz, " + aux1 + " taldeak irabazi egin du partidua." );
				}
				else if (emaitza1 < emaitza2){
					textField_3.setText( aux2 + " taldeak " + emaitza2 +" puntu lortu ditu eta " + aux1 + " taldeak "+ emaitza1 + ". Beraz, " + aux2 + " taldeak irabazi egin du partidua." );
				}	
				
				else {
					textField_3.setText("Talde biak emaitz berbera lortu dute, hau da, " + emaitza1 + ". Beraz, partidua ez du inor irabazi."  );
				}
				
				
			
			}
			
			
		});
	}	
}