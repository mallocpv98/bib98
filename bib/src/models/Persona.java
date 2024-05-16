package models;

import java.time.LocalDate;



abstract class Persona {
	
	private String nome;
	private String cognome;
	private LocalDate dataNascita;
	private Sesso sesso;

	
	public Persona(String nome, String cognome, LocalDate dataNascita, Sesso sesso
			) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.sesso = sesso;
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	


	public LocalDate getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCongnome(String congnome) {
		this.cognome = congnome;
	}



	public Sesso getSesso() {
		return sesso;
	}
	public void setSesso(Sesso sesso) {
		this.sesso = sesso;
	}
	
}
