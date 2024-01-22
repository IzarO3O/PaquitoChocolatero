package WindowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;

public class Adibideaondo extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<String> cmbIzenak;
	private JList<String> zndIzenak;
	private DefaultListModel<String> dlm;
	private JButton btnGehitu;
	private JButton btnEzabatu;
	private JPanel panel2;
	private JTextField txtEsanIzenBat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adibideaondo frame = new Adibideaondo();
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
	public Adibideaondo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		setContentPane(contentPane);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 75, 208, 147);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		
		//COMBO BOX BATEN EGITURA
		cmbIzenak = new JComboBox<String>();
		cmbIzenak.setBounds(39, 32, 151, 22);
		panel1.add(cmbIzenak);
		cmbIzenak.setToolTipText("Izenak");
		cmbIzenak.addItem("Nico");
		cmbIzenak.addItem("Roman");
		cmbIzenak.addItem("Michael");
		cmbIzenak.addItem("Trevor");
		cmbIzenak.addItem("Franklin");
		cmbIzenak.addItem("CJ");
		cmbIzenak.addItem("Chop");
		
		
		cmbIzenak.setSelectedIndex(0);
		
		btnGehitu = new JButton("Gehitu zerrendara");
		btnGehitu.setBounds(39, 72, 151, 23);
		panel1.add(btnGehitu);
		
		btnEzabatu = new JButton("Zerrendatik ezabatu");
		btnEzabatu.setBounds(39, 105, 151, 23);
		panel1.add(btnEzabatu);
		
		zndIzenak = new JList<String>();
		zndIzenak.setBounds(39, 34, 149, 184);
		//contentPane.add(zndIzenak);
		
		panel2 = new JPanel();
		panel2.setBounds(218, 0, 216, 222);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		panel2.add(zndIzenak);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 222, 434, 39);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblErrorea = new JLabel("");
		lblErrorea.setForeground(new Color(255, 0, 0));
		lblErrorea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblErrorea.setBounds(10, 5, 414, 23);
		panel.add(lblErrorea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 208, 78);
		contentPane.add(panel_1);
		
		txtEsanIzenBat = new JTextField();
		txtEsanIzenBat.setText("Esan Izen bat");
		panel_1.add(txtEsanIzenBat);
		txtEsanIzenBat.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (txtEsanIzenBat.getSelectedText() ==null) {
				lblErrorea.setText("Idatzi izena mesedez");
			}else {
				lblErrorea.setText(" ");
				String izenab= (dlm).get(ABORT);
				dlm.addElement(izenab);
				zndIzenak.setModel(dlm);
			}
			
			}
		});
		panel_1.add(btnNewButton);
		
		dlm= new DefaultListModel <String> ();
		
		btnGehitu.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(cmbIzenak.getSelectedItem() ==null) {
					lblErrorea.setText("Comboa hutsik dago.");
				}else {
					lblErrorea.setText("");
				//comboboxetik zerrendara pasa
				String izena= cmbIzenak.getSelectedItem().toString();
				dlm.addElement(izena);
				zndIzenak.setModel(dlm);
				
				//comboboxetik ezabatu
				cmbIzenak.removeItem(izena);
				}
				
				
				
			}
		});
		
		btnEzabatu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//hutsik badago mezua
				if(dlm.isEmpty()) {
					lblErrorea.setText("Zerrenda hutsik dago.");
					//leihoa agertzeko
					JOptionPane.showMessageDialog(new JFrame(), "Zerrenda hutsik da","Error",JOptionPane.WARNING_MESSAGE);
				}else {
					//aukeratutako izena ezabatu zerrendatik
					lblErrorea.setText("");
					int[] nireSI= zndIzenak.getSelectedIndices();
					
					for(int i=nireSI.length-1;i>=0;i--) {
						String izena=dlm.elementAt(nireSI[i]);
						dlm.remove(nireSI[i]);
						
						//gahitu combora
						cmbIzenak.addItem(izena);
					}
					
					
				}
				
				
			}
			
		});
				
		
		
	}
}