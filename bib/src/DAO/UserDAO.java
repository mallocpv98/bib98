package DAO;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

import models.Bibliotecaria;
import models.Sesso;
import models.User;
import util.DBConnector;



	public class UserDAO {
		
		private DBConnector DBConn;
		private Connection conn; 
		
		public boolean caricaUser1(String email, String password, String id) {
	        try (Connection conn = DriverManager.getConnection(DBConn.getUrl(), DBConn.getUser(), DBConn.getPassword())) 
	        {
	            String sql = "SELECT * FROM librarian_table WHERE email = ? AND password = ? AND num_id = ?";
	            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
	                stmt.setString(1, email);
	                stmt.setString(2, password);
	                stmt.setString(3, id);
	                
	                try (ResultSet rs = stmt.executeQuery()) {
	                    if (rs.next()) {
	                    	return true;
	                    }
	                   
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return false;  
		}

		private Bibliotecaria mapToUser(ResultSet rs) throws SQLException {
			return new Bibliotecaria (
					
				rs.getString("nome"),
				rs.getString("cognome"),
				rs.getDate("data_nascita").toLocalDate(),
				mapToSesso(rs.getString("sesso")),
				rs.getString("indirizzo"),
				rs.getInt("n_civico"),
				rs.getInt("telefono"),
				rs.getString("email"),
				rs.getString("cf"),
				
				 rs.getString("id_librarian"), 
				rs.getString("password"));
				
		}
		
		private Sesso mapToSesso ( String sessoString) {
			return Sesso.valueOf(sessoString);
		}
	  

	}



