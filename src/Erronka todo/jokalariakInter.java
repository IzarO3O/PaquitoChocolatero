package erronka1;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public interface jokalariakInter extends erronka1.menuBar, erronka1.jokalariDat {
	public JPanel jokalariakPane = new JPanel();
	public JLabel jokalariIzena = new JLabel();
	
	public default void jokalariakRel() {
		
		jokalariakPane.setBounds(0, 0, 800, 510);
		jokalariakPane.setLayout(null);
		
		//taldea aukeratzeko comboBox-a
		JComboBox<String> taldeSelec = new JComboBox<String>();
		taldeSelec.setVisible(true);
		//gizoneskoen eta emakumezkoen jokalariak aukeratzeko
		JTabbedPane genero = new JTabbedPane(JTabbedPane.TOP);
		genero.setVisible(true);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVisible(true);
		JScrollPane scrollBar2 = new JScrollPane();
		scrollBar2.setVisible(true);
		
		//jokalarien lista
		DefaultListModel<String> jokalariIz = new DefaultListModel<String>();
		JList<String> list = new JList<String>(jokalariIz);
		
		JTextPane description = new JTextPane();
		description.setVisible(true);
		
		ImageIcon imagen4=new ImageIcon("Trey Fix-Wolansy.jpg");
		JLabel jokImg = new JLabel(imagen4);
		jokImg.setVisible(true);
		
		JPanel gizonezkoak = new JPanel();
		gizonezkoak.setVisible(true);
		JPanel emakumezkoak = new JPanel();
		emakumezkoak.setVisible(true);
		
		taldeSelec.setModel(new DefaultComboBoxModel<String>(new String[] {"Arizona Coyotes", "Boston Bruins", "Buffalo Sabres", "Carolina Hurricanes", "Chicago Blackhawks", "Colorado Avalanche", "Dallas Stars", "Detroit Red Wings", "Florida Panthers", "Minnesota Wild", "Montreal Canadiens", "Nashville Predators", "Ottawa Senators", "St. Louis Blues", "Toronto Maple Leafs", "Winnipeg Jets"}));
		
		taldeSelec.setBounds(27, 83, 235, 20);
		genero.setBounds(27, 112, 235, 338);
		gizonezkoak.setBackground(new Color(255, 255, 255));
		
		scrollPane.setPreferredSize(new java.awt.Dimension(220, 300));
		
		scrollBar2.setBounds(778, 56, 330, 240);
		
		description.setBounds(433, 127, 284, 92);
		jokalariIzena.setBounds(433, 83, 127, 33);
		//default-eko balioa
		jokalariIzena.setText("Trey Fix-Wolansy");
		jokImg.setBounds(288, 83, 135, 201);
		//default-eko balioa
		description.setText("Center -- shoots L\\r\\nBorn Feb 3 2000 -- New York, NY\\r\\n[23 yrs. ago]\\r\\nHeight 5.11 -- Weight 174 [180 cm/79 kg]");
		
		//lis-eko default balioa
		for(int i = 0; i < 121; i++) {
			if(taldeJok[i][1].equals("Arizona Coyotes")){
				jokalariIz.addElement(taldeJok[i][0]);
			}
		}
		//lista honetan autatzerakoan argazkia izena eta deskribapena aldatzeko
		list.addListSelectionListener(new ListSelectionListener() {
		    @Override
		    public void valueChanged(ListSelectionEvent e) {
		    	if (list.getSelectedValue() != null) {
		    		jokalariIzena.setText(list.getSelectedValue().toString());
		    		ImageIcon imagen =new ImageIcon(""+ jokalariIzena.getText().toString() + ".jpg");
		    		jokImg.setIcon(imagen);
		    		
		    		for(int i = 0; jokalariIzena.getText() != url[i][0]; i++) {
		    			description.setText(url[i][1]);
		    		}
		    	}
		    }
		});
		//default-eko balioa
		taldeSelec.setSelectedItem("Arizona Coyotes");
		//segun ze talde aukeratzen duzu jokalariak filtratzen ditu
		taldeSelec.addActionListener(new ActionListener() {
			   @SuppressWarnings("unchecked")
			@Override
			   public void actionPerformed(ActionEvent e) {
				   
				   if(taldeSelec.getSelectedItem().equals("Arizona Coyotes")) {
					   	jokalariIz.removeAllElements();
						for(int i = 0; i < 121; i++) {
							if(taldeJok[i][1].equals(taldeSelec.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(taldeSelec.getSelectedItem().equals("Boston Bruins")) {
					   jokalariIz.removeAllElements();
						for(int i = 0; i < taldeJok.length; i++) {
							if(taldeJok[i][1].equals(taldeSelec.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(taldeSelec.getSelectedItem().equals("Buffalo Sabres")) {
					   jokalariIz.removeAllElements();
						for(int i = 0; i < taldeJok.length; i++) {
							if(taldeJok[i][1].equals(taldeSelec.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(taldeSelec.getSelectedItem().equals("Carolina Hurricanes")) {
					   jokalariIz.removeAllElements();
						for(int i = 0; i < taldeJok.length; i++) {
							if(taldeJok[i][1].equals(taldeSelec.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(taldeSelec.getSelectedItem().equals("Chicago Blackhawks")) {
					   jokalariIz.removeAllElements();
						for(int i = 0; i < taldeJok.length; i++) {
							if(taldeJok[i][1].equals(taldeSelec.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(taldeSelec.getSelectedItem().equals("Colorado Avalanche")) {
					   jokalariIz.removeAllElements();
						for(int i = 0; i < taldeJok.length; i++) {
							if(taldeJok[i][1].equals(taldeSelec.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(taldeSelec.getSelectedItem().equals("Dallas Stars")) {
					   jokalariIz.removeAllElements();
						for(int i = 0; i < taldeJok.length; i++) {
							if(taldeJok[i][1].equals(taldeSelec.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(taldeSelec.getSelectedItem().equals("Detroit Red Wings")) {
					   jokalariIz.removeAllElements();
						for(int i = 0; i < taldeJok.length; i++) {
							if(taldeJok[i][1].equals(taldeSelec.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(taldeSelec.getSelectedItem().equals("Florida Panthers")) {
					   jokalariIz.removeAllElements();
						for(int i = 0; i < taldeJok.length; i++) {
							if(taldeJok[i][1].equals(taldeSelec.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(taldeSelec.getSelectedItem().equals("Minnesota Wild")) {
					   jokalariIz.removeAllElements();
						for(int i = 0; i < taldeJok.length; i++) {
							if(taldeJok[i][1].equals(taldeSelec.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(taldeSelec.getSelectedItem().equals("Montreal Canadiens")) {
					   jokalariIz.removeAllElements();
						for(int i = 0; i < taldeJok.length; i++) {
							if(taldeJok[i][1].equals(taldeSelec.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(taldeSelec.getSelectedItem().equals("Nashville Predators")) {
					   jokalariIz.removeAllElements();
						for(int i = 0; i < taldeJok.length; i++) {
							if(taldeJok[i][1].equals(taldeSelec.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(taldeSelec.getSelectedItem().equals("Ottawa Senators")) {
					   jokalariIz.removeAllElements();
						for(int i = 0; i < taldeJok.length; i++) {
							if(taldeJok[i][1].equals(taldeSelec.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(taldeSelec.getSelectedItem().equals("St. Louis Blues")) {
					   jokalariIz.removeAllElements();
						for(int i = 0; i < taldeJok.length; i++) {
							if(taldeJok[i][1].equals(taldeSelec.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(taldeSelec.getSelectedItem().equals("Toronto Maple Leafs")) {
					   jokalariIz.removeAllElements();
						for(int i = 0; i < taldeJok.length; i++) {
							if(taldeJok[i][1].equals(taldeSelec.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(taldeSelec.getSelectedItem().equals("Winnipeg Jets")) {
					   jokalariIz.removeAllElements();
						for(int i = 0; i < taldeJok.length; i++) {
							if(taldeJok[i][1].equals(taldeSelec.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }
			  }
		});
		
		gizonezkoak.add(scrollPane);
		scrollPane.setViewportView(list);
		genero.addTab("Gizonezkoak", null, gizonezkoak, null);
		genero.addTab("Emakumezkoak", null, emakumezkoak, null);
		
		jokalariakPane.add(taldeSelec);
		jokalariakPane.add(genero);
		jokalariakPane.add(jokalariIzena);
		jokalariakPane.add(description);
		
		jokalariakPane.add(jokImg);
		
		
		
	}
}
