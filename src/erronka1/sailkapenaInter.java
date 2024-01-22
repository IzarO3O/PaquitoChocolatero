package erronka1;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public interface sailkapenaInter extends erronka1.menuBar, erronka1.jardunaldiTable, erronka1.jardunaldiakInter, erronka1.etxeaInter, erronka1.dialog {

	public JPanel sailkapenaPane = new JPanel();
	
	public String[] taldeakArray = {
			"Arizona Coyotes", "Boston Bruins", "Buffalo Sabres", "Carolina Hurricanes", "Chicago Blackhawks", "Colorado Avalanche", "Dallas Stars", "Detroit Red Wings", "Florida Panthers", "Minnesota Wild", "Montreal Canadiens", "Nashville Predators", "Ottawa Senators", "St. Louis Blues", "Toronto Maple Leafs", "Winnipeg Jets"
	};
	
	public int[] puntuakArray = new int[taldeakArray.length];
	public String[] puntuak = new String[puntuakArray.length];
	
	public default void sailkapenaRel() {
		
		sailkapenaPane.setBounds(0, 0, 800, 500);
		sailkapenaPane.setLayout(null);
		
		dialogRel();
		
		//Aldagaiak definitu 
				JComboBox<String> comboBoxEtxeko = new JComboBox<String>();
				comboBoxEtxeko.setBounds(183, 72, 160, 21);
				sailkapenaPane.add(comboBoxEtxeko);
				for (int i=0;i<taldeakArray.length;i++)	{
					comboBoxEtxeko.addItem(taldeakArray[i]);
				}
				
						
				JComboBox<String> comboBoxBisitari = new JComboBox<String>();
				comboBoxBisitari.setBounds(353, 72, 160, 21);
				sailkapenaPane.add(comboBoxBisitari);
				for (int i=0;i<taldeakArray.length;i++)	{
					comboBoxBisitari.addItem(taldeakArray[i]);
				}
				
				JLabel lblEtxeko = new JLabel("Etxeko taldea");
				lblEtxeko.setBounds(183, 49, 84, 13);
				sailkapenaPane.add(lblEtxeko);
				
				JLabel lblBisitari = new JLabel("Talde bisitaria");
				lblBisitari.setBounds(353, 49, 95, 13);
				sailkapenaPane.add(lblBisitari);
				
				JLabel lblGolak = new JLabel("Golak");
				lblGolak.setBounds(180, 103, 45, 13);
				sailkapenaPane.add(lblGolak);
				
				JTextField tfEtxekoGol = new JTextField();
				tfEtxekoGol.setBounds(183, 126, 96, 19);
				sailkapenaPane.add(tfEtxekoGol);
				tfEtxekoGol.setColumns(10);
				
				JTextField tfBisitariGol = new JTextField();
				tfBisitariGol.setBounds(302, 126, 96, 19);
				sailkapenaPane.add(tfBisitariGol);
				tfBisitariGol.setColumns(10);
				
				JButton btnSartu = new JButton("Sartu");
				btnSartu.setBounds(408, 125, 85, 21);
				sailkapenaPane.add(btnSartu);
				
				JComboBox<String> jardunaldiComBo = new JComboBox<String>(new String[] {"1. Jardunaldia", "2. Jardunaldia", "3. Jardunaldia", "4. Jardunaldia", "5. Jardunaldia", "6. Jardunaldia", "7. Jardunaldia", "8. Jardunaldia", "9. Jardunaldia", "10. Jardunaldia", "11. Jardunaldia", "12. Jardunaldia", "13. Jardunaldia", "14. Jardunaldia", "15. Jardunaldia"});
				jardunaldiComBo.setBounds(353, 100, 160, 20);
				sailkapenaPane.add(jardunaldiComBo);
				
				JScrollPane scrollPaneTaula = new JScrollPane();
				scrollPaneTaula.setBounds(200, 200, 300, 100);
				sailkapenaPane.add(scrollPaneTaula);
				
				JTable tableTaula = new JTable();
				tableTaula.setEnabled(false);
				tableTaula.setModel(new DefaultTableModel(
					new String[][] {
						{puntuak[0], taldeakArray[0]},
						{puntuak[1], taldeakArray[1]},
						{puntuak[2], taldeakArray[2]},
						{puntuak[3], taldeakArray[3]},
						{puntuak[4], taldeakArray[4]},
						{puntuak[5], taldeakArray[5]},
						{puntuak[6], taldeakArray[6]},
						{puntuak[7], taldeakArray[7]},
						{puntuak[8], taldeakArray[8]},
						{puntuak[9], taldeakArray[9]},
						{puntuak[10], taldeakArray[10]},
						{puntuak[11], taldeakArray[11]},
						{puntuak[12], taldeakArray[12]},
						{puntuak[13], taldeakArray[13]},
						{puntuak[14], taldeakArray[14]},
						{puntuak[15], taldeakArray[15]},
					},
					new String[] {
						"Puntuak", "Taldea"
					}
				));
				tableTaula.getColumnModel().getColumn(0).setPreferredWidth(43);
				tableTaula.getColumnModel().getColumn(1).setPreferredWidth(163);
				scrollPaneTaula.setViewportView(tableTaula);
				
				JSpinner urtea = new javax.swing.JSpinner();
				JSpinner hilabetea = new JSpinner();
				JSpinner eguna = new JSpinner();
				JSpinner spinner1 = new javax.swing.JSpinner();
				SpinnerDateModel spinnermodel = new SpinnerDateModel();
				SpinnerNumberModel spinnermodelurtea = new SpinnerNumberModel(Calendar.getInstance().get(Calendar.YEAR), 2000, 2100, 1);
				
				spinnermodel.setCalendarField(Calendar.MINUTE);
				spinner1.setModel(spinnermodel);
				spinner1.setEditor(new JSpinner.DateEditor(spinner1 , "hh:mm"));
				
				urtea.setModel(spinnermodelurtea);
				urtea.setEditor(new JSpinner.NumberEditor(urtea));
				
				urtea.setBounds(320, 160, 60, 20);
				hilabetea.setBounds(260, 160, 50, 20);
				eguna.setBounds(200, 160, 50, 20);
				spinner1.setBounds(400, 160, 100, 20);
				
				urtea.setValue(2023);
				hilabetea.setValue(01);
				eguna.setValue(01);
				
				sailkapenaPane.add(urtea);
				sailkapenaPane.add(spinner1);
				sailkapenaPane.add(hilabetea);
				sailkapenaPane.add(eguna);
				
				
				btnSartu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(!tfEtxekoGol.getText().isEmpty() || !tfBisitariGol.getText().isEmpty()) {
							dial.setVisible(true);
							dial.setTitle("Sailkapena: Emailtza");
							lblError.setText("Ziur saude emaitz hau idatzi nahi duzu?");
							btnEztatu.setVisible(true);
						}else {
							dial.setVisible(true);
							dial.setTitle("Sailkapena: Error");
							lblError.setText("Idatzi behar duzu emaitzak");
						}
					}
				});
				btnBaieztatu.addActionListener(new ActionListener () {
					public void actionPerformed(ActionEvent e) {
						//Irakurri golak
						int golE = -1;
						int golB = -1;
						if(!tfEtxekoGol.getText().isEmpty() && !tfEtxekoGol.getText().isBlank()) {
							golE = Integer.parseInt(tfEtxekoGol.getText());
							golB = Integer.parseInt(tfBisitariGol.getText());
						}
						
						DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
						modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
						
						try {
							//zero edo baino handiago den bi taldeen puntuak koprobatu
							if(golE >= 0 && golB >= 0) {
								//jardunaldia konprobatu
								if(jardunaldiComBo.getSelectedItem().equals("1. Jardunaldia")) {
									//urtea-ren balioa aldatu
									urtea.getValue().toString().replace(".", "");
									//hilabete baten kapoko balioa eta eguna-ren kanpoko balioa konprobatu
									if(Integer.parseInt(eguna.getValue().toString()) <= 31 && Integer.parseInt(eguna.getValue().toString()) >= 01 && Integer.parseInt(hilabetea.getValue().toString()) <= 12 && Integer.parseInt(hilabetea.getValue().toString()) >= 01) {
										//formatua emon
										String date = eguna.getValue().toString()+ "." +hilabetea.getValue().toString()+ "." +urtea.getValue().toString();
										
										//datuen array-aren luzeera en atera
										for(int i = 0; i < datos.length; i++) {
											//datuak zuzenak hala okerrak diren aukeratu
											if(datos[i][0].equals(date) && datos[i][2].equals(comboBoxEtxeko.getSelectedItem().toString()) || datos[i][3].equals(comboBoxBisitari.getSelectedItem().toString()) && datos[i][4].equals("-")) {
												
												//datuak sartu
												datos[i][4]=tfEtxekoGol.getText().toString()+ " - " +tfBisitariGol.getText().toString();
												DefaultTableModel dtm = new DefaultTableModel(datos, columnNames);
												table.setModel(dtm);
												
												//erdian ipini
												table.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
												table.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
												table.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
												table.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
												table.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
												
											}
											
										}
										
									}else if(jardunaldiComBo.getSelectedItem().equals("2. Jardunaldia")) {
										urtea.getValue().toString().replace(".", "");
										if(Integer.parseInt(eguna.getValue().toString()) <= 31 && Integer.parseInt(eguna.getValue().toString()) >= 01 && Integer.parseInt(hilabetea.getValue().toString()) <= 12 && Integer.parseInt(hilabetea.getValue().toString()) >= 01) {
											String date = eguna.getValue().toString()+ "." +hilabetea.getValue().toString()+ "." +urtea.getValue().toString();
											for(int i = 0; i < 9; i++) {
												if(datos2[i][0].equals(date) && datos2[i][2].equals(comboBoxEtxeko.getSelectedItem()) && datos2[i][3].equals(comboBoxBisitari.getSelectedItem().toString()) && datos2[i][4].equals("-")) {
													
													datos2[i][4]=tfEtxekoGol.getText().toString()+ " - " +tfBisitariGol.getText().toString();
													DefaultTableModel dtm2 = new DefaultTableModel(datos2, columnNames);
													table2.setModel(dtm2);
													
													table2.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
													table2.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
													table2.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
													table2.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
													table2.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
													
												}else if(datos_F2[i][0].equals(date) && datos_F2[i][2].equals(comboBoxEtxeko.getSelectedItem()) && datos_F2[i][3].equals(comboBoxBisitari.getSelectedItem().toString()) && datos_F2[i][4].equals("-")) {
													
													datos_F2[i][4]=tfEtxekoGol.getText().toString()+ " - " +tfBisitariGol.getText().toString();
													DefaultTableModel dtmF2 = new DefaultTableModel(datos_F2, columnNames);
													tableF2.setModel(dtmF2);
													
													tableF2.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
													tableF2.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
													tableF2.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
													tableF2.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
													tableF2.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
													
												}
											}
										}
									}else if(jardunaldiComBo.getSelectedItem().equals("3. Jardunaldia")) {
										urtea.getValue().toString().replace(".", "");
										if(Integer.parseInt(eguna.getValue().toString()) <= 31 && Integer.parseInt(eguna.getValue().toString()) >= 01 && Integer.parseInt(hilabetea.getValue().toString()) <= 12 && Integer.parseInt(hilabetea.getValue().toString()) >= 01) {
											String date = eguna.getValue().toString()+ "." +hilabetea.getValue().toString()+ "." +urtea.getValue().toString();
											for(int i = 0; i < 9; i++) {
												if(datos3[i][0].equals(date) && datos3[i][2].equals(comboBoxEtxeko.getSelectedItem()) && datos3[i][3].equals(comboBoxBisitari.getSelectedItem().toString()) && datos3[i][4].equals("-")) {
													
													datos3[i][4]=tfEtxekoGol.getText().toString()+ " - " +tfBisitariGol.getText().toString();
													DefaultTableModel dtm3 = new DefaultTableModel(datos3, columnNames);
													table3.setModel(dtm3);
													
													table3.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
													table3.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
													table3.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
													table3.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
													table3.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
													
												}else if(datos_F3[i][0].equals(date) && datos_F3[i][2].equals(comboBoxEtxeko.getSelectedItem()) && datos_F3[i][3].equals(comboBoxBisitari.getSelectedItem().toString()) && datos_F3[i][4].equals("-")) {
													
													datos_F3[i][4]=tfEtxekoGol.getText().toString()+ " - " +tfBisitariGol.getText().toString();
													DefaultTableModel dtmF3 = new DefaultTableModel(datos_F3, columnNames);
													table3F.setModel(dtmF3);
													
													table3F.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
													table3F.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
													table3F.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
													table3F.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
													table3F.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
													
												}
											}
										}
									}else if(jardunaldiComBo.getSelectedItem().equals("4. Jardunaldia")) {
										urtea.getValue().toString().replace(".", "");
										if(Integer.parseInt(eguna.getValue().toString()) <= 31 && Integer.parseInt(eguna.getValue().toString()) >= 01 && Integer.parseInt(hilabetea.getValue().toString()) <= 12 && Integer.parseInt(hilabetea.getValue().toString()) >= 01) {
											String date = eguna.getValue().toString()+ "." +hilabetea.getValue().toString()+ "." +urtea.getValue().toString();
											for(int i = 0; i < 9; i++) {
												if(datos4[i][0].equals(date) && datos4[i][2].equals(comboBoxEtxeko.getSelectedItem()) && datos4[i][3].equals(comboBoxBisitari.getSelectedItem().toString()) && datos4[i][4].equals("-")) {
													
													datos4[i][4]=tfEtxekoGol.getText().toString()+ " - " +tfBisitariGol.getText().toString();
													DefaultTableModel dtm4 = new DefaultTableModel(datos4, columnNames);
													table4.setModel(dtm4);
													
													table4.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
													table4.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
													table4.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
													table4.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
													table4.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
													
												}else if(datos_F4[i][0].equals(date) && datos_F4[i][2].equals(comboBoxEtxeko.getSelectedItem()) && datos_F4[i][3].equals(comboBoxBisitari.getSelectedItem().toString()) && datos_F4[i][4].equals("-")) {
													
													datos_F4[i][4]=tfEtxekoGol.getText().toString()+ " - " +tfBisitariGol.getText().toString();
													DefaultTableModel dtmF4 = new DefaultTableModel(datos_F4, columnNames);
													table4F.setModel(dtmF4);
													
													table4F.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
													table4F.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
													table4F.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
													table4F.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
													table4F.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
													
												}
											}
										}
									}else if(jardunaldiComBo.getSelectedItem().equals("5. Jardunaldia")) {
										urtea.getValue().toString().replace(".", "");
										if(Integer.parseInt(eguna.getValue().toString()) <= 31 && Integer.parseInt(eguna.getValue().toString()) >= 01 && Integer.parseInt(hilabetea.getValue().toString()) <= 12 && Integer.parseInt(hilabetea.getValue().toString()) >= 01) {
											String date = eguna.getValue().toString()+ "." +hilabetea.getValue().toString()+ "." +urtea.getValue().toString();
											for(int i = 0; i < 9; i++) {
												if(datos5[i][0].equals(date) && datos5[i][2].equals(comboBoxEtxeko.getSelectedItem()) && datos5[i][3].equals(comboBoxBisitari.getSelectedItem().toString()) && datos5[i][4].equals("-")) {
													
													datos5[i][4]=tfEtxekoGol.getText().toString()+ " - " +tfBisitariGol.getText().toString();
													DefaultTableModel dtm = new DefaultTableModel(datos5, columnNames);
													table5.setModel(dtm);
													
													table5.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
													table5.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
													table5.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
													table5.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
													table5.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
													
												}else if(datos_F5[i][0].equals(date) && datos_F5[i][2].equals(comboBoxEtxeko.getSelectedItem()) && datos_F5[i][3].equals(comboBoxBisitari.getSelectedItem().toString()) && datos_F5[i][4].equals("-")) {
													
													datos_F5[i][4]=tfEtxekoGol.getText().toString()+ " - " +tfBisitariGol.getText().toString();
													DefaultTableModel dtmF5 = new DefaultTableModel(datos_F5, columnNames);
													table5F.setModel(dtmF5);
													
													table5F.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
													table5F.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
													table5F.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
													table5F.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
													table5F.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
													
												}
											}
										}
									}else if(jardunaldiComBo.getSelectedItem().equals("6. Jardunaldia")) {
										urtea.getValue().toString().replace(".", "");
										if(Integer.parseInt(eguna.getValue().toString()) <= 31 && Integer.parseInt(eguna.getValue().toString()) >= 01 && Integer.parseInt(hilabetea.getValue().toString()) <= 12 && Integer.parseInt(hilabetea.getValue().toString()) >= 01) {
											String date = eguna.getValue().toString()+ "." +hilabetea.getValue().toString()+ "." +urtea.getValue().toString();
											for(int i = 0; i < 9; i++) {
												if(datos6[i][0].equals(date) && datos6[i][2].equals(comboBoxEtxeko.getSelectedItem()) && datos6[i][3].equals(comboBoxBisitari.getSelectedItem().toString()) && datos6[i][4].equals("-")) {
													
													datos6[i][4]=tfEtxekoGol.getText().toString()+ " - " +tfBisitariGol.getText().toString();
													DefaultTableModel dtm6 = new DefaultTableModel(datos6, columnNames);
													table6.setModel(dtm6);
													
													table6.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
													table6.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
													table6.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
													table6.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
													table6.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
													
												}
											}
										}
									}else if(jardunaldiComBo.getSelectedItem().equals("7. Jardunaldia")) {
										urtea.getValue().toString().replace(".", "");
										if(Integer.parseInt(eguna.getValue().toString()) <= 31 && Integer.parseInt(eguna.getValue().toString()) >= 01 && Integer.parseInt(hilabetea.getValue().toString()) <= 12 && Integer.parseInt(hilabetea.getValue().toString()) >= 01) {
											String date = eguna.getValue().toString()+ "." +hilabetea.getValue().toString()+ "." +urtea.getValue().toString();
											for(int i = 0; i < 9; i++) {
												if(datos7[i][0].equals(date) && datos7[i][2].equals(comboBoxEtxeko.getSelectedItem()) && datos7[i][3].equals(comboBoxBisitari.getSelectedItem().toString()) && datos7[i][4].equals("-")) {
													
													datos7[i][4]=tfEtxekoGol.getText().toString()+ " - " +tfBisitariGol.getText().toString();
													DefaultTableModel dtm7 = new DefaultTableModel(datos7, columnNames);
													table7.setModel(dtm7);
													
													table7.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
													table7.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
													table7.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
													table7.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
													table7.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
													
												}
											}
										}
									}else if(jardunaldiComBo.getSelectedItem().equals("8. Jardunaldia")) {
										urtea.getValue().toString().replace(".", "");
										if(Integer.parseInt(eguna.getValue().toString()) <= 31 && Integer.parseInt(eguna.getValue().toString()) >= 01 && Integer.parseInt(hilabetea.getValue().toString()) <= 12 && Integer.parseInt(hilabetea.getValue().toString()) >= 01) {
											String date = eguna.getValue().toString()+ "." +hilabetea.getValue().toString()+ "." +urtea.getValue().toString();
											for(int i = 0; i < 9; i++) {
												if(datos8[i][0].equals(date) && datos8[i][2].equals(comboBoxEtxeko.getSelectedItem()) && datos8[i][3].equals(comboBoxBisitari.getSelectedItem().toString()) && datos8[i][4].equals("-")) {
													
													datos8[i][4]=tfEtxekoGol.getText().toString()+ " - " +tfBisitariGol.getText().toString();
													DefaultTableModel dtm8 = new DefaultTableModel(datos8, columnNames);
													table8.setModel(dtm8);
													
													table8.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
													table8.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
													table8.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
													table8.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
													table8.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
													
												}
											}
										}
									}else if(jardunaldiComBo.getSelectedItem().equals("9. Jardunaldia")) {
										urtea.getValue().toString().replace(".", "");
										if(Integer.parseInt(eguna.getValue().toString()) <= 31 && Integer.parseInt(eguna.getValue().toString()) >= 01 && Integer.parseInt(hilabetea.getValue().toString()) <= 12 && Integer.parseInt(hilabetea.getValue().toString()) >= 01) {
											String date = eguna.getValue().toString()+ "." +hilabetea.getValue().toString()+ "." +urtea.getValue().toString();
											for(int i = 0; i < 9; i++) {
												if(datos9[i][0].equals(date) && datos9[i][2].equals(comboBoxEtxeko.getSelectedItem()) && datos9[i][3].equals(comboBoxBisitari.getSelectedItem().toString()) && datos9[i][4].equals("-")) {
													
													datos9[i][4]=tfEtxekoGol.getText().toString()+ " - " +tfBisitariGol.getText().toString();
													DefaultTableModel dtm9 = new DefaultTableModel(datos9, columnNames);
													table9.setModel(dtm9);
													
													table9.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
													table9.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
													table9.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
													table9.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
													table9.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
													
												}
											}
										}
									}else if(jardunaldiComBo.getSelectedItem().equals("10. Jardunaldia")) {
										urtea.getValue().toString().replace(".", "");
										if(Integer.parseInt(eguna.getValue().toString()) <= 31 && Integer.parseInt(eguna.getValue().toString()) >= 01 && Integer.parseInt(hilabetea.getValue().toString()) <= 12 && Integer.parseInt(hilabetea.getValue().toString()) >= 01) {
											String date = eguna.getValue().toString()+ "." +hilabetea.getValue().toString()+ "." +urtea.getValue().toString();
											for(int i = 0; i < 9; i++) {
												if(datos10[i][0].equals(date) && datos10[i][2].equals(comboBoxEtxeko.getSelectedItem()) && datos10[i][3].equals(comboBoxBisitari.getSelectedItem().toString()) && datos10[i][4].equals("-")) {
													
													datos10[i][4]=tfEtxekoGol.getText().toString()+ " - " +tfBisitariGol.getText().toString();
													DefaultTableModel dtm10 = new DefaultTableModel(datos10, columnNames);
													table10.setModel(dtm10);
													
													table10.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
													table10.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
													table10.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
													table10.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
													table10.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
													
												}
											}
										}
									}else if(jardunaldiComBo.getSelectedItem().equals("11. Jardunaldia")) {
										urtea.getValue().toString().replace(".", "");
										if(Integer.parseInt(eguna.getValue().toString()) <= 31 && Integer.parseInt(eguna.getValue().toString()) >= 01 && Integer.parseInt(hilabetea.getValue().toString()) <= 12 && Integer.parseInt(hilabetea.getValue().toString()) >= 01) {
											String date = eguna.getValue().toString()+ "." +hilabetea.getValue().toString()+ "." +urtea.getValue().toString();
											for(int i = 0; i < 9; i++) {
												if(datos11[i][0].equals(date) && datos11[i][2].equals(comboBoxEtxeko.getSelectedItem()) && datos11[i][3].equals(comboBoxBisitari.getSelectedItem().toString()) && datos11[i][4].equals("-")) {
													
													datos11[i][4]=tfEtxekoGol.getText().toString()+ " - " +tfBisitariGol.getText().toString();
													DefaultTableModel dtm11 = new DefaultTableModel(datos11, columnNames);
													table11.setModel(dtm11);
													
													table11.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
													table11.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
													table11.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
													table11.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
													table11.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
													
												}
											}
										}
									}else if(jardunaldiComBo.getSelectedItem().equals("12. Jardunaldia")) {
										urtea.getValue().toString().replace(".", "");
										if(Integer.parseInt(eguna.getValue().toString()) <= 31 && Integer.parseInt(eguna.getValue().toString()) >= 01 && Integer.parseInt(hilabetea.getValue().toString()) <= 12 && Integer.parseInt(hilabetea.getValue().toString()) >= 01) {
											String date = eguna.getValue().toString()+ "." +hilabetea.getValue().toString()+ "." +urtea.getValue().toString();
											for(int i = 0; i < 9; i++) {
												if(datos12[i][0].equals(date) && datos12[i][2].equals(comboBoxEtxeko.getSelectedItem()) && datos12[i][3].equals(comboBoxBisitari.getSelectedItem().toString()) && datos12[i][4].equals("-")) {
													
													datos12[i][4]=tfEtxekoGol.getText().toString()+ " - " +tfBisitariGol.getText().toString();
													DefaultTableModel dtm12 = new DefaultTableModel(datos12, columnNames);
													table12.setModel(dtm12);
													
													table12.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
													table12.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
													table12.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
													table12.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
													table12.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
													
												}
											}
										}
									}else if(jardunaldiComBo.getSelectedItem().equals("13. Jardunaldia")) {
										urtea.getValue().toString().replace(".", "");
										if(Integer.parseInt(eguna.getValue().toString()) <= 31 && Integer.parseInt(eguna.getValue().toString()) >= 01 && Integer.parseInt(hilabetea.getValue().toString()) <= 12 && Integer.parseInt(hilabetea.getValue().toString()) >= 01) {
											String date = eguna.getValue().toString()+ "." +hilabetea.getValue().toString()+ "." +urtea.getValue().toString();
											for(int i = 0; i < 9; i++) {
												if(datos13[i][0].equals(date) && datos13[i][2].equals(comboBoxEtxeko.getSelectedItem()) && datos13[i][3].equals(comboBoxBisitari.getSelectedItem().toString()) && datos13[i][4].equals("-")) {
													
													datos13[i][4]=tfEtxekoGol.getText().toString()+ " - " +tfBisitariGol.getText().toString();
													DefaultTableModel dtm13 = new DefaultTableModel(datos13, columnNames);
													table13.setModel(dtm13);
													
													table13.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
													table13.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
													table13.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
													table13.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
													table13.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
													
												}
											}
										}
									}else if(jardunaldiComBo.getSelectedItem().equals("14. Jardunaldia")) {
										urtea.getValue().toString().replace(".", "");
										if(Integer.parseInt(eguna.getValue().toString()) <= 31 && Integer.parseInt(eguna.getValue().toString()) >= 01 && Integer.parseInt(hilabetea.getValue().toString()) <= 12 && Integer.parseInt(hilabetea.getValue().toString()) >= 01) {
											String date = eguna.getValue().toString()+ "." +hilabetea.getValue().toString()+ "." +urtea.getValue().toString();
											for(int i = 0; i < 9; i++) {
												if(datos14[i][0].equals(date) && datos14[i][2].equals(comboBoxEtxeko.getSelectedItem()) && datos14[i][3].equals(comboBoxBisitari.getSelectedItem().toString()) && datos14[i][4].equals("-")) {
													
													datos14[i][4]=tfEtxekoGol.getText().toString()+ " - " +tfBisitariGol.getText().toString();
													DefaultTableModel dtm14 = new DefaultTableModel(datos14, columnNames);
													table14.setModel(dtm14);
													
													table14.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
													table14.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
													table14.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
													table14.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
													table14.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
													
												}
											}
										}
									}else if(jardunaldiComBo.getSelectedItem().equals("15. Jardunaldia")) {
										urtea.getValue().toString().replace(".", "");
										if(Integer.parseInt(eguna.getValue().toString()) <= 31 && Integer.parseInt(eguna.getValue().toString()) >= 01 && Integer.parseInt(hilabetea.getValue().toString()) <= 12 && Integer.parseInt(hilabetea.getValue().toString()) >= 01) {
											String date = eguna.getValue().toString()+ "." +hilabetea.getValue().toString()+ "." +urtea.getValue().toString();
											for(int i = 0; i < 9; i++) {
												if(datos15[i][0].equals(date) && datos15[i][2].equals(comboBoxEtxeko.getSelectedItem()) && datos15[i][3].equals(comboBoxBisitari.getSelectedItem().toString()) && datos15[i][4].equals("-")) {
													
													datos15[i][4]=tfEtxekoGol.getText().toString()+ " - " +tfBisitariGol.getText().toString();
													DefaultTableModel dtm15 = new DefaultTableModel(datos15, columnNames);
													table15.setModel(dtm15);
													
													table15.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
													table15.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
													table15.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
													table15.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
													table15.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
													
												}
											}
										}
									}
								}
								
										//Etxekoak irabazi
										if (golE > golB) {
											for (int i=0; i<puntuakArray.length; i++) {
												if (comboBoxEtxeko.getSelectedItem().equals(taldeakArray[i])) {
													puntuakArray[i]+=2;
													puntuak[i]= String.valueOf(puntuakArray[i]);
													tableTaula.setModel(new DefaultTableModel(
															new String[][] {
																{puntuak[0], taldeakArray[0]},
																{puntuak[1], taldeakArray[1]},
																{puntuak[2], taldeakArray[2]},
																{puntuak[3], taldeakArray[3]},
																{puntuak[4], taldeakArray[4]},
																{puntuak[5], taldeakArray[5]},
																{puntuak[6], taldeakArray[6]},
																{puntuak[7], taldeakArray[7]},
																{puntuak[8], taldeakArray[8]},
																{puntuak[9], taldeakArray[9]},
																{puntuak[10], taldeakArray[10]},
																{puntuak[11], taldeakArray[11]},
																{puntuak[12], taldeakArray[12]},
																{puntuak[13], taldeakArray[13]},
																{puntuak[14], taldeakArray[14]},
																{puntuak[15], taldeakArray[15]},
															},
															new String[] {
																"Puntuak", "Taldea"
															}
														));
													tableTaula.getColumnModel().getColumn(0).setPreferredWidth(43);
													tableTaula.getColumnModel().getColumn(1).setPreferredWidth(163);
												}
											}
										}
										
										// Bisitariak irabazi
										if (golE < golB) {
											for (int i=0; i<puntuakArray.length; i++) {
												if (comboBoxBisitari.getSelectedItem().equals(taldeakArray[i])) {
													puntuakArray[i]+=2;
													puntuak[i]= String.valueOf(puntuakArray[i]);
													tableTaula.setModel(new DefaultTableModel(
															new String[][] {
																{puntuak[0], taldeakArray[0]},
																{puntuak[1], taldeakArray[1]},
																{puntuak[2], taldeakArray[2]},
																{puntuak[3], taldeakArray[3]},
																{puntuak[4], taldeakArray[4]},
																{puntuak[5], taldeakArray[5]},
																{puntuak[6], taldeakArray[6]},
																{puntuak[7], taldeakArray[7]},
																{puntuak[8], taldeakArray[8]},
																{puntuak[9], taldeakArray[9]},
																{puntuak[10], taldeakArray[10]},
																{puntuak[11], taldeakArray[11]},
																{puntuak[12], taldeakArray[12]},
																{puntuak[13], taldeakArray[13]},
																{puntuak[14], taldeakArray[14]},
																{puntuak[15], taldeakArray[15]},
															},
															new String[] {
																"Puntuak", "Taldea"
															}
														));
													tableTaula.getColumnModel().getColumn(0).setPreferredWidth(43);
													tableTaula.getColumnModel().getColumn(1).setPreferredWidth(163);
												}
											}
										}
										if (golE == golB) {
											for (int i=0; i < puntuakArray.length; i++) {
												if (comboBoxEtxeko.getSelectedItem().equals(taldeakArray[i])) {
													puntuakArray[i] += 1;
													puntuak[i] = String.valueOf(puntuakArray[i]);
													tableTaula.setModel(new DefaultTableModel(
															new String[][] {
																{puntuak[0], taldeakArray[0]},
																{puntuak[1], taldeakArray[1]},
																{puntuak[2], taldeakArray[2]},
																{puntuak[3], taldeakArray[3]},
																{puntuak[4], taldeakArray[4]},
																{puntuak[5], taldeakArray[5]},
																{puntuak[6], taldeakArray[6]},
																{puntuak[7], taldeakArray[7]},
																{puntuak[8], taldeakArray[8]},
																{puntuak[9], taldeakArray[9]},
																{puntuak[10], taldeakArray[10]},
																{puntuak[11], taldeakArray[11]},
																{puntuak[12], taldeakArray[12]},
																{puntuak[13], taldeakArray[13]},
																{puntuak[14], taldeakArray[14]},
																{puntuak[15], taldeakArray[15]},
															},
															new String[] {
																"Puntuak", "Taldea"
															}
														));
													tableTaula.getColumnModel().getColumn(0).setPreferredWidth(43);
													tableTaula.getColumnModel().getColumn(1).setPreferredWidth(163);
												}
												if (comboBoxBisitari.getSelectedItem().equals(taldeakArray[i])) {
													puntuakArray[i]+=1;
													puntuak[i]= String.valueOf(puntuakArray[i]);
													tableTaula.setModel(new DefaultTableModel(
															new String[][] {
																{puntuak[0], taldeakArray[0]},
																{puntuak[1], taldeakArray[1]},
																{puntuak[2], taldeakArray[2]},
																{puntuak[3], taldeakArray[3]},
																{puntuak[4], taldeakArray[4]},
																{puntuak[5], taldeakArray[5]},
																{puntuak[6], taldeakArray[6]},
																{puntuak[7], taldeakArray[7]},
																{puntuak[8], taldeakArray[8]},
																{puntuak[9], taldeakArray[9]},
																{puntuak[10], taldeakArray[10]},
																{puntuak[11], taldeakArray[11]},
																{puntuak[12], taldeakArray[12]},
																{puntuak[13], taldeakArray[13]},
																{puntuak[14], taldeakArray[14]},
																{puntuak[15], taldeakArray[15]},
															},
															new String[] {
																"Puntuak", "Taldea"
															}
														));
													tableTaula.getColumnModel().getColumn(0).setPreferredWidth(43);
													tableTaula.getColumnModel().getColumn(1).setPreferredWidth(163);
												}
											}
										}
								int count=0;
								
								String[][] momen = new String[2][1];
								
								//Konparatu array-ak
								do {
									
									//Pasatu array-a int-etik String-era
									for (int i=0;i < 16;i++) {
										sortedPuntuakS[i]=String.valueOf(puntuakArray[i]);
										sortedTaldeak[i]=String.valueOf(taldeakArray[i]);
									}
									//Sartu array berrian ordenatuta
									for (int i = 0; i < 16 ; i++) {
										 for (int j = i + 1; j < 16; j++) {
										        if (Integer.parseInt(sortedPuntuakS[i]) < Integer.parseInt(sortedPuntuakS[j])) {
										            // Intercambio de elementos si el elemento actual es mayor que el siguiente
										        	momen[0][0] = sortedPuntuakS[i];
													momen[1][0] = sortedTaldeak[i];
													
													sortedPuntuakS[i] = sortedPuntuakS[j];
													sortedTaldeak[i] = sortedTaldeak[j];
													
													sortedPuntuakS[j] = momen[0][0];
													sortedTaldeak[j] = momen[1][0];
										        }
										}
									}
									
									//Hurrengo buelta
									count++;			
									
									///Taulan atera
									tableSailkapen.setModel(new DefaultTableModel(
											new String[][] {
												{"1", sortedPuntuakS[0], sortedTaldeak[0]},
												{"2", sortedPuntuakS[1], sortedTaldeak[1]},
												{"3", sortedPuntuakS[2], sortedTaldeak[2]},
												{"4", sortedPuntuakS[3], sortedTaldeak[3]},
												{"5", sortedPuntuakS[4], sortedTaldeak[4]},
												{"6", sortedPuntuakS[5], sortedTaldeak[5]},
												{"7", sortedPuntuakS[6], sortedTaldeak[6]},
												{"8", sortedPuntuakS[7], sortedTaldeak[7]},
												{"9", sortedPuntuakS[8], sortedTaldeak[8]},
												{"10", sortedPuntuakS[9], sortedTaldeak[9]},
												{"11", sortedPuntuakS[10], sortedTaldeak[10]},
												{"12", sortedPuntuakS[11], sortedTaldeak[11]},
												{"13", sortedPuntuakS[12], sortedTaldeak[12]},
												{"14", sortedPuntuakS[13], sortedTaldeak[13]},
												{"15", sortedPuntuakS[14], sortedTaldeak[14]},
												{"16", sortedPuntuakS[15], sortedTaldeak[15]},
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

								} while (count < 16);
							}else {
								dial.setVisible(true);
								dial.setTitle("Sailkapena: Error");
							}
							tfEtxekoGol.setText(null);
							tfBisitariGol.setText(null);
						} catch (Exception e2) {
							dial.setVisible(true);
							dial.setTitle("Sailkapena: Error");
						}
					}
				});
				
				btnEztatu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dial.setVisible(false);
						tfEtxekoGol.setText(null);
						tfBisitariGol.setText(null);
					}
				});
	}
		
	
}
