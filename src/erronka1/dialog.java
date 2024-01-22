package erronka1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public interface dialog {
	
	/**
	 * 
	 * JDialog sortu erroreak adierazteko
	 * JDialog aren botoia sortu
	 * Idazten den lerroa eta botoiarentzako bi JPanel
	 * 
	 * 
	**/
	
	public JDialog dial = new JDialog();
	public JButton btnBaieztatu = new JButton();
	public JPanel contPane = new JPanel();
	public JPanel btnPane = new JPanel();
	public JButton btnEztatu = new JButton();
	
	//Label bat sortu errore bat gertatzen bada
	public JLabel lblError = new JLabel("Zerbait tzarto atera da... :(");
	
	public default void dialogRel() {
		
		//JDialog-aren barruan botoia eta lerroa insertatu
		btnPane.add(btnBaieztatu);
		contPane.add(lblError);
		
		//botoiari layauta kudeatu
		btnPane.setLayout(new FlowLayout());
		btnPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//ez agertzeko hasieran
		btnEztatu.setVisible(false);
		//JPanel-ean sartu
		btnPane.add(btnEztatu);
		btnEztatu.setText("Ezeztatu");
		
		//JPanel eta JDialog-aren layauta kudeatu
		contPane.setLayout(null);
		dial.getContentPane().add(contPane, BorderLayout.CENTER);
		btnPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		dial.getContentPane().add(btnPane, BorderLayout.SOUTH);
		
		//lerroa kokatu JPanel barruan
		lblError.setLocation(0, 50);
		lblError.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		/**
		 * 
		 * Defaulteko JDialog-aren izenburua tamaina
		 * JButton eta JLabel-ren kokatu
		 * 
		**/
		dial.setResizable(false);
		dial.setTitle("SingUp: ERROR");
		dial.setBounds(300, 200, 300, 200);
		lblError.setSize(300, 20);
		btnBaieztatu.setSize(88, 20);
		btnBaieztatu.setText("Baieztatu");
		
		btnBaieztatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//dialog-a itzi
				dial.setVisible(false);
			}
		});
		
		
	}
}
