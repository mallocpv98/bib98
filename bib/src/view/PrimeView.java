package view;

import javax.swing.JFrame;

public class PrimeView {
	
		private static PrimeView instance;
		
		private HomeView hmv;
		private AddLibroView adlv;
		private AddUtenteView aduv;
		private LibrarianOptionView libov;
		private LoginView logv;
		private ModificaView modv;
		private PrestaView prv;
		private RicercaView ricv;
		private RisultatoRicercaView risv;
		
		private PrimeView () {
			
			this.hmv = new HomeView();
			this.adlv= new AddLibroView();
			this.aduv = new AddUtenteView();
			this.libov = new LibrarianOptionView();
			this.logv = new LoginView();
			this.modv = new ModificaView(null, null, null, null, null, null);
			this.prv = new PrestaView(null);
			this.ricv = new RicercaView();
			this.risv = new RisultatoRicercaView(null, null, null, null, null);
			
		}
		public static PrimeView getInstance() {
			if (instance == null) {
				instance = new PrimeView();
			}
			return instance;
		}
		
		public HomeView getHomeView () {
			hmv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			hmv.setVisible(true);
			return this.hmv;
			
		}
		public AddLibroView getaddlibroView() {
			adlv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			adlv.setVisible(true);
			return this.adlv;
		}
		public AddUtenteView getAddUtenteView() {
			aduv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			aduv.setVisible(true);
			return this.aduv;
		}
		public LibrarianOptionView getlLibrarianOptionView() {
			libov.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			libov.setVisible(true);
			return this.libov;
		}
		public LoginView getLoginView() {
			logv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			logv.setVisible(true);
			return this.logv;
		}
		public ModificaView getmodiModificaView() {
			modv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			modv.setVisible(true);
			return this.modv;
		}
		public PrestaView getprePrestaView() {
			prv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			prv.setVisible(true);
			return this.prv;
		}
		public RicercaView getriRicercaView() {
			ricv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ricv.setVisible(true);
			return this.ricv;
		}
		public RisultatoRicercaView getRisultatoRicercaView() {
			risv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			risv.setVisible(true);
			return this.risv;
		}
		
}
