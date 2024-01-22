package Calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JComboBox;


/**
 * @author Andoni
 * @version 1.1
 */

public class calculadora extends javax.swing.JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frmCalculadora;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora window = new calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public static boolean por=false, entre=false, menos=false, mas=false, punto=false, porce=false, par1=false;
	public static double num1=0, num2=0;

	/**
	 * Create the application.
	 */
	public calculadora() {
		initialize();
	}
	
	/**
	 * 
	 */
	private void initialize() {
		
		frmCalculadora = new JFrame();
		frmCalculadora.setResizable(false);
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setForeground(new Color(0, 0, 0));
		frmCalculadora.getContentPane().setBackground(Color.black);
		frmCalculadora.getContentPane().setForeground(Color.black);
		frmCalculadora.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\andon\\eclipse-workspace\\calculadora\\src\\calculadora\\346399.png"));
		frmCalculadora.setBounds(100, 100, 433, 683);
		frmCalculadora.setUndecorated(false);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Dialog", Font.PLAIN, 25));
		textField.setColumns(10);
		textField.setBorder(null);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.WHITE);
		textField_1.setEditable(false);
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		
		
		JButton siete = new JButton("7");
		siete.setBorder(null);
		siete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(par1==true) {
					textField.setText(null);
					textField.setText(textField.getText()+"7");
				}else {
					textField.setText(textField.getText()+"7");
				}
				par1=false;
			}
		});
		
		JButton ocho = new JButton("8");
		ocho.setBorder(null);
		ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(par1==true) {
					textField.setText(null);
					textField.setText(textField.getText()+"8");
				}else {
					textField.setText(textField.getText()+"8");
				}
				par1=false;
			}
		});
		
		JButton nueve = new JButton("9");
		nueve.setBorder(null);
		nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(par1==true) {
					textField.setText(null);
					textField.setText(textField.getText()+"9");
				}else {
					textField.setText(textField.getText()+"9");
				}
				par1=false;
			}
		});
		
		JButton porcen = new JButton("/");
		porcen.setBorder(null);
		porcen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField.getText()+" /");
				if(textField_1 != null) {
					textField_1.setText(textField_1.getText().substring(0, textField_1.getText().length()-2)+" /");
				}
				mas=false;
				menos=false;
				por=false;
				porce=false;
				num1= Double.parseDouble(textField.getText());
				entre= true;
				par1= true;
				punto=false;
			}
		});
		
		JButton ce = new JButton("CE");
		ce.setBorder(null);
		ce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				
				por=false;
				entre=false;
				menos=false;
				mas=false;
				punto=false;
				porce=false;
			}
		});
		
		JButton c = new JButton("C");
		c.setBorder(null);
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().substring(0, textField.getText().length()-1));
				
			}
		});
		
		JButton tres = new JButton("3");
		tres.setBorder(null);
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(par1==true) {
					textField.setText(null);
					textField.setText(textField.getText()+"3");
				}else {
					textField.setText(textField.getText()+"3");
				}
				par1=false;
			}
		});
		
		JButton meno = new JButton("-");
		meno.setBorder(null);
		meno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField.getText()+" -");
				if(textField_1 != null) {
					textField_1.setText(textField_1.getText().substring(0, textField_1.getText().length()-2)+" -");
				}
				mas=false;
				por=false;
				entre=false;
				porce=false;
				num1= Double.parseDouble(textField.getText());
				menos= true;
				par1= true;
				punto=false;
			}
		});
		
		JButton po = new JButton("x");
		po.setBorder(null);
		po.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField.getText()+" x");
				if(textField_1 != null) {
					textField_1.setText(textField_1.getText().substring(0, textField_1.getText().length()-1)+" x");
				}
				mas=false;
				menos=false;
				entre=false;
				porce=false;
				num1= Double.parseDouble(textField.getText());
				por= true;
				par1= true;
				punto=false;
			}
		});
		
		JButton seis = new JButton("6");
		seis.setBorder(null);
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(par1==true) {
					textField.setText(null);
					textField.setText(textField.getText()+"6");
				}else {
					textField.setText(textField.getText()+"6");
				}
				par1=false;
			}
		});
		
		JButton dos = new JButton("2");
		dos.setBorder(null);
		dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(par1==true) {
					textField.setText(null);
					textField.setText(textField.getText()+"2");
				}else {
					textField.setText(textField.getText()+"2");
				}
				par1=false;
			}
		});
		
		JButton cinco = new JButton("5");
		cinco.setBorder(null);
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(par1==true) {
					textField.setText(null);
					textField.setText(textField.getText()+"5");
				}else {
					textField.setText(textField.getText()+"5");
				}
				par1=false;
			}
		});
		
		JButton cuatro = new JButton("4");
		cuatro.setBorder(null);
		cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(par1==true) {
					textField.setText(null);
					textField.setText(textField.getText()+"4");
				}else {
					textField.setText(textField.getText()+"4");
				}
				par1=false;
			}
		});
		
		JButton uno = new JButton("1");
		uno.setBorder(null);
		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(par1==true) {
					textField.setText(null);
					textField.setText(textField.getText()+"1");
				}else {
					textField.setText(textField.getText()+"1");
				}
				par1=false;
			}
		});
		
		JButton cero = new JButton("0");
		cero.setBorder(null);
		cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(par1==true) {
					textField.setText(null);
					textField.setText(textField.getText()+"0");
				}else {
					if(punto==true) {
						textField.setText(textField.getText()+"0");
					}else if(punto==true && par1==false){
						textField.setText(textField.getText()+"0");
					}else {
						textField.setText(null);
						textField.setText(textField.getText()+"0");
					}
				}
				par1=false;
			}
		});
		
		JButton punt = new JButton(".");
		punt.setBorder(null);
		punt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(punto!=true && textField!=null) {
					textField.setText(textField.getText()+".");
					punto=true;
					if(textField_1 == null) {
						textField_1.setText(textField.getText());
					}
				}
			}
		});
		
		JButton re = new JButton("=");
		re.setBorder(null);
		re.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Double.parseDouble(textField.getText());
				textField.setText(null);
				textField_1.setText(null);
				
				if(por == true) {
					String numCadena= Double.toString(num1*num2);
					textField.setText(numCadena);
				}else if(entre == true) {
					String numCadena= Double.toString(num1/num2);
					textField.setText(numCadena);
				}else if(menos == true) {
					String numCadena= Double.toString(num1-num2);
					textField.setText(numCadena);
				}else if(mas == true) {
					String numCadena= Double.toString(num1+num2);
					textField.setText(numCadena);
				}else if (porce == true) {
					String numCadena= Double.toString(num1%num2);
					textField.setText(numCadena);
				}
				
				por=false;
				entre=false;
				menos=false;
				mas=false;
				punto=false;
				porce=false;
				par1=false;
				num1=0;
				num2=0;
			}
		});
		
		JButton ma = new JButton("+");
		ma.setBorder(null);
		ma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField.getText()+" +");
				if(textField_1 != null) {
					textField_1.setText(textField_1.getText().substring(0, textField_1.getText().length()-2)+" +");
				}
				porce=false;
				menos=false;
				entre=false;
				por=false;
				num1= Double.parseDouble(textField.getText());
				par1= true;
				mas= true;
				punto=false;
			}
		});
		
		JButton porc = new JButton("%");
		porc.setBorder(null);
		porc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField.getText()+" %");
				if(textField_1 != null) {
					textField_1.setText(textField_1.getText().substring(0, textField_1.getText().length()-2)+" %");
				}
				mas=false;
				menos=false;
				entre=false;
				por=false;
				num1= Double.parseDouble(textField.getText());
				par1= true;
				porce= true;
				punto=false;
			}
		});
		
		ma.setForeground(Color.white);
  	  porc.setForeground(Color.white);
  	  re.setForeground(Color.white);
  	  punt.setForeground(Color.white);
  	  po.setForeground(Color.white);
  	  meno.setForeground(Color.white);
  	  c.setForeground(Color.white);
  	  ce.setForeground(Color.white);
  	  porcen.setForeground(Color.white);
  	  cero.setForeground(Color.white);
  	  uno.setForeground(Color.white);
  	  cuatro.setForeground(Color.white);
  	  cinco.setForeground(Color.white);
  	  dos.setForeground(Color.white);
  	  seis.setForeground(Color.white);
  	  tres.setForeground(Color.white);
  	  ocho.setForeground(Color.white);
  	  siete.setForeground(Color.white);
  	  nueve.setForeground(Color.white);
  	  
  	  punt.setBackground(Color.gray);
  	  cero.setBackground(Color.gray);
  	  uno.setBackground(Color.gray);
  	  cuatro.setBackground(Color.gray);
  	  cinco.setBackground(Color.gray);
  	  dos.setBackground(Color.gray);
  	  seis.setBackground(Color.gray);
  	  tres.setBackground(Color.gray);
  	  ocho.setBackground(Color.gray);
  	  siete.setBackground(Color.gray);
  	  nueve.setBackground(Color.gray);
  	  
  	  ma.setBackground(Color.orange);
  	  porc.setBackground(Color.orange);
  	  re.setBackground(Color.orange);
  	  po.setBackground(Color.orange);
  	  meno.setBackground(Color.orange);
  	  c.setBackground(Color.orange);
  	  ce.setBackground(Color.orange);
  	  porcen.setBackground(Color.orange);
  	  
  	  
  	  
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBackground(new Color(0, 0, 0));
		comboBox.addItem("Dark");
		comboBox.addItem("Light");
		comboBox.setForeground(Color.white);
		comboBox.setForeground(Color.white);
		textField.setBackground(Color.gray);
  	    textField_1.setBackground(Color.gray);
		comboBox.addActionListener(new ActionListener() {
			   @Override
			   public void actionPerformed(ActionEvent e) {
			    	  
			      if(comboBox.getSelectedItem()=="Dark") {
			    	  frmCalculadora.getContentPane().setBackground(Color.black);
			    	  textField.setBackground(Color.gray);
			    	  textField_1.setBackground(Color.gray);
			    	  comboBox.setBackground(Color.black);
			    	  ma.setForeground(Color.white);
			      	  porc.setForeground(Color.white);
			      	  re.setForeground(Color.white);
			      	  punt.setForeground(Color.white);
			      	  po.setForeground(Color.white);
			      	  meno.setForeground(Color.white);
			      	  c.setForeground(Color.white);
			      	  ce.setForeground(Color.white);
			      	  porcen.setForeground(Color.white);
			      	  cero.setForeground(Color.white);
			      	  uno.setForeground(Color.white);
			      	  cuatro.setForeground(Color.white);
			      	  cinco.setForeground(Color.white);
			      	  dos.setForeground(Color.white);
			      	  seis.setForeground(Color.white);
			      	  tres.setForeground(Color.white);
			      	  ocho.setForeground(Color.white);
			      	  siete.setForeground(Color.white);
			      	  nueve.setForeground(Color.white);
			      	  
			      	  punt.setBackground(Color.gray);
			      	  cero.setBackground(Color.gray);
			      	  uno.setBackground(Color.gray);
			      	  cuatro.setBackground(Color.gray);
			      	  cinco.setBackground(Color.gray);
			      	  dos.setBackground(Color.gray);
			      	  seis.setBackground(Color.gray);
			      	  tres.setBackground(Color.gray);
			      	  ocho.setBackground(Color.gray);
			      	  siete.setBackground(Color.gray);
			      	  nueve.setBackground(Color.gray);
			      	  
			      	  ma.setBackground(Color.orange);
			      	  porc.setBackground(Color.orange);
			      	  re.setBackground(Color.orange);
			      	  po.setBackground(Color.orange);
			      	  meno.setBackground(Color.orange);
			      	  c.setBackground(Color.orange);
			      	  ce.setBackground(Color.orange);
			      	  porcen.setBackground(Color.orange);
			      }else if(comboBox.getSelectedItem()=="Light") {
			    	  frmCalculadora.getContentPane().setBackground(Color.white);
			  		  textField.setBackground(new Color(238, 254, 255));
			  	      textField_1.setBackground(new Color(238, 254, 255));
			    	  frmCalculadora.getContentPane().setBackground(Color.white);
			    	  comboBox.setForeground(Color.black);
			    	  comboBox.setBackground(Color.white);
			    	  ma.setForeground(Color.black);
			      	  porc.setForeground(Color.black);
			      	  re.setForeground(Color.black);
			      	  punt.setForeground(Color.black);
			      	  po.setForeground(Color.black);
			      	  meno.setForeground(Color.black);
			      	  c.setForeground(Color.black);
			      	  ce.setForeground(Color.black);
			      	  porcen.setForeground(Color.black);
			      	  cero.setForeground(Color.black);
			      	  uno.setForeground(Color.black);
			      	  cuatro.setForeground(Color.black);
			      	  cinco.setForeground(Color.black);
			      	  dos.setForeground(Color.black);
			      	  seis.setForeground(Color.black);
			      	  tres.setForeground(Color.black);
			      	  ocho.setForeground(Color.black);
			      	  siete.setForeground(Color.black);
			      	  nueve.setForeground(Color.black);
			      	  
			      	  ma.setBackground(Color.orange);
			      	  porc.setBackground(Color.orange);
			      	  re.setBackground(Color.orange);
			      	  po.setBackground(Color.orange);
			      	  meno.setBackground(Color.orange);
			      	  c.setBackground(Color.orange);
			      	  ce.setBackground(Color.orange);
			      	  porcen.setBackground(Color.orange);
			      	  
			      	  textField.setBorder(new MatteBorder(1,1,1,1,Color.black));
			      	  textField_1.setBorder(new MatteBorder(1,1,1,1,Color.black));
			      }
			   }
		});
		GroupLayout groupLayout = new GroupLayout(frmCalculadora.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 293, GroupLayout.PREFERRED_SIZE)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(255)
							.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
					.addGap(14))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(cuatro, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cinco, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(uno, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(dos, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(siete, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(ocho, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(cero, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(punt, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(ce, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(c, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(nueve, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(po, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(re, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(porc, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
									.addComponent(tres, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
									.addComponent(seis, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(ma, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
									.addComponent(porcen, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
									.addComponent(meno, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(9)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(90)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(nueve, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
										.addComponent(po, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(porc, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
									.addComponent(porcen, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(meno, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
								.addComponent(seis, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(ma, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
								.addComponent(tres, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(re, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(ce, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
								.addComponent(c, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(siete, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
								.addComponent(ocho, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(cinco, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
								.addComponent(cuatro, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(uno, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
								.addComponent(dos, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(cero, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
								.addComponent(punt, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		frmCalculadora.getContentPane().setLayout(groupLayout);
	}
}