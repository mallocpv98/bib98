package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AddLibroView extends JFrame{
	
		private JTextField eAN13Field;
		private JTextField titoloField;
		private JTextField autoriField;
		private JTextField annoField;
		private JTextField genereComboBox;
		private JTextField linguaField;
		private JTextField casaEditriceField;
		private JButton indietroButton;
		private JButton aggiungiButton;
		
		
		public AddLibroView() {
			
			setLayout(new BorderLayout());
			setSize(300,200);
			
			JPanel northPanel = new JPanel();
			add(northPanel,BorderLayout.NORTH);
			
			northPanel.add(new JLabel("inserisci i dati:"));
			
			
			
}


		public JTextField geteAN13Field() {
			return eAN13Field;
		}


		public void seteAN13Field(JTextField eAN13Field) {
			this.eAN13Field = eAN13Field;
		}


	

		public JTextField getTitoloField() {
			return titoloField;
		}


		public void setTitoloField(JTextField titoloField) {
			this.titoloField = titoloField;
		}


		public JTextField getAutoriField() {
			return autoriField;
		}


		public void setAutoriField(JTextField autoriField) {
			this.autoriField = autoriField;
		}


		public JTextField getAnnoField() {
			return annoField;
		}


		public void setAnnoField(JTextField annoField) {
			this.annoField = annoField;
		}



		public JTextField getGenereComboBox() {
			return genereComboBox;
		}


		public void setGenereComboBox(JTextField genereComboBox) {
			this.genereComboBox = genereComboBox;
		}


		public JTextField getLinguaField() {
			return linguaField;
		}


		public void setLinguaField(JTextField linguaField) {
			this.linguaField = linguaField;
		}


		public JTextField getCasaEditriceField() {
			return casaEditriceField;
		}


		public void setCasaEditriceField(JTextField casaEditriceField) {
			this.casaEditriceField = casaEditriceField;
		}


		public JButton getIndietroButton() {
			return indietroButton;
		}


		public void setIndietroButton(JButton indietroButton) {
			this.indietroButton = indietroButton;
		}


		public JButton getAggiungiButton() {
			return aggiungiButton;
		}


		public void setAggiungiButton(JButton aggiungiButton) {
			this.aggiungiButton = aggiungiButton;
		}


	
		
		
}
