package models;

import java.util.List;


public interface Icatalogo {

	void rimuoviPrestabile(Prestabile prestabile);



	void setUtili(List<Libro> utili);

	List<Libro> getUtili();

	List<Libro> getListaPrestabiles();



	void aggiungiPrestabili(Libro prestabile);



	void aggiungiLibro(List<Libro> libro);
}
