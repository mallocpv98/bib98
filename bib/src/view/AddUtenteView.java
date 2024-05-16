package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import models.Sesso;

public class AddUtenteView extends JFrame {

	private JTextField nomeField;
	private JTextField cognomeField;
	private JTextField dataNascitaField;
	private JComboBox <Sesso> sessoComboBox;
	private JTextField numeroField;
	private JTextField emailField;
	private JTextField cF;
	
	private JButton creaButton;
	private JButton indietroButton;
	
	public AddUtenteView() {
		
		setLayout(new BorderLayout());
		setSize(300,200);
		
		JPanel northpPanel = new JPanel();
		add(northpPanel, BorderLayout.NORTH);
		
		northpPanel.add(new JLabel("inserisci i dati:"));
		
		JPanel westPanel = new JPanel();
		add(westPanel, BorderLayout.WEST);
		westPanel.setLayout(new GridLayout());
		
		westPanel.add(new JLabel("nome:"));
		westPanel.add(new JLabel("cognome:"));
		westPanel.add(new JLabel("data di nascita:"));
		westPanel.add(new JLabel("sesso:"));
		westPanel.add(new JLabel("numero di telefono:"));
		westPanel.add(new JLabel("email:"));
		westPanel.add( new JLabel("codice fiscale:"));
		
		JPanel centralPanel = new JPanel();
		add(centralPanel, BorderLayout.CENTER);
		centralPanel.setLayout(new GridLayout());

		nomeField = new JTextField();
		centralPanel.add(nomeField);
		nomeField.setColumns(10);
		
		cognomeField = new JTextField();
		centralPanel.add(cognomeField);
		cognomeField.setColumns(10);
		
		dataNascitaField = new JTextField();
		centralPanel.add(dataNascitaField);
		dataNascitaField.setColumns(10);
		
		sessoComboBox = new JComboBox<Sesso>();
		centralPanel.add(sessoComboBox);
		
		numeroField = new JTextField();
		centralPanel.add(numeroField);
		numeroField.setColumns(10);
		
		emailField = new JTextField();
		centralPanel.add(emailField);
		emailField.setColumns(10);
		
		cF = new JTextField();
		centralPanel.add(cF);
		cF.setColumns(10);
		
		
		
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public void setNomeField(JTextField nomeField) {
		this.nomeField = nomeField;
	}

	public JTextField getCognomeField() {
		return cognomeField;
	}

	public void setCognomeField(JTextField cognomeField) {
		this.cognomeField = cognomeField;
	}

	public JTextField getDataNascitaField() {
		return dataNascitaField;
	}

	public void setDataNascitaField(JTextField dataNascitaField) {
		this.dataNascitaField = dataNascitaField;
	}

	public JComboBox<Sesso> getSessoComboBox() {
		return sessoComboBox;
	}

	public void setSessoComboBox(JComboBox<Sesso> sessoComboBox) {
		this.sessoComboBox = sessoComboBox;
	}

	public JTextField getNumeroField() {
		return numeroField;
	}

	public void setNumeroField(JTextField numeroField) {
		this.numeroField = numeroField;
	}

	public JTextField getEmailField() {
		return emailField;
	}

	public void setEmailField(JTextField emailField) {
		this.emailField = emailField;
	}

	public JTextField getcF() {
		return cF;
	}

	public void setcF(JTextField cF) {
		this.cF = cF;
	}

	public JButton getCreaButton() {
		return creaButton;
	}

	public void setCreaButton(JButton creaButton) {
		this.creaButton = creaButton;
	}

	public JButton getIndietroButton() {
		return indietroButton;
	}

	public void setIndietroButton(JButton indietroButton) {
		this.indietroButton = indietroButton;
	}
	
	
	
	
}
