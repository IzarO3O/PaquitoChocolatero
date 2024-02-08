package erronka2;

import javax.swing.JPanel;

import java.io.FileWriter;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import erronkaOndo2.Persona;

import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

import java.io.File;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.NetPermission;
import java.net.URL;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSpinner;

/**
 * 
 */
public class FIBA extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private JTextField textField;
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private boolean ireki=false;

	/**
	 * Create the panel.
	 */
	private int puntu1 = 0;
	private int puntu2 = 0;
	FileOutputStream fos;
	ObjectOutputStream oos;

	public FIBA() {
		
		setBounds(0,0,710, 380);
		setBackground(new Color(128, 128, 128));
		setLayout(null);
		
		try {
			menuFIBA();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@SuppressWarnings("deprecation")
	public void menuFIBA () throws SAXException, IOException {
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 684, 360);
		add(panel);
		panel.setLayout(null);
		
		JButton btnJokalariBerria = new JButton("Jokalari Berria");
		btnJokalariBerria.setBounds(10, 10, 145, 30);
		panel.add(btnJokalariBerria);
		JButton btnNewButton = new JButton("Jolastu");
		btnNewButton.setBounds(529, 10, 145, 30);
		panel.add(btnNewButton);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setBounds(173, 75, 64, 21);
		panel.add(comboBox_9);
		comboBox_9.setBackground(new Color(255, 128, 128));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(173, 101, 64, 21);
		panel.add(comboBox_1);
		comboBox_1.setBackground(new Color(128, 128, 255));
			
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(86, 179, 64, 21);
		panel.add(comboBox);
		comboBox.setBackground(new Color(128, 128, 255));
		
				
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(151, 280, 64, 21);
		panel.add(comboBox_2);
		comboBox_2.setBackground(new Color(128, 128, 255));
		
				
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(237, 250, 64, 21);
		panel.add(comboBox_8);
		comboBox_8.setBackground(new Color(255, 128, 128));
		
				
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(466, 280, 64, 21);
		panel.add(comboBox_4);
		comboBox_4.setBackground(new Color(128, 128, 255));
		
				
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(466, 250, 64, 21);
		panel.add(comboBox_6);
		comboBox_6.setBackground(new Color(255, 128, 128));
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(552, 179, 64, 21);
		panel.add(comboBox_5);
		comboBox_5.setBackground(new Color(255, 128, 128));
		
				
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(504, 101, 64, 21);
		panel.add(comboBox_7);
		comboBox_7.setBackground(new Color(255, 128, 128));
		
			
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(425, 75, 64, 21);
		panel.add(comboBox_3);
		comboBox_3.setBackground(new Color(128, 128, 255));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(43, 50, 617, 292);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(FIBA.class.getResource("/erronka2/court.jpg")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
				File xmlFile = new File("C:\\PROG\\JAVA\\src\\erronka2\\jokala.xml");

	            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	            Document doc = dBuilder.parse(xmlFile);

	            // Normalize the document
	            doc.getDocumentElement().normalize();

	            // Assuming each name is represented by a <Name> element
	            NodeList nameList = doc.getElementsByTagName("Izena");

	            for (int temp = 0; temp < nameList.getLength(); temp++) {
	                org.w3c.dom.Node nNode = nameList.item(temp);

	                if (nNode.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
	                    Element eElement = (Element) nNode;
	                    
	                    int abia = 0;
                        int punt = 0;
                        int defe = 0;
	                    int abia1 = 0;
                        int punt1 = 0;
                        int defe1 = 0;
	                    int abia2 = 0;
                        int punt2 = 0;
                        int defe2 = 0;
	                    int abia3 = 0;
                        int punt3 = 0;
                        int defe3 = 0;
	                    int abia4 = 0;
                        int punt4 = 0;
                        int defe4 = 0;
	                    int abia5 = 0;
                        int punt5 = 0;
                        int defe5 = 0;
	                    int abia6 = 0;
                        int punt6 = 0;
                        int defe6 = 0;
	                    int abia7 = 0;
                        int punt7 = 0;
                        int defe7 = 0;
	                    int abia8 = 0;
                        int punt8 = 0;
                        int defe8 = 0;
	                    int abia9 = 0;
                        int punt9 = 0;
                        int defe9 = 0;
                        
                        // Check if the name matches the search term
	                    if (eElement.getTextContent().equals(comboBox.getSelectedItem())) {
	                        // Get attributes Abiadura, Punteria, and Defentza
	                    	NodeList abiaduraElements = eElement.getElementsByTagName("Abiadura");
	                    	Element abiaduraElement = (Element) abiaduraElements.item(1);
	                    	String abiadura = abiaduraElement.getTextContent();
	                    	//String abiadura = eElement.getAttribute("Abiadura");
	                    	String punteria = eElement.getAttribute("Punteria");
	                    	String defentza = eElement.getAttribute("Defentza");
	                    	System.out.println(abiadura);
	                         abia = 0 + Integer.parseInt(abiadura);
	                         punt = 0 + Integer.parseInt(punteria);
	                         defe = 0 + Integer.parseInt(defentza);

	                    }
	                    if (eElement.getTextContent().equals(comboBox_1.getSelectedItem())) {
	                        // Get attributes Abiadura, Punteria, and Defentza
	                    	String abiadura_1 = eElement.getAttribute("Abiadura");
	                    	String punteria_1 = eElement.getAttribute("Punteria");
	                    	String defentza_1 = eElement.getAttribute("Defentza");
		                      abia1 = Integer.parseInt(abiadura_1);
		                      punt1 = Integer.parseInt(punteria_1);
		                      defe1 = Integer.parseInt(defentza_1);
	                    }
	                    if (eElement.getTextContent().equals(comboBox_2.getSelectedItem())) {
	                        // Get attributes Abiadura, Punteria, and Defentza
	                    	String abiadura_2 = eElement.getAttribute("Abiadura");
	                    	String punteria_2 = eElement.getAttribute("Punteria");
	                    	String defentza_2 = eElement.getAttribute("Defentza");
	                          abia2 = Integer.parseInt(abiadura_2);
		                      punt2 = Integer.parseInt(punteria_2);
		                      defe2 = Integer.parseInt(defentza_2);
	                    }
	                    if (eElement.getTextContent().equals(comboBox_3.getSelectedItem())) {
	                        // Get attributes Abiadura, Punteria, and Defentza
	                    	String abiadura_3 = eElement.getAttribute("Abiadura");
	                    	String punteria_3 = eElement.getAttribute("Punteria");
	                    	String defentza_3 = eElement.getAttribute("Defentza");
	                    	abia3 = Integer.parseInt(abiadura_3);
		                      punt3 = Integer.parseInt(punteria_3);
		                      defe3 = Integer.parseInt(defentza_3);
	                    }
	                    
	                    if (eElement.getTextContent().equals(comboBox_4.getSelectedItem())) {
	                        // Get attributes Abiadura, Punteria, and Defentza
	                    	String abiadura_4 = eElement.getAttribute("Abiadura");
	                    	String punteria_4 = eElement.getAttribute("Punteria");
	                    	String defentza_4 = eElement.getAttribute("Defentza");
	                    	abia4 = Integer.parseInt(abiadura_4);
		                      punt4 = Integer.parseInt(punteria_4);
		                      defe4 = Integer.parseInt(defentza_4);
	                    }
	                    if (eElement.getTextContent().equals(comboBox_5.getSelectedItem())) {
	                        // Get attributes Abiadura, Punteria, and Defentza
	                    	String abiadura_5 = eElement.getAttribute("Abiadura");
	                    	String punteria_5 = eElement.getAttribute("Punteria");
	                    	String defentza_5 = eElement.getAttribute("Defentza");
	                    	abia5 = Integer.parseInt(abiadura_5);
		                      punt5 = Integer.parseInt(punteria_5);
		                      defe5 = Integer.parseInt(defentza_5);
	                    }
	                    if (eElement.getTextContent().equals(comboBox_6.getSelectedItem())) {
	                        // Get attributes Abiadura, Punteria, and Defentza
	                    	String abiadura_6 = eElement.getAttribute("Abiadura");
	                    	String punteria_6 = eElement.getAttribute("Punteria");
	                    	String defentza_6 = eElement.getAttribute("Defentza");
	                    	abia6 = Integer.parseInt(abiadura_6);
		                      punt6 = Integer.parseInt(punteria_6);
		                      defe6 = Integer.parseInt(defentza_6);
	                    }
	                    if (eElement.getTextContent().equals(comboBox_7.getSelectedItem())) {
	                        // Get attributes Abiadura, Punteria, and Defentza
	                    	String abiadura_7 = eElement.getAttribute("Abiadura");
	                    	String punteria_7 = eElement.getAttribute("Punteria");
	                    	String defentza_7 = eElement.getAttribute("Defentza");
	                    	abia7 = Integer.parseInt(abiadura_7);
		                      punt7 = Integer.parseInt(punteria_7);
		                      defe7 = Integer.parseInt(defentza_7);
	                    }
	                    if (eElement.getTextContent().equals(comboBox_8.getSelectedItem())) {
	                        // Get attributes Abiadura, Punteria, and Defentza
	                    	String abiadura_8 = eElement.getAttribute("Abiadura");
	                    	String punteria_8 = eElement.getAttribute("Punteria");
	                    	String defentza_8 = eElement.getAttribute("Defentza");
	                    	abia8 = Integer.parseInt(abiadura_8);
		                      punt8 = Integer.parseInt(punteria_8);
		                      defe8 = Integer.parseInt(defentza_8);
	                    }
	                    if (eElement.getTextContent().equals(comboBox_9.getSelectedItem())) {
	                        // Get attributes Abiadura, Punteria, and Defentza
	                    	String abiadura_9 = eElement.getAttribute("Abiadura");
	                    	String punteria_9 = eElement.getAttribute("Punteria");
	                    	String defentza_9 = eElement.getAttribute("Defentza");
	                    	abia9 = Integer.parseInt(abiadura_9);
		                      punt9 = Integer.parseInt(punteria_9);
		                      defe9 = Integer.parseInt(defentza_9);
	                    }
	                    if (defe>defe5) {
	                    	puntu1 = puntu1+1;
	                    }else if (defe<defe5) {
	                    	puntu2 = puntu2+1;
	                    } 
	                    System.out.println(defe);
	                
	                }
	            }
	            
	            
	            
	            
	           
	            
	        } catch (ParserConfigurationException | SAXException | IOException e1) {
	            e1.printStackTrace(); // Handle error properly in your application
	        }
			}
		});
		
		try {
			//XMLtik comboBoxera
	        File xmlFile = new File("C:\\PROG\\JAVA\\src\\erronka2\\jokala.xml");

	        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder dBuilder;
			
				dBuilder = dbFactory.newDocumentBuilder();
			
	        Document doc1 = dBuilder.parse(xmlFile);

	        // Normalize the document
	        doc1.getDocumentElement().normalize();

	        NodeList nameList = doc1.getElementsByTagName("Izena");

	        for (int temp = 0; temp < nameList.getLength(); temp++) {
	            org.w3c.dom.Node nNode = nameList.item(temp);

	            if (nNode.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
	                Element eElement = (Element) nNode;
	                for (Component component : getComponents()) {
	                	comboBox.addItem(eElement.getTextContent()); 
	                	comboBox_1.addItem(eElement.getTextContent());
	                	comboBox_2.addItem(eElement.getTextContent());
	                	comboBox_3.addItem(eElement.getTextContent());
	                	comboBox_4.addItem(eElement.getTextContent());
	                	comboBox_5.addItem(eElement.getTextContent());
	                	comboBox_6.addItem(eElement.getTextContent());
	                	comboBox_7.addItem(eElement.getTextContent());
	                	comboBox_8.addItem(eElement.getTextContent());
	                	comboBox_9.addItem(eElement.getTextContent());
	        }
	            }
	        }
	        } catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(192, 192, 192));
		panel1.setBounds(48, 28, 605, 309);
		add(panel1);
		panel1.setLayout(null);
		panel1.setVisible(false);
		
		JLabel lblNewLabel_1 = new JLabel("IZENA");
		lblNewLabel_1.setBounds(46, 40, 45, 13);
		panel1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(46, 63, 96, 19);
		panel1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ABIERA (0-120)");
		lblNewLabel_2.setBounds(43, 103, 126, 13);
		panel1.add(lblNewLabel_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(46, 126, 30, 20);
		panel1.add(spinner_3);
		
		JLabel lblNewLabel_3 = new JLabel("DEFENTZA (0-120)");
		lblNewLabel_3.setBounds(46, 156, 191, 13);
		panel1.add(lblNewLabel_3);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(46, 179, 30, 20);
		panel1.add(spinner_1);
		
		JLabel lblNewLabel_4 = new JLabel("PUNTERIA (0-120)");
		lblNewLabel_4.setBounds(39, 218, 147, 13);
		panel1.add(lblNewLabel_4);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(46, 241, 30, 20);
		panel1.add(spinner_2);
		
		JButton btnNewButton_1 = new JButton("SARTU");
		btnNewButton_1.setBounds(333, 62, 85, 21);
		panel1.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(new JFrame(), "Parametro guztiak idatzi","Error",JOptionPane.WARNING_MESSAGE);
				}else {
					int abi = (int) spinner_3.getValue();
					int pun = (int) spinner_1.getValue();
					int def = (int) spinner_2.getValue();

					if (abi>120||abi<0||def>120||def<0||pun>120||pun<0) {
						JOptionPane.showMessageDialog(new JFrame(), "Habilitatea ez da onartzen","Error",JOptionPane.WARNING_MESSAGE);
					}else {
						Jokalaria jokalaria = new Jokalaria();
						jokalaria.setizena(textField.getText());
						jokalaria.setabiadura(abi);
						jokalaria.setpunteria(pun);
						jokalaria.setdefentza(def);
						
						panel.setVisible(true);
						panel1.setVisible(false);
						// Crear una instancia de Jokalaria
						/*   Jokalaria jokalaria = new Jokalaria();

		        		// Obtener la representación XML de la jokalaria
		        		String xmljokala = jokalaria.toXML();
*/
						// Escribir el XML en un archivo
		        try {
		        	String i = textField.getText();
		            String a = Integer.toString(abi);
		            String p = Integer.toString(pun);
		            String d = Integer.toString(def);

		            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		            Document doc = docBuilder.parse("C:\\PROG\\JAVA\\src\\erronka2\\jokala.xml");

		            // Create a new jokala element
		            Element jokalaElement = doc.createElement("Jokalaria");

		            // Create elements for each piece of information
		            Element izenaElement = doc.createElement("Izena");
		            izenaElement.appendChild(doc.createTextNode(i));
		            jokalaElement.appendChild(izenaElement);

		            Element abiaduraElement = doc.createElement("Abiadura");
		            abiaduraElement.appendChild(doc.createTextNode(a));
		            jokalaElement.appendChild(abiaduraElement);

		            Element punteriaElement = doc.createElement("Punteria");
		            punteriaElement.appendChild(doc.createTextNode(p));
		            jokalaElement.appendChild(punteriaElement);

		            Element defentzaElement = doc.createElement("Defentza");
		            defentzaElement.appendChild(doc.createTextNode(d));
		            jokalaElement.appendChild(defentzaElement);

		            // Append the jokala element to the root element of the document
		            doc.getDocumentElement().appendChild(jokalaElement);

		            // Write the updated XML document back to the file
		            TransformerFactory transformerFactory = TransformerFactory.newInstance();
		            Transformer transformer = transformerFactory.newTransformer();
		            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		            DOMSource source = new DOMSource(doc);
		            StreamResult result = new StreamResult(new File("C:\\PROG\\JAVA\\src\\erronka2\\jokala.xml"));
		            transformer.transform(source, result);

		            
		            
		        /*	Transformer transformer = TransformerFactory.newInstance().newTransformer();
		        	transformer.setOutputProperty(OutputKeys.INDENT, "yes");

		        	//initialize StreamResult with File object to save to file
		        	StreamResult result = new StreamResult(new StringWriter());
		        	DOMSource source = new DOMSource(doc);
		        	transformer.transform(source, result);

		        	String xmlString = result.getWriter().toString();
		        	System.out.println(xmlString);
					*/JOptionPane.showMessageDialog(new JFrame(), "No","Error",JOptionPane.WARNING_MESSAGE);
		        } catch (IOException | ParserConfigurationException | SAXException | TransformerException e1) {
					JOptionPane.showMessageDialog(new JFrame(), "Ez da onartu","Error",JOptionPane.WARNING_MESSAGE);
		        }
				
				 
			}

				}}
			
		/*	public int getTextField(JSpinner spinner) {
				// TODO Auto-generated method stub
				return 4266;
			}*/
		});
		btnJokalariBerria.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
			panel.setVisible(false);
			panel1.setVisible(true);

	    }	        
			
		});
	
	
	
	
	//public void jokalariBerri() {
		//this.menuFIBA();
		
}}
