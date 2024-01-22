package WindowBuilder;

import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class LehioaKaixo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tFaktoriala;
	private JButton btnFaktoriala;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LehioaKaixo frame = new LehioaKaixo();
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
	public LehioaKaixo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextField textField = new TextField();
		textField.setBounds(213, 10, 24, 21);
		contentPane.add(textField);
		
		
		Button button = new Button("º");
		button.setBounds(246, 10, 18, 21);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(button);
		
		JLabel label = new JLabel("Eman zbk bat");
		label.setBounds(112, 10, 93, 21);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(133, 37, 131, 92);
		contentPane.add(label_1);
		
		int zbk = Integer.parseInt(textField.getText()); 
		int faktoriala=1;
		
		for (int i=1;i<=zbk;i++) {
				faktoriala=faktoriala*i;
		}
		
		label_1.setText(Integer.toString(faktoriala));
		
	}
}
