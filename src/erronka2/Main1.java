package erronka2;

import java.io.FileWriter;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import java.awt.Color;
import java.awt.Canvas;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JButton;

public class Main1 implements MenuBar,  WindowListener {

	public JFrame Main1 ;
		
	public boolean aldaketak = false;
	private JTable table_1;
	private JTable table;
	private JTable table_2;
	private JPanel panelin;
	private FIBA Fa;
	private Etxea Fe;
	private Denboraldiak Fi;

	/**
	 * Launch the application.
	 */
	public String[] taldeakEkiArray = {
			"Boston Celtics", "Brooklyn Nets", "Chicago Bulls", "Cleveland Cavaliers", "Atlanta Hawks","Charlotte Hornets"
	};
	public int[] puntuakEkiArray = new int[taldeakEkiArray.length];

	
	
	private void ShowPane (JPanel p) {
		p.setSize (713, 384);
		p.setLocation(0,0);
		
		panelin.removeAll();
		panelin.add(p, BorderLayout.CENTER);
		panelin.revalidate();
		panelin.repaint();
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main1 window = new Main1();
					window.Main1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main1() {
		initialize();
	}
	
	@SuppressWarnings("serial")
	public void initialize() {
		// TODO Auto-generated method stub
		Fa = new FIBA();
		Fa.setSize(713, 384);
		Fa.setLocation(0,0);
		
		Fe = new Etxea();
		Fe.setSize(713, 384);
		Fe.setLocation(0,0);
		
		Fi = new Denboraldiak();
		Fi.setSize(713, 384);
		Fi.setLocation(0,0);
		
		Main1 = new JFrame ();
		Main1.setResizable(false);
		Main1.getContentPane().setBackground(new Color(255, 255, 255));
		Main1.setTitle("Saskibaloi Asoziazioa");
		Main1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Main1.setBounds(100, 100, 729, 451);
		
		//etxeaRel();
		Main1.getContentPane().add(Denboraldiak, BorderLayout.CENTER);		
		Main1.getContentPane().setLayout(null);
		
		panelin = new JPanel(new BorderLayout());
		panelin.setSize(710, 380);
		panelin.add(Fe, BorderLayout.CENTER);
		Main1.getContentPane().add(panelin);
		
				
		
		Denboraldiak.setVisible(true);
		FIBA.setVisible(true);
		Etxea.setVisible(true);
		

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(128, 128, 192));
		Main1.setJMenuBar(menuBar);
		
		menuBar.add(Etxea);
		menuBar.add(Denboraldiak);
		menuBar.add(FIBA);
		
		
		
		
		
		Denboraldiak.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent actionEvent) {
			ShowPane(Fi);
        }	
		});
		
		FIBA.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent actionEvent) {
			ShowPane(Fa);
        }	
		});
		
		Etxea.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent actionEvent) {
			ShowPane(Fe);
        }	
		});

        

		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
	/*	if (aldaketak) {
			int aukera = JOptionPane.showConfirmDialog(
					this, 
					(String)"Datuak aldatu dira, gorde nahi duzu?", 
					"Datuak aldatuta", 
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null);
				switch (aukera) {
				case JOptionPane.YES_OPTION:
					
				}
		}*/
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
