package LeihoenAdibideak;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class algo extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<String> cmbIzenak;
	private JList<String> zndIzenak;
	private DefaultListModel<String> dlm;
	private JButton btnGehitu;
	private JButton btnEzabatu;
	private JPanel panel2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					algo frame = new algo();
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
	public algo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		setContentPane(contentPane);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 208, 222);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		//COMBO BOX BATEN EGITURA
		JComboBox<String> cmbIzenak = new JComboBox<String>();
		cmbIzenak.setToolTipText("Izenak");
		cmbIzenak.addItem("Nico");
		cmbIzenak.addItem("Roman");
		cmbIzenak.addItem("Michael");
		cmbIzenak.addItem("Trevor");
		cmbIzenak.addItem("Franklin");
		cmbIzenak.addItem("CJ");
		cmbIzenak.addItem("Chop");
		cmbIzenak.setBounds(39, 82, 151, 22);
		panel1.add(cmbIzenak);
		
		cmbIzenak.setSelectedIndex(0);
		
		btnGehitu = new JButton("Gehitu zerrendara");
		btnGehitu.setBounds(39, 115, 151, 23);
		panel1.add(btnGehitu);
		
		btnEzabatu = new JButton("Zerrendatik ezabatu");
		
		btnEzabatu.setBounds(39, 149, 151, 23);
		panel1.add(btnEzabatu);
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		JList<String> zndIzenak = new JList<String>(model);
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
		
		JLabel lblErrorea = new JLabel("Hemen erroreak agertu beharko dira");
		lblErrorea.setVisible(false);
		lblErrorea.setForeground(new Color(255, 0, 0));
		lblErrorea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblErrorea.setBounds(10, 5, 414, 23);
		panel.add(lblErrorea);
		
		btnGehitu.addActionListener(new ActionListener () {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					
					if(cmbIzenak.getSelectedIndex() == -1) {
						lblErrorea.setVisible(true);
					}else {
						model.addElement(cmbIzenak.getSelectedItem().toString());
						cmbIzenak.removeItem(cmbIzenak.getSelectedItem().toString());
					}
			}
			
		});
		
		btnEzabatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int[] selectedIndices = zndIzenak.getSelectedIndices();

					// Eliminar los elementos seleccionados del modelo en orden inverso
					for (int i = selectedIndices.length - 1; i >= 0; i--) {
						cmbIzenak.addItem((String) model.get(selectedIndices[i]));
						model.removeElementAt(selectedIndices[i]);
					}
				} catch (Exception e2) {
					lblErrorea.setText(e2.getMessage());
				}

			}
		});
		zndIzenak.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	}
}
