package DAO;

import java.sql.SQLException;
import java.util.List;

import models.Libro;
import models.User;

public class DBFacade {

		static DBFacade instance ;
		
		UserDAO userDAO;
		LibroDAO libroDAO;
		
		private DBFacade() {
			userDAO= new UserDAO();
			libroDAO = new LibroDAO();
			
		}
	
		public static synchronized DBFacade getInstance () {
			if ( instance == null) instance = new DBFacade();
			return instance;
			
		}
		
		public boolean login (String email, String password ,String id) throws SQLException {
			return userDAO.caricaUser1(email, password, id);
		}
		
		public List<Libro> getAllLibro () {
			return libroDAO.getAllLibri();
			
		}
		
		public void addLibro ( Libro libro) {
			libroDAO.inserisciLibro(libro);
			
		}
		
		public void deleteLibro ( Libro libro) {
			libroDAO.togliLibro(libro);
		}
		
}
