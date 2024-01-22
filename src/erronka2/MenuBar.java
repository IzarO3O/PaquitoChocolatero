package erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public interface MenuBar  {
	
	public JMenuBar menuBar = new JMenuBar();
	
	/**
	 * 
	 */
	public JMenuItem FIBA = new JMenuItem("FIBA");
	public JMenuItem fondito = new JMenuItem("Etxea");
	public JMenuItem DenboraldiMenu = new JMenuItem ("Denboraldiak");
	
}
