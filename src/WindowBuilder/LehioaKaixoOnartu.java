package WindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LehioaKaixoOnartu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LehioaKaixoOnartu frame = new LehioaKaixoOnartu();
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
	public LehioaKaixoOnartu() {
		setTitle("Klik Gertaera");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Ez duzu onartu botoia sakatu");
		lblNewJgoodiesLabel.setBounds(126, 77, 192, 82);
		contentPane.add(lblNewJgoodiesLabel);
		
		JButton btnNewButton = new JButton("Onartu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Botoia sakatuta");
				lblNewJgoodiesLabel.setBounds(126, 77, 192, 82);

			}
		});
		btnNewButton.setBounds(156, 149, 85, 21);
		contentPane.add(btnNewButton);
	}

	public static String getText() {
		// TODO Auto-generated method stub
		return null;
	}
}
