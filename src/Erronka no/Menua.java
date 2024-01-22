package klaseak;
import java.awt.Color;
import javax.swing.*;
/**
 * Lehio nagusiaren panel guztietan agertzen den nabigazio menua
 */
public class Menua extends JMenuBar{
	/**
	 * Hasierara joateko botoia
	 */
	JButton btnHasiera;
	/**
	 * infoOrokorrarara joateko botoia
	 */
	JButton btnInfoOrokorra;
	/**
	 * Lehiaketara joateko botoia
	 */
	JButton btnLehiaketa;
	/**
	 * kontaktuetara joateko botoia
	 */
	JButton btnGehigarriak;

	@SuppressWarnings("javadoc")
	private static final long serialVersionUID = 1L;
	/**
	 * menuaren eraikitzailea
	 * @param lehioa panelaren elementuen dimentsioen kalkuluak egiteko
	 */
	public Menua(JFrame lehioa){
		
		//Menu bat aplikaziotik mugitzeko 
		//botoi bat hasierara joateko, fondo grisa eta letra kolorea zuria
		btnHasiera = new JButton("Hasiera");
		btnHasiera.setSize(getPreferredSize());
		add(btnHasiera);
		btnHasiera.setBackground(new Color(128, 128, 128));
		btnHasiera.setForeground(Color.white);
		
		//botoi bat Informazio orokorrera joateko, fondo grisa eta letra kolorea zuria
		btnInfoOrokorra = new JButton("Info orokorra");
		btnInfoOrokorra.setSize(getPreferredSize());
		add(btnInfoOrokorra);
		btnInfoOrokorra.setBackground(new Color(128, 128, 128));
		btnInfoOrokorra.setForeground(Color.white);
		
		//botoi bat Lehiaketa atalera joateko, fondo grisa eta letra kolorea zuria
		btnLehiaketa = new JButton("Lehiaketa");
		btnLehiaketa.setSize(getPreferredSize());
		add(btnLehiaketa);
		btnLehiaketa.setBackground(new Color(128, 128, 128));
		btnLehiaketa.setForeground(Color.white);
		
		//botoi bat Gehigarriak atalera joateko, fondo grisa eta letra kolorea zuria
		btnGehigarriak = new JButton("Gehigarriak");
		btnGehigarriak.setSize(getPreferredSize());
		add(btnGehigarriak);
		btnGehigarriak.setBackground(new Color(128, 128, 128));
		btnGehigarriak.setForeground(Color.white);
	
		setSize(getPreferredSize());
		setBounds(lehioa.getWidth()/2-180,10,getPreferredSize().width,getPreferredSize().height);
	}
		
}
