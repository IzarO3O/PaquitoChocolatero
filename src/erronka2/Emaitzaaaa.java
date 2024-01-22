package erronka2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public interface Emaitzaaaa extends FIBA {

	public JPanel contPanel = new JPanel();

	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
/*	public static void main(String[] args) {
		try {
			Emaitzaaaa dialog = new Emaitzaaaa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public default void Emaitzaaaa() {
		
		contPanel.setBounds(0, 100, 450, 300);
		contPanel.setLayout(null);
		contPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		{
			JLabel lblNewLabel = new JLabel("EMAITZA");
			lblNewLabel.setLayout(new FlowLayout(FlowLayout.CENTER));
			contPanel.add(lblNewLabel);
			//lblNewLabel.setBounds(null);
		}
		{
			JPanel buttonPane = new JPanel();
			contPanel.add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			buttonPane.setBounds(0, 250, 450, 50);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
