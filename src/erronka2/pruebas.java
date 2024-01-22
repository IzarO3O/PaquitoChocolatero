package erronka2;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class pruebas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pruebas frame = new pruebas();
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
	public pruebas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(10, 10, 218, 157);
		contentPane.add(list);
		list.setModel(new DefaultComboBoxModel<String>(new String[] {"Paco", "Paquito", "Manolito", "Manolo", "Galileo", "Gervasio", "Nicolas"}));
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Paco");
		mntmNewMenuItem.setBounds(10, 10, 133, 24);
		contentPane.add(mntmNewMenuItem);
		
		JMenu mnNewMenu = new JMenu("New menu");
		mnNewMenu.setBounds(223, 177, 111, 24);
		contentPane.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_1);

	}
}
