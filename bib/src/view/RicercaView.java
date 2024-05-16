package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class RicercaView extends JFrame{
	
	private JTextField autoreField;
	private JTextField titoloField;
	private JTextField iSBNfiField;
    private JTextField generiField; // Use JComboBox for enum
    private JTextField annoField;
    private JButton ricercaButton;
    private JButton indietroButton;
    
    public RicercaView() {
    
    	setLayout(new BorderLayout());
    	setSize(300,200);
    	
    	JPanel northPanel = new JPanel();
    	add(northPanel,BorderLayout.NORTH);
    	
    	northPanel.add(new JLabel("inserisci le informazioni per la ricerca"));
    	
    	JPanel westPanel = new JPanel();
    	add(westPanel, BorderLayout.WEST);
    	westPanel.setLayout(new GridLayout());
    	
    	westPanel.add(new JLabel("autore:"));
    	westPanel.add(new JLabel("titolo:"));
    	westPanel.add(new JLabel("isbn:"));
    	westPanel.add(new JLabel("anno"));
    	westPanel.add(new JLabel("genere:"));
    	
    	
    	JPanel centerPanel = new JPanel();
    	add(centerPanel, BorderLayout.CENTER);
    	centerPanel.setLayout(new GridLayout());
    	
    	autoreField = new JTextField();
    	centerPanel.add(autoreField);
    	autoreField.setColumns(10);
    	
    	titoloField = new JTextField();
    	centerPanel.add(titoloField);
    	titoloField.setColumns(10);
    	
    	iSBNfiField = new JTextField();
    	centerPanel.add(iSBNfiField);
    	iSBNfiField.setColumns(10);
    	
    	annoField= new JTextField();
    	centerPanel.add(annoField);
    	annoField.setColumns(10);
    	
    	generiField = new JTextField();
    	centerPanel.add(generiField);
    	generiField.setColumns(10);
    	
    	JPanel southPanel = new JPanel();
    	add(southPanel , BorderLayout.SOUTH);
    	
    	add(new JLabel(" "));
    	
    	ricercaButton= new JButton("ricerca");
    	ricercaButton.setActionCommand("ricerca");
    	southPanel.add(ricercaButton);
    	
    	
    	
    	
    }

	public JTextField getAutoreField() {
		return autoreField;
	}

	public void setAutoreField(JTextField autoreField) {
		this.autoreField = autoreField;
	}

	public JTextField getTitoloField() {
		return titoloField;
	}

	public void setTitoloField(JTextField titoloField) {
		this.titoloField = titoloField;
	}

	public JTextField getiSBNfiField() {
		return iSBNfiField;
	}

	public void setiSBNfiField(JTextField iSBNfiField) {
		this.iSBNfiField = iSBNfiField;
	}



	public JTextField getGeneriField() {
		return generiField;
	}

	public void setGeneriField(JTextField generiField) {
		this.generiField = generiField;
	}

	public JTextField getAnnoField() {
		return annoField;
	}

	public void setAnnoField(JTextField annoField) {
		this.annoField = annoField;
	}

	public JButton getRicercaButton() {
		return ricercaButton;
	}

	public void setRicercaButton(JButton ricercaButton) {
		this.ricercaButton = ricercaButton;
	}

	public JButton getIndietroButton() {
		return indietroButton;
	}

	public void setIndietroButton(JButton indietroButton) {
		this.indietroButton = indietroButton;
	}
    
}
