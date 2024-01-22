package kontrol;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;

public class LehenenKudeaketa extends JFrame{

	private static final long serialVersionUID = 1727390277379407306L;
	private JPanel contentPane;
	private JTextField txtZenbakia;
	private JPanel panelGoiburua;
	private JLabel lblZenbakia;
	private JButton btnSartu;
	private JButton btnEzabatu;
	private JButton btnGarbitu;

	private JPanel panelOina;
	private JLabel lblZenbakienGuztira;
	private JLabel lblZenbakienGuztiraBalioa;
	private JLabel lblBatazbestekoa;
	private JLabel lblBatazbestekoaBalioa;

	private JPanel panelErdikoa;
	private JPanel panelLehenak;
	private JLabel lblLehenak;
	private JList<Integer> lstLehenak;
	private DefaultListModel<Integer> dlmLehenak;
	private JPanel panelEzLehenak;
	private JLabel lblEzLehenak;
	private JList<Integer> lstEzLehenak;
	private DefaultListModel<Integer> dlmEzLehenak;
	private Label label;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LehenenKudeaketa frame = new LehenenKudeaketa();
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
	public LehenenKudeaketa() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		panelGoiburua = new JPanel();
		contentPane.add(panelGoiburua, BorderLayout.NORTH);

		lblZenbakia = new JLabel("Zenbakia");
		panelGoiburua.add(lblZenbakia);

		txtZenbakia = new JTextField();
		txtZenbakia.setHorizontalAlignment(SwingConstants.RIGHT);
		txtZenbakia.setText("0");
		panelGoiburua.add(txtZenbakia);
		txtZenbakia.setColumns(10);
		
		
		btnSartu = new JButton("Sartu");
		btnSartu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = txtZenbakia.getText();
				
				if (txtZenbakia.getText()==null||txtZenbakia.getText().isEmpty()) {
					JOptionPane.showMessageDialog(new JFrame(), "Ez da ezer idatzi","Error",JOptionPane.WARNING_MESSAGE);				
					label.setText("Ez duzu ezer idatzi");
					} 
					
			
				
	
				int n=Integer.parseInt(s.trim()); 
				if (n%2==0){
					label.setText("");
					dlmLehenak.addElement(n);
					lstLehenak.setModel(dlmLehenak);
					
				}else {
					label.setText("");
					dlmEzLehenak.addElement(n);
					lstEzLehenak.setModel(dlmEzLehenak);
				}
			}		
			});
		
		panelGoiburua.add(btnSartu);

		btnEzabatu = new JButton("Ezabatu");
		btnEzabatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if (dlmLehenak.isEmpty()&&dlmEzLehenak.isEmpty()) {
						JOptionPane.showMessageDialog(new JFrame(), "Zerrenda hutsik da","Error",JOptionPane.WARNING_MESSAGE);
					}else 
					label.setText("");
					JList<Integer> zndzbk = null;
					int[] nireSI= zndzbk.getSelectedIndices();
					
					for(int i=nireSI.length-1;i>=0;i--) {
						int zbk=dlmLehenak.elementAt(nireSI[i]);
						dlmLehenak.remove(nireSI[i]);
					
					for(int j=nireSI.length-1;j>=0;j--) {
						int zbke=dlmEzLehenak.elementAt(nireSI[j]);
						dlmEzLehenak.remove(nireSI[j]);
	
			}
		}}});
		panelGoiburua.add(btnEzabatu);

		btnGarbitu = new JButton("Garbitu");
		btnGarbitu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelGoiburua.add(btnGarbitu);

		panelErdikoa = new JPanel();
		contentPane.add(panelErdikoa, BorderLayout.CENTER);
		panelErdikoa.setLayout(new BorderLayout(0, 0));

		panelLehenak = new JPanel();
		panelErdikoa.add(panelLehenak, BorderLayout.WEST);
		panelLehenak.setLayout(new BorderLayout(0, 0));

		// lstLehenak zerrendaren modeloa sortzen dut
		dlmLehenak = new DefaultListModel<Integer>();

		// Zerrenda sortzen dut
		lstLehenak = new JList<Integer>();
		// zerrenda eta modeloa bateratzen ditut
		lstLehenak.setModel(dlmLehenak);
		panelLehenak.add(lstLehenak, BorderLayout.CENTER);

		lblLehenak = new JLabel("Zenbaki Lehenak");
		lblLehenak.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLehenak.setHorizontalAlignment(SwingConstants.CENTER);
		panelLehenak.add(lblLehenak, BorderLayout.NORTH);

		panelEzLehenak = new JPanel();
		panelErdikoa.add(panelEzLehenak, BorderLayout.EAST);
		panelEzLehenak.setLayout(new BorderLayout(0, 0));

		lblEzLehenak = new JLabel("Zenbaki Ez Lehenak");
		lblEzLehenak.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEzLehenak.setHorizontalAlignment(SwingConstants.CENTER);
		panelEzLehenak.add(lblEzLehenak, BorderLayout.NORTH);

		// lstEzLehenak zerrendaren modeloa sortzen dut
		dlmEzLehenak = new DefaultListModel<Integer>();

		// Zerrenda sortzen dut
		lstEzLehenak = new JList<Integer>();
		// zerrenda eta modeloa bateratzen ditut
		lstEzLehenak.setModel(dlmEzLehenak);
		panelEzLehenak.add(lstEzLehenak, BorderLayout.CENTER);
		
		label = new Label("");
		panelErdikoa.add(label, BorderLayout.CENTER);

		panelOina = new JPanel();
		contentPane.add(panelOina, BorderLayout.SOUTH);

		lblZenbakienGuztira = new JLabel("Zenbakien Guztira");
		panelOina.add(lblZenbakienGuztira);

		lblZenbakienGuztiraBalioa = new JLabel("0");
		lblZenbakienGuztiraBalioa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblZenbakienGuztiraBalioa.setHorizontalAlignment(SwingConstants.RIGHT);
		panelOina.add(lblZenbakienGuztiraBalioa);

		lblBatazbestekoa = new JLabel("Batazbestekoa");
		panelOina.add(lblBatazbestekoa);

		lblBatazbestekoaBalioa = new JLabel("0.0");
		lblBatazbestekoaBalioa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBatazbestekoaBalioa.setHorizontalAlignment(SwingConstants.RIGHT);
		panelOina.add(lblBatazbestekoaBalioa);

	}

}
