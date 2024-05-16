package models;

public class Libro extends Prestabile{
	private String casaEditrice;
	private String Autori;

	public Libro(String titolo, String annoPublicazione, String eAN13, String genere, String lingua, 
			int quatitaDisponibile, String casaEditrice, String autori) {
		super(titolo, annoPublicazione, eAN13, genere, lingua,  quatitaDisponibile);
		this.casaEditrice = casaEditrice;
		Autori = autori;
	}

	public String getCasaEditrice() {
		return casaEditrice;
	}
	public String getAutori() {
		return Autori;
	}

	public void setCasaEditrice(String casaEditrice) {
		this.casaEditrice = casaEditrice;
	}
	public void setAutori(String autori) {
		Autori = autori;
	}
	@Override
	public int quatita() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isDisponibile() {
		// TODO Auto-generated method stub
		return false;
}
}