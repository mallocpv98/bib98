package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import models.Libro;


public class RisultatoRicercaView extends JFrame {
	
	private JButton indietro;
	private JButton prestito;
	private JButton modifica;
	private JButton elimina;
	
	private JTextField autoreField;
	private JLabel risultatiLabel;
	private JTextField titoloField;
	private JTextField annoField;
	private JTextField isbnField;
	
	
	public RisultatoRicercaView(String initialTitolo, String initialAutore, String initialAnnoPubblicazione,
            String initialGenerefi, 
            String initialEan13) {
		
		setLayout(new BorderLayout());
		setSize(300,200);
		
		JPanel northPanel = new JPanel();
		add(northPanel, BorderLayout.NORTH);
		
		northPanel.add(new JLabel("risultati:"));
		
		JPanel westPanel = new JPanel();
		add(westPanel, BorderLayout.WEST);
		westPanel.setLayout(new GridLayout());
		
		westPanel.add(new JLabel("titolo:"));
		westPanel.add(new JLabel("autore:"));
		westPanel.add(new JLabel("anno:"));
		westPanel.add(new JLabel("isbn:"));
		
		JPanel centralPanel = new JPanel();
		add(centralPanel,BorderLayout.EAST);
		centralPanel.setLayout(new GridLayout());
		
		autoreField = new JTextField(initialTitolo);
		centralPanel.add(autoreField);
		autoreField.setEditable(false);
		autoreField.setColumns(10);
		
		titoloField = new JTextField(initialAutore);
		centralPanel.add(autoreField);
		titoloField.setEditable(false);
		titoloField.setColumns(10);
		
		annoField = new JTextField(initialAnnoPubblicazione);
		centralPanel.add(annoField);
		annoField.setEditable(false);
		annoField.setColumns(10);
		
		isbnField = new JTextField(initialEan13);
		centralPanel.add(isbnField);
		isbnField.setEditable(false);
		isbnField.setColumns(10);
		
		JPanel southPanel = new JPanel();
		add(southPanel,BorderLayout.SOUTH);
		southPanel.setLayout(new GridLayout());
		
		prestito = new JButton("presta:");
		prestito.setActionCommand("presta");
		southPanel.add(prestito);
		
		modifica = new JButton("modifica");
		modifica.setActionCommand("modifica");
		southPanel.add(modifica);
		
		elimina = new JButton("elimina");
		elimina.setActionCommand("elimina");
		southPanel.add(elimina);
		
		indietro = new JButton("indietro");
		indietro.setActionCommand("torna indietro");
		southPanel.add(indietro);					
		
	}


	public JButton getPrestito() {
		return prestito;
	}

	public void setPrestito(JButton prestito) {
		this.prestito = prestito;
	}

	public JButton getModifica() {
		return modifica;
	}

	public void setModifica(JButton modifica) {
		this.modifica = modifica;
	}

	public JLabel getRisultatiLabel() {
		return risultatiLabel;
	}

	public void setRisultatiLabel(JLabel risultatiLabel) {
		this.risultatiLabel = risultatiLabel;
	}




	public JTextField getTitoloField() {
		return titoloField;
	}

	public void setTitoloField(JTextField titoloField) {
		this.titoloField = titoloField;
	}
	

	public JButton getIndietro() {
		return indietro;
	}

	public void setIndietro(JButton indietro) {
		this.indietro = indietro;
	}

	public void setRisultati(List<Libro> risultati) {
		// TODO Auto-generated method stub
		
	}

	public JTextField getAutoreField() {
		return autoreField;
	}

	public void setAutoreField(JTextField autoreField) {
		this.autoreField = autoreField;
	}



	public JButton getElimina() {
		return elimina;
	}


	public void setElimina(JButton elimina) {
		this.elimina = elimina;
	}


	public JTextField getIsbnField() {
		return isbnField;
	}


	public void setIsbnField(JTextField isbnField) {
		this.isbnField = isbnField;
	}



}