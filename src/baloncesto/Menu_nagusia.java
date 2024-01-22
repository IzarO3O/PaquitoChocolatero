package ERRONKA;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
public class Menu_nagusia extends JFrame {
	
	//Geure asmoa orrialde honetan, aukeratzea bi konferentzien artean eta botoian sakatzean beste orrialde batera eraman
	//konkretuki, ekialde eta mendebalde orriak. 

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtho;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_nagusia frame = new Menu_nagusia();
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
	public Menu_nagusia() {
		setAlwaysOnTop(false);
			setTitle("NBA");

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			
			setBounds(100, 100, 465, 256);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			//Geure orrialdearen izena
			
			JLabel lblNBA = new JLabel("NBA");
			lblNBA.setHorizontalAlignment(SwingConstants.CENTER);
			lblNBA.setFont(new Font("SansSerif", Font.BOLD, 33));
			lblNBA.setBounds(10, 10, 431, 31);
			contentPane.add(lblNBA);
			
			//Ateratzen zaigu agindu bat zer konferentzia aukeratu nahi dugun
			JLabel lblAukeratu = new JLabel("Aukeratu konferentzia edo kalkulagailua:");
			lblAukeratu.setHorizontalAlignment(SwingConstants.CENTER);
			lblAukeratu.setFont(new Font("SansSerif", Font.PLAIN, 14));
			lblAukeratu.setBounds(10, 60, 431, 14);
			contentPane.add(lblAukeratu);

			//Botoi bat sortu dugu lehen konferentzia aukeratzeko
			JButton btnEkialde = new JButton("EKIALDE");
			btnEkialde.addActionListener(e -> new Ekialdea().setVisible(true)); 
			
					

			btnEkialde.setBounds(65, 95, 117, 31);
			contentPane.add(btnEkialde);
			
			//Bigarren botoi bat sortu dugu mendebalde konferentzia aukeratzeko
			JButton btnMendebalde = new JButton("MENDEBALDE");
			btnMendebalde.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Mendebaldea newframe = new Mendebaldea();
					newframe.setVisible(true);
		
				}

			});
			btnMendebalde.setBounds(253, 95, 133, 31);
			contentPane.add(btnMendebalde);
			
			//Azken botoi hau partiduen kalkulagailua hautatzeko
			JButton btnPartidu_Kalk = new JButton("PARTIDU KALKULAGAILUA");
			btnPartidu_Kalk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					EmaitzaKalku newframe = new EmaitzaKalku();
					newframe.setVisible(true);
				}
			});
			btnPartidu_Kalk.setBounds(115, 155, 204, 42);
			contentPane.add(btnPartidu_Kalk);
			
	}
}
