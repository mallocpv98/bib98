package models;



public abstract class Prestabile implements IPrestabile {
	private String titolo;
	private String AnnoPublicazione; 
	private String EAN13;
	private String genere;
	private String lingua;
	private int quatitaDisponibile;


	public Prestabile(String titolo, String annoPublicazione, String eAN13, String genere, String lingua, 
			int quatitaDisponibile) {
		super();
		this.titolo = titolo;
		AnnoPublicazione = annoPublicazione;
		EAN13 = eAN13;
		this.genere = genere;
		this.lingua = lingua;
		
		this.quatitaDisponibile = quatitaDisponibile;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public String getAnnoPublicazione() {
		return AnnoPublicazione;
	}


	public void setAnnoPublicazione(String annoPublicazione) {
		AnnoPublicazione = annoPublicazione;
	}


	public String getEAN13() {
		return EAN13;
	}
	public void setEAN13(String eAN13) {
		EAN13 = eAN13;
	}
	public String getLingua() {
		return lingua;
	}
	public void setLingua(String lingua) {
		this.lingua = lingua;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}



	public int getQuatitaDisponibile() {
		return quatitaDisponibile;
	}
	public void setQuatitaDisponibile(int quatitaDisponibile) {
		this.quatitaDisponibile = quatitaDisponibile;
	}

		
}
