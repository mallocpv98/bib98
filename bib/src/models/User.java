package models;

import java.time.LocalDate;



public class User extends Persona{


	private String indirizzo;
	private int nCivico;
	private int telefono;
	private String email;
	private String cF;

	public User(String nome, String cognome, LocalDate dataNascita, Sesso sesso, String indirizzo, int nCivico,
			int telefono, String email, String cF) {
		super(nome, cognome, dataNascita, sesso);
		this.indirizzo = indirizzo;
		this.nCivico = nCivico;
		this.telefono = telefono;
		this.email = email;
		this.cF = cF;
	}

	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}


	public int getnCivico() {
		return nCivico;
	}


	public void setnCivico(int nCivico) {
		this.nCivico = nCivico;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getcF() {
		return cF;
	}

	public void setcF(String cF) {
		this.cF = cF;
	}
}