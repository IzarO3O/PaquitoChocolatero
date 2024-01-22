package klaseak;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;
/**
 * Panel bat, InfoOrokorra atalaren edukierak sortzen dituena
 */
public class InfoOrokorra extends JPanel{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//JLabel lblLogo;
	/**
	 * Panel honetako eraikitzailea
	 * @param lehioa panelaren dimentsioak kalkulatzeko
	 */
	public InfoOrokorra(JFrame lehioa) {
		
		setLayout(null);
		setBounds(0,0,lehioa.getWidth(),lehioa.getHeight());
		
		//Scroll pane bat sortzen dugu informazio guztia ikusgai mantentzeko erresoluzio txikietan
		JScrollPane scrollPanel = new JScrollPane(new Informazioa(lehioa));
		scrollPanel.setBounds(20, 50, lehioa.getWidth()-60, lehioa.getHeight()-100);
		add(scrollPanel);
	
		}
	/**
	 * Atal honetan lantzen diren edukierak dauzkan panel pribatu bat
	 */
	private class Informazioa extends JPanel{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		/**
		 * Panelaren eraikitzailea
		 * @param lehioa panelaren dimentsioak kalkulatzeko
		 */
		public Informazioa(JFrame lehioa) {
			
			
			//panelaren dimentsioak ezarri
			Dimension infoD = new Dimension(1900,850);
			setLayout(null);
			setPreferredSize(infoD);
			
			//text area bat titulua jartzeko
			JTextArea tainfoOrokorraTitulua = new JTextArea("Euskal Errugbi Federazioaren historia");
			
			tainfoOrokorraTitulua.setBackground(null);
			tainfoOrokorraTitulua.setBounds(0,0 , 400, 30);
			add(tainfoOrokorraTitulua);
	
			//text area bat, editaezina, informazioa jartzeko
			JTextArea tainfoOrokorra = new JTextArea(
					"Fundazioa (1980. urtea):"
					+"\r\n"
					+"1980an, euskal eskualdeko errugbi zale amorratuen talde batek bat egin zuen Euskal Errugbi Federazioa sortzeko. Bere ikuspegia Euskal Herrian errugbia sustatzea eta garatzea zen, kirolaren balioak partekatuz: errespetua, talde-lana eta lagunartea."
					+"\r\n"
					+"Lehen urratsak eta erronkak (80ko hamarkada):"
					+"\r\n"
					+"Bere lehen urteetan, Euskal Errugbi Federazioak erronka esanguratsuak aurkitu zituen. Joko-eremu egokirik ez izatea eta eskualdean talde eta jokalari gutxi egotea hasierako oztopoak izan ziren, eta taldeak erabakitasunez egin zien aurre."
					+"\r\n"
					+"Afiliazio Nazionala (1985):"
					+"\r\n"
					+"1985ean, Euskal Errugbi Federazioa Espainiako Errugbi Federazioko kide ofizial bihurtu zen, eta, horri esker, nazio mailan lehiatu eta herrialdeko errugbi lehiaketa garrantzitsuenetan parte hartu ahal izan zuten."
					+"\r\n"
					+"Hazkundea eta garapena (90eko hamarkada):"
					+"\r\n"
					+"90eko hamarkadan zehar, federazioak gazteen kategoriak garatu zituen, tokiko eskolekin hertsiki lan eginez gazteek kirolean parte har dezaten sustatzeko. Entrenatzaileak prestatzeko programak ezarri ziren eta abangoardiako entrenamendu-instalazioak eraiki ziren."
					+"\r\n"
					+"Txapelketak eta arrakastak (2000. urteak):"
					+"\r\n"
					+"XXI. mendeko lehen hamarkadan, Euskal Errugbi Federazioko hainbat taldek txapelketa nazionalak eta erregionalak irabazi zituzten, eta horrek errugbiaren ospea areagotu zuen eskualdean."
					+"\r\n"
					+"Komunitatera irekitzea (2010. urtea):"
					+"\r\n"
					+"2010ean, Euskal Errugbi Federazioak errugbi inklusiboko programak abiarazi zituen adin eta trebetasun guztietako pertsonentzat, komunitateko kide ugariri ateak irekiz."
					+"\r\n"
					+"40. urteurrenaren ospakizuna (2020. urtea):"
					+"\r\n"	
					+"2020an, federazioak 40. urteurrena ospatu zuen, jokalari, entrenatzaile eta kide belaunaldiak bildu zituen ekitaldi batekin, RugbyEuskadik eskualdean izan dituen lorpenak eta eragin positiboa nabarmenduz."
					+"\r\n"
					+"Nazioarteko proiekzioa (etorkizuna):"
					+"\r\n"
					+"Euskal Errugbi Federazioaren helburua bere presentzia nazioartean zabaltzea da, Euskal Herria nazioarteko txapelketa eta lehiaketetan ordezkatuz, eta euskal errugbiaren espiritua eta tradizioa mundu osoan sustatuz."
					);
			
			tainfoOrokorra.setBounds(20, 50, 1850,350);
			tainfoOrokorra.setBackground(null);
			add(tainfoOrokorra);
			
			//text area bat, editaezina, titulua jartzeko
			JTextArea tainfoArauakTitulua = new JTextArea("Arautegia");
			
			tainfoArauakTitulua.setBackground(null);
			tainfoArauakTitulua.setBounds(0,400,100,30);
			add(tainfoArauakTitulua);
	
			//textArea bat arauak jartzeko, editaezina
			JTextArea taArauak = new JTextArea(
					"Ezin da baloia aurrerantz pasatu. Baloia ere ez da aurrerantz erortzen uzten, eta horri knock-on edo avant esaten zaio.\r\n"
					+ "Baloiak aurrera eramanez edo ostikatuz bakarrik egin dezake aurrera.\r\n"
					+ "Joko-zelaiko edozein jokalarik baloiarekin aurrera egin dezake.\r\n"
					+ "Jokalari plakatu edo takleatu batek (botata) baloia berehala pasatu edo askatu behar du.\r\n"
					+ "Taka egiten duen jokalariak berehala askatu behar du takleatutako jokalaria.\r\n"
					+ "Errugbia etengabeko kirola da. Ez zen etenik aurreikusi (lesiorik ez badago, behintzat).\r\n"
					+ "Mele/scrum batek jokoa berrabiarazten du aurrera pasearen edo knock-on baten ondoren.\r\n"
					+ "Mele/scrum bat ere sortzen da hain ohikoak ez diren beste batzuetan.\r\n"
					+ "Line-out batek jokoa berrabiarazten du baloia berdegunetik ateratzen denean.\r\n"
					+ "Saiakera/Try bat baloia goal lerroa (idazpen-gunea) haratago eramaten denean eta lurrean bermatzen denean ematen da.\r\n"
					+ "5 puntu saiakuntza/try bat egitean ematen dira.\r\n"
					+ "2 puntu ematen dira entsegu/try baten ondoren ostikada gehigarria bihurtzean.\r\n"
					+ "3 puntu ematen dira zelaiko gol bat (kolpea) arau-hauste bat egin ondoren bihurtzean.\r\n"
					+ "3 puntu ematen dira drop bat (bote-pronto ostikoa) joko ireki bihurtzean.\r\n"
					+ "Entsegu/try edo zigor bat bihurtu ondoren, baloia ostikoka hasten da saskiratzaile taldearen aurka (sevens, zazpi jokalari alde batean dituen errugbia izan ezik).\r\n"
					+ "Arbitroa da araudia errespetaraztearen arduraduna.\r\n"
					+ "40 minutuko bi denbora jarraitutan jokatzen da, 5 minutuko tartearekin.\r\n"
					+ "Arbitro nagusiak darama denbora, eta lesioak daudenean bakarrik gelditu behar du.\r\n"
					+ "Bi lerro-epaile daude baloia edo baloia daraman pertsona joko-zelaitik noiz ateratzen den adierazten laguntzen dutenak."
					);
			
			taArauak.setBounds(20, 450, 1150,500);
			taArauak.setBackground(null);
			add(taArauak);
			Font testuArrunta = new Font("testua",Font.PLAIN,15);
			tainfoOrokorra.setFont(testuArrunta);
			
			Font tituluak = new Font("tituluak",Font.BOLD,20);
			tainfoOrokorraTitulua.setFont(tituluak);
			taArauak.setFont(testuArrunta);
			tainfoArauakTitulua.setFont(tituluak);
			
			//editaezinak izateko
			tainfoOrokorra.setEditable(false);
			tainfoOrokorraTitulua.setEditable(false);
			taArauak.setEditable(false);
			tainfoArauakTitulua.setEditable(false);
			
			//label bat argazki bat jartzeko
			ImageIcon argazkia = new ImageIcon(getClass().getResource("argazkiak/joko_zelaiajpg.jpg"));
			JLabel lblArgazkia = new JLabel(argazkia);
			add(lblArgazkia);
			lblArgazkia.setBounds(1200,400,400,500);
			}
			
		
	}
		
}
