package view;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PrestaView extends JFrame {

	private JTextField cfDebitoreField;
	private JTextField titoloLibroField;
	private JButton prestaJButton;
	private JButton indietroButton;
	
	public PrestaView(String libro) {
		setLayout(new BorderLayout());
		setSize(300,200);
		
		JPanel northPanel = new JPanel();
		add(northPanel,BorderLayout.NORTH);
		
		northPanel.add(new JLabel("inserisc i i dati per prestare il libro"));
		
		JPanel westJPanel = new JPanel();
		add(westJPanel,BorderLayout.WEST);
		westJPanel.setLayout(new GridLayout());
		
		westJPanel.add(new JLabel("libro da prestare:"));
		westJPanel.add(new JLabel("codice fiscale:"));
		
		JPanel centralJPanel = new JPanel();
		add(centralJPanel,BorderLayout.CENTER);
		centralJPanel.setLayout(new GridLayout());
		
		titoloLibroField = new JTextField(libro);
		centralJPanel.add(titoloLibroField);
		titoloLibroField.setEditable(false);
		titoloLibroField.setColumns(10);
		
		cfDebitoreField = new JTextField();
		centralJPanel.add(cfDebitoreField);
		cfDebitoreField.setColumns(10);
		
		JPanel southJPanel = new JPanel();
		add(southJPanel, BorderLayout.SOUTH);
		southJPanel.setLayout(new GridLayout());
		
		indietroButton = new JButton("torna indietro");
		indietroButton.setActionCommand("torna indietro");
		southJPanel.add(indietroButton);
		
		prestaJButton = new JButton("presta libro");
		prestaJButton.setActionCommand("presta");
		southJPanel.add(prestaJButton);
		
		
		
		
	}

	public JTextField getCfDebitoreField() {
		return cfDebitoreField;
	}

	public void setCfDebitoreField(JTextField cfDebitoreField) {
		this.cfDebitoreField = cfDebitoreField;
	}

	public JTextField getTitoloLibroField() {
		return titoloLibroField;
	}

	public void setTitoloLibroField(JTextField titoloLibroField) {
		this.titoloLibroField = titoloLibroField;
	}

	public JButton getPrestaJButton() {
		return prestaJButton;
	}

	public void setPrestaJButton(JButton prestaJButton) {
		this.prestaJButton = prestaJButton;
	}

	public JButton getIndietroButton() {
		return indietroButton;
	}

	public void setIndietroButton(JButton indietroButton) {
		this.indietroButton = indietroButton;
	}
	
}
