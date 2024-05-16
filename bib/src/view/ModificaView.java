package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

    public class ModificaView extends JFrame {
    private JTextField titoloField;
    private JTextField autoreField;
    private JTextField annoPubblicazioneField;
    private JTextField isbnField;

    private JTextField linguaField;
    private JButton salvaButton;
    private JButton indietroButton;

    public ModificaView(String initialTitolo, String initialAutore, String initialAnnoPubblicazione,String lingua,
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
		westPanel.add(new JLabel("lingua"));
		westPanel.add(new JLabel("autore:"));
		westPanel.add(new JLabel("anno:"));
		westPanel.add(new JLabel("isbn:"));
		
		JPanel centralPanel = new JPanel();
		add(centralPanel,BorderLayout.EAST);
		centralPanel.setLayout(new GridLayout());
		
		autoreField = new JTextField(initialTitolo);
		centralPanel.add(autoreField);
		autoreField.setColumns(10);
		
		linguaField = new JTextField(lingua);
		centralPanel.add(linguaField);
		linguaField.setColumns(10);
		
		titoloField = new JTextField(initialAutore);
		centralPanel.add(autoreField);
		titoloField.setColumns(10);
		
		annoPubblicazioneField = new JTextField(initialAnnoPubblicazione);
		centralPanel.add(annoPubblicazioneField);
		annoPubblicazioneField.setColumns(10);
		
		isbnField = new JTextField(initialEan13);
		centralPanel.add(isbnField);
		isbnField.setColumns(10);
		
		JPanel southPanel = new JPanel();
		add(southPanel,BorderLayout.SOUTH);
		southPanel.setLayout(new GridLayout());
		
	
		
		salvaButton = new JButton("modifica");
		salvaButton.setActionCommand("modifica");
		southPanel.add(salvaButton);
		
	
		indietroButton = new JButton("indietro");
		indietroButton.setActionCommand("torna indietro");
		southPanel.add(indietroButton);					
		
	
    }

	public JTextField getTitoloField() {
		return titoloField;
	}

	public void setTitoloField(JTextField titoloField) {
		this.titoloField = titoloField;
	}

	public JTextField getAutoreField() {
		return autoreField;
	}

	public void setAutoreField(JTextField autoreField) {
		this.autoreField = autoreField;
	}

	public JTextField getAnnoPubblicazioneField() {
		return annoPubblicazioneField;
	}

	public void setAnnoPubblicazioneField(JTextField annoPubblicazioneField) {
		this.annoPubblicazioneField = annoPubblicazioneField;
	}



	public JTextField getIsbnField() {
		return isbnField;
	}

	public void setIsbnField(JTextField isbnField) {
		this.isbnField = isbnField;
	}


	public JTextField getLinguaField() {
		return linguaField;
	}

	public void setLinguaField(JTextField linguaField) {
		this.linguaField = linguaField;
	}



	public JButton getSalvaButton() {
		return salvaButton;
	}

	public void setSalvaButton(JButton salvaButton) {
		this.salvaButton = salvaButton;
	}

	public JButton getIndietroButton() {
		return indietroButton;
	}

	public void setIndietroButton(JButton indietroButton) {
		this.indietroButton = indietroButton;
	}
    
    
}