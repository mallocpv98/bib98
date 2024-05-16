package view;


import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class LibrarianOptionView extends JFrame {

	private JButton ricercamodificaButton;
	private JButton aggiungiPrestabile;
	private JButton chiudiButton;
	//private JButton prestaButton;
	private JButton aggiungiUtente ;
	private JButton modificaUtente;
	private JButton ritiraPrestabile;
	
	public LibrarianOptionView() {
		setLayout(new BorderLayout());
		setSize(300,200);
		
		JPanel onePanel= new JPanel();
		add(onePanel, BorderLayout.CENTER);
		
		ricercamodificaButton = new JButton("ricerca/modifica");
		ricercamodificaButton.setActionCommand("ricerca/modifica");
		onePanel.add(ricercamodificaButton);
			
		aggiungiPrestabile = new JButton("aggiungi");
		aggiungiPrestabile.setActionCommand("aggiungi libro");
		onePanel.add(aggiungiPrestabile);
		
		chiudiButton = new JButton("chiudi sessione");
		chiudiButton.setActionCommand("chiudi");
		onePanel.add(chiudiButton);
		
		
		
		
		
	}

	public JButton getRicercamodificaButton() {
		return ricercamodificaButton;
	}

	public void setRicercamodificaButton(JButton ricercamodificaButton) {
		this.ricercamodificaButton = ricercamodificaButton;
	}

	public JButton getAggiungiPrestabile() {
		return aggiungiPrestabile;
	}

	public void setAggiungiPrestabile(JButton aggiungiPrestabile) {
		this.aggiungiPrestabile = aggiungiPrestabile;
	}

	public JButton getChiudiButton() {
		return chiudiButton;
	}

	public void setChiudiButton(JButton chiudiButton) {
		this.chiudiButton = chiudiButton;
	}

	public JButton getAggiungiUtente() {
		return aggiungiUtente;
	}

	public void setAggiungiUtente(JButton aggiungiUtente) {
		this.aggiungiUtente = aggiungiUtente;
	}

	public JButton getModificaUtente() {
		return modificaUtente;
	}

	public void setModificaUtente(JButton modificaUtente) {
		this.modificaUtente = modificaUtente;
	}

	public JButton getRitiraPrestabile() {
		return ritiraPrestabile;
	}

	public void setRitiraPrestabile(JButton ritiraPrestabile) {
		this.ritiraPrestabile = ritiraPrestabile;
	}
	
}
