package util;

import java.sql.Connection;
//USO
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

		    public static String URL = "jdbc:mysql://127.0.0.1:3306/biblioteca_z23";
		    private static String USER = "root";
		    private static String PASSWORD = "1234567890";

		    public static Connection getConnection() throws SQLException {
		        return DriverManager.getConnection(URL, USER, PASSWORD);
		    }

			public static String getUrl() {
				return URL;
			}

			public static void setUrl(String url) {
				URL = url;
			}

			public static String getUser() {
				return USER;
			}

			public static void setUser(String user) {
				USER = user;
			}

			public static String getPassword() {
				return PASSWORD;
			}

			public static void setPassword(String password) {
				PASSWORD = password;
			}
		    
		}



