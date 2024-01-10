package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost/";
		String dbName = "xefi";
		String user="root";
		String pwd="";
		Connection connect = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		     try {
				connect = DriverManager.getConnection(url+dbName,user,pwd);
				System.out.println("OK for connect");
	
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			} catch (ClassNotFoundException e) {e.printStackTrace();
		}
		return connect;
	}
}
