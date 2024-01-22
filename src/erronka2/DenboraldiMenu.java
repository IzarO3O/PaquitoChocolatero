package erronka2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public interface DenboraldiMenu extends MenuBar   {

	public JPanel DenboraldiEzarpenak = new JPanel();


	/**
	 * Create the panel.
	 * @wbp.parser.entryPoint
	 */
	public default void DenboraldiMenu() {
		JTextField Izena = new JTextField ("Eman Izena");
		DenboraldiEzarpenak.add(Izena);
		
		JList editatzeko = new JList();
		editatzeko.setBounds(10, 10, 218, 157);
		DenboraldiEzarpenak.add(editatzeko);
		editatzeko.setModel(new DefaultComboBoxModel<String>(new String[] {}));
		
		JList list = new JList();
		list.setBounds(10, 10, 218, 157);
		DenboraldiEzarpenak.add(list);
		list.setModel(new DefaultComboBoxModel<String>(new String[] {"1. Denboraldia", "2. Denboraldia"}));
		
		JButton Berria = new JButton ("Berria");
		DenboraldiEzarpenak.add(Berria);
		Berria.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent actionEvent) {
			editatzeko.setModel(new DefaultComboBoxModel<String>(new String[] {"+ Denboraldia"}));



        }	
		});
		
		
		JButton Ezabatu = new JButton ("Berria");
		DenboraldiEzarpenak.add(Ezabatu);
		Ezabatu.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent actionEvent) {
        	


        }	
		});
		

		


		
		
		
		
		
		
	}

}
