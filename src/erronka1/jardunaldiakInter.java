package erronka1;

import javax.swing.AbstractListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public interface jardunaldiakInter extends erronka1.menuBar, erronka1.jardunaldiTable {
	
	public JPanel jardunaldiakPane = new JPanel();	
	public JTable table = new JTable();
	public JTable tableF = new JTable();
	public JTable table2 = new JTable();
	public JTable tableF2 = new JTable();
	public JTable table3 = new JTable();
	public JTable table4 = new JTable();
	public JTable table5 = new JTable();
	public JTable table6 = new JTable();
	public JTable table7 = new JTable();
	public JTable table8 = new JTable();
	public JTable table9 = new JTable();
	public JTable table10 = new JTable();
	public JTable table11 = new JTable();
	public JTable table12 = new JTable();
	public JTable table13 = new JTable();
	public JTable table14 = new JTable();
	public JTable table15 = new JTable();
	public JTable table3F = new JTable();
	public JTable table4F = new JTable();
	public JTable table5F = new JTable();
	
	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	public default void jardunaldiakRel() {
				
		jardunaldiakPane.setBounds(0, 0, 800, 500);
		jardunaldiakPane.setLayout(null);
		
		JList list = new JList();
		list.setLayoutOrientation(JList.VERTICAL);
		list.setBounds(50, 100, 100, 270);
		
		//jardunaldien taulak sortu
		DefaultTableModel dtm = new DefaultTableModel(datos, columnNames);
		table.setModel(dtm);
		table.setBounds(260, 50, 375, 192);
		jardunaldiakPane.add(table);
		
		DefaultTableModel dtmF = new DefaultTableModel(datos_F, columnNames);
		tableF.setModel(dtmF);
		tableF.setBounds(260, 250, 375, 192);
		jardunaldiakPane.add(tableF);
		
		DefaultTableModel dtm2 = new DefaultTableModel(datos2, columnNames);
		table2.setModel(dtm2);
		table2.setBounds(260, 50, 375, 192);
		jardunaldiakPane.add(table2);
		
		DefaultTableModel dtm2F = new DefaultTableModel(datos_F2, columnNames);	
		tableF2.setModel(dtm2F);
		tableF2.setBounds(260, 250, 375, 192);
		jardunaldiakPane.add(tableF2);
		
		DefaultTableModel dtm3 = new DefaultTableModel(datos3, columnNames);
		table3.setModel(dtm3);
		table3.setBounds(260, 50, 375, 192);
		jardunaldiakPane.add(table3);
		
		DefaultTableModel dtm3F = new DefaultTableModel(datos_F3, columnNames);
		table3F.setModel(dtm3F);
		table3F.setBounds(260, 250, 375, 192);
		jardunaldiakPane.add(table3F);
				
		DefaultTableModel dtm4 = new DefaultTableModel(datos4, columnNames);
		table4.setModel(dtm4);
		table4.setBounds(260, 50, 375, 192);
		jardunaldiakPane.add(table4);
		
		DefaultTableModel dtm4F = new DefaultTableModel(datos_F4, columnNames);
		table4F.setModel(dtm4F);
		table4F.setBounds(260, 250, 375, 192);
		jardunaldiakPane.add(table4F);
				
		DefaultTableModel dtm5 = new DefaultTableModel(datos5, columnNames);
		table5.setModel(dtm5);
		table5.setBounds(260, 50, 375, 192);
		jardunaldiakPane.add(table5);
		
		DefaultTableModel dtm5F = new DefaultTableModel(datos_F5, columnNames);
		table5F.setModel(dtm5F);
		table5F.setBounds(260, 250, 375, 192);
		jardunaldiakPane.add(table5F);
				
		DefaultTableModel dtm6 = new DefaultTableModel(datos6, columnNames);
		table6.setModel(dtm6);
		table6.setBounds(260, 50, 375, 192);
		jardunaldiakPane.add(table6);
		
		DefaultTableModel dtm7 = new DefaultTableModel(datos7, columnNames);
		table7.setModel(dtm7);
		table7.setBounds(260, 50, 375, 192);
		jardunaldiakPane.add(table7);
		
		DefaultTableModel dtm8 = new DefaultTableModel(datos8, columnNames);
		table8.setModel(dtm8);
		table8.setBounds(260, 50, 375, 192);
		jardunaldiakPane.add(table8);
				
		DefaultTableModel dtm9 = new DefaultTableModel(datos9, columnNames);
		table9.setModel(dtm9);
		table9.setBounds(260, 50, 375, 192);
		jardunaldiakPane.add(table9);
				
		DefaultTableModel dtm10 = new DefaultTableModel(datos10, columnNames);
		table10.setModel(dtm10);
		table10.setBounds(260, 50, 375, 192);
		jardunaldiakPane.add(table10);
				
		DefaultTableModel dtm11 = new DefaultTableModel(datos11, columnNames);
		table11.setModel(dtm11);
		table11.setBounds(260, 50, 375, 192);
		jardunaldiakPane.add(table11);
				
		DefaultTableModel dtm12 = new DefaultTableModel(datos12, columnNames);
		table12.setModel(dtm12);
		table12.setBounds(260, 50, 375, 192);
		jardunaldiakPane.add(table12);
				
		DefaultTableModel dtm13 = new DefaultTableModel(datos13, columnNames);
		table13.setModel(dtm13);
		table13.setBounds(260, 50, 375, 192);
		jardunaldiakPane.add(table13);
		
		DefaultTableModel dtm14 = new DefaultTableModel(datos14, columnNames);
		table14.setModel(dtm14);
		table14.setBounds(260, 50, 375, 192);
		jardunaldiakPane.add(table14);
		
		DefaultTableModel dtm15 = new DefaultTableModel(datos15, columnNames);
		table15.setModel(dtm15);
		table15.setBounds(260, 50, 375, 192);
		jardunaldiakPane.add(table15);
		
		jardunaldiakPane.add(table);
		jardunaldiakPane.add(tableF);
		
		//default-eko list-ren balioak eta array-aren luzeera jarri
		list.setModel(new AbstractListModel() {
			public int getSize() {
				return jardunaldiList.length;
			}
			public Object getElementAt(int index) {
				return jardunaldiList[index];
			}
		});
		//jardunaldi bat hala beztea aukeratu
		list.addListSelectionListener(new ListSelectionListener() {
		    @Override
		    public void valueChanged(ListSelectionEvent e) {
		    	if (list.getSelectedValue() == "1. Jardunaldia") {
		    		table.setVisible(true);
		    		tableF.setVisible(true);
		    		table2.setVisible(false);
		    		tableF2.setVisible(false);
		    		table3.setVisible(false);
		    		table3F.setVisible(false);
		    		table4.setVisible(false);
		    		table4F.setVisible(false);
		    		table5.setVisible(false);
		    		table5F.setVisible(false);
		    		table6.setVisible(false);
		    		table7.setVisible(false);
		    		table8.setVisible(false);
		    		table9.setVisible(false);
		    		table10.setVisible(false);
		    		table11.setVisible(false);
		    		table12.setVisible(false);
		    		table13.setVisible(false);
		    		table14.setVisible(false);
		    		table15.setVisible(false);
		    	}else if (list.getSelectedValue() == "2. Jardunaldia") {
		    		table.setVisible(false);
		    		tableF.setVisible(false);
		    		table2.setVisible(true);
		    		tableF2.setVisible(true);
		    		table3.setVisible(false);
		    		table3F.setVisible(false);
		    		table4.setVisible(false);
		    		table4F.setVisible(false);
		    		table5.setVisible(false);
		    		table5F.setVisible(false);
		    		table6.setVisible(false);
		    		table7.setVisible(false);
		    		table8.setVisible(false);
		    		table9.setVisible(false);
		    		table10.setVisible(false);
		    		table11.setVisible(false);
		    		table12.setVisible(false);
		    		table13.setVisible(false);
		    		table14.setVisible(false);
		    		table15.setVisible(false);
		    	}else if (list.getSelectedValue() == "3. Jardunaldia") {
		    		table.setVisible(false);
		    		tableF.setVisible(false);
		    		table2.setVisible(false);
		    		tableF2.setVisible(false);
		    		table3.setVisible(true);
		    		table3F.setVisible(true);
		    		table4.setVisible(false);
		    		table4F.setVisible(false);
		    		table5.setVisible(false);
		    		table5F.setVisible(false);
		    		table6.setVisible(false);
		    		table7.setVisible(false);
		    		table8.setVisible(false);
		    		table9.setVisible(false);
		    		table10.setVisible(false);
		    		table11.setVisible(false);
		    		table12.setVisible(false);
		    		table13.setVisible(false);
		    		table14.setVisible(false);
		    		table15.setVisible(false);
		    	}else if (list.getSelectedValue() == "4. Jardunaldia") {
		    		table.setVisible(false);
		    		tableF.setVisible(false);
		    		table2.setVisible(false);
		    		tableF2.setVisible(false);
		    		table3.setVisible(false);
		    		table3F.setVisible(false);
		    		table4.setVisible(true);
		    		table4F.setVisible(true);
		    		table5.setVisible(false);
		    		table5F.setVisible(false);
		    		table6.setVisible(false);
		    		table7.setVisible(false);
		    		table8.setVisible(false);
		    		table9.setVisible(false);
		    		table10.setVisible(false);
		    		table11.setVisible(false);
		    		table12.setVisible(false);
		    		table13.setVisible(false);
		    		table14.setVisible(false);
		    		table15.setVisible(false);
		    	}else if (list.getSelectedValue() == "5. Jardunaldia") {
		    		table.setVisible(false);
		    		tableF.setVisible(false);
		    		table2.setVisible(false);
		    		tableF2.setVisible(false);
		    		table3.setVisible(false);
		    		table3F.setVisible(false);
		    		table4.setVisible(false);
		    		table4F.setVisible(false);
		    		table5.setVisible(true);
		    		table5F.setVisible(true);
		    		table6.setVisible(false);
		    		table7.setVisible(false);
		    		table8.setVisible(false);
		    		table9.setVisible(false);
		    		table10.setVisible(false);
		    		table11.setVisible(false);
		    		table12.setVisible(false);
		    		table13.setVisible(false);
		    		table14.setVisible(false);
		    		table15.setVisible(false);
		    	}else if (list.getSelectedValue() == "6. Jardunaldia") {
		    		table.setVisible(false);
		    		tableF.setVisible(false);
		    		table2.setVisible(false);
		    		tableF2.setVisible(false);
		    		table3.setVisible(false);
		    		table3F.setVisible(false);
		    		table4.setVisible(false);
		    		table4F.setVisible(false);
		    		table5.setVisible(false);
		    		table5F.setVisible(false);
		    		table6.setVisible(true);
		    		table7.setVisible(false);
		    		table8.setVisible(false);
		    		table9.setVisible(false);
		    		table10.setVisible(false);
		    		table11.setVisible(false);
		    		table12.setVisible(false);
		    		table13.setVisible(false);
		    		table14.setVisible(false);
		    		table15.setVisible(false);
		    	}else if (list.getSelectedValue() == "7. Jardunaldia") {
		    		table.setVisible(false);
		    		tableF.setVisible(false);
		    		table2.setVisible(false);
		    		tableF2.setVisible(false);
		    		table3.setVisible(false);
		    		table3F.setVisible(false);
		    		table4.setVisible(false);
		    		table4F.setVisible(false);
		    		table5.setVisible(false);
		    		table5F.setVisible(false);
		    		table6.setVisible(false);
		    		table7.setVisible(true);
		    		table8.setVisible(false);
		    		table9.setVisible(false);
		    		table10.setVisible(false);
		    		table11.setVisible(false);
		    		table12.setVisible(false);
		    		table13.setVisible(false);
		    		table14.setVisible(false);
		    		table15.setVisible(false);
		    	}else if (list.getSelectedValue() == "8. Jardunaldia") {
		    		table.setVisible(false);
		    		tableF.setVisible(false);
		    		table2.setVisible(false);
		    		tableF2.setVisible(false);
		    		table3.setVisible(false);
		    		table3F.setVisible(false);
		    		table4.setVisible(false);
		    		table4F.setVisible(false);
		    		table5.setVisible(false);
		    		table5F.setVisible(false);
		    		table6.setVisible(false);
		    		table7.setVisible(false);
		    		table8.setVisible(true);
		    		table9.setVisible(false);
		    		table10.setVisible(false);
		    		table11.setVisible(false);
		    		table12.setVisible(false);
		    		table13.setVisible(false);
		    		table14.setVisible(false);
		    		table15.setVisible(false);
		    	}else if (list.getSelectedValue() == "9. Jardunaldia") {
		    		table.setVisible(false);
		    		tableF.setVisible(false);
		    		table2.setVisible(false);
		    		tableF2.setVisible(false);
		    		table3.setVisible(false);
		    		table3F.setVisible(false);
		    		table4.setVisible(false);
		    		table4F.setVisible(false);
		    		table5.setVisible(false);
		    		table5F.setVisible(false);
		    		table6.setVisible(false);
		    		table7.setVisible(false);
		    		table8.setVisible(false);
		    		table9.setVisible(true);
		    		table10.setVisible(false);
		    		table11.setVisible(false);
		    		table12.setVisible(false);
		    		table13.setVisible(false);
		    		table14.setVisible(false);
		    		table15.setVisible(false);
		    	}else if (list.getSelectedValue() == "10. Jardunaldia") {
		    		table.setVisible(false);
		    		tableF.setVisible(false);
		    		table2.setVisible(false);
		    		tableF2.setVisible(false);
		    		table3.setVisible(false);
		    		table3F.setVisible(false);
		    		table4.setVisible(false);
		    		table4F.setVisible(false);
		    		table5.setVisible(false);
		    		table5F.setVisible(false);
		    		table6.setVisible(false);
		    		table7.setVisible(false);
		    		table8.setVisible(false);
		    		table9.setVisible(false);
		    		table10.setVisible(true);
		    		table11.setVisible(false);
		    		table12.setVisible(false);
		    		table13.setVisible(false);
		    		table14.setVisible(false);
		    		table15.setVisible(false);
		    	}else if (list.getSelectedValue() == "11. Jardunaldia") {
		    		table.setVisible(false);
		    		tableF.setVisible(false);
		    		table2.setVisible(false);
		    		tableF2.setVisible(false);
		    		table3.setVisible(false);
		    		table3F.setVisible(false);
		    		table4.setVisible(false);
		    		table4F.setVisible(false);
		    		table5.setVisible(false);
		    		table5F.setVisible(false);
		    		table6.setVisible(false);
		    		table7.setVisible(false);
		    		table8.setVisible(false);
		    		table9.setVisible(false);
		    		table10.setVisible(false);
		    		table11.setVisible(true);
		    		table12.setVisible(false);
		    		table13.setVisible(false);
		    		table14.setVisible(false);
		    		table15.setVisible(false);
		    	}else if (list.getSelectedValue() == "12. Jardunaldia") {
		    		table.setVisible(false);
		    		tableF.setVisible(false);
		    		table2.setVisible(false);
		    		tableF2.setVisible(false);
		    		table3.setVisible(false);
		    		table3F.setVisible(false);
		    		table4.setVisible(false);
		    		table4F.setVisible(false);
		    		table5.setVisible(false);
		    		table5F.setVisible(false);
		    		table6.setVisible(false);
		    		table7.setVisible(false);
		    		table8.setVisible(false);
		    		table9.setVisible(false);
		    		table10.setVisible(false);
		    		table11.setVisible(false);
		    		table12.setVisible(true);
		    		table13.setVisible(false);
		    		table14.setVisible(false);
		    		table15.setVisible(false);
		    	}else if (list.getSelectedValue() == "13. Jardunaldia") {
		    		table.setVisible(false);
		    		tableF.setVisible(false);
		    		table2.setVisible(false);
		    		tableF2.setVisible(false);
		    		table3.setVisible(false);
		    		table3F.setVisible(false);
		    		table4.setVisible(false);
		    		table4F.setVisible(false);
		    		table5.setVisible(false);
		    		table5F.setVisible(false);
		    		table6.setVisible(false);
		    		table7.setVisible(false);
		    		table8.setVisible(false);
		    		table9.setVisible(false);
		    		table10.setVisible(false);
		    		table11.setVisible(false);
		    		table12.setVisible(false);
		    		table13.setVisible(true);
		    		table14.setVisible(false);
		    		table15.setVisible(false);
		    	}else if (list.getSelectedValue() == "14. Jardunaldia") {
		    		table.setVisible(false);
		    		tableF.setVisible(false);
		    		table2.setVisible(false);
		    		tableF2.setVisible(false);
		    		table3.setVisible(false);
		    		table3F.setVisible(false);
		    		table4.setVisible(false);
		    		table4F.setVisible(false);
		    		table5.setVisible(false);
		    		table5F.setVisible(false);
		    		table6.setVisible(false);
		    		table7.setVisible(false);
		    		table8.setVisible(false);
		    		table9.setVisible(false);
		    		table10.setVisible(false);
		    		table11.setVisible(false);
		    		table12.setVisible(false);
		    		table13.setVisible(false);
		    		table14.setVisible(true);
		    		table15.setVisible(false);
		    	}else if (list.getSelectedValue() == "15. Jardunaldia") {
		    		table.setVisible(false);
		    		tableF.setVisible(false);
		    		table2.setVisible(false);
		    		tableF2.setVisible(false);
		    		table3.setVisible(false);
		    		table3F.setVisible(false);
		    		table4.setVisible(false);
		    		table4F.setVisible(false);
		    		table5.setVisible(false);
		    		table5F.setVisible(false);
		    		table6.setVisible(false);
		    		table7.setVisible(false);
		    		table8.setVisible(false);
		    		table9.setVisible(false);
		    		table10.setVisible(false);
		    		table11.setVisible(false);
		    		table12.setVisible(false);
		    		table13.setVisible(false);
		    		table14.setVisible(false);
		    		table15.setVisible(true);
		    	}
		    }
		});
		
		table.setVisible(true);
		tableF.setVisible(true);
		table2.setVisible(false);
		tableF2.setVisible(false);
		table3.setVisible(false);
		table3F.setVisible(false);
		table4.setVisible(false);
		table4F.setVisible(false);
		table5.setVisible(false);
		table5F.setVisible(false);
		table6.setVisible(false);
		table7.setVisible(false);
		table8.setVisible(false);
		table9.setVisible(false);
		table10.setVisible(false);
		table11.setVisible(false);
		table12.setVisible(false);
		table13.setVisible(false);
		table14.setVisible(false);
		table15.setVisible(false);
		
		table.setEnabled(false);
		tableF.setEnabled(false);
		table2.setEnabled(false);
		tableF2.setEnabled(false);
		table3.setEnabled(false);
		table3F.setEnabled(false);
		table4.setEnabled(false);
		table4F.setEnabled(false);
		table5.setEnabled(false);
		table5F.setEnabled(false);
		table6.setEnabled(false);
		table7.setEnabled(false);
		table8.setEnabled(false);
		table9.setEnabled(false);
		table10.setEnabled(false);
		table11.setEnabled(false);
		table12.setEnabled(false);
		table13.setEnabled(false);
		table14.setEnabled(false);
		table15.setEnabled(false);
		
		table.setBackground(null);
		tableF.setBackground(null);
		table2.setBackground(null);
		tableF2.setBackground(null);
		table3.setBackground(null);
		table3F.setBackground(null);
		table4.setBackground(null);
		table4F.setBackground(null);
		table5.setBackground(null);
		table5F.setBackground(null);
		table6.setBackground(null);
		table7.setBackground(null);
		table8.setBackground(null);
		table9.setBackground(null);
		table10.setBackground(null);
		table11.setBackground(null);
		table12.setBackground(null);
		table13.setBackground(null);
		table14.setBackground(null);
		table15.setBackground(null);
		
		DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
		modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
		
		table.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
		table.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
		table.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
		table.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
		table.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
		
		tableF.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
		tableF.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
		tableF.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
		tableF.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
		tableF.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
		
		table2.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
		table2.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
		table2.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
		table2.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
		table2.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
		
		tableF2.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
		tableF2.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
		tableF2.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
		tableF2.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
		tableF2.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
		
		table3.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
		table3.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
		table3.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
		table3.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
		table3.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
		
		table3F.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
		table3F.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
		table3F.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
		table3F.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
		table3F.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
		
		table4.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
		table4.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
		table4.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
		table4.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
		table4.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
		
		table4F.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
		table4F.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
		table4F.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
		table4F.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
		table4F.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
		
		table5.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
		table5.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
		table5.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
		table5.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
		table5.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
		
		table5F.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
		table5F.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
		table5F.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
		table5F.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
		table5F.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);

		table6.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
		table6.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
		table6.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
		table6.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
		table6.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);

		table7.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
		table7.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
		table7.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
		table7.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
		table7.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);

		table8.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
		table8.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
		table8.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
		table8.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
		table8.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);

		table8.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
		table8.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
		table8.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
		table8.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
		table8.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);

		table9.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
		table9.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
		table9.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
		table9.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
		table9.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);

		table10.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
		table10.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
		table10.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
		table10.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
		table10.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);

		table11.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
		table11.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
		table11.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
		table11.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
		table11.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);

		table12.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
		table12.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
		table12.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
		table12.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
		table12.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);

		table13.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
		table13.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
		table13.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
		table13.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
		table13.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);

		table14.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
		table14.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
		table14.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
		table14.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
		table14.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);

		table15.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
		table15.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
		table15.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
		table15.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
		table15.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
		
		
		
		
		
		jardunaldiakPane.add(list);
		
		
	}
}
