package erronka2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public interface fondito extends MenuBar {

	public JPanel etxeaPane = new JPanel();

	/**
	 * Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ayay frame = new ayay();
					frame.ayay.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 * @return 
	 * @wbp.parser.entryPoint
	 */
	
	public default void etxeaRel(){
		initialize();
	}
	
	public default void initialize() {
		etxeaPane.setLayout(null);
		etxeaPane.setBackground(new Color(255, 128, 192));

		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 695, 368);
		fondito.add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(608, 82, 59, 21);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"23-24", "22-23"}));
		
		String[] columnNames = {
		          "Posizioa", "Izena", "IP", "GP" }
		      ;
		
		JTable table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Posizioa", "Izena", "IP", "GP"},
				{"1", "", null, null},
				{"2", null, null, null},
				{"3", null, null, null},
				{"4", null, null, null},
				{"5", null, null, null},
				{"6", null, null, null},
			},
			new String[] {
				"Posizioa", "Izena", "IP", "GP"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class, Integer.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.getColumnModel().getColumn(1).setPreferredWidth(100);
	    JTable table = new JTable(null, columnNames);
	    table.setShowHorizontalLines(true);
		table_1.setBackground(new Color(128, 128, 192));
		table_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		table_1.setBounds(14, 113, 279, 112);
		panel.add(table_1);

		
		JTable table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"Posizioa", "Izena", null, "GP"},
				{"1", null, null, null},
				{"2", null, null, null},
				{"3", null, null, null},
				{"4", null, null, null},
				{"5", null, null, null},
				{"6", null, null, null},
			},
			new String[] {
				"Posizioa", "Izena", "IP", "GP"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class, String.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_2.getColumnModel().getColumn(1).setPreferredWidth(100);
		table_2.setBackground(new Color(255, 128, 128));
		table_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		table_2.setBounds(402, 113, 279, 112);
		panel.add(table_2);
		table_2.setRowSorter(null);

		
	}
	
}
