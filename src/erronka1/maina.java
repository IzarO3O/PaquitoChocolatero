package erronka1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;

public class maina implements erronka1.menuBara, erronka1.jokalariakIntera, erronka1.etxeaIntera, jaurdunaldiakIntera, erronka1.sailkapenaIntera {

	public JFrame maina;

	/**
	 * Launch the application.
	 */
	public static void maina(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					maina window = new maina();
					window.maina.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public maina() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Lehioa-ren default-eko balioak jarri
		maina = new JFrame();
		maina.setBounds(100, 100, 800, 510);
		maina.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		maina.setLocationRelativeTo(null);
		maina.setResizable(false);
		maina.getContentPane().add(etxeaPane, BorderLayout.CENTER);		
		maina.getContentPane().setLayout(null);
		maina.setTitle("Saskibaloi Federazioa - Etxea");
		maina.setIconImage(Toolkit.getDefaultToolkit().getImage("logo.png"));
		
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
	        	maina.setTitle("Hockey Federazioa - Etxea");
	        	maina.getContentPane().removeAll();
	        	maina.getContentPane().add(etxeaPane, BorderLayout.CENTER);
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
	        	maina.setTitle("Hockey Federazioa - Jokalariak");
	        	maina.getContentPane().removeAll();
	        	maina.getContentPane().add(jokalariakPane, BorderLayout.CENTER);
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
	        	maina.setTitle("Hockey Federazioa - Sailkapena");
	        	maina.getContentPane().removeAll();
	        	maina.getContentPane().add(sailkapenaPane, BorderLayout.CENTER);
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
	        	maina.setTitle("Hockey Federazioa - Jardunaldiak");
	        	maina.getContentPane().removeAll();
	        	maina.getContentPane().add(jardunaldiakPane, BorderLayout.CENTER);
	        	jokalariakPane.remove(menuBar);
	        	etxeaPane.remove(menuBar);
	        	sailkapenaPane.remove(menuBar);
	        	jardunaldiakPane.add(menuBar);
	        }
	    });
		
	}


	public void sailkapenaRel() {
		// TODO Auto-generated method stub
		
	}


	public static void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}