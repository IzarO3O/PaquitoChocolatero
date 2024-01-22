package erronka1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class main implements erronka1.menuBar, erronka1.jokalariakInter, erronka1.etxeaInter, erronka1.jardunaldiakInter, erronka1.sailkapenaInter {

	public JFrame main;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.main.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Lehioa-ren default-eko balioak jarri
		main = new JFrame();
		main.setBounds(100, 100, 800, 510);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setLocationRelativeTo(null);
		main.getContentPane().setLayout(null);
		main.setResizable(false);
		main.getContentPane().add(etxeaPane, BorderLayout.CENTER);		
		main.setTitle("Hockey Federazioa - Etxea");
		main.setIconImage(Toolkit.getDefaultToolkit().getImage("logo.png"));
		
		//panel bakoitzean menua gehitu
		etxeaPane.add(menuBar);
		//menuari posizioa ipini
		menuBar.setBounds(300, 20, 310, 20);


		menuBar.add(etxeaMenu);
		menuBar.add(jokalariakMenu);
		menuBar.add(sailkapenakMenu);
		menuBar.add(jardunaldiakMenu);
		
		//JPanel bakoitzaren behar duen gauzak
		etxeaRel();
		jokalariakRel();
		sailkapenaRel();
		jardunaldiakRel();
		
		
		//panel bakoitza erakutzi
		etxeaMenu.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent actionEvent) {
	        	sailkapenaPane.setVisible(false);
	        	jokalariakPane.setVisible(false);
	        	etxeaPane.setVisible(true);
	        	jardunaldiakPane.setVisible(false);
	        	main.setTitle("Hockey Federazioa - Etxea");
	        	main.getContentPane().removeAll();
	        	main.getContentPane().add(etxeaPane, BorderLayout.CENTER);
	        	sailkapenaPane.remove(menuBar);
	        	jokalariakPane.remove(menuBar);
	        	etxeaPane.add(menuBar);
	        	jardunaldiakPane.remove(menuBar);
	        }
	    });
		
		jokalariakMenu.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent actionEvent) {
	        	sailkapenaPane.setVisible(false);
	        	jokalariakPane.setVisible(true);
	        	etxeaPane.setVisible(false);
	        	jardunaldiakPane.setVisible(false);
	        	main.setTitle("Hockey Federazioa - Jokalariak");
	        	main.getContentPane().removeAll();
	        	main.getContentPane().add(jokalariakPane, BorderLayout.CENTER);
	        	sailkapenaPane.remove(menuBar);
	        	etxeaPane.remove(menuBar);
	        	jokalariakPane.add(menuBar);
	        	jardunaldiakPane.remove(menuBar);
	        }
	    });
		
		sailkapenakMenu.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent actionEvent) {
	        	sailkapenaPane.setVisible(true);
	        	jokalariakPane.setVisible(false);
	        	etxeaPane.setVisible(false);
	        	jardunaldiakPane.setVisible(false);
	        	main.setTitle("Hockey Federazioa - Sailkapena");
	        	main.getContentPane().removeAll();
	        	main.getContentPane().add(sailkapenaPane, BorderLayout.CENTER);
	        	jokalariakPane.remove(menuBar);
	        	etxeaPane.remove(menuBar);
	        	sailkapenaPane.add(menuBar);
	        	jardunaldiakPane.remove(menuBar);
	        }
	    });
		
		jardunaldiakMenu.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent actionEvent) {
	        	sailkapenaPane.setVisible(false);
	        	jokalariakPane.setVisible(false);
	        	etxeaPane.setVisible(false);
	        	jardunaldiakPane.setVisible(true);
	        	main.setTitle("Hockey Federazioa - Jardunaldiak");
	        	main.getContentPane().removeAll();
	        	main.getContentPane().add(jardunaldiakPane, BorderLayout.CENTER);
	        	jokalariakPane.remove(menuBar);
	        	etxeaPane.remove(menuBar);
	        	sailkapenaPane.remove(menuBar);
	        	jardunaldiakPane.add(menuBar);
	        }
	    });
		
	}
}