package models;

import java.util.ArrayList;
import java.util.List;



public class Catalogo implements Icatalogo , Iricerca {

		private List<Libro> utili;
		
		
		public Catalogo (List<Libro> listas) {
			this.utili= new ArrayList<>(listas);		
		}
		@Override
		public void aggiungiPrestabili(Libro prestabile) {
		utili.add(prestabile);
		
		}
		@Override
		public void rimuoviPrestabile ( Prestabile prestabile) {
			
			utili.remove(prestabile);
		}
		@Override
		public List<Libro> getListaPrestabiles() {
			return utili;
			
		}

		@Override
		public List<Libro> getUtili() {
			return utili;
		}
		
		public void setUtili(List<Libro> utili) {
			this.utili = utili;
		}
		@Override
		public List<Libro> cercaPrestabile(String titolo, String annoPubblicazione, String genere, String autore, String EAN13) {
	        List<Libro> risultati = new ArrayList<>();

	        for (Libro prestabile : utili) {
	            if ((titolo == null || prestabile.getTitolo().equalsIgnoreCase(titolo)) &&
	                (annoPubblicazione == null || prestabile.getAnnoPublicazione().equalsIgnoreCase(annoPubblicazione)) &&
	                (genere == null || prestabile.getGenere().equalsIgnoreCase(genere)) &&
	                (autore == null || prestabile.getAutori().equalsIgnoreCase(autore)) &&
	                (EAN13 == null || prestabile.getEAN13().equalsIgnoreCase(EAN13))) {
	                risultati.add(prestabile);
	            }
	        }

	        return risultati;
	    }
		@Override
		public List<Libro> cercaPrestabile(String EAN13) {
			List<Libro> risultati = new ArrayList<Libro>();
			for(Libro prestabile: utili) {
				if((EAN13== null || prestabile.getEAN13().contains(EAN13)))  {
					utili.add(prestabile);
				}
			}
			return risultati;
		}
		@Override
		public void aggiungiLibro(List<Libro> libro) {
			utili.addAll(libro);
		}

	
}

