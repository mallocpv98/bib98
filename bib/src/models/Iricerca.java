package models;

import java.util.List;



	public interface Iricerca {
		public List<Libro> cercaPrestabile(String titolo, String annoPubblicazione,  String genere, String autore, String ean13);

		public List<Libro> cercaPrestabile(String ean13);

		void setUtili(List<Libro> utili);
}
