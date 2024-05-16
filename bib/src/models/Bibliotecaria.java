package models;

import java.time.LocalDate;


public class Bibliotecaria extends User {

	private String numId;
	private String password;






	public Bibliotecaria(String nome, String cognome, LocalDate dataNascita, Sesso sesso, String indirizzo, int nCivico,
			int telefono, String email, String cF, String numId, String password) {
		super(nome, cognome, dataNascita, sesso, indirizzo, nCivico, telefono, email, cF);
		this.numId = numId;
		this.password = password;
	}

	

	public String getNumId() {
		return numId;
	}


	public void setNumId(String numId) {
		this.numId = numId;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
