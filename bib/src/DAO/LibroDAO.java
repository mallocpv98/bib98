package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.Libro;
import util.DBConnector;


public class LibroDAO {
	
	
	public List<Libro> getAllLibri() {
		List<Libro> libri = new ArrayList<Libro>();

        try (Connection connection = DBConnector.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM libri_table");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
            	int idLibro = resultSet.getInt("id_libro");
                String titolo = resultSet.getString("titolo");
                String ean13 = resultSet.getString("EAN13");
                String annoPubblicazione = resultSet.getString("anno_pubblicazione");
                String genere = resultSet.getString("genere");
                String lingua = resultSet.getString("lingua");
                int quantita = resultSet.getInt("quantitadisponibile");
                String casaEditrice = resultSet.getString("casa_editrice");
                String autori = resultSet.getString("autore");

                Libro libro = new Libro( titolo,annoPubblicazione, ean13,
                        genere, lingua,quantita, casaEditrice, autori);
                libri.add(libro);
            }

	}	
        catch(SQLException e) {
        	e.printStackTrace();
        }
        return libri;
}
	public void aggiungiQuantitaLibro(String ean13, int quantitaDaAggiungere) {
	    try (Connection connection = DBConnector.getConnection();
	         PreparedStatement preparedStatement = connection.prepareStatement(
	                 "UPDATE libri_table SET quantitaDisponibile = quantitaDisponibile + ? " +
	                         "WHERE ean13 = ?")) {

	        preparedStatement.setInt(1, quantitaDaAggiungere);
	        preparedStatement.setString(2, ean13);

	        int affectedRows = preparedStatement.executeUpdate();

	        if (affectedRows > 0) {
	            System.out.println("Quantità disponibile aggiornata con successo!");
	        } else {
	            System.out.println("Nessun libro trovato con l'EAN13 specificato.");
	        }

	    } catch (SQLException e) {
	        e.printStackTrace(); // Gestire l'eccezione in modo appropriato
	    }
	}

	public void inserisciLibro(Libro libro) {
	    try (Connection connection = DBConnector.getConnection();
	         PreparedStatement preparedStatement = connection.prepareStatement(
	                 "INSERT INTO libri_table (titolo, ean13, anno_pubblicazione, genere, lingua,  casa_editrice, autore, quantitaDisponibile) " +
	                         "VALUES (?, ?, ?, ?, ?, ?, ?, 1)", Statement.RETURN_GENERATED_KEYS)) {

	    	 preparedStatement.setString(1, libro.getTitolo());
	    	    preparedStatement.setString(2, libro.getEAN13());
	    	    int annoPubblicazione = Integer.parseInt(libro.getAnnoPublicazione());
	    	    preparedStatement.setInt(3, annoPubblicazione);
	    	    preparedStatement.setString(4, libro.getGenere());
	    	    preparedStatement.setString(5, libro.getLingua());
	    	    preparedStatement.setString(6, libro.getCasaEditrice());
	    	    preparedStatement.setString(7, libro.getAutori());

	        int affectedRows = preparedStatement.executeUpdate();

	        if (affectedRows > 0) {
	            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
	            if (generatedKeys.next()) {
	                int idLibro = generatedKeys.getInt(1);

	                System.out.println("Libro aggiunto con successo con ID: " + idLibro);
	            }
	        }

	    } catch (SQLException e) {
	        e.printStackTrace(); 
	    }
	}
	public void togliLibro(Libro libro) {
	    try (Connection connection = DBConnector.getConnection();
	         PreparedStatement preparedStatement = connection.prepareStatement(
	                 "UPDATE libri_table SET quantita_disponibile = quantita_disponibile - 1 " +
	                         "WHERE ean13 = ? AND quantita_disponibile > 0")) {

	        preparedStatement.setString(1, libro.getEAN13());

	        int affectedRows = preparedStatement.executeUpdate();

	        if (affectedRows > 0) {
	            System.out.println("Quantità disponibile diminuita con successo!");
	        } else {
	            System.out.println("Nessun libro trovato con l'EAN13 specificato o quantità disponibile già a 0.");
	        }

	    } catch (SQLException e) {
	        e.printStackTrace(); 
	    }
	}


}
