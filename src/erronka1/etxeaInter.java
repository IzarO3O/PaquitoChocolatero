package erronka1;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;

public interface etxeaInter extends erronka1.menuBar {
	
	public JPanel etxeaPane = new JPanel();
	//Aldagaiak definitu
	public String[] taldeak= new String[16];
	public int [] puntuakArray= new int [taldeak.length];
	public String[]sortedTaldeak= new String [taldeak.length];
	public int[] sortedPuntuak= new int[taldeak.length];
	public String[] sortedPuntuakS=new String[taldeak.length];
	public JTable tableSailkapen = new JTable();
	public JScrollPane scrollPane = new JScrollPane();
	
	public default void etxeaRel() {
		
		
		
		etxeaPane.setBounds(0, 0, 800, 500);
		etxeaPane.setLayout(null);
		
		scrollPane.setBounds(260, 160, 350, 170);
		etxeaPane.add(scrollPane);
		
		tableSailkapen.setEnabled(false);
		tableSailkapen.setModel(new DefaultTableModel(
			new String[][] {
				{"1", null, null},
				{"2", null, null},
				{"3", null, null},
				{"4", null, null},
				{"5", null, null},
				{"6", null, null},
				{"7", null, null},
				{"8", null, null},
				{"9", null, null},
				{"10", null, null},
				{"11", null, null},
				{"12", null, null},
				{"13", null, null},
				{"14", null, null},
				{"15", null, null},
				{"16", null, null},
			},
			new String[] {
				"Posizioa", "Puntuak", "Taldea"
			}
			
		));
		tableSailkapen.getColumnModel().getColumn(0).setPreferredWidth(50);
		tableSailkapen.getColumnModel().getColumn(0).setMinWidth(50);
		tableSailkapen.getColumnModel().getColumn(1).setPreferredWidth(50);
		tableSailkapen.getColumnModel().getColumn(1).setMinWidth(50);
		tableSailkapen.getColumnModel().getColumn(2).setPreferredWidth(250);
		tableSailkapen.getColumnModel().getColumn(2).setMinWidth(250);
		scrollPane.setViewportView(tableSailkapen);
		
		JLabel lblIzenburu = new JLabel("SAILKAPEN OROKORRA");
		lblIzenburu.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIzenburu.setBounds(260, 137, 179, 13);
		etxeaPane.add(lblIzenburu);
		
		
	}
}
