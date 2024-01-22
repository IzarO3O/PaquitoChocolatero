package klaseak;
import javax.swing.*; 
import javax.swing.border.Border;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;
/**
 * Lehiaketa atalaren edukierak dauzkan panelaren klasea
 */
public class Lehiaketa extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Taldeak gordetzen dituen array bat
	 */
	private Taldea[] taldeak = new Taldea[12];
	/**
	 * Taulan erakutsiko diren datuen array-a. Object motatakoa da balio mota desberdinak erabiltzen direlako
	 */
	private Object[][] datuak = new Object[12][12];
	/**
	 * erakutsiko den taula
	 */
	private JTable taula;
	/**
	 * Panelaren eraikitzailea
	 * @param lehioa hartzen du panelaren elementuen dimentsioen kalkuluak egiteko
	 */
	public Lehiaketa (JFrame lehioa) {
		setLayout(null);
		setBounds(0,0,lehioa.getWidth(),lehioa.getHeight());
		//12 balioko dimentsioa ematen diogu 12 talde direlako
		taldeak = new Taldea[12];
		
		taldeakSortu();
		taldeakAuzaz();
		taldeakOrdenatu();
		datuakPrestatu();
		
		Object[] tituluak = {"posizioa","Taldea","Puntuak","Jokatutako partiduak","Irabazitako partiduak","Berdinketak","Galdutako partiduak"};
		/**
		 * TableModel berri bat sortzen dugu gure taulako edukierak babesteko
		 */
		TableModel modelua = new DefaultTableModel(datuak,tituluak)
		  {
		    /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column)
		    {
		      return false;
		    }
		  };
		//taula sortzen dugu eta haren propietateak ezartzen ditugu
		taula = new JTable(datuak,tituluak);
		taula.setPreferredSize(new Dimension(1200,600));
		taula.setRowHeight(50);
		taula.setModel(modelua);
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		taula.setBorder(BorderFactory.createCompoundBorder(border,
	    BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		
		JScrollPane scrollPanel = new JScrollPane(taula);
		scrollPanel.setBounds(50,50,lehioa.getWidth()-100,lehioa.getHeight()-100);
		add(scrollPanel);
		
		 DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
	        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

	        for (int i = 0; i < taula.getColumnCount(); i++) {
	            taula.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
	        }
		
	}
	/**
	 * taldeen puntuazioak eta posizioak auzaz sortzen dira
	 */
	private void taldeakAuzaz() {
		
		for (int i = 0; i<=11; i++) {
			for (int j = 0; j<=11; j++) {
				//kondizio hau beharrezkoa da, bestela talde bakoitza partido bat jokatuko du talde haren kontra
				if (taldeak[i] != taldeak[j]) {
					Random random = new Random();
					
					//Math.random()*(max-min+1)+min formula jarraitzen dugu zenbaki bat batetik hirura lortzeko
					int emaitza = random.nextInt(3)+1;
					//jokatzen duten bi taldeen jokatutako partiduen kontadorea areagotzen da
					taldeak[i].pj++;
					taldeak[j].pj++;
					//emaitza bat izatean, lehenengo taldea irabazten du
					if (emaitza == 1) {
						//lehenengo taldea 4 puntu lortzen ditu
						taldeak[i].puntuak = taldeak[i].puntuak+4;
						//lehenengo taldearen irabazitako partiduen kontagailua areagotzen da
						taldeak[i].pg++;
						//bigarren taldearen galdutako partiduen kontagailua areagotzen da
						taldeak[j].pp++;
					}
					//emaitza 2 izatean bigarren taldea irabazten du
					else if (emaitza == 2) {
						//bigarren taldea 4 puntu lortzen ditu
						taldeak[j].puntuak = taldeak[j].puntuak+4;
						//bigarren taldearen irabazitako partiduen kontagailua areagotzen da
						taldeak[j].pg++;
						//lehenengo taldearen galdutako partiduen kontagailua areagotzen da
						taldeak[i].pp++;						
					}
					//emaitza 3 izatean bi taldeak enpatatzen dute
					else {
						//bi taldeak puntu bat lortzen dute
						taldeak[i].puntuak++;
						taldeak[j].puntuak++;
						//bi taldeen enpatatuako partiduen kontagailua areagotzen da
						taldeak[i].pe++;
						taldeak[j].pe++;
					}
				}
			}
		}
	}
	/**
	 * taldeen array-a puntuazioz ordenatzeko funtzioa
	 */
	private void taldeakOrdenatu() {
		//array auxiliar bat sortzen dugu array ordenatua gordetzeko
		Taldea[] taldeakF = new Taldea[12];
		
		//posizio posible bakoitzaren for buklea
		for (int i = 0;i<=11;i++) {
			int puntMax = 0;
			int taldeMax = 0;
			//talde guztiak irakurtzen dituen for buklea
			for (int j = 0; j<=11; j++) {
				if (taldeak[j].puntuak>puntMax) {
					puntMax = taldeak[j].puntuak;
					taldeMax = j;
				}
			}
			//taldeakF array-ara kopiatzen dira posizio hau lortu duen taldearen informazio guztia
		taldeakF[i] = taldeaKopiatu(taldeak[taldeMax]);
		//posizio hau lortu duen taldearen puntuazioa 0-ra ezartzen da taldeak array-an hurrengo bueltetan berriro kuentan ez hartzeko
		taldeak[taldeMax].puntuak = 0;
		}
		//taldeakF array-a taldeak array-ara kopiatzen da ordenatutako array-a funtzio honetatik kanpo erabili ahal izateko
	for (int i = 0; i<=11;i++) {
		taldeak[i] = taldeakF[i];
	}
	}
	/**
	 * taldeak array-an gordetzen dira aurretik emandako 12 taldeen izenak
	 */
	private void taldeakSortu() {
		taldeak[0] = new Taldea("Hernani Club Rugby Elkartea");
		taldeak[1] = new Taldea("Mungia Rugby Taldea");
		taldeak[2] = new Taldea("Ordizia R.E");
		taldeak[3] = new Taldea("Gernika R.T");
		taldeak[4] = new Taldea("Durango R.T");
		taldeak[5] = new Taldea("Universitario Bilbao Rugby");
		taldeak[6] = new Taldea("Iruña Rugby Club");
		taldeak[7] = new Taldea("Eibar R.T");
		taldeak[8] = new Taldea("Kakarraldo R.T");
		taldeak[9] = new Taldea("Getxo Rugby Taldea");
		taldeak[10] = new Taldea("Arratiko Zekorrak R.T");
		taldeak[11] = new Taldea("Arrasate R.T");
		for (int i = 0; i <=11; i++) {
			taldeak[i].puntuak = 0;
			taldeak[i].pj = 0;
			taldeak[i].pe = 0;
			taldeak[i].pp = 0;
			taldeak[i].pg = 0;
		}
	}
	/**
	 * Taldeen informazio guztia lortu eta gero, datuen array-an gordetzen dira datu guztiak JTable-a irakurri ahal izateko
	 */
	private void datuakPrestatu() {
		for (int i = 0; i<=11; i++) {
			datuak[i][0] = i+1;
			datuak[i][1] = taldeak[i].izena;
			datuak[i][2] = taldeak[i].puntuak;
			datuak[i][3] = taldeak[i].pj;
			datuak[i][4] = taldeak[i].pg;
			datuak[i][5] = taldeak[i].pe;
			datuak[i][6] = taldeak[i].pp;
		}
	}
	/**
	 * Talde bat kopiatzeko array batetik bestera erabiltzen den funtzioa
	 * @param kopiaFrom Talde originala, kopiatuko dena
	 * @return Talde berdina bueltatzen du
	 */
	private Taldea taldeaKopiatu(Taldea kopiaFrom) {
		Taldea taldeFinala = new Taldea(kopiaFrom.izena);
		taldeFinala.puntuak = kopiaFrom.puntuak;
		taldeFinala.pj = kopiaFrom.pj;
		taldeFinala.pg = kopiaFrom.pg;
		taldeFinala.pe = kopiaFrom.pe;
		taldeFinala.pp = kopiaFrom.pp;
		return taldeFinala;
		
	}
	/**
	 * Talde baten informazioa biltzen duen klasea
	 */
	private class Taldea{
		/**
		 * taldearen izena
		 */
		String izena;
		/**
		 * taldearen puntuak
		 */
		int puntuak;
		/**
		 * taldeak jokatu dituen partiduen kopurua
		 */
		int pj;
		/**
		 * taldeak irabazi dituen partiduen kopurua
		 */
		int pg;
		/**
		 * taldeak enpatatu dituen partiduen kopurua
		 */
		int pe;
		/**
		 * taldeak galdu dituen partiduen kopurua
		 */
		int pp;
		/**
		 * Taldea datu guztiekin sortzeko eraikitzailea
		 * @param izena taldearen izena
		 * @param pj taldea jokatutako partiduak
		 * @param pg taldea irabazitako partiduak
		 * @param pe taldea enpatatutako partiduak
		 * @param pp taldea galdutako partiduak
		 */
		
		@SuppressWarnings("unused")
		public Taldea(String izena, int pj, int pg, int pe, int pp) {
			this.izena = izena;
			this.pj = pj;
			this.pg = pg;
			this.pe = pe;
			this.pp = pp;			
		}
		/**
		 * taldea bakarrik izenarekin sortzeko eraikitzailea
		 * @param izena taldea hartuko duen izena
		 */
		public Taldea(String izena) {
			this.izena = izena;
		}
			
	}
}