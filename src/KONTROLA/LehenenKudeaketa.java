package azterketa;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

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
		panelGoiburua.add(btnSartu);

		btnEzabatu = new JButton("Ezabatu");
		panelGoiburua.add(btnEzabatu);

		btnGarbitu = new JButton("Garbitu");
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
