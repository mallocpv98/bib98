package controllers;

import java.util.List;
import models.Libro;
import DAO.LibroDAO;

public class LibroDataFacade {
    private LibroDAO libroDAO;

    public LibroDataFacade() {
        this.libroDAO = new LibroDAO();
    }

    public List<Libro> getAllBooks() {
        return libroDAO.getAllLibri();
    }

    public void aggiungiQuantitaLibro(String ean13, int quantitaDaAggiungere) {
        libroDAO.aggiungiQuantitaLibro(ean13, quantitaDaAggiungere);
    }

    public void inserisciLibro(Libro libro) {
        libroDAO.inserisciLibro(libro);
    }

    public void togliLibro(Libro libro) {
        libroDAO.togliLibro(libro);
    }
}
